CREATE TABLE `user_info`
(
    `user_id`     bigint UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `username`    varchar(16)     NULL COMMENT '昵称',
    `telephone`   char(11)        NULL COMMENT '手机号',
    `email`       varchar(32)     NULL COMMENT '邮箱',
    `create_time` timestamp(3)    NOT NULL DEFAULT CURRENT_TIMESTAMP(3) COMMENT '创建时间',
    `update_time` timestamp(3)    NOT NULL DEFAULT CURRENT_TIMESTAMP(3) ON UPDATE CURRENT_TIMESTAMP(3) COMMENT '更新时间',
    PRIMARY KEY (`user_id`),
    UNIQUE INDEX `user_id` (`user_id`) USING BTREE COMMENT '用户ID'
) COMMENT = '用户信息表';