/*
 *  Copyright 2016 http://www.hswebframework.org
 *  
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *  
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  
 */
package org.hswebframework.web.entity.organizational;

import org.hswebframework.web.commons.entity.Entity;

/**
 * 人员职位关联 实体
 *
 * @author hsweb-generator-online
 */
public interface PersonPositionEntity extends Entity {
 /*-------------------------------------------
    |               属性名常量               |
    ===========================================*/
    /**
     * 人员id
     */
    String personId   = "personId";
    /**
     * 职位id
     */
    String positionId = "positionId";

    /**
     * @return 人员id
     */
    String getPersonId();

    /**
     * 设置 人员id
     */
    void setPersonId(String personId);

    /**
     * @return 职位id
     */
    String getPositionId();

    /**
     * 设置 职位id
     */
    void setPositionId(String positionId);

}