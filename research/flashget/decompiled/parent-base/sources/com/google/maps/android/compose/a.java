package com.google.maps.android.compose;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CameraMoveStartedReason.kt */
@androidx.compose.runtime.m1
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/google/maps/android/compose/a;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "Companion", "a", "UNKNOWN", "NO_MOVEMENT_YET", "GESTURE", "API_ANIMATION", "DEVELOPER_ANIMATION", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class a {
    private static final /* synthetic */ kotlin.enums.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE;
    private final int value;
    public static final a UNKNOWN = new a(ProtectedSandApp.s("ڒ\u0001"), 0, -2);
    public static final a NO_MOVEMENT_YET = new a(ProtectedSandApp.s("ړ\u0001"), 1, -1);
    public static final a GESTURE = new a(ProtectedSandApp.s("ڔ\u0001"), 2, 1);
    public static final a API_ANIMATION = new a(ProtectedSandApp.s("ڕ\u0001"), 3, 2);
    public static final a DEVELOPER_ANIMATION = new a(ProtectedSandApp.s("ږ\u0001"), 4, 3);

    /* compiled from: CameraMoveStartedReason.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/google/maps/android/compose/a$a;", "", "<init>", "()V", "", "value", "Lcom/google/maps/android/compose/a;", "a", "(I)Lcom/google/maps/android/compose/a;", "maps-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nCameraMoveStartedReason.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraMoveStartedReason.kt\ncom/google/maps/android/compose/CameraMoveStartedReason$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,52:1\n1282#2,2:53\n*S KotlinDebug\n*F\n+ 1 CameraMoveStartedReason.kt\ncom/google/maps/android/compose/CameraMoveStartedReason$Companion\n*L\n49#1:53,2\n*E\n"})
    /* renamed from: com.google.maps.android.compose.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.l
        public final a a(int value) {
            a aVar;
            a[] values = a.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    aVar = null;
                    break;
                }
                aVar = values[i4];
                if (aVar.getValue() == value) {
                    break;
                }
                i4++;
            }
            return aVar == null ? a.UNKNOWN : aVar;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    private static final /* synthetic */ a[] $values() {
        return new a[]{UNKNOWN, NO_MOVEMENT_YET, GESTURE, API_ANIMATION, DEVELOPER_ANIMATION};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.c.c($values);
        INSTANCE = new Companion();
    }

    private a(String str, int i4, int i5) {
        this.value = i5;
    }

    @fg.l
    public static kotlin.enums.a<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
