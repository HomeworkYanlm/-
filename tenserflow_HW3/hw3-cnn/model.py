# -*- coding: utf-8 -*-

import tensorflow as tf


class Model:
    def __init__(self,
                 is_train,
                 learning_rate=0.001,
                 learning_rate_decay_factor=0.9995):
        self.x_ = tf.placeholder(tf.float32, [None, 1, 28, 28])
        self.y_ = tf.placeholder(tf.int32, [None])
        self.keep_prob = tf.placeholder(tf.float32)

        x = tf.reshape(self.x_, [-1, 28, 28, 1])

        # TODO: implement input -- Conv -- BN -- ReLU -- MaxPool -- Conv -- BN -- ReLU -- MaxPool -- Linear -- loss
        #        the 10-class prediction output is named as "logits"
        
        # conv1        
        W_conv1 = weight_variable([5,5, 1,4]);
        b_conv1 = bias_variable([4]);
        o_conv1 = tf.nn.relu(batch_normalization_layer(conv2d(x, W_conv1) + b_conv1)); # output size 28x28x8
        o_pool1 = max_pool_2x2(o_conv1);

        # conv2 
        W_conv2 = weight_variable([5,5, 4,8]);
        b_conv2 = bias_variable([8]);
        o_conv2 = tf.nn.relu(batch_normalization_layer(conv2d(o_pool1, W_conv2) + b_conv2)); # output size 14x14x16
        o_pool2 = max_pool_2x2(o_conv2);
        h_pool2_flat = tf.reshape(o_pool2, [-1, 7*7*8])
        # liner
        W1 = weight_variable([7*7*8, 10])
        b1 = bias_variable([10])
        out4 = tf.matmul(h_pool2_flat, W1) + b1;
        logits = out4;


        # logits = tf.Variable(tf.constant(0.0, shape=[100, 10]))  # deleted this line after you implement above layers

        self.loss = tf.reduce_mean(tf.nn.sparse_softmax_cross_entropy_with_logits(labels=self.y_, logits=logits))
        self.correct_pred = tf.equal(tf.cast(tf.argmax(logits, 1), tf.int32), self.y_)
        self.pred = tf.argmax(logits, 1)
        self.acc = tf.reduce_mean(tf.cast(self.correct_pred, tf.float32))

        self.learning_rate = tf.Variable(float(learning_rate), trainable=False,
                                         dtype=tf.float32)
        self.learning_rate_decay_op = self.learning_rate.assign(self.learning_rate * learning_rate_decay_factor)

        self.global_step = tf.Variable(0, trainable=False)
        self.params = tf.trainable_variables()
        self.train_op = tf.train.AdamOptimizer(self.learning_rate).minimize(self.loss, global_step=self.global_step,
                                                                            var_list=self.params)

        self.saver = tf.train.Saver(tf.global_variables(), write_version=tf.train.SaverDef.V2,
                                    max_to_keep=3, pad_step_number=True, keep_checkpoint_every_n_hours=1.0)


def conv2d(x, W):
    return tf.nn.conv2d(x, W, strides=[1, 1, 1, 1], padding='SAME')

def max_pool_2x2(x):
    return tf.nn.max_pool(x, ksize=[1,2,2,1], strides=[1,2,2,1], padding='SAME')

def weight_variable(shape):  # you can use this func to build new variables
    initial = tf.truncated_normal(shape, stddev=0.1)
    return tf.Variable(initial)


def bias_variable(shape):  # you can use this func to build new variables
    initial = tf.constant(0.1, shape=shape)
    return tf.Variable(initial)


def batch_normalization_layer(inputs, isTrain=True):
    # TODO: implemented the batch normalization func and applied it on conv and fully-connected layers
    # hint: you can add extra parameters (e.g., shape) if necessary
    _variance_epsilon = 1e-10;

    out_size = inputs.get_shape()[-1];
    old_mean = tf.Variable(tf.zeros([out_size]), trainable=False);
    old_variance = tf.Variable(tf.ones([out_size]), trainable=False);
    _offset = tf.Variable(tf.zeros([out_size],dtype=tf.float32,name=None));
    _scale = tf.Variable(tf.ones([out_size],dtype=tf.float32,name=None));
    normalized = inputs;
    if isTrain:
        axis = list(range(len(inputs.get_shape()) - 1));
        _mean, _variance = tf.nn.moments(inputs, axis);
        train_mean = tf.assign(old_mean,
                               old_mean * 0.999 + _mean * (0.001))
        train_var  = tf.assign(old_variance,
                               old_variance * 0.999 + _variance * (0.001))
        with tf.control_dependencies([train_mean,train_var]):
            normalized = tf.nn.batch_normalization(x=inputs,mean = _mean,variance=_variance,variance_epsilon = _variance_epsilon,offset=_offset,scale=_scale);
    else:
        normalized = tf.nn.batch_normalization(x=inputs,mean = old_mean,variance=old_variance,variance_epsilon = _variance_epsilon,offset=_offset,scale=_scale);
    return normalized;
