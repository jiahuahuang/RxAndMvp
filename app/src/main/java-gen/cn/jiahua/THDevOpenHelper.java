package cn.jiahua;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import cn.jiahua.bean.DaoMaster;


/**
 * Created by jhhuang on 2016/7/27.
 * QQ:781913268
 * Description：
 * 封装DaoMaster.OpenHelper方法, 在更新的时候,用来保存原来的数据
 * greenDao默认在更新的时候,会新建表,原来的数据就丢失了
 */

public class THDevOpenHelper extends DaoMaster.OpenHelper{
    public THDevOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory) {
        super(context, name, factory);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
