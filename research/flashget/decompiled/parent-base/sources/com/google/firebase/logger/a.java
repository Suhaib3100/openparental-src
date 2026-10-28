package com.google.firebase.logger;

import android.util.Log;
import androidx.annotation.m1;
import androidx.compose.material3.s3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kd.j;
import kd.n;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.t1;
import kotlin.jvm.internal.w;
import kotlin.text.v;

/* compiled from: Logger.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b!\b&\u0018\u0000 02\u00020\u0001:\u0004!%\u00190B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0012\b\u0002\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J;\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0014J#\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u0017J;\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u0014J#\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001b\u0010\u0017J;\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u0014J#\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001d\u0010\u0017J;\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u0014J#\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001f\u0010\u0017J;\u0010 \u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b \u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/google/firebase/logger/a;", "", "", "tag", "", "enabled", "Lcom/google/firebase/logger/a$d;", "minLevel", "<init>", "(Ljava/lang/String;ZLcom/google/firebase/logger/a$d;)V", "level", "format", "", "args", "", "throwable", "", "y", "(Lcom/google/firebase/logger/a$d;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "G", "(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "msg", "E", "(Ljava/lang/String;Ljava/lang/Throwable;)I", "e", "c", "u", "s", "M", "K", "k", "i", "x", "a", "Ljava/lang/String;", "q", "()Ljava/lang/String;", "b", "Z", "n", "()Z", "A", "(Z)V", "Lcom/google/firebase/logger/a$d;", "p", "()Lcom/google/firebase/logger/a$d;", "B", "(Lcom/google/firebase/logger/a$d;)V", "d", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,196:1\n26#2:197\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger\n*L\n78#1:197\n*E\n"})
/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion();

    /* renamed from: e, reason: collision with root package name */
    @l
    private static final ConcurrentHashMap<String, a> f59843e = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @l
    private final String tag;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @l
    private d minLevel;

    /* compiled from: Logger.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/firebase/logger/a$a;", "Lcom/google/firebase/logger/a;", "", "tag", "", "enabled", "Lcom/google/firebase/logger/a$d;", "minLevel", "<init>", "(Ljava/lang/String;ZLcom/google/firebase/logger/a$d;)V", "level", "format", "", "", "args", "", "throwable", "", "x", "(Lcom/google/firebase/logger/a$d;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$AndroidLogger\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1#2:197\n*E\n"})
    /* renamed from: com.google.firebase.logger.a$a, reason: collision with other inner class name */
    private static final class C0924a extends a {

        /* compiled from: Logger.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: com.google.firebase.logger.a$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0925a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f59847a;

            static {
                int[] iArr = new int[d.values().length];
                try {
                    iArr[d.VERBOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[d.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[d.WARN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[d.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f59847a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0924a(@l String str, boolean z4, @l d dVar) {
            super(str, z4, dVar, null);
            l0.p(str, ProtectedSandApp.s("ĭ\u0001"));
            l0.p(dVar, ProtectedSandApp.s("Į\u0001"));
        }

        @Override // com.google.firebase.logger.a
        public int x(@l d level, @l String format, @l Object[] args, @m Throwable throwable) {
            l0.p(level, ProtectedSandApp.s("į\u0001"));
            l0.p(format, ProtectedSandApp.s("İ\u0001"));
            l0.p(args, ProtectedSandApp.s("ı\u0001"));
            if (args.length != 0) {
                t1 t1Var = t1.f75371a;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                format = s3.a(copyOf, copyOf.length, format, ProtectedSandApp.s("Ĳ\u0001"));
            }
            int i4 = C0925a.f59847a[level.ordinal()];
            if (i4 == 1) {
                String tag = getTag();
                return throwable != null ? Log.v(tag, format, throwable) : Log.v(tag, format);
            }
            if (i4 == 2) {
                String tag2 = getTag();
                return throwable != null ? Log.d(tag2, format, throwable) : Log.d(tag2, format);
            }
            if (i4 == 3) {
                String tag3 = getTag();
                return throwable != null ? Log.i(tag3, format, throwable) : Log.i(tag3, format);
            }
            if (i4 == 4) {
                String tag4 = getTag();
                return throwable != null ? Log.w(tag4, format, throwable) : Log.w(tag4, format);
            }
            if (i4 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            String tag5 = getTag();
            return throwable != null ? Log.e(tag5, format, throwable) : Log.e(tag5, format);
        }
    }

    /* compiled from: Logger.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/firebase/logger/a$b;", "", "<init>", "()V", "", "tag", "", "enabled", "Lcom/google/firebase/logger/a$d;", "minLevel", "Lcom/google/firebase/logger/a;", "a", "(Ljava/lang/String;ZLcom/google/firebase/logger/a$d;)Lcom/google/firebase/logger/a;", "Lcom/google/firebase/logger/a$c;", "c", "(Ljava/lang/String;ZLcom/google/firebase/logger/a$d;)Lcom/google/firebase/logger/a$c;", "Ljava/util/concurrent/ConcurrentHashMap;", "loggers", "Ljava/util/concurrent/ConcurrentHashMap;", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$Companion\n+ 2 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n73#2,2:197\n1#3:199\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$Companion\n*L\n180#1:197,2\n180#1:199\n*E\n"})
    /* renamed from: com.google.firebase.logger.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ a b(Companion companion, String str, boolean z4, d dVar, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = true;
            }
            if ((i4 & 4) != 0) {
                dVar = d.INFO;
            }
            return companion.a(str, z4, dVar);
        }

        public static /* synthetic */ c d(Companion companion, String str, boolean z4, d dVar, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                z4 = true;
            }
            if ((i4 & 4) != 0) {
                dVar = d.DEBUG;
            }
            return companion.c(str, z4, dVar);
        }

        @l
        @n
        public final a a(@l String tag, boolean enabled, @l d minLevel) {
            Object putIfAbsent;
            l0.p(tag, ProtectedSandApp.s("ĳ\u0001"));
            l0.p(minLevel, ProtectedSandApp.s("Ĵ\u0001"));
            ConcurrentHashMap concurrentHashMap = a.f59843e;
            Object obj = concurrentHashMap.get(tag);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(tag, (obj = new C0924a(tag, enabled, minLevel)))) != null) {
                obj = putIfAbsent;
            }
            l0.o(obj, ProtectedSandApp.s("ĵ\u0001"));
            return (a) obj;
        }

        @l
        @n
        @m1
        public final c c(@l String tag, boolean enabled, @l d minLevel) {
            l0.p(tag, ProtectedSandApp.s("ĳ\u0001"));
            l0.p(minLevel, ProtectedSandApp.s("Ĵ\u0001"));
            c cVar = new c(tag, enabled, minLevel);
            a.f59843e.put(tag, cVar);
            return cVar;
        }

        public Companion(w wVar) {
        }
    }

    /* compiled from: Logger.kt */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/google/firebase/logger/a$c;", "Lcom/google/firebase/logger/a;", "", "tag", "", "enabled", "Lcom/google/firebase/logger/a$d;", "minLevel", "<init>", "(Ljava/lang/String;ZLcom/google/firebase/logger/a$d;)V", "level", "format", "", "", "args", "", "throwable", "S", "(Lcom/google/firebase/logger/a$d;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/String;", "", "x", "(Lcom/google/firebase/logger/a$d;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "Lkotlin/k2;", "P", "()V", "message", "Q", "(Ljava/lang/String;)Z", "Lkotlin/Function1;", "predicate", "R", "(Lld/l;)Z", "", "f", "Ljava/util/List;", "record", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @m1
    @r1({"SMAP\nLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$FakeLogger\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,196:1\n1747#2,3:197\n1747#2,3:200\n1#3:203\n*S KotlinDebug\n*F\n+ 1 Logger.kt\ncom/google/firebase/logger/Logger$FakeLogger\n*L\n144#1:197,3\n148#1:200,3\n*E\n"})
    public static final class c extends a {

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @l
        private final List<String> record;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@l String str, boolean z4, @l d dVar) {
            super(str, z4, dVar, null);
            l0.p(str, ProtectedSandApp.s("Ķ\u0001"));
            l0.p(dVar, ProtectedSandApp.s("ķ\u0001"));
            this.record = new ArrayList();
        }

        private final String S(d level, String format, Object[] args, Throwable throwable) {
            if (args.length != 0) {
                t1 t1Var = t1.f75371a;
                Object[] copyOf = Arrays.copyOf(args, args.length);
                format = s3.a(copyOf, copyOf.length, format, ProtectedSandApp.s("ĸ\u0001"));
            }
            if (throwable != null) {
                String str = level + ' ' + format + ' ' + Log.getStackTraceString(throwable);
                if (str != null) {
                    return str;
                }
            }
            return level + ' ' + format;
        }

        @m1
        public final void P() {
            this.record.clear();
        }

        @m1
        public final boolean Q(@l String message) {
            l0.p(message, ProtectedSandApp.s("Ĺ\u0001"));
            List<String> list = this.record;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (v.T2((String) it.next(), message, false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @m1
        public final boolean R(@l ld.l<? super String, Boolean> predicate) {
            l0.p(predicate, ProtectedSandApp.s("ĺ\u0001"));
            List<String> list = this.record;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (predicate.invoke(it.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.firebase.logger.a
        public int x(@l d level, @l String format, @l Object[] args, @m Throwable throwable) {
            l0.p(level, ProtectedSandApp.s("Ļ\u0001"));
            l0.p(format, ProtectedSandApp.s("ļ\u0001"));
            l0.p(args, ProtectedSandApp.s("Ľ\u0001"));
            String S = S(level, format, args, throwable);
            System.out.println((Object) androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("ľ\u0001"), S));
            this.record.add(S);
            return S.length();
        }
    }

    /* compiled from: Logger.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/google/firebase/logger/a$d;", "", "", "priority", "<init>", "(Ljava/lang/String;II)V", "I", "getPriority$com_google_firebase_firebase_common", "()I", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "com.google.firebase-firebase-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum d {
        VERBOSE(2),
        DEBUG(3),
        INFO(4),
        WARN(5),
        ERROR(6);

        private final int priority;

        d(int i4) {
            this.priority = i4;
        }

        /* renamed from: getPriority$com_google_firebase_firebase_common, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }
    }

    public /* synthetic */ a(String str, boolean z4, d dVar, w wVar) {
        this(str, z4, dVar);
    }

    @l
    @n
    @m1
    public static final c C(@l String str, boolean z4, @l d dVar) {
        return INSTANCE.c(str, z4, dVar);
    }

    public static /* synthetic */ int H(a aVar, String str, Throwable th, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ģ\u0001"));
        }
        if ((i4 & 2) != 0) {
            th = null;
        }
        return aVar.E(str, th);
    }

    public static /* synthetic */ int I(a aVar, String str, Object[] objArr, Throwable th, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ģ\u0001"));
        }
        if ((i4 & 4) != 0) {
            th = null;
        }
        return aVar.G(str, objArr, th);
    }

    public static /* synthetic */ int N(a aVar, String str, Throwable th, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("Ĥ\u0001"));
        }
        if ((i4 & 2) != 0) {
            th = null;
        }
        return aVar.K(str, th);
    }

    public static /* synthetic */ int O(a aVar, String str, Object[] objArr, Throwable th, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("Ĥ\u0001"));
        }
        if ((i4 & 4) != 0) {
            th = null;
        }
        return aVar.M(str, objArr, th);
    }

    public static /* synthetic */ int f(a aVar, String str, Throwable th, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ĥ\u0001"));
        }
        if ((i4 & 2) != 0) {
            th = null;
        }
        return aVar.c(str, th);
    }

    public static /* synthetic */ int g(a aVar, String str, Object[] objArr, Throwable th, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ĥ\u0001"));
        }
        if ((i4 & 4) != 0) {
            th = null;
        }
        return aVar.e(str, objArr, th);
    }

    public static /* synthetic */ int l(a aVar, String str, Throwable th, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("Ħ\u0001"));
        }
        if ((i4 & 2) != 0) {
            th = null;
        }
        return aVar.i(str, th);
    }

    public static /* synthetic */ int m(a aVar, String str, Object[] objArr, Throwable th, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("Ħ\u0001"));
        }
        if ((i4 & 4) != 0) {
            th = null;
        }
        return aVar.k(str, objArr, th);
    }

    @l
    @n
    public static final a o(@l String str, boolean z4, @l d dVar) {
        return INSTANCE.a(str, z4, dVar);
    }

    public static /* synthetic */ int v(a aVar, String str, Throwable th, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ħ\u0001"));
        }
        if ((i4 & 2) != 0) {
            th = null;
        }
        return aVar.s(str, th);
    }

    public static /* synthetic */ int w(a aVar, String str, Object[] objArr, Throwable th, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ħ\u0001"));
        }
        if ((i4 & 4) != 0) {
            th = null;
        }
        return aVar.u(str, objArr, th);
    }

    private final int y(d level, String format, Object[] args, Throwable throwable) {
        if (!this.enabled || (this.minLevel.getPriority() > level.getPriority() && !Log.isLoggable(this.tag, level.getPriority()))) {
            return 0;
        }
        return x(level, format, args, throwable);
    }

    static /* synthetic */ int z(a aVar, d dVar, String str, Object[] objArr, Throwable th, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("Ĩ\u0001"));
        }
        if ((i4 & 4) != 0) {
            objArr = new Object[0];
        }
        return aVar.y(dVar, str, objArr, th);
    }

    public final void A(boolean z4) {
        this.enabled = z4;
    }

    public final void B(@l d dVar) {
        l0.p(dVar, ProtectedSandApp.s("ĩ\u0001"));
        this.minLevel = dVar;
    }

    @j
    public final int D(@l String str) {
        l0.p(str, ProtectedSandApp.s("Ī\u0001"));
        return H(this, str, null, 2, null);
    }

    @j
    public final int E(@l String msg, @m Throwable throwable) {
        l0.p(msg, ProtectedSandApp.s("Ī\u0001"));
        return z(this, d.VERBOSE, msg, null, throwable, 4, null);
    }

    @j
    public final int F(@l String str, @l Object... objArr) {
        l0.p(str, ProtectedSandApp.s("ī\u0001"));
        l0.p(objArr, ProtectedSandApp.s("Ĭ\u0001"));
        return I(this, str, objArr, null, 4, null);
    }

    @j
    public final int G(@l String format, @l Object[] args, @m Throwable throwable) {
        l0.p(format, ProtectedSandApp.s("ī\u0001"));
        l0.p(args, ProtectedSandApp.s("Ĭ\u0001"));
        return y(d.VERBOSE, format, args, throwable);
    }

    @j
    public final int J(@l String str) {
        l0.p(str, ProtectedSandApp.s("Ī\u0001"));
        return N(this, str, null, 2, null);
    }

    @j
    public final int K(@l String msg, @m Throwable throwable) {
        l0.p(msg, ProtectedSandApp.s("Ī\u0001"));
        return z(this, d.WARN, msg, null, throwable, 4, null);
    }

    @j
    public final int L(@l String str, @l Object... objArr) {
        l0.p(str, ProtectedSandApp.s("ī\u0001"));
        l0.p(objArr, ProtectedSandApp.s("Ĭ\u0001"));
        return O(this, str, objArr, null, 4, null);
    }

    @j
    public final int M(@l String format, @l Object[] args, @m Throwable throwable) {
        l0.p(format, ProtectedSandApp.s("ī\u0001"));
        l0.p(args, ProtectedSandApp.s("Ĭ\u0001"));
        return y(d.WARN, format, args, throwable);
    }

    @j
    public final int b(@l String str) {
        l0.p(str, ProtectedSandApp.s("Ī\u0001"));
        return f(this, str, null, 2, null);
    }

    @j
    public final int c(@l String msg, @m Throwable throwable) {
        l0.p(msg, ProtectedSandApp.s("Ī\u0001"));
        return z(this, d.DEBUG, msg, null, throwable, 4, null);
    }

    @j
    public final int d(@l String str, @l Object... objArr) {
        l0.p(str, ProtectedSandApp.s("ī\u0001"));
        l0.p(objArr, ProtectedSandApp.s("Ĭ\u0001"));
        return g(this, str, objArr, null, 4, null);
    }

    @j
    public final int e(@l String format, @l Object[] args, @m Throwable throwable) {
        l0.p(format, ProtectedSandApp.s("ī\u0001"));
        l0.p(args, ProtectedSandApp.s("Ĭ\u0001"));
        return y(d.DEBUG, format, args, throwable);
    }

    @j
    public final int h(@l String str) {
        l0.p(str, ProtectedSandApp.s("Ī\u0001"));
        return l(this, str, null, 2, null);
    }

    @j
    public final int i(@l String msg, @m Throwable throwable) {
        l0.p(msg, ProtectedSandApp.s("Ī\u0001"));
        return z(this, d.ERROR, msg, null, throwable, 4, null);
    }

    @j
    public final int j(@l String str, @l Object... objArr) {
        l0.p(str, ProtectedSandApp.s("ī\u0001"));
        l0.p(objArr, ProtectedSandApp.s("Ĭ\u0001"));
        return m(this, str, objArr, null, 4, null);
    }

    @j
    public final int k(@l String format, @l Object[] args, @m Throwable throwable) {
        l0.p(format, ProtectedSandApp.s("ī\u0001"));
        l0.p(args, ProtectedSandApp.s("Ĭ\u0001"));
        return y(d.ERROR, format, args, throwable);
    }

    /* renamed from: n, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @l
    /* renamed from: p, reason: from getter */
    public final d getMinLevel() {
        return this.minLevel;
    }

    @l
    /* renamed from: q, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    @j
    public final int r(@l String str) {
        l0.p(str, ProtectedSandApp.s("Ī\u0001"));
        return v(this, str, null, 2, null);
    }

    @j
    public final int s(@l String msg, @m Throwable throwable) {
        l0.p(msg, ProtectedSandApp.s("Ī\u0001"));
        return z(this, d.INFO, msg, null, throwable, 4, null);
    }

    @j
    public final int t(@l String str, @l Object... objArr) {
        l0.p(str, ProtectedSandApp.s("ī\u0001"));
        l0.p(objArr, ProtectedSandApp.s("Ĭ\u0001"));
        return w(this, str, objArr, null, 4, null);
    }

    @j
    public final int u(@l String format, @l Object[] args, @m Throwable throwable) {
        l0.p(format, ProtectedSandApp.s("ī\u0001"));
        l0.p(args, ProtectedSandApp.s("Ĭ\u0001"));
        return y(d.INFO, format, args, throwable);
    }

    public abstract int x(@l d level, @l String format, @l Object[] args, @m Throwable throwable);

    private a(String str, boolean z4, d dVar) {
        this.tag = str;
        this.enabled = z4;
        this.minLevel = dVar;
    }
}
