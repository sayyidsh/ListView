package pro.nanosystems.listview004;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import pro.nanosystems.listview004.data.DbHelper;
import pro.nanosystems.listview004.data.StudentContract;


public class MainActivity extends AppCompatActivity {
    ListView list ;
    /*
     * 0- Design Contract Class.
     * 1- Connect Database , Create Class extends SqliteOpenHelper.
     * 2- rowi tems  XML.
     * 3- Adapter
     * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.list_item);

        DbHelper dbHelper = new DbHelper(this);
        SQLiteDatabase qry = dbHelper.getReadableDatabase();

      Cursor c= qry.query(StudentContract.StudentData.TABLE_NAME,
              null, null, null,
              null, null, null);


       StudentAdapter obj = new StudentAdapter(this,c);
        list.setAdapter(obj);


    }
}
