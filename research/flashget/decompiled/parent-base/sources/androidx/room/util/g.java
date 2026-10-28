package androidx.room.util;

import androidx.annotation.c1;
import androidx.annotation.m1;
import androidx.compose.ui.graphics.k6;
import androidx.compose.ui.graphics.l6;
import androidx.room.h0;
import androidx.room.i;
import fg.l;
import fg.m;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kd.n;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.v;

/* compiled from: TableInfo.kt */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0006\u0018\u001a\u001c\u001e\u001f BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rB3\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\f\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/room/util/g;", "", "", "name", "", "Landroidx/room/util/g$a;", "columns", "", "Landroidx/room/util/g$d;", "foreignKeys", "Landroidx/room/util/g$f;", "indices", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Ljava/util/Map;", "c", "Ljava/util/Set;", "d", "e", "f", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: f, reason: collision with root package name */
    public static final int f33963f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final int f33964g = 1;

    /* renamed from: h, reason: collision with root package name */
    public static final int f33965h = 2;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    @kd.f
    public final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @l
    @kd.f
    public final Map<String, a> columns;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    @kd.f
    public final Set<d> foreignKeys;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @m
    @kd.f
    public final Set<f> indices;

    /* compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/room/util/g$b;", "", "<init>", "()V", "Lf3/d;", "database", "", "tableName", "Landroidx/room/util/g;", "a", "(Lf3/d;Ljava/lang/String;)Landroidx/room/util/g;", "", "CREATED_FROM_DATABASE", "I", "CREATED_FROM_ENTITY", "CREATED_FROM_UNKNOWN", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.room.util.g$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @l
        @n
        public final g a(@l f3.d database, @l String tableName) {
            l0.p(database, "database");
            l0.p(tableName, "tableName");
            return h.f(database, tableName);
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0003\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/util/g$c;", "", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @dd.e(dd.a.SOURCE)
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* compiled from: TableInfo.kt */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/room/util/g$d;", "", "", "referenceTable", "onDelete", "onUpdate", "", "columnNames", "referenceColumnNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "c", "d", "Ljava/util/List;", "e", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        @kd.f
        public final String referenceTable;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        @kd.f
        public final String onDelete;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        @kd.f
        public final String onUpdate;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @l
        @kd.f
        public final List<String> columnNames;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @l
        @kd.f
        public final List<String> referenceColumnNames;

        public d(@l String referenceTable, @l String onDelete, @l String onUpdate, @l List<String> columnNames, @l List<String> referenceColumnNames) {
            l0.p(referenceTable, "referenceTable");
            l0.p(onDelete, "onDelete");
            l0.p(onUpdate, "onUpdate");
            l0.p(columnNames, "columnNames");
            l0.p(referenceColumnNames, "referenceColumnNames");
            this.referenceTable = referenceTable;
            this.onDelete = onDelete;
            this.onUpdate = onUpdate;
            this.columnNames = columnNames;
            this.referenceColumnNames = referenceColumnNames;
        }

        public boolean equals(@m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            if (l0.g(this.referenceTable, dVar.referenceTable) && l0.g(this.onDelete, dVar.onDelete) && l0.g(this.onUpdate, dVar.onUpdate) && l0.g(this.columnNames, dVar.columnNames)) {
                return l0.g(this.referenceColumnNames, dVar.referenceColumnNames);
            }
            return false;
        }

        public int hashCode() {
            return this.referenceColumnNames.hashCode() + k6.a(this.columnNames, androidx.compose.foundation.text.modifiers.n.a(this.onUpdate, androidx.compose.foundation.text.modifiers.n.a(this.onDelete, this.referenceTable.hashCode() * 31, 31), 31), 31);
        }

        @l
        public String toString() {
            StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
            sb.append(this.referenceTable);
            sb.append("', onDelete='");
            sb.append(this.onDelete);
            sb.append(" +', onUpdate='");
            sb.append(this.onUpdate);
            sb.append("', columnNames=");
            sb.append(this.columnNames);
            sb.append(", referenceColumnNames=");
            return l6.a(sb, this.referenceColumnNames, '}');
        }
    }

    /* compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Landroidx/room/util/g$e;", "", "", "id", "sequence", "", "from", "to", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "other", "a", "(Landroidx/room/util/g$e;)I", "b", "I", "c", "()I", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e implements Comparable<e> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int id;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int sequence;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @l
        private final String from;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @l
        private final String to;

        public e(int i4, int i5, @l String from, @l String to) {
            l0.p(from, "from");
            l0.p(to, "to");
            this.id = i4;
            this.sequence = i5;
            this.from = from;
            this.to = to;
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@l e other) {
            l0.p(other, "other");
            int i4 = this.id - other.id;
            return i4 == 0 ? this.sequence - other.sequence : i4;
        }

        @l
        /* renamed from: b, reason: from getter */
        public final String getFrom() {
            return this.from;
        }

        /* renamed from: c, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* renamed from: d, reason: from getter */
        public final int getSequence() {
            return this.sequence;
        }

        @l
        /* renamed from: e, reason: from getter */
        public final String getTo() {
            return this.to;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(@l String name, @l Map<String, a> columns, @l Set<d> foreignKeys) {
        this(name, columns, foreignKeys, kotlin.collections.l0.f74939b);
        l0.p(name, "name");
        l0.p(columns, "columns");
        l0.p(foreignKeys, "foreignKeys");
    }

    @l
    @n
    public static final g a(@l f3.d dVar, @l String str) {
        return INSTANCE.a(dVar, str);
    }

    public boolean equals(@m Object other) {
        Set<f> set;
        if (this == other) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        if (!l0.g(this.name, gVar.name) || !l0.g(this.columns, gVar.columns) || !l0.g(this.foreignKeys, gVar.foreignKeys)) {
            return false;
        }
        Set<f> set2 = this.indices;
        if (set2 == null || (set = gVar.indices) == null) {
            return true;
        }
        return l0.g(set2, set);
    }

    public int hashCode() {
        return this.foreignKeys.hashCode() + ((this.columns.hashCode() + (this.name.hashCode() * 31)) * 31);
    }

    @l
    public String toString() {
        return "TableInfo{name='" + this.name + "', columns=" + this.columns + ", foreignKeys=" + this.foreignKeys + ", indices=" + this.indices + '}';
    }

    public g(@l String name, @l Map<String, a> columns, @l Set<d> foreignKeys, @m Set<f> set) {
        l0.p(name, "name");
        l0.p(columns, "columns");
        l0.p(foreignKeys, "foreignKeys");
        this.name = name;
        this.columns = columns;
        this.foreignKeys = foreignKeys;
        this.indices = set;
    }

    /* compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\u0018\u0000 $2\u00020\u0001:\u0001\u0017B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fB)\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001a\u0010!\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u0012\u0004\b\u0019\u0010 R\u0011\u0010#\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\"¨\u0006%"}, d2 = {"Landroidx/room/util/g$a;", "", "", "name", "type", "", "notNull", "", "primaryKeyPosition", "defaultValue", "createdFrom", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V", "(Ljava/lang/String;Ljava/lang/String;ZI)V", "b", "(Ljava/lang/String;)I", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "Z", "d", "I", "e", "f", "g", "()V", "affinity", "()Z", "isPrimaryKey", "h", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        @kd.f
        public final String name;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @l
        @kd.f
        public final String type;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final boolean notNull;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int primaryKeyPosition;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @m
        @kd.f
        public final String defaultValue;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int createdFrom;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final int affinity;

        /* compiled from: TableInfo.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/room/util/g$a$a;", "", "<init>", "()V", "", "current", "", "a", "(Ljava/lang/String;)Z", "other", "b", "(Ljava/lang/String;Ljava/lang/String;)Z", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Column$Companion\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,646:1\n1183#2,3:647\n*S KotlinDebug\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Column$Companion\n*L\n249#1:647,3\n*E\n"})
        /* renamed from: androidx.room.util.g$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            private final boolean a(String current) {
                if (current.length() == 0) {
                    return false;
                }
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (i4 < current.length()) {
                    char charAt = current.charAt(i4);
                    int i7 = i6 + 1;
                    if (i6 == 0 && charAt != '(') {
                        return false;
                    }
                    if (charAt == '(') {
                        i5++;
                    } else if (charAt == ')' && i5 - 1 == 0 && i6 != current.length() - 1) {
                        return false;
                    }
                    i4++;
                    i6 = i7;
                }
                return i5 == 0;
            }

            @n
            @m1
            public final boolean b(@l String current, @m String other) {
                l0.p(current, "current");
                if (l0.g(current, other)) {
                    return true;
                }
                if (!a(current)) {
                    return false;
                }
                String substring = current.substring(1, current.length() - 1);
                l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                return l0.g(v.C5(substring).toString(), other);
            }

            public Companion(w wVar) {
            }
        }

        public a(@l String name, @l String type, boolean z4, int i4, @m String str, int i5) {
            l0.p(name, "name");
            l0.p(type, "type");
            this.name = name;
            this.type = type;
            this.notNull = z4;
            this.primaryKeyPosition = i4;
            this.defaultValue = str;
            this.createdFrom = i5;
            this.affinity = b(type);
        }

        @n
        @m1
        public static final boolean a(@l String str, @m String str2) {
            return INSTANCE.b(str, str2);
        }

        @i.c
        private final int b(String type) {
            if (type == null) {
                return 5;
            }
            Locale US = Locale.US;
            l0.o(US, "US");
            String upperCase = type.toUpperCase(US);
            l0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
            if (v.T2(upperCase, "INT", false, 2, null)) {
                return 3;
            }
            if (v.T2(upperCase, "CHAR", false, 2, null) || v.T2(upperCase, "CLOB", false, 2, null) || v.T2(upperCase, "TEXT", false, 2, null)) {
                return 2;
            }
            if (v.T2(upperCase, "BLOB", false, 2, null)) {
                return 5;
            }
            return (v.T2(upperCase, "REAL", false, 2, null) || v.T2(upperCase, "FLOA", false, 2, null) || v.T2(upperCase, "DOUB", false, 2, null)) ? 4 : 1;
        }

        @i.c
        public static /* synthetic */ void c() {
        }

        public final boolean d() {
            return this.primaryKeyPosition > 0;
        }

        public boolean equals(@m Object other) {
            String str;
            String str2;
            String str3;
            if (this == other) {
                return true;
            }
            if (!(other instanceof a) || this.primaryKeyPosition != ((a) other).primaryKeyPosition) {
                return false;
            }
            a aVar = (a) other;
            if (!l0.g(this.name, aVar.name) || this.notNull != aVar.notNull) {
                return false;
            }
            if (this.createdFrom == 1 && aVar.createdFrom == 2 && (str3 = this.defaultValue) != null && !INSTANCE.b(str3, aVar.defaultValue)) {
                return false;
            }
            if (this.createdFrom == 2 && aVar.createdFrom == 1 && (str2 = aVar.defaultValue) != null && !INSTANCE.b(str2, this.defaultValue)) {
                return false;
            }
            int i4 = this.createdFrom;
            return (i4 == 0 || i4 != aVar.createdFrom || ((str = this.defaultValue) == null ? aVar.defaultValue == null : INSTANCE.b(str, aVar.defaultValue))) && this.affinity == aVar.affinity;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + this.affinity) * 31) + (this.notNull ? 1231 : 1237)) * 31) + this.primaryKeyPosition;
        }

        @l
        public String toString() {
            StringBuilder sb = new StringBuilder("Column{name='");
            sb.append(this.name);
            sb.append("', type='");
            sb.append(this.type);
            sb.append("', affinity='");
            sb.append(this.affinity);
            sb.append("', notNull=");
            sb.append(this.notNull);
            sb.append(", primaryKeyPosition=");
            sb.append(this.primaryKeyPosition);
            sb.append(", defaultValue='");
            String str = this.defaultValue;
            if (str == null) {
                str = "undefined";
            }
            return android.support.v4.media.c.a(sb, str, "'}");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @k(message = "Use {@link Column#Column(String, String, boolean, int, String, int)} instead.")
        public a(@l String name, @l String type, boolean z4, int i4) {
            this(name, type, z4, i4, null, 0);
            l0.p(name, "name");
            l0.p(type, "type");
        }
    }

    /* compiled from: TableInfo.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0014B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nB'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/room/util/g$f;", "", "", "name", "", "unique", "", "columns", "orders", "<init>", "(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;ZLjava/util/List;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "Z", "c", "Ljava/util/List;", "d", "e", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @r1({"SMAP\nTableInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TableInfo.kt\nandroidx/room/util/TableInfo$Index\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,646:1\n1#2:647\n*E\n"})
    public static final class f {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @l
        @kd.f
        public final String name;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public final boolean unique;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @l
        @kd.f
        public final List<String> columns;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @l
        @kd.f
        public List<String> orders;

        /* renamed from: f, reason: collision with root package name */
        @l
        public static final String f33988f = "index_";

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public f(@l String name, boolean z4, @l List<String> columns, @l List<String> orders) {
            l0.p(name, "name");
            l0.p(columns, "columns");
            l0.p(orders, "orders");
            this.name = name;
            this.unique = z4;
            this.columns = columns;
            this.orders = orders;
            List<String> list = orders;
            if (list.isEmpty()) {
                int size = columns.size();
                list = new ArrayList(size);
                for (int i4 = 0; i4 < size; i4++) {
                    list.add(h0.a.ASC.name());
                }
            }
            this.orders = (List) list;
        }

        public boolean equals(@m Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof f)) {
                return false;
            }
            f fVar = (f) other;
            if (this.unique == fVar.unique && l0.g(this.columns, fVar.columns) && l0.g(this.orders, fVar.orders)) {
                return v.s2(this.name, "index_", false, 2, null) ? v.s2(fVar.name, "index_", false, 2, null) : l0.g(this.name, fVar.name);
            }
            return false;
        }

        public int hashCode() {
            return this.orders.hashCode() + k6.a(this.columns, (((v.s2(this.name, "index_", false, 2, null) ? -1184239155 : this.name.hashCode()) * 31) + (this.unique ? 1 : 0)) * 31, 31);
        }

        @l
        public String toString() {
            StringBuilder sb = new StringBuilder("Index{name='");
            sb.append(this.name);
            sb.append("', unique=");
            sb.append(this.unique);
            sb.append(", columns=");
            sb.append(this.columns);
            sb.append(", orders=");
            return androidx.privacysandbox.ads.adservices.measurement.d.a(sb, this.orders, "'}");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        @kotlin.k(message = "Use {@link #Index(String, boolean, List, List)}")
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public f(@fg.l java.lang.String r5, boolean r6, @fg.l java.util.List<java.lang.String> r7) {
            /*
                r4 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.l0.p(r5, r0)
                java.lang.String r0 = "columns"
                kotlin.jvm.internal.l0.p(r7, r0)
                int r0 = r7.size()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r0)
                r2 = 0
            L14:
                if (r2 >= r0) goto L22
                androidx.room.h0$a r3 = androidx.room.h0.a.ASC
                java.lang.String r3 = r3.name()
                r1.add(r3)
                int r2 = r2 + 1
                goto L14
            L22:
                r4.<init>(r5, r6, r7, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.g.f.<init>(java.lang.String, boolean, java.util.List):void");
        }
    }

    public /* synthetic */ g(String str, Map map, Set set, Set set2, int i4, w wVar) {
        this(str, map, set, (i4 & 8) != 0 ? null : set2);
    }
}
