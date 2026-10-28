package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;
import kotlin.m2;

/* compiled from: SharedPreferences.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, d2 = {"Landroid/content/SharedPreferences;", "", "commit", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lkotlin/m2;", "Lkotlin/u;", "action", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class t {
    @SuppressLint({"ApplySharedPref"})
    public static final void a(@d5.d SharedPreferences sharedPreferences, boolean z5, @d5.d q3.l<? super SharedPreferences.Editor, m2> action) {
        l0.p(sharedPreferences, "<this>");
        l0.p(action, "action");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        l0.o(editor, "editor");
        action.N(editor);
        if (z5) {
            editor.commit();
        } else {
            editor.apply();
        }
    }

    public static /* synthetic */ void b(SharedPreferences sharedPreferences, boolean z5, q3.l action, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z5 = false;
        }
        l0.p(sharedPreferences, "<this>");
        l0.p(action, "action");
        SharedPreferences.Editor editor = sharedPreferences.edit();
        l0.o(editor, "editor");
        action.N(editor);
        if (z5) {
            editor.commit();
        } else {
            editor.apply();
        }
    }
}
