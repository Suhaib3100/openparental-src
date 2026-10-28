package com.google.android.gms.common.sqlite;

import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.Cursor;
import android.database.CursorWindow;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class CursorWrapper extends android.database.CursorWrapper implements CrossProcessCursor {
    private AbstractWindowedCursor zza;

    @KeepForSdk
    public CursorWrapper(@o0 Cursor cursor) {
        super(cursor);
        for (int i5 = 0; i5 < 10 && (cursor instanceof android.database.CursorWrapper); i5++) {
            cursor = ((android.database.CursorWrapper) cursor).getWrappedCursor();
        }
        if (!(cursor instanceof AbstractWindowedCursor)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("బ").concat(cursor.getClass().getName()));
        }
        this.zza = (AbstractWindowedCursor) cursor;
    }

    @Override // android.database.CrossProcessCursor
    @KeepForSdk
    public void fillWindow(int i5, @o0 CursorWindow cursorWindow) {
        this.zza.fillWindow(i5, cursorWindow);
    }

    @Override // android.database.CrossProcessCursor
    @q0
    @KeepForSdk
    public CursorWindow getWindow() {
        return this.zza.getWindow();
    }

    @Override // android.database.CursorWrapper
    @o0
    public final /* synthetic */ Cursor getWrappedCursor() {
        return this.zza;
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int i5, int i6) {
        return this.zza.onMove(i5, i6);
    }

    @KeepForSdk
    public void setWindow(@q0 CursorWindow cursorWindow) {
        this.zza.setWindow(cursorWindow);
    }
}
