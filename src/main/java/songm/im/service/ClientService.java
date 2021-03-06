/*
 * Copyright [2016] [zhangsong <songm.cn>].
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */
package songm.im.service;

import songm.im.IMException;
import songm.im.entity.SessionCh;
import songm.im.mqtt.ClientUser;

/**
 * MQTT客户端业务逻辑处理
 * 
 * @author zhangsong
 *
 */
public interface ClientService {

    /**
     * 创建MQTT客户端
     * @param session
     * @return
     */
    public ClientUser createClient(SessionCh session) throws IMException;

    /**
     * 获取MQTT客户端
     * 
     * @param uid
     * @return
     */
    public ClientUser getClient(String uid);

    /**
     * 移除客户端
     * 
     * @param uid
     */
    public void removeClient(String uid) throws IMException;

    /**
     * 发布消息
     * 
     * @param uid
     * @param topic
     * @param body
     */
    public void publish(String uid, String topic, byte[] body) throws IMException;
}
