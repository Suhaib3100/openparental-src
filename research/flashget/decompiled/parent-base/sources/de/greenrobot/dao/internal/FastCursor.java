package de.greenrobot.dao.internal;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes7.dex */
public final class FastCursor implements Cursor {
    private final int count;
    private int position;
    private final CursorWindow window;

    public FastCursor(CursorWindow cursorWindow) {
        this.window = cursorWindow;
        this.count = cursorWindow.getNumRows();
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int i4, CharArrayBuffer charArrayBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void deactivate() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int i4) {
        return this.window.getBlob(this.position, i4);
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public int getColumnIndex(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(String str) throws IllegalArgumentException {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public String getColumnName(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public String[] getColumnNames() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public int getCount() {
        return this.window.getNumRows();
    }

    @Override // android.database.Cursor
    public double getDouble(int i4) {
        return this.window.getDouble(this.position, i4);
    }

    @Override // android.database.Cursor
    public Bundle getExtras() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public float getFloat(int i4) {
        return this.window.getFloat(this.position, i4);
    }

    @Override // android.database.Cursor
    public int getInt(int i4) {
        return this.window.getInt(this.position, i4);
    }

    @Override // android.database.Cursor
    public long getLong(int i4) {
        return this.window.getLong(this.position, i4);
    }

    @Override // android.database.Cursor
    public int getPosition() {
        return this.position;
    }

    @Override // android.database.Cursor
    public short getShort(int i4) {
        return this.window.getShort(this.position, i4);
    }

    @Override // android.database.Cursor
    public String getString(int i4) {
        return this.window.getString(this.position, i4);
    }

    @Override // android.database.Cursor
    public int getType(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean isAfterLast() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean isBeforeFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean isFirst() {
        return this.position == 0;
    }

    @Override // android.database.Cursor
    public boolean isLast() {
        return this.position == this.count - 1;
    }

    @Override // android.database.Cursor
    public boolean isNull(int i4) {
        return this.window.isNull(this.position, i4);
    }

    @Override // android.database.Cursor
    public boolean move(int i4) {
        return moveToPosition(this.position + i4);
    }

    @Override // android.database.Cursor
    public boolean moveToFirst() {
        this.position = 0;
        return this.count > 0;
    }

    @Override // android.database.Cursor
    public boolean moveToLast() {
        int i4 = this.count;
        if (i4 <= 0) {
            return false;
        }
        this.position = i4 - 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToNext() {
        int i4 = this.position;
        if (i4 >= this.count - 1) {
            return false;
        }
        this.position = i4 + 1;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPosition(int i4) {
        if (i4 < 0 || i4 >= this.count) {
            return false;
        }
        this.position = i4;
        return true;
    }

    @Override // android.database.Cursor
    public boolean moveToPrevious() {
        int i4 = this.position;
        if (i4 <= 0) {
            return false;
        }
        this.position = i4 - 1;
        return true;
    }

    @Override // android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public boolean requery() {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public Bundle respond(Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
        throw new UnsupportedOperationException();
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        throw new UnsupportedOperationException();
    }
}
