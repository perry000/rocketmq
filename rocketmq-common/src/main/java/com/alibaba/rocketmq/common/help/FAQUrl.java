/**
 * Copyright (C) 2010-2013 Alibaba Group Holding Limited
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.rocketmq.common.help;

/**
 * 记录一些问题对应的解决方案，减少答疑工作量
 *
 * @author shijia.wxr<vintage.wang@gmail.com>
 */
public class FAQUrl {
    // FAQ: Topic不存在如何解决
    public static final String APPLY_TOPIC_URL = //
            "http://docs.aliyun.com/cn#/pub/ons/faq/exceptions&topic_not_exist";

    // FAQ: Name Server地址不存在
    public static final String NAME_SERVER_ADDR_NOT_EXIST_URL = //
            "http://docs.aliyun.com/cn#/pub/ons/faq/exceptions&namesrv_not_exist";

    // FAQ: 启动Producer、Consumer失败，Group Name重复
    public static final String GROUP_NAME_DUPLICATE_URL = //
            "http://docs.aliyun.com/cn#/pub/ons/faq/exceptions&group_duplicate";

    // FAQ: 客户端对象参数校验合法性
    public static final String CLIENT_PARAMETER_CHECK_URL = //
            "http://docs.aliyun.com/cn#/pub/ons/faq/exceptions&parameter_check_failed";

    // FAQ: 订阅组不存在如何解决
    public static final String SUBSCRIPTION_GROUP_NOT_EXIST = //
            "http://docs.aliyun.com/cn#/pub/ons/faq/exceptions&subGroup_not_exist";

    // FAQ: Producer、Consumer服务状态不正确
    public static final String CLIENT_SERVICE_NOT_OK = //
            "http://docs.aliyun.com/cn#/pub/ons/faq/exceptions&service_not_ok";

    // FAQ: No route info of this topic, TopicABC
    public static final String NO_TOPIC_ROUTE_INFO = //
            "http://docs.aliyun.com/cn#/pub/ons/faq/exceptions&topic_not_exist";

    // FAQ: 广播消费者启动加载json文件异常问题
    public static final String LOAD_JSON_EXCEPTION = //
            "http://docs.aliyun.com/cn#/pub/ons/faq/exceptions&load_json_exception";

    // FAQ: 同一个订阅组内不同Consumer实例订阅关系不同
    public static final String SAME_GROUP_DIFFERENT_TOPIC = //
            "http://docs.aliyun.com/cn#/pub/ons/faq/exceptions&subscription_exception";

    // FAQ: 主动订阅消息，获取队列列表报Topic不存在
    public static final String MQLIST_NOT_EXIST = //
            "http://docs.aliyun.com/cn#/pub/ons/faq/exceptions&queue_not_exist";

    //
    // FAQ: 未收录异常处理办法
    //
    public static final String UNEXPECTED_EXCEPTION_URL = //
            "http://docs.aliyun.com/cn#/pub/ons/faq/exceptions&unexpected_exception";

    // FAQ: 发送消息尝试多次失败
    public static final String SEND_MSG_FAILED = //
            "http://docs.aliyun.com/cn#/pub/ons/faq/exceptions&send_msg_failed";

    // FAQ: 主机名不存在
    public static final String UNKNOWN_HOST_EXCEPTION = //
            "http://docs.aliyun.com/cn#/pub/ons/faq/exceptions&unknown_host";

    private static final String TipStringBegin = "\nSee ";
    private static final String TipStringEnd = " for further details.";


    public static String suggestTodo(final String url) {
        StringBuilder sb = new StringBuilder();
        sb.append(TipStringBegin);
        sb.append(url);
        sb.append(TipStringEnd);
        return sb.toString();
    }


    /**
     * 对于没有未异常原因指定FAQ的情况，追加默认FAQ
     */
    public static String attachDefaultURL(final String errorMessage) {
        if (errorMessage != null) {
            int index = errorMessage.indexOf(TipStringBegin);
            if (-1 == index) {
                StringBuilder sb = new StringBuilder();
                sb.append(errorMessage);
                sb.append("\n");
                sb.append("For more information, please visit the url, ");
                sb.append(UNEXPECTED_EXCEPTION_URL);
                return sb.toString();
            }
        }

        return errorMessage;
    }
}
