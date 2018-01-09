package pro.nanosystems.listview004;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Sayyid Shaban on 09/01/2018.
 * E-mail: sayyid.ls@gmail.com
 */

public class StudentAdapter extends CursorAdapter {
    public StudentAdapter(Context context, Cursor c) {
        super(context, c, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.items_list, parent,false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView idView, nameView, classView;
        idView =  view.findViewById(R.id.idView);
        nameView = view.findViewById(R.id.nameView);
        classView = view.findViewById(R.id.classView);
        idView.setText(cursor.getInt(0) +"");
        nameView.setText(cursor.getString(1));
        classView.setText(cursor.getString(2));

    }
}
