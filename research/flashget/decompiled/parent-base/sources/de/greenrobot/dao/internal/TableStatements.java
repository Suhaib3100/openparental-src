package de.greenrobot.dao.internal;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public class TableStatements {
    private final String[] allColumns;

    /* renamed from: db, reason: collision with root package name */
    private final SQLiteDatabase f73726db;
    private SQLiteStatement deleteStatement;
    private SQLiteStatement insertOrReplaceStatement;
    private SQLiteStatement insertStatement;
    private final String[] pkColumns;
    private volatile String selectAll;
    private volatile String selectByKey;
    private volatile String selectByRowId;
    private volatile String selectKeys;
    private final String tablename;
    private SQLiteStatement updateStatement;

    public TableStatements(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String[] strArr2) {
        this.f73726db = sQLiteDatabase;
        this.tablename = str;
        this.allColumns = strArr;
        this.pkColumns = strArr2;
    }

    public SQLiteStatement getDeleteStatement() {
        if (this.deleteStatement == null) {
            this.deleteStatement = this.f73726db.compileStatement(SqlUtils.createSqlDelete(this.tablename, this.pkColumns));
        }
        return this.deleteStatement;
    }

    public SQLiteStatement getInsertOrReplaceStatement() {
        if (this.insertOrReplaceStatement == null) {
            this.insertOrReplaceStatement = this.f73726db.compileStatement(SqlUtils.createSqlInsert(ProtectedSandApp.s("忲\u0001"), this.tablename, this.allColumns));
        }
        return this.insertOrReplaceStatement;
    }

    public SQLiteStatement getInsertStatement() {
        if (this.insertStatement == null) {
            this.insertStatement = this.f73726db.compileStatement(SqlUtils.createSqlInsert(ProtectedSandApp.s("忳\u0001"), this.tablename, this.allColumns));
        }
        return this.insertStatement;
    }

    public String getSelectAll() {
        if (this.selectAll == null) {
            this.selectAll = SqlUtils.createSqlSelect(this.tablename, ProtectedSandApp.s("忴\u0001"), this.allColumns);
        }
        return this.selectAll;
    }

    public String getSelectByKey() {
        if (this.selectByKey == null) {
            StringBuilder sb = new StringBuilder(getSelectAll());
            sb.append(ProtectedSandApp.s("念\u0001"));
            SqlUtils.appendColumnsEqValue(sb, ProtectedSandApp.s("忴\u0001"), this.pkColumns);
            this.selectByKey = sb.toString();
        }
        return this.selectByKey;
    }

    public String getSelectByRowId() {
        if (this.selectByRowId == null) {
            this.selectByRowId = getSelectAll() + ProtectedSandApp.s("忶\u0001");
        }
        return this.selectByRowId;
    }

    public String getSelectKeys() {
        if (this.selectKeys == null) {
            this.selectKeys = SqlUtils.createSqlSelect(this.tablename, ProtectedSandApp.s("忴\u0001"), this.pkColumns);
        }
        return this.selectKeys;
    }

    public SQLiteStatement getUpdateStatement() {
        if (this.updateStatement == null) {
            this.updateStatement = this.f73726db.compileStatement(SqlUtils.createSqlUpdate(this.tablename, this.allColumns, this.pkColumns));
        }
        return this.updateStatement;
    }
}
