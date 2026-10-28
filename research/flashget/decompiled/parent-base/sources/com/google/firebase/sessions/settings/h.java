package com.google.firebase.sessions.settings;

import fg.l;
import fg.m;
import kotlin.Metadata;
import kotlin.k2;

/* compiled from: SettingsProvider.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u000b8&X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Lcom/google/firebase/sessions/settings/h;", "", "Lkotlin/k2;", "e", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "d", "()Z", "a", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/e;", "b", "()Lkotlin/time/e;", "sessionRestartTimeout", "", "c", "()Ljava/lang/Double;", "samplingRate", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface h {

    /* compiled from: SettingsProvider.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static boolean a(@l h hVar) {
            return false;
        }

        @m
        public static Object b(@l h hVar, @l kotlin.coroutines.d<? super k2> dVar) {
            return k2.f75408a;
        }
    }

    @m
    Boolean a();

    @m
    kotlin.time.e b();

    @m
    Double c();

    boolean d();

    @m
    Object e(@l kotlin.coroutines.d<? super k2> dVar);
}
