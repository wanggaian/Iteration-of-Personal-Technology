package com.wga.service.singleton;

import com.wga.java.service.singleton.SingletonHungry;
import com.wga.java.service.singleton.SingletonHungryEnum;
import com.wga.java.service.singleton.SingletonLazy;
import com.wga.java.service.singleton.SingletonLazyDoubleCheckLock;
import com.wga.java.service.singleton.SingletonLazyHolder;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * SingletonTest
 *
 * @Author wanggaian <v_wanggaian@baidu.com>
 * @Date 2019/3/6 14:13
 */
public class SingletonTest {

    @Test
    public void singletonHungryTest() {
        System.out.println("SingletonHungry -> " + SingletonHungry.getInstance().hashCode());
    }

    @Test
    public void singletonLazyTest() {
        System.out.println("SingletonLazy -> " + SingletonLazy.getInstance().hashCode());
    }

    @Test
    public void singletonLazyDoubleCheckLockTest() {
        System.out.println("SingletonLazyDoubleCheckLock -> " + SingletonLazyDoubleCheckLock.getInstance().hashCode());
    }

    @Test
    public void singletonLazyHolderTest() {
        System.out.println("SingletonLazyHolder -> " + SingletonLazyHolder.getInstance().hashCode());
    }

    @Test
    public void singletonHungryEnumTest() {
        System.out.println("SingletonHungryEnum" + SingletonHungryEnum.INSTANCE.hashCode());
        SingletonHungryEnum.INSTANCE.doSomething();
    }

    /**
     * serializable 在序列化的时候被破坏
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Test
    public void serializableTest1() throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
        oos.writeObject(SingletonLazyDoubleCheckLock.getInstance());
        File file = new File("tempFile");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        SingletonLazyDoubleCheckLock newInstance = (SingletonLazyDoubleCheckLock) ois.readObject();
        System.out.println(newInstance.equals(SingletonLazyDoubleCheckLock.getInstance()));
        System.out.println(newInstance == SingletonLazyDoubleCheckLock.getInstance());
    }
}


    //Write Obj to file
//    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tempFile"));
//        oos.writeObject(Singleton.getSingleton());
//                //Read Obj from file
//                File file = new File("tempFile");
//                ObjectInputStream ois =  new ObjectInputStream(new FileInputStream(file));
//                Singleton newInstance = (Singleton) ois.readObject();
//                //判断是否是同一个对象
//                System.out.println(newInstance == Singleton.getSingleton());