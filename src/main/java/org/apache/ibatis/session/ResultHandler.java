/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.session;

/**
 * 通过对ResultHandler进行拓展,可以自定义映射的过程,修改Mybatis的映射结果
 * 例如
 * http://iamxi.iteye.com/blog/1621273
 * 通过sqlSession.select(**,myResultHandler);
 * 每一个查询结果集都会封装到resultContext中,并调用HandlerResult方法
 * @author Clinton Begin
 */
public interface ResultHandler<T> {

  void handleResult(ResultContext<? extends T> resultContext);

}
