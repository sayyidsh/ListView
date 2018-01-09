package pro.nanosystems.listview004.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * Created by Sayyid Shaban on 09/01/2018.
 * E-mail: sayyid.ls@gmail.com
 */

public class DbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME ="students.db";
    public static final int VERSION = 1;
    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(StudentContract.StudentData.CREATE_SQL);
        ContentValues values = new ContentValues();
        values.put(StudentContract.StudentData.NAME, "Ahmed");
        values.put(StudentContract.StudentData.CLASS,"1st");
        db.insert(StudentContract.StudentData.TABLE_NAME, null,values);
        values.put(StudentContract.StudentData.NAME, "Mohamed");
        values.put(StudentContract.StudentData.CLASS,"1st");
        db.insert(StudentContract.StudentData.TABLE_NAME, null,values);
        values.put(StudentContract.StudentData.NAME, "Ali");
        values.put(StudentContract.StudentData.CLASS,"1st");
        db.insert(StudentContract.StudentData.TABLE_NAME, null,values);
        values.put(StudentContract.StudentData.NAME, "Hassan");
        values.put(StudentContract.StudentData.CLASS,"1st");
        db.insert(StudentContract.StudentData.TABLE_NAME, null,values);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(StudentContract.StudentData.DROP_SQL);
        onCreate(db);

    }
}
