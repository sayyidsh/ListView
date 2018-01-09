package pro.nanosystems.listview004.data;

import android.provider.BaseColumns;

/**
 * Created by Sayyid Shaban on 09/01/2018.
 * E-mail: sayyid.ls@gmail.com
 */

public final class StudentContract {
    public final static class StudentData implements BaseColumns {
        public static final String TABLE_NAME = "student";

        public static final String NAME = "name";
        public static final String CLASS = "class";

        public static final String CREATE_SQL = " create table " +
                TABLE_NAME + "( " + _ID
                + " integer primary key autoincrement , " +
                NAME + " text, " + CLASS + " text );";
        public static final String DROP_SQL = " drop table if exists " +
                TABLE_NAME;
    }
}
