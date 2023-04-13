package database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class QuestionDatabaseHelper extends SQLiteOpenHelper
{
    private static final String DATABASE_NAME = "my_database";
    private static final int DATABASE_VERSION = 1;
    public QuestionDatabaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String createTable = "CREATE TABLE questions(_id Integer PRIMARY KEY, question TEXT, " +
                "answer1 TEXT, answer2 TEXT, answer3 TEXT, answer4 TEXT, correctAnswer Text)";
        db.execSQL(createTable);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion,
                          int newVersion)
    {

    }
    public void addQuestion(String question, String answer1, String answer2,
                            String answer3, String answer4, String correctAnswer) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("question", question);
        values.put("answer1", answer1);
        values.put("answer2", answer2);
        values.put("answer3", answer3);
        values.put("answer4", answer4);
        values.put("correctAnswer", correctAnswer);

        long newRowId = db.insert("questions", null, values);
    }

}
