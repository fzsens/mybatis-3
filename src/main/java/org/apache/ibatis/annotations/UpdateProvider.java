/**
 *    Copyright 2009-2016 the original author or authors.
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
package org.apache.ibatis.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**

 @SelectProvider(type = StatementProvider.class, method = "provideSelect")
 S select(S param);

 public class StatementProvider {
     public String provideSelect(Object param) {
         StringBuilder sql = new StringBuilder("select * from ");
         if (param == null || param instanceof Person) {
             sql.append(" person ");
             if (param != null && ((Person) param).getId() != null) {
                sql.append(" where id = #{id}");
             }
         } else if (param instanceof Country) {
             sql.append(" country ");
             if (((Country) param).getId() != null) {
                 sql.append(" where id = #{id}");
             }
         }
         sql.append(" order by id");
         return sql.toString();
     }
 }
 通过内嵌的类来实现SQL的编写
  * @author Clinton Begin
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface UpdateProvider {
    /**
     * 可以使用
     * @return
     */
  Class<?> type();

  String method();
}
