package androidx.room;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import f3.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003#\u000f\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0097\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001f¨\u0006$"}, d2 = {"Landroidx/room/e;", "Lf3/e;", "Landroidx/room/p;", "delegate", "Landroidx/room/d;", "autoCloser", "<init>", "(Lf3/e;Landroidx/room/d;)V", "", "enabled", "Lkotlin/k2;", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "b", "Lf3/e;", "getDelegate", "()Lf3/e;", "c", "Landroidx/room/d;", "Landroidx/room/e$a;", "d", "Landroidx/room/e$a;", "autoClosingDb", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lf3/d;", "O2", "()Lf3/d;", "writableDatabase", "K2", "readableDatabase", "a", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements f3.e, p {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final f3.e delegate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.l
    @kd.f
    public final d autoCloser;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final a autoClosingDb;

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\tH\u0016¢\u0006\u0004\b$\u0010%J)\u0010)\u001a\u00020#2\u0006\u0010\"\u001a\u00020\t2\u0010\u0010(\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010'0&H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020#2\u0006\u0010\"\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J!\u00100\u001a\u00020#2\u0006\u0010\"\u001a\u00020+2\b\u0010/\u001a\u0004\u0018\u00010.H\u0017¢\u0006\u0004\b0\u00101J'\u00107\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\t2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J5\u0010;\u001a\u0002032\u0006\u00102\u001a\u00020\t2\b\u00109\u001a\u0004\u0018\u00010\t2\u0012\u0010:\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010'\u0018\u00010&H\u0016¢\u0006\u0004\b;\u0010<JE\u0010=\u001a\u0002032\u0006\u00102\u001a\u00020\t2\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u0002052\b\u00109\u001a\u0004\u0018\u00010\t2\u0012\u0010:\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010'\u0018\u00010&H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b?\u0010@J)\u0010A\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0010\u0010(\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010'0&H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\u00172\u0006\u0010C\u001a\u000203H\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00062\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u000203H\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010N\u001a\u00020\u00062\u0006\u0010M\u001a\u00020\u0017H\u0017¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0017H\u0016¢\u0006\u0004\bP\u0010\u0019J\u000f\u0010Q\u001a\u00020\u0006H\u0016¢\u0006\u0004\bQ\u0010\bJ\u000f\u0010R\u001a\u00020\u0006H\u0016¢\u0006\u0004\bR\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010V\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u0019R$\u0010W\u001a\u0002032\u0006\u0010W\u001a\u0002038V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010LR\u0014\u0010]\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\\R$\u0010a\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b^\u0010\\\"\u0004\b_\u0010`R\u0014\u0010c\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010\u0019R\u0014\u0010d\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bd\u0010\u0019R\u0016\u0010g\u001a\u0004\u0018\u00010\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\be\u0010fR\u0014\u0010i\u001a\u00020\u00178WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010\u0019R(\u0010n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0k\u0018\u00010j8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0014\u0010p\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bo\u0010\u0019¨\u0006q"}, d2 = {"Landroidx/room/e$a;", "Lf3/d;", "Landroidx/room/d;", "autoCloser", "<init>", "(Landroidx/room/d;)V", "Lkotlin/k2;", "a", "()V", "", "sql", "Lf3/i;", "i2", "(Ljava/lang/String;)Lf3/i;", "R", "J0", "Landroid/database/sqlite/SQLiteTransactionListener;", "transactionListener", "V0", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "l3", "Y0", "G0", "", "m3", "()Z", "P2", "", "sleepAfterYieldDelayMillis", "X1", "(J)Z", "numBytes", "L0", "(J)J", "query", "Landroid/database/Cursor;", "U2", "(Ljava/lang/String;)Landroid/database/Cursor;", "", "", "bindArgs", "Z1", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Lf3/g;", "i1", "(Lf3/g;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "cancellationSignal", "R1", "(Lf3/g;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "table", "", "conflictAlgorithm", "Landroid/content/ContentValues;", "values", "Y2", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "whereClause", "whereArgs", "P", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "F2", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "b0", "(Ljava/lang/String;)V", "I0", "(Ljava/lang/String;[Ljava/lang/Object;)V", "newVersion", "f1", "(I)Z", "Ljava/util/Locale;", "locale", "setLocale", "(Ljava/util/Locale;)V", "cacheSize", "y3", "(I)V", "enabled", "z2", "(Z)V", "F0", "a0", "close", "b", "Landroidx/room/d;", "X0", "isDbLockedByCurrentThread", "version", "getVersion", "()I", "setVersion", "E2", "()J", "maximumSize", "v", "B3", "(J)V", "pageSize", "v2", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "x3", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "Z", "()Ljava/util/List;", "attachedDbs", "e0", "isDatabaseIntegrityOk", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements f3.d {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.room.d autoCloser;

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lf3/d;", "obj", "", "Landroid/util/Pair;", "", "a", "(Lf3/d;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.e$a$a, reason: collision with other inner class name */
        static final class C0602a extends kotlin.jvm.internal.n0 implements ld.l<f3.d, List<? extends Pair<String, String>>> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0602a f33611b = new C0602a(1);

            C0602a() {
                super(1);
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Pair<String, String>> invoke(@fg.l f3.d obj) {
                kotlin.jvm.internal.l0.p(obj, "obj");
                return obj.Z();
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "db", "", "a", "(Lf3/d;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class b extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Integer> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f33612b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f33613c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object[] f33614d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, String str2, Object[] objArr) {
                super(1);
                this.f33612b = str;
                this.f33613c = str2;
                this.f33614d = objArr;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@fg.l f3.d db2) {
                kotlin.jvm.internal.l0.p(db2, "db");
                return Integer.valueOf(db2.P(this.f33612b, this.f33613c, this.f33614d));
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "db", "", "a", "(Lf3/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class c extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Object> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f33615b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str) {
                super(1);
                this.f33615b = str;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l f3.d db2) {
                kotlin.jvm.internal.l0.p(db2, "db");
                db2.b0(this.f33615b);
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "db", "", "a", "(Lf3/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class d extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Object> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f33616b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object[] f33617c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(String str, Object[] objArr) {
                super(1);
                this.f33616b = str;
                this.f33617c = objArr;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l f3.d db2) {
                kotlin.jvm.internal.l0.p(db2, "db");
                db2.I0(this.f33616b, this.f33617c);
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.room.e$a$e, reason: collision with other inner class name */
        /* synthetic */ class C0603e extends kotlin.jvm.internal.h0 implements ld.l<f3.d, Boolean> {

            /* renamed from: d, reason: collision with root package name */
            public static final C0603e f33618d = new C0603e();

            C0603e() {
                super(1, f3.d.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.l f3.d p02) {
                kotlin.jvm.internal.l0.p(p02, "p0");
                return Boolean.valueOf(p02.m3());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "db", "", "a", "(Lf3/d;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
        static final class f extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Long> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f33619b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f33620c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ContentValues f33621d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(String str, int i4, ContentValues contentValues) {
                super(1);
                this.f33619b = str;
                this.f33620c = i4;
                this.f33621d = contentValues;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(@fg.l f3.d db2) {
                kotlin.jvm.internal.l0.p(db2, "db");
                return Long.valueOf(db2.Y2(this.f33619b, this.f33620c, this.f33621d));
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "obj", "", "a", "(Lf3/d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class g extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final g f33622b = new g(1);

            g() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.l f3.d obj) {
                kotlin.jvm.internal.l0.p(obj, "obj");
                return Boolean.valueOf(obj.e0());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "obj", "", "a", "(Lf3/d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class i extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final i f33624b = new i(1);

            i() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.l f3.d obj) {
                kotlin.jvm.internal.l0.p(obj, "obj");
                return Boolean.valueOf(obj.v2());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "db", "", "a", "(Lf3/d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class j extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public static final j f33625b = new j(1);

            j() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.l f3.d db2) {
                kotlin.jvm.internal.l0.p(db2, "db");
                return Boolean.valueOf(db2.x3());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "db", "", "a", "(Lf3/d;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
        static final class l extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Boolean> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f33627b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            l(int i4) {
                super(1);
                this.f33627b = i4;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.l f3.d db2) {
                kotlin.jvm.internal.l0.p(db2, "db");
                return Boolean.valueOf(db2.f1(this.f33627b));
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "db", "", "a", "(Lf3/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class n extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Object> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f33629b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            n(long j4) {
                super(1);
                this.f33629b = j4;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l f3.d db2) {
                kotlin.jvm.internal.l0.p(db2, "db");
                db2.B3(this.f33629b);
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "obj", "", "a", "(Lf3/d;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        static final class o extends kotlin.jvm.internal.n0 implements ld.l<f3.d, String> {

            /* renamed from: b, reason: collision with root package name */
            public static final o f33630b = new o(1);

            o() {
                super(1);
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@fg.l f3.d obj) {
                kotlin.jvm.internal.l0.p(obj, "obj");
                return obj.getPath();
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "it", "", "a", "(Lf3/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class p extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Object> {

            /* renamed from: b, reason: collision with root package name */
            public static final p f33631b = new p(1);

            p() {
                super(1);
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l f3.d it) {
                kotlin.jvm.internal.l0.p(it, "it");
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "db", "", "a", "(Lf3/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class q extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Object> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f33632b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            q(boolean z4) {
                super(1);
                this.f33632b = z4;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l f3.d db2) {
                kotlin.jvm.internal.l0.p(db2, "db");
                db2.z2(this.f33632b);
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "db", "", "a", "(Lf3/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class r extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Object> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Locale f33633b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            r(Locale locale) {
                super(1);
                this.f33633b = locale;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l f3.d db2) {
                kotlin.jvm.internal.l0.p(db2, "db");
                db2.setLocale(this.f33633b);
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "db", "", "a", "(Lf3/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class s extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Object> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f33634b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            s(int i4) {
                super(1);
                this.f33634b = i4;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l f3.d db2) {
                kotlin.jvm.internal.l0.p(db2, "db");
                db2.y3(this.f33634b);
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "db", "", "a", "(Lf3/d;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
        static final class t extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Long> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f33635b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            t(long j4) {
                super(1);
                this.f33635b = j4;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(@fg.l f3.d db2) {
                kotlin.jvm.internal.l0.p(db2, "db");
                return Long.valueOf(db2.L0(this.f33635b));
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "db", "", "a", "(Lf3/d;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class u extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Integer> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f33636b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f33637c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ContentValues f33638d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f33639e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Object[] f33640f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            u(String str, int i4, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f33636b = str;
                this.f33637c = i4;
                this.f33638d = contentValues;
                this.f33639e = str2;
                this.f33640f = objArr;
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@fg.l f3.d db2) {
                kotlin.jvm.internal.l0.p(db2, "db");
                return Integer.valueOf(db2.F2(this.f33636b, this.f33637c, this.f33638d, this.f33639e, this.f33640f));
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/d;", "db", "", "a", "(Lf3/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class w extends kotlin.jvm.internal.n0 implements ld.l<f3.d, Object> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f33642b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            w(int i4) {
                super(1);
                this.f33642b = i4;
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l f3.d db2) {
                kotlin.jvm.internal.l0.p(db2, "db");
                db2.setVersion(this.f33642b);
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class x extends kotlin.jvm.internal.h0 implements ld.l<f3.d, Boolean> {

            /* renamed from: d, reason: collision with root package name */
            public static final x f33643d = new x();

            x() {
                super(1, f3.d.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.l f3.d p02) {
                kotlin.jvm.internal.l0.p(p02, "p0");
                return Boolean.valueOf(p02.P2());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class y extends kotlin.jvm.internal.h0 implements ld.l<f3.d, Boolean> {

            /* renamed from: d, reason: collision with root package name */
            public static final y f33644d = new y();

            y() {
                super(1, f3.d.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: Z, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@fg.l f3.d p02) {
                kotlin.jvm.internal.l0.p(p02, "p0");
                return Boolean.valueOf(p02.P2());
            }
        }

        public a(@fg.l androidx.room.d autoCloser) {
            kotlin.jvm.internal.l0.p(autoCloser, "autoCloser");
            this.autoCloser = autoCloser;
        }

        @Override // f3.d
        public void B3(long j4) {
            this.autoCloser.g(new n(j4));
        }

        @Override // f3.d
        public long E2() {
            return ((Number) this.autoCloser.g(new kotlin.jvm.internal.g1() { // from class: androidx.room.e.a.k
                @Override // kotlin.jvm.internal.g1, kotlin.reflect.q
                @fg.m
                public Object get(@fg.m Object obj) {
                    return Long.valueOf(((f3.d) obj).E2());
                }
            })).longValue();
        }

        @Override // f3.d
        public boolean F0() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // f3.d
        public int F2(@fg.l String table, int conflictAlgorithm, @fg.l ContentValues values, @fg.m String whereClause, @fg.m Object[] whereArgs) {
            kotlin.jvm.internal.l0.p(table, "table");
            kotlin.jvm.internal.l0.p(values, "values");
            return ((Number) this.autoCloser.g(new u(table, conflictAlgorithm, values, whereClause, whereArgs))).intValue();
        }

        @Override // f3.d
        public void G0() {
            kotlin.k2 k2Var;
            f3.d delegateDatabase = this.autoCloser.getDelegateDatabase();
            if (delegateDatabase != null) {
                delegateDatabase.G0();
                k2Var = kotlin.k2.f75408a;
            } else {
                k2Var = null;
            }
            if (k2Var == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // f3.d
        public void I0(@fg.l String sql, @fg.l Object[] bindArgs) throws SQLException {
            kotlin.jvm.internal.l0.p(sql, "sql");
            kotlin.jvm.internal.l0.p(bindArgs, "bindArgs");
            this.autoCloser.g(new d(sql, bindArgs));
        }

        @Override // f3.d
        public void J0() {
            try {
                this.autoCloser.n().J0();
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        @Override // f3.d
        public long L0(long numBytes) {
            return ((Number) this.autoCloser.g(new t(numBytes))).longValue();
        }

        @Override // f3.d
        public int P(@fg.l String table, @fg.m String whereClause, @fg.m Object[] whereArgs) {
            kotlin.jvm.internal.l0.p(table, "table");
            return ((Number) this.autoCloser.g(new b(table, whereClause, whereArgs))).intValue();
        }

        @Override // f3.d
        public boolean P2() {
            return ((Boolean) this.autoCloser.g(x.f33643d)).booleanValue();
        }

        @Override // f3.d
        public void R() {
            try {
                this.autoCloser.n().R();
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        @Override // f3.d
        @fg.l
        @androidx.annotation.x0(api = 24)
        public Cursor R1(@fg.l f3.g query, @fg.m CancellationSignal cancellationSignal) {
            kotlin.jvm.internal.l0.p(query, "query");
            try {
                return new c(this.autoCloser.n().R1(query, cancellationSignal), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        @Override // f3.d
        @fg.l
        public Cursor U2(@fg.l String query) {
            kotlin.jvm.internal.l0.p(query, "query");
            try {
                return new c(this.autoCloser.n().U2(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        @Override // f3.d
        public void V0(@fg.l SQLiteTransactionListener transactionListener) {
            kotlin.jvm.internal.l0.p(transactionListener, "transactionListener");
            try {
                this.autoCloser.n().V0(transactionListener);
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        @Override // f3.d
        public boolean X0() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.g(new kotlin.jvm.internal.g1() { // from class: androidx.room.e.a.h
                @Override // kotlin.jvm.internal.g1, kotlin.reflect.q
                @fg.m
                public Object get(@fg.m Object obj) {
                    return Boolean.valueOf(((f3.d) obj).X0());
                }
            })).booleanValue();
        }

        @Override // f3.d
        public boolean X1(long sleepAfterYieldDelayMillis) {
            return ((Boolean) this.autoCloser.g(y.f33644d)).booleanValue();
        }

        @Override // f3.d
        public void Y0() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                f3.d delegateDatabase = this.autoCloser.getDelegateDatabase();
                kotlin.jvm.internal.l0.m(delegateDatabase);
                delegateDatabase.Y0();
            } finally {
                this.autoCloser.e();
            }
        }

        @Override // f3.d
        public long Y2(@fg.l String table, int conflictAlgorithm, @fg.l ContentValues values) throws SQLException {
            kotlin.jvm.internal.l0.p(table, "table");
            kotlin.jvm.internal.l0.p(values, "values");
            return ((Number) this.autoCloser.g(new f(table, conflictAlgorithm, values))).longValue();
        }

        @Override // f3.d
        @fg.m
        public List<Pair<String, String>> Z() {
            return (List) this.autoCloser.g(C0602a.f33611b);
        }

        @Override // f3.d
        @fg.l
        public Cursor Z1(@fg.l String query, @fg.l Object[] bindArgs) {
            kotlin.jvm.internal.l0.p(query, "query");
            kotlin.jvm.internal.l0.p(bindArgs, "bindArgs");
            try {
                return new c(this.autoCloser.n().Z1(query, bindArgs), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        public final void a() {
            this.autoCloser.g(p.f33631b);
        }

        @Override // f3.d
        public void a0() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // f3.d
        public void b0(@fg.l String sql) throws SQLException {
            kotlin.jvm.internal.l0.p(sql, "sql");
            this.autoCloser.g(new c(sql));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.autoCloser.d();
        }

        @Override // f3.d
        public boolean e0() {
            return ((Boolean) this.autoCloser.g(g.f33622b)).booleanValue();
        }

        @Override // f3.d
        public boolean f1(int newVersion) {
            return ((Boolean) this.autoCloser.g(new l(newVersion))).booleanValue();
        }

        @Override // f3.d
        @fg.m
        public String getPath() {
            return (String) this.autoCloser.g(o.f33630b);
        }

        @Override // f3.d
        public int getVersion() {
            return ((Number) this.autoCloser.g(new kotlin.jvm.internal.x0() { // from class: androidx.room.e.a.v
                @Override // kotlin.jvm.internal.x0, kotlin.reflect.l
                public void G(@fg.m Object obj, @fg.m Object obj2) {
                    ((f3.d) obj).setVersion(((Number) obj2).intValue());
                }

                @Override // kotlin.jvm.internal.x0, kotlin.reflect.q
                @fg.m
                public Object get(@fg.m Object obj) {
                    return Integer.valueOf(((f3.d) obj).getVersion());
                }
            })).intValue();
        }

        @Override // f3.d
        @fg.l
        public Cursor i1(@fg.l f3.g query) {
            kotlin.jvm.internal.l0.p(query, "query");
            try {
                return new c(this.autoCloser.n().i1(query), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        @Override // f3.d
        @fg.l
        public f3.i i2(@fg.l String sql) {
            kotlin.jvm.internal.l0.p(sql, "sql");
            return new b(sql, this.autoCloser);
        }

        @Override // f3.d
        public boolean isOpen() {
            f3.d delegateDatabase = this.autoCloser.getDelegateDatabase();
            if (delegateDatabase == null) {
                return false;
            }
            return delegateDatabase.isOpen();
        }

        @Override // f3.d
        public void l3(@fg.l SQLiteTransactionListener transactionListener) {
            kotlin.jvm.internal.l0.p(transactionListener, "transactionListener");
            try {
                this.autoCloser.n().l3(transactionListener);
            } catch (Throwable th) {
                this.autoCloser.e();
                throw th;
            }
        }

        @Override // f3.d
        public boolean m3() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.g(C0603e.f33618d)).booleanValue();
        }

        @Override // f3.d
        public void setLocale(@fg.l Locale locale) {
            kotlin.jvm.internal.l0.p(locale, "locale");
            this.autoCloser.g(new r(locale));
        }

        @Override // f3.d
        public void setVersion(int i4) {
            this.autoCloser.g(new w(i4));
        }

        @Override // f3.d
        public long v() {
            return ((Number) this.autoCloser.g(new kotlin.jvm.internal.x0() { // from class: androidx.room.e.a.m
                @Override // kotlin.jvm.internal.x0, kotlin.reflect.l
                public void G(@fg.m Object obj, @fg.m Object obj2) {
                    ((f3.d) obj).B3(((Number) obj2).longValue());
                }

                @Override // kotlin.jvm.internal.x0, kotlin.reflect.q
                @fg.m
                public Object get(@fg.m Object obj) {
                    return Long.valueOf(((f3.d) obj).v());
                }
            })).longValue();
        }

        @Override // f3.d
        public boolean v2() {
            return ((Boolean) this.autoCloser.g(i.f33624b)).booleanValue();
        }

        @Override // f3.d
        @androidx.annotation.x0(api = 16)
        public boolean x3() {
            return ((Boolean) this.autoCloser.g(j.f33625b)).booleanValue();
        }

        @Override // f3.d
        public void y3(int cacheSize) {
            this.autoCloser.g(new s(cacheSize));
        }

        @Override // f3.d
        @androidx.annotation.x0(api = 16)
        public void z2(boolean enabled) {
            this.autoCloser.g(new q(enabled));
        }
    }

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0011\u0010 \u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u0011H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000eH\u0016¢\u0006\u0004\b/\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R(\u00106\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001303j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013`48\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105¨\u00067"}, d2 = {"Landroidx/room/e$b;", "Lf3/i;", "", "sql", "Landroidx/room/d;", "autoCloser", "<init>", "(Ljava/lang/String;Landroidx/room/d;)V", "T", "Lkotlin/Function1;", "block", "d", "(Lld/l;)Ljava/lang/Object;", "supportSQLiteStatement", "Lkotlin/k2;", "c", "(Lf3/i;)V", "", "bindIndex", "", "value", "e", "(ILjava/lang/Object;)V", "close", "()V", "j", "h0", "()I", "", "P1", "()J", "Y1", "R0", "()Ljava/lang/String;", "index", "h3", "(I)V", "C2", "(IJ)V", "", "k0", "(ID)V", "c2", "(ILjava/lang/String;)V", "", "L2", "(I[B)V", "C3", "b", "Ljava/lang/String;", "Landroidx/room/d;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "binds", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nAutoClosingRoomOpenHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoClosingRoomOpenHelper.kt\nandroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,571:1\n1864#2,3:572\n*S KotlinDebug\n*F\n+ 1 AutoClosingRoomOpenHelper.kt\nandroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement\n*L\n478#1:572,3\n*E\n"})
    private static final class b implements f3.i {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String sql;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final androidx.room.d autoCloser;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final ArrayList<Object> binds;

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/i;", "statement", "", "a", "(Lf3/i;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class a extends kotlin.jvm.internal.n0 implements ld.l<f3.i, Object> {

            /* renamed from: b, reason: collision with root package name */
            public static final a f33648b = new a(1);

            a() {
                super(1);
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@fg.l f3.i statement) {
                kotlin.jvm.internal.l0.p(statement, "statement");
                statement.j();
                return null;
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/i;", "obj", "", "a", "(Lf3/i;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.e$b$b, reason: collision with other inner class name */
        static final class C0604b extends kotlin.jvm.internal.n0 implements ld.l<f3.i, Long> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0604b f33649b = new C0604b(1);

            C0604b() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(@fg.l f3.i obj) {
                kotlin.jvm.internal.l0.p(obj, "obj");
                return Long.valueOf(obj.P1());
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lf3/d;", "db", "a", "(Lf3/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class c<T> extends kotlin.jvm.internal.n0 implements ld.l<f3.d, T> {

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ld.l<f3.i, T> f33651c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(ld.l<? super f3.i, ? extends T> lVar) {
                super(1);
                this.f33651c = lVar;
            }

            @Override // ld.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final T invoke(@fg.l f3.d db2) {
                kotlin.jvm.internal.l0.p(db2, "db");
                f3.i i22 = db2.i2(b.this.sql);
                b.this.c(i22);
                return this.f33651c.invoke(i22);
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/i;", "obj", "", "a", "(Lf3/i;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0})
        static final class d extends kotlin.jvm.internal.n0 implements ld.l<f3.i, Integer> {

            /* renamed from: b, reason: collision with root package name */
            public static final d f33652b = new d(1);

            d() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(@fg.l f3.i obj) {
                kotlin.jvm.internal.l0.p(obj, "obj");
                return Integer.valueOf(obj.h0());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/i;", "obj", "", "a", "(Lf3/i;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.room.e$b$e, reason: collision with other inner class name */
        static final class C0605e extends kotlin.jvm.internal.n0 implements ld.l<f3.i, Long> {

            /* renamed from: b, reason: collision with root package name */
            public static final C0605e f33653b = new C0605e(1);

            C0605e() {
                super(1);
            }

            @Override // ld.l
            @fg.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(@fg.l f3.i obj) {
                kotlin.jvm.internal.l0.p(obj, "obj");
                return Long.valueOf(obj.Y1());
            }
        }

        /* compiled from: AutoClosingRoomOpenHelper.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/i;", "obj", "", "a", "(Lf3/i;)Ljava/lang/String;"}, k = 3, mv = {1, 8, 0})
        static final class f extends kotlin.jvm.internal.n0 implements ld.l<f3.i, String> {

            /* renamed from: b, reason: collision with root package name */
            public static final f f33654b = new f(1);

            f() {
                super(1);
            }

            @Override // ld.l
            @fg.m
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(@fg.l f3.i obj) {
                kotlin.jvm.internal.l0.p(obj, "obj");
                return obj.R0();
            }
        }

        public b(@fg.l String sql, @fg.l androidx.room.d autoCloser) {
            kotlin.jvm.internal.l0.p(sql, "sql");
            kotlin.jvm.internal.l0.p(autoCloser, "autoCloser");
            this.sql = sql;
            this.autoCloser = autoCloser;
            this.binds = new ArrayList<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(f3.i supportSQLiteStatement) {
            Iterator<T> it = this.binds.iterator();
            int i4 = 0;
            while (it.hasNext()) {
                it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    kotlin.collections.w.Z();
                }
                Object obj = this.binds.get(i4);
                if (obj == null) {
                    supportSQLiteStatement.h3(i5);
                } else if (obj instanceof Long) {
                    supportSQLiteStatement.C2(i5, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    supportSQLiteStatement.k0(i5, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    supportSQLiteStatement.c2(i5, (String) obj);
                } else if (obj instanceof byte[]) {
                    supportSQLiteStatement.L2(i5, (byte[]) obj);
                }
                i4 = i5;
            }
        }

        private final <T> T d(ld.l<? super f3.i, ? extends T> block) {
            return (T) this.autoCloser.g(new c(block));
        }

        private final void e(int bindIndex, Object value) {
            int size;
            int i4 = bindIndex - 1;
            if (i4 >= this.binds.size() && (size = this.binds.size()) <= i4) {
                while (true) {
                    this.binds.add(null);
                    if (size == i4) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.binds.set(i4, value);
        }

        @Override // f3.f
        public void C2(int index, long value) {
            e(index, Long.valueOf(value));
        }

        @Override // f3.f
        public void C3() {
            this.binds.clear();
        }

        @Override // f3.f
        public void L2(int index, @fg.l byte[] value) {
            kotlin.jvm.internal.l0.p(value, "value");
            e(index, value);
        }

        @Override // f3.i
        public long P1() {
            return ((Number) d(C0604b.f33649b)).longValue();
        }

        @Override // f3.i
        @fg.m
        public String R0() {
            return (String) d(f.f33654b);
        }

        @Override // f3.i
        public long Y1() {
            return ((Number) d(C0605e.f33653b)).longValue();
        }

        @Override // f3.f
        public void c2(int index, @fg.l String value) {
            kotlin.jvm.internal.l0.p(value, "value");
            e(index, value);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // f3.i
        public int h0() {
            return ((Number) d(d.f33652b)).intValue();
        }

        @Override // f3.f
        public void h3(int index) {
            e(index, null);
        }

        @Override // f3.i
        public void j() {
            d(a.f33648b);
        }

        @Override // f3.f
        public void k0(int index, double value) {
            e(index, Double.valueOf(value));
        }
    }

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J(\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\tH\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\n \n*\u0004\u0018\u00010\u00110\u00112\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0017\u001a\u00020\u00072\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u00160\u0016H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u0019\u001a\u00020\u00072\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010\u00160\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u0018J \u0010\u001a\u001a\n \n*\u0004\u0018\u00010\u00160\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001d\u001a(\u0012\f\u0012\n \n*\u0004\u0018\u00010\u00160\u0016 \n*\u0014\u0012\u000e\b\u0001\u0012\n \n*\u0004\u0018\u00010\u00160\u0016\u0018\u00010\u001c0\u001cH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\u001f\u0010\u0015J\u0018\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\n \n*\u0004\u0018\u00010#0#H\u0096\u0001¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b)\u0010*J\u0018\u0010,\u001a\u00020+2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b.\u0010\u0015J\u0018\u00100\u001a\u00020/2\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b0\u00101J \u00102\u001a\n \n*\u0004\u0018\u00010\u00160\u00162\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b2\u0010\u001bJ\u0018\u00103\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b3\u0010*J\u0010\u00105\u001a\u000204H\u0096\u0001¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u000204H\u0096\u0001¢\u0006\u0004\b7\u00106J\u0010\u00108\u001a\u000204H\u0096\u0001¢\u0006\u0004\b8\u00106J\u0010\u00109\u001a\u000204H\u0096\u0001¢\u0006\u0004\b9\u00106J\u0010\u0010:\u001a\u000204H\u0096\u0001¢\u0006\u0004\b:\u00106J\u0010\u0010;\u001a\u000204H\u0096\u0001¢\u0006\u0004\b;\u00106J\u0018\u0010<\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b>\u0010=J\u0010\u0010?\u001a\u000204H\u0096\u0001¢\u0006\u0004\b?\u00106J\u0010\u0010@\u001a\u000204H\u0096\u0001¢\u0006\u0004\b@\u00106J\u0010\u0010A\u001a\u000204H\u0096\u0001¢\u0006\u0004\bA\u00106J\u0018\u0010B\u001a\u0002042\u0006\u0010\b\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\bB\u0010=J\u0010\u0010C\u001a\u000204H\u0096\u0001¢\u0006\u0004\bC\u00106J \u0010E\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010D0DH\u0096\u0001¢\u0006\u0004\bE\u0010FJ \u0010H\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010G0GH\u0096\u0001¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u000204H\u0097\u0001¢\u0006\u0004\bJ\u00106J(\u0010K\u001a\n \n*\u0004\u0018\u00010#0#2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010#0#H\u0096\u0001¢\u0006\u0004\bK\u0010LJ0\u0010O\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010M0M2\u000e\u0010\u000b\u001a\n \n*\u0004\u0018\u00010N0NH\u0096\u0001¢\u0006\u0004\bO\u0010PJ \u0010Q\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010D0DH\u0096\u0001¢\u0006\u0004\bQ\u0010FJ \u0010R\u001a\u00020\f2\u000e\u0010\b\u001a\n \n*\u0004\u0018\u00010G0GH\u0096\u0001¢\u0006\u0004\bR\u0010IJ\u000f\u0010S\u001a\u00020\fH\u0016¢\u0006\u0004\bS\u0010\u0010J%\u0010W\u001a\u00020\f2\u0006\u0010T\u001a\u00020M2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020N0UH\u0017¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020NH\u0017¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\b\u0012\u0004\u0012\u00020N0UH\u0017¢\u0006\u0004\b[\u0010\\J\u0017\u0010^\u001a\u00020\f2\u0006\u0010]\u001a\u00020#H\u0017¢\u0006\u0004\b^\u0010_R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006d"}, d2 = {"Landroidx/room/e$c;", "Landroid/database/Cursor;", "delegate", "Landroidx/room/d;", "autoCloser", "<init>", "(Landroid/database/Cursor;Landroidx/room/d;)V", "", "p0", "Landroid/database/CharArrayBuffer;", "kotlin.jvm.PlatformType", "p1", "Lkotlin/k2;", "copyStringToBuffer", "(ILandroid/database/CharArrayBuffer;)V", "deactivate", "()V", "", "getBlob", "(I)[B", "getColumnCount", "()I", "", "getColumnIndex", "(Ljava/lang/String;)I", "getColumnIndexOrThrow", "getColumnName", "(I)Ljava/lang/String;", "", "getColumnNames", "()[Ljava/lang/String;", "getCount", "", "getDouble", "(I)D", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "", "getFloat", "(I)F", "getInt", "(I)I", "", "getLong", "(I)J", "getPosition", "", "getShort", "(I)S", "getString", "getType", "", "getWantsAllOnMoveCalls", "()Z", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "(I)Z", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "Landroid/database/ContentObserver;", "registerContentObserver", "(Landroid/database/ContentObserver;)V", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "(Landroid/database/DataSetObserver;)V", "requery", "respond", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "Landroid/content/ContentResolver;", "Landroid/net/Uri;", "setNotificationUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "unregisterContentObserver", "unregisterDataSetObserver", "close", "cr", "", "uris", "setNotificationUris", "(Landroid/content/ContentResolver;Ljava/util/List;)V", "getNotificationUri", "()Landroid/net/Uri;", "getNotificationUris", "()Ljava/util/List;", "extras", "setExtras", "(Landroid/os/Bundle;)V", "b", "Landroid/database/Cursor;", "c", "Landroidx/room/d;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class c implements Cursor {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final Cursor delegate;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final d autoCloser;

        public c(@fg.l Cursor delegate, @fg.l d autoCloser) {
            kotlin.jvm.internal.l0.p(delegate, "delegate");
            kotlin.jvm.internal.l0.p(autoCloser, "autoCloser");
            this.delegate = delegate;
            this.autoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int p02, CharArrayBuffer p12) {
            this.delegate.copyStringToBuffer(p02, p12);
        }

        @Override // android.database.Cursor
        @kotlin.k(message = "Deprecated in Java")
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int p02) {
            return this.delegate.getBlob(p02);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String p02) {
            return this.delegate.getColumnIndex(p02);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String p02) {
            return this.delegate.getColumnIndexOrThrow(p02);
        }

        @Override // android.database.Cursor
        public String getColumnName(int p02) {
            return this.delegate.getColumnName(p02);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int p02) {
            return this.delegate.getDouble(p02);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int p02) {
            return this.delegate.getFloat(p02);
        }

        @Override // android.database.Cursor
        public int getInt(int p02) {
            return this.delegate.getInt(p02);
        }

        @Override // android.database.Cursor
        public long getLong(int p02) {
            return this.delegate.getLong(p02);
        }

        @Override // android.database.Cursor
        @fg.l
        @androidx.annotation.x0(api = 19)
        public Uri getNotificationUri() {
            return c.b.a(this.delegate);
        }

        @Override // android.database.Cursor
        @fg.l
        @androidx.annotation.x0(api = 29)
        public List<Uri> getNotificationUris() {
            return c.e.a(this.delegate);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int p02) {
            return this.delegate.getShort(p02);
        }

        @Override // android.database.Cursor
        public String getString(int p02) {
            return this.delegate.getString(p02);
        }

        @Override // android.database.Cursor
        public int getType(int p02) {
            return this.delegate.getType(p02);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int p02) {
            return this.delegate.isNull(p02);
        }

        @Override // android.database.Cursor
        public boolean move(int p02) {
            return this.delegate.move(p02);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int p02) {
            return this.delegate.moveToPosition(p02);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver p02) {
            this.delegate.registerContentObserver(p02);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver p02) {
            this.delegate.registerDataSetObserver(p02);
        }

        @Override // android.database.Cursor
        @kotlin.k(message = "Deprecated in Java")
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle p02) {
            return this.delegate.respond(p02);
        }

        @Override // android.database.Cursor
        @androidx.annotation.x0(api = 23)
        public void setExtras(@fg.l Bundle extras) {
            kotlin.jvm.internal.l0.p(extras, "extras");
            c.d.a(this.delegate, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver p02, Uri p12) {
            this.delegate.setNotificationUri(p02, p12);
        }

        @Override // android.database.Cursor
        @androidx.annotation.x0(api = 29)
        public void setNotificationUris(@fg.l ContentResolver cr, @fg.l List<? extends Uri> uris) {
            kotlin.jvm.internal.l0.p(cr, "cr");
            kotlin.jvm.internal.l0.p(uris, "uris");
            c.e.b(this.delegate, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver p02) {
            this.delegate.unregisterContentObserver(p02);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver p02) {
            this.delegate.unregisterDataSetObserver(p02);
        }
    }

    public e(@fg.l f3.e delegate, @fg.l d autoCloser) {
        kotlin.jvm.internal.l0.p(delegate, "delegate");
        kotlin.jvm.internal.l0.p(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
        autoCloser.o(delegate);
        this.autoClosingDb = new a(autoCloser);
    }

    @Override // f3.e
    @fg.l
    @androidx.annotation.x0(api = 24)
    public f3.d K2() {
        this.autoClosingDb.a();
        return this.autoClosingDb;
    }

    @Override // f3.e
    @fg.l
    @androidx.annotation.x0(api = 24)
    public f3.d O2() {
        this.autoClosingDb.a();
        return this.autoClosingDb;
    }

    @Override // f3.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.autoClosingDb.close();
    }

    @Override // f3.e
    @fg.m
    /* renamed from: getDatabaseName */
    public String getName() {
        return this.delegate.getName();
    }

    @Override // androidx.room.p
    @fg.l
    public f3.e getDelegate() {
        return this.delegate;
    }

    @Override // f3.e
    @androidx.annotation.x0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }
}
