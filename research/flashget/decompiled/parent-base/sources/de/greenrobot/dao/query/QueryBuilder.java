package de.greenrobot.dao.query;

import com.flashget.parentalcontrol.ProtectedSandApp;
import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoException;
import de.greenrobot.dao.DaoLog;
import de.greenrobot.dao.InternalQueryDaoAccess;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.SqlUtils;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes7.dex */
public class QueryBuilder<T> {
    public static boolean LOG_SQL;
    public static boolean LOG_VALUES;
    private final AbstractDao<T, ?> dao;
    private StringBuilder joinBuilder;
    private Integer limit;
    private Integer offset;
    private StringBuilder orderBuilder;
    private final String tablePrefix;
    private final List<Object> values;
    private final List<WhereCondition> whereConditions;

    protected QueryBuilder(AbstractDao<T, ?> abstractDao) {
        this(abstractDao, ProtectedSandApp.s("态\u0001"));
    }

    private void appendWhereClause(StringBuilder sb, String str) {
        this.values.clear();
        if (this.whereConditions.isEmpty()) {
            return;
        }
        sb.append(ProtectedSandApp.s("怂\u0001"));
        ListIterator<WhereCondition> listIterator = this.whereConditions.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.hasPrevious()) {
                sb.append(ProtectedSandApp.s("怃\u0001"));
            }
            WhereCondition next = listIterator.next();
            next.appendTo(sb, str);
            next.appendValuesTo(this.values);
        }
    }

    private void checkOrderBuilder() {
        StringBuilder sb = this.orderBuilder;
        if (sb == null) {
            this.orderBuilder = new StringBuilder();
        } else if (sb.length() > 0) {
            this.orderBuilder.append(ProtectedSandApp.s("怄\u0001"));
        }
    }

    public static <T2> QueryBuilder<T2> internalCreate(AbstractDao<T2, ?> abstractDao) {
        return new QueryBuilder<>(abstractDao);
    }

    private void orderAscOrDesc(String str, Property... propertyArr) {
        for (Property property : propertyArr) {
            checkOrderBuilder();
            append(this.orderBuilder, property);
            if (String.class.equals(property.type)) {
                this.orderBuilder.append(ProtectedSandApp.s("怅\u0001"));
            }
            this.orderBuilder.append(str);
        }
    }

    protected void addCondition(StringBuilder sb, List<Object> list, WhereCondition whereCondition) {
        checkCondition(whereCondition);
        whereCondition.appendTo(sb, this.tablePrefix);
        whereCondition.appendValuesTo(list);
    }

    public WhereCondition and(WhereCondition whereCondition, WhereCondition whereCondition2, WhereCondition... whereConditionArr) {
        return combineWhereConditions(ProtectedSandApp.s("怃\u0001"), whereCondition, whereCondition2, whereConditionArr);
    }

    protected StringBuilder append(StringBuilder sb, Property property) {
        checkProperty(property);
        sb.append(this.tablePrefix);
        sb.append('.');
        sb.append('\'');
        sb.append(property.columnName);
        sb.append('\'');
        return sb;
    }

    public Query<T> build() {
        int i4;
        StringBuilder sb = this.joinBuilder;
        StringBuilder sb2 = new StringBuilder((sb == null || sb.length() == 0) ? InternalQueryDaoAccess.getStatements(this.dao).getSelectAll() : SqlUtils.createSqlSelect(this.dao.getTablename(), this.tablePrefix, this.dao.getAllColumns()));
        appendWhereClause(sb2, this.tablePrefix);
        StringBuilder sb3 = this.orderBuilder;
        if (sb3 != null && sb3.length() > 0) {
            sb2.append(ProtectedSandApp.s("怆\u0001"));
            sb2.append((CharSequence) this.orderBuilder);
        }
        int i5 = -1;
        if (this.limit != null) {
            sb2.append(ProtectedSandApp.s("怇\u0001"));
            this.values.add(this.limit);
            i4 = this.values.size() - 1;
        } else {
            i4 = -1;
        }
        if (this.offset != null) {
            if (this.limit == null) {
                throw new IllegalStateException(ProtectedSandApp.s("怉\u0001"));
            }
            sb2.append(ProtectedSandApp.s("怈\u0001"));
            this.values.add(this.offset);
            i5 = this.values.size() - 1;
        }
        String sb4 = sb2.toString();
        if (LOG_SQL) {
            DaoLog.d(ProtectedSandApp.s("怊\u0001") + sb4);
        }
        if (LOG_VALUES) {
            DaoLog.d(ProtectedSandApp.s("怋\u0001") + this.values);
        }
        return Query.create(this.dao, sb4, this.values.toArray(), i4, i5);
    }

    public CountQuery<T> buildCount() {
        String tablename = this.dao.getTablename();
        StringBuilder sb = new StringBuilder(SqlUtils.createSqlSelectCountStar(tablename));
        appendWhereClause(sb, tablename);
        String sb2 = sb.toString();
        if (LOG_SQL) {
            DaoLog.d(ProtectedSandApp.s("怌\u0001") + sb2);
        }
        if (LOG_VALUES) {
            DaoLog.d(ProtectedSandApp.s("怍\u0001") + this.values);
        }
        return CountQuery.create(this.dao, sb2, this.values.toArray());
    }

    public DeleteQuery<T> buildDelete() {
        String tablename = this.dao.getTablename();
        StringBuilder sb = new StringBuilder(SqlUtils.createSqlDelete(tablename, null));
        appendWhereClause(sb, tablename);
        String sb2 = sb.toString();
        if (LOG_SQL) {
            DaoLog.d(ProtectedSandApp.s("怎\u0001") + sb2);
        }
        if (LOG_VALUES) {
            DaoLog.d(ProtectedSandApp.s("怏\u0001") + this.values);
        }
        return DeleteQuery.create(this.dao, sb2, this.values.toArray());
    }

    protected void checkCondition(WhereCondition whereCondition) {
        if (whereCondition instanceof WhereCondition.PropertyCondition) {
            checkProperty(((WhereCondition.PropertyCondition) whereCondition).property);
        }
    }

    protected void checkProperty(Property property) {
        AbstractDao<T, ?> abstractDao = this.dao;
        if (abstractDao != null) {
            for (Property property2 : abstractDao.getProperties()) {
                if (property == property2) {
                    return;
                }
            }
            throw new DaoException(ProtectedSandApp.s("怐\u0001") + property.name + ProtectedSandApp.s("怑\u0001") + this.dao);
        }
    }

    protected WhereCondition combineWhereConditions(String str, WhereCondition whereCondition, WhereCondition whereCondition2, WhereCondition... whereConditionArr) {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("怒\u0001"));
        ArrayList arrayList = new ArrayList();
        addCondition(sb, arrayList, whereCondition);
        sb.append(str);
        addCondition(sb, arrayList, whereCondition2);
        for (WhereCondition whereCondition3 : whereConditionArr) {
            sb.append(str);
            addCondition(sb, arrayList, whereCondition3);
        }
        sb.append(')');
        return new WhereCondition.StringCondition(sb.toString(), arrayList.toArray());
    }

    public long count() {
        return buildCount().count();
    }

    public <J> QueryBuilder<J> join(Class<J> cls, Property property) {
        throw new UnsupportedOperationException();
    }

    public <J> QueryBuilder<J> joinToMany(Class<J> cls, Property property) {
        throw new UnsupportedOperationException();
    }

    public QueryBuilder<T> limit(int i4) {
        this.limit = Integer.valueOf(i4);
        return this;
    }

    public List<T> list() {
        return build().list();
    }

    public CloseableListIterator<T> listIterator() {
        return build().listIterator();
    }

    public LazyList<T> listLazy() {
        return build().listLazy();
    }

    public LazyList<T> listLazyUncached() {
        return build().listLazyUncached();
    }

    public QueryBuilder<T> offset(int i4) {
        this.offset = Integer.valueOf(i4);
        return this;
    }

    public WhereCondition or(WhereCondition whereCondition, WhereCondition whereCondition2, WhereCondition... whereConditionArr) {
        return combineWhereConditions(ProtectedSandApp.s("怓\u0001"), whereCondition, whereCondition2, whereConditionArr);
    }

    public QueryBuilder<T> orderAsc(Property... propertyArr) {
        orderAscOrDesc(ProtectedSandApp.s("怔\u0001"), propertyArr);
        return this;
    }

    public QueryBuilder<T> orderCustom(Property property, String str) {
        checkOrderBuilder();
        append(this.orderBuilder, property).append(' ');
        this.orderBuilder.append(str);
        return this;
    }

    public QueryBuilder<T> orderDesc(Property... propertyArr) {
        orderAscOrDesc(ProtectedSandApp.s("怕\u0001"), propertyArr);
        return this;
    }

    public QueryBuilder<T> orderRaw(String str) {
        checkOrderBuilder();
        this.orderBuilder.append(str);
        return this;
    }

    public T unique() {
        return build().unique();
    }

    public T uniqueOrThrow() {
        return build().uniqueOrThrow();
    }

    public QueryBuilder<T> where(WhereCondition whereCondition, WhereCondition... whereConditionArr) {
        this.whereConditions.add(whereCondition);
        for (WhereCondition whereCondition2 : whereConditionArr) {
            checkCondition(whereCondition2);
            this.whereConditions.add(whereCondition2);
        }
        return this;
    }

    public QueryBuilder<T> whereOr(WhereCondition whereCondition, WhereCondition whereCondition2, WhereCondition... whereConditionArr) {
        this.whereConditions.add(or(whereCondition, whereCondition2, whereConditionArr));
        return this;
    }

    protected QueryBuilder(AbstractDao<T, ?> abstractDao, String str) {
        this.dao = abstractDao;
        this.tablePrefix = str;
        this.values = new ArrayList();
        this.whereConditions = new ArrayList();
    }
}
