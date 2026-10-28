package de.greenrobot.dao;

import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.query.WhereCondition;
import java.util.Collection;

/* loaded from: classes7.dex */
public class Property {
    public final String columnName;
    public final String name;
    public final int ordinal;
    public final boolean primaryKey;
    public final Class<?> type;

    public Property(int i4, Class<?> cls, String str, boolean z4, String str2) {
        this.ordinal = i4;
        this.type = cls;
        this.name = str;
        this.primaryKey = z4;
        this.columnName = str2;
    }

    public WhereCondition between(Object obj, Object obj2) {
        return new WhereCondition.PropertyCondition(this, ProtectedSandApp.s("徰\u0001"), new Object[]{obj, obj2});
    }

    public WhereCondition eq(Object obj) {
        return new WhereCondition.PropertyCondition(this, ProtectedSandApp.s("徱\u0001"), obj);
    }

    public WhereCondition ge(Object obj) {
        return new WhereCondition.PropertyCondition(this, ProtectedSandApp.s("徲\u0001"), obj);
    }

    public WhereCondition gt(Object obj) {
        return new WhereCondition.PropertyCondition(this, ProtectedSandApp.s("徳\u0001"), obj);
    }

    public WhereCondition in(Object... objArr) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("徴\u0001"));
        SqlUtils.appendPlaceholders(sb, objArr.length).append(')');
        return new WhereCondition.PropertyCondition(this, sb.toString(), objArr);
    }

    public WhereCondition isNotNull() {
        return new WhereCondition.PropertyCondition(this, ProtectedSandApp.s("徵\u0001"));
    }

    public WhereCondition isNull() {
        return new WhereCondition.PropertyCondition(this, ProtectedSandApp.s("徶\u0001"));
    }

    public WhereCondition le(Object obj) {
        return new WhereCondition.PropertyCondition(this, ProtectedSandApp.s("德\u0001"), obj);
    }

    public WhereCondition like(String str) {
        return new WhereCondition.PropertyCondition(this, ProtectedSandApp.s("徸\u0001"), str);
    }

    public WhereCondition lt(Object obj) {
        return new WhereCondition.PropertyCondition(this, ProtectedSandApp.s("徹\u0001"), obj);
    }

    public WhereCondition notEq(Object obj) {
        return new WhereCondition.PropertyCondition(this, ProtectedSandApp.s("徺\u0001"), obj);
    }

    public WhereCondition notIn(Object... objArr) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("徻\u0001"));
        SqlUtils.appendPlaceholders(sb, objArr.length).append(')');
        return new WhereCondition.PropertyCondition(this, sb.toString(), objArr);
    }

    public WhereCondition in(Collection<?> collection) {
        return in(collection.toArray());
    }

    public WhereCondition notIn(Collection<?> collection) {
        return notIn(collection.toArray());
    }
}
