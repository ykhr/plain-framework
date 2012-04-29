/*
 * Copyright 2012 Project UNKONW.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.techie.plain.framework.exception;

/**
 * @author bose999
 *
 */
@SuppressWarnings("serial")
public class ActionHandlingException extends RuntimeException{
    /**
     * コンストラクタ
     * 
     * @param reason Exception reason
     */
    public ActionHandlingException(String reason){
        super(reason);
    }
}
