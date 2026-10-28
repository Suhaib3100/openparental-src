package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.m2;
import kotlin.time.Duration;

/* compiled from: SettingsProvider.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Lcom/google/firebase/sessions/settings/h;", "", "Lkotlin/m2;", "e", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "c", "a", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/e;", "b", "()Lkotlin/time/e;", "sessionRestartTimeout", "", "d", "()Ljava/lang/Double;", "samplingRate", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface h {

    /* compiled from: SettingsProvider.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public static boolean a(@d5.d h hVar) {
            return false;
        }

        @d5.e
        public static Object b(@d5.d h hVar, @d5.d Continuation<? super m2> continuation) {
            return m2.f23662a;
        }
    }

    @d5.e
    Boolean a();

    @d5.e
    Duration b();

    boolean c();

    @d5.e
    Double d();

    @d5.e
    Object e(@d5.d Continuation<? super m2> continuation);
}
