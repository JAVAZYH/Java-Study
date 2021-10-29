package zyh.JAVAadvanced.Collection.Set;

import zyh.JAVAadvanced.Collection.Entity.User;

import java.util.Comparator;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Javazyh
 * \* Date: 2019/5/4
 * \* Time: 14:39
 * \
 */

/**
 * 自定义比较器，用来比较User对象
 */
public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
      if (u1.getScore()>u2.getScore()){
          return -1;
      }else if(u1.getScore()<u2.getScore()){
          return 1;
      }else {
          return 0;
      }
    }
}