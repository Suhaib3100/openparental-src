package androidx.content;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.l0;
import fg.l;
import kotlin.Metadata;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.n0;

/* compiled from: ActivityNavArgsLazy.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/n;", "Args", "Landroid/app/Activity;", "Landroidx/navigation/o;", "a", "(Landroid/app/Activity;)Landroidx/navigation/o;", "navigation-runtime_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* renamed from: androidx.navigation.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1456c {

    /* compiled from: ActivityNavArgsLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/navigation/n;", "Args", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;"}, k = 3, mv = {1, 6, 0})
    /* renamed from: androidx.navigation.c$a */
    public static final class a extends n0 implements ld.a<Bundle> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f31011b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity) {
            super(0);
            this.f31011b = activity;
        }

        @Override // ld.a
        @l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Bundle invoke() {
            Bundle bundle;
            Intent intent = this.f31011b.getIntent();
            if (intent == null) {
                bundle = null;
            } else {
                Activity activity = this.f31011b;
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    throw new IllegalStateException("Activity " + activity + " has null extras in " + intent);
                }
                bundle = extras;
            }
            if (bundle != null) {
                return bundle;
            }
            throw new IllegalStateException("Activity " + this.f31011b + " has a null Intent");
        }
    }

    @l0
    public static final <Args extends n> o<Args> a(Activity activity) {
        kotlin.jvm.internal.l0.p(activity, "<this>");
        kotlin.jvm.internal.l0.P();
        return new o<>(l1.d(n.class), new a(activity));
    }
}
