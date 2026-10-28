package b;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.result.ActivityResult;
import android.view.result.IntentSenderRequest;
import androidx.annotation.x0;
import b.a;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.EmptyList;
import kotlin.collections.e1;
import kotlin.collections.f1;
import kotlin.collections.j0;
import kotlin.collections.t;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;

/* compiled from: ActivityResultContracts.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u000f\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0013"}, d2 = {"Lb/b;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "activity_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b {

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lb/b$a;", "Lb/a;", "Landroid/net/Uri;", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "Lb/a$a;", "e", "", "resultCode", "intent", "f", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static class a extends b.a<Uri, Boolean> {
        @Override // b.a
        @androidx.annotation.i
        @d5.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@d5.d Context context, @d5.d Uri input) {
            l0.p(context, ProtectedSandApp.s("ᯖ"));
            l0.p(input, ProtectedSandApp.s("ᯗ"));
            Intent putExtra = new Intent(ProtectedSandApp.s("ᯘ")).putExtra(ProtectedSandApp.s("ᯙ"), input);
            l0.o(putExtra, ProtectedSandApp.s("ᯚ"));
            return putExtra;
        }

        @Override // b.a
        @d5.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0126a<Boolean> b(@d5.d Context context, @d5.d Uri input) {
            l0.p(context, ProtectedSandApp.s("ᯛ"));
            l0.p(input, ProtectedSandApp.s("ᯜ"));
            return null;
        }

        @Override // b.a
        @d5.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Boolean c(int resultCode, @d5.e Intent intent) {
            return Boolean.valueOf(resultCode == -1);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¨\u0006\u0011"}, d2 = {"Lb/b$c;", "Lb/a;", "", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "Lb/a$a;", "e", "", "resultCode", "intent", "f", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static class c extends b.a<String, Uri> {
        @Override // b.a
        @androidx.annotation.i
        @d5.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@d5.d Context context, @d5.d String input) {
            l0.p(context, ProtectedSandApp.s("᯦"));
            l0.p(input, ProtectedSandApp.s("ᯧ"));
            Intent type = new Intent(ProtectedSandApp.s("ᯨ")).addCategory(ProtectedSandApp.s("ᯩ")).setType(input);
            l0.o(type, ProtectedSandApp.s("ᯪ"));
            return type;
        }

        @Override // b.a
        @d5.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0126a<Uri> b(@d5.d Context context, @d5.d String input) {
            l0.p(context, ProtectedSandApp.s("ᯫ"));
            l0.p(input, ProtectedSandApp.s("ᯬ"));
            return null;
        }

        @Override // b.a
        @d5.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int resultCode, @d5.e Intent intent) {
            if (!(resultCode == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0017\u0018\u0000 \u00132\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0017J$\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\t¨\u0006\u0014"}, d2 = {"Lb/b$d;", "Lb/a;", "", "", "Landroid/net/Uri;", "Lp3/o;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "Lb/a$a;", "e", "", "resultCode", "intent", "f", "<init>", "()V", "a", "activity_release"}, k = 1, mv = {1, 6, 0})
    @x0(18)
    /* loaded from: classes3.dex */
    public static class d extends b.a<String, List<Uri>> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lb/b$d$a;", "", "Landroid/content/Intent;", "", "Landroid/net/Uri;", "a", "(Landroid/content/Intent;)Ljava/util/List;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
        @x0(18)
        /* renamed from: b.b$d$a, reason: from kotlin metadata */
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            @d5.d
            public final List<Uri> a(@d5.d Intent intent) {
                l0.p(intent, ProtectedSandApp.s("q"));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return EmptyList.f23167o;
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i5 = 0; i5 < itemCount; i5++) {
                        Uri uri = clipData.getItemAt(i5).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }

            public Companion(w wVar) {
            }
        }

        @Override // b.a
        @androidx.annotation.i
        @d5.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@d5.d Context context, @d5.d String input) {
            l0.p(context, ProtectedSandApp.s("ᯭ"));
            l0.p(input, ProtectedSandApp.s("ᯮ"));
            Intent putExtra = new Intent(ProtectedSandApp.s("ᯯ")).addCategory(ProtectedSandApp.s("ᯰ")).setType(input).putExtra(ProtectedSandApp.s("ᯱ"), true);
            l0.o(putExtra, ProtectedSandApp.s("᯲"));
            return putExtra;
        }

        @Override // b.a
        @d5.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0126a<List<Uri>> b(@d5.d Context context, @d5.d String input) {
            l0.p(context, ProtectedSandApp.s("᯳"));
            l0.p(input, ProtectedSandApp.s("\u1bf4"));
            return null;
        }

        @Override // b.a
        @d5.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int resultCode, @d5.e Intent intent) {
            List<Uri> a6;
            if (!(resultCode == -1)) {
                intent = null;
            }
            return (intent == null || (a6 = INSTANCE.a(intent)) == null) ? EmptyList.f23167o : a6;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ-\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\b¨\u0006\u0014"}, d2 = {"Lb/b$e;", "Lb/a;", "", "", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lb/a$a;", "e", "(Landroid/content/Context;[Ljava/lang/String;)Lb/a$a;", "", "resultCode", "intent", "f", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    @x0(19)
    /* loaded from: classes3.dex */
    public static class e extends b.a<String[], Uri> {
        @Override // b.a
        @androidx.annotation.i
        @d5.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@d5.d Context context, @d5.d String[] input) {
            l0.p(context, ProtectedSandApp.s("\u1bf5"));
            l0.p(input, ProtectedSandApp.s("\u1bf6"));
            Intent type = new Intent(ProtectedSandApp.s("\u1bf7")).putExtra(ProtectedSandApp.s("\u1bf8"), input).setType(ProtectedSandApp.s("\u1bf9"));
            l0.o(type, ProtectedSandApp.s("\u1bfa"));
            return type;
        }

        @Override // b.a
        @d5.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0126a<Uri> b(@d5.d Context context, @d5.d String[] input) {
            l0.p(context, ProtectedSandApp.s("\u1bfb"));
            l0.p(input, ProtectedSandApp.s("᯼"));
            return null;
        }

        @Override // b.a
        @d5.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int resultCode, @d5.e Intent intent) {
            if (!(resultCode == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0017J\"\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0006¨\u0006\u0010"}, d2 = {"Lb/b$f;", "Lb/a;", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "Lb/a$a;", "e", "", "resultCode", "intent", "f", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    @x0(21)
    /* loaded from: classes3.dex */
    public static class f extends b.a<Uri, Uri> {
        @Override // b.a
        @androidx.annotation.i
        @d5.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@d5.d Context context, @d5.e Uri input) {
            l0.p(context, ProtectedSandApp.s("᯽"));
            Intent intent = new Intent(ProtectedSandApp.s("᯾"));
            if (Build.VERSION.SDK_INT >= 26 && input != null) {
                intent.putExtra(ProtectedSandApp.s("᯿"), input);
            }
            return intent;
        }

        @Override // b.a
        @d5.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0126a<Uri> b(@d5.d Context context, @d5.e Uri input) {
            l0.p(context, ProtectedSandApp.s("ᰀ"));
            return null;
        }

        @Override // b.a
        @d5.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int resultCode, @d5.e Intent intent) {
            if (!(resultCode == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u000e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\n¨\u0006\u0016"}, d2 = {"Lb/b$g;", "Lb/a;", "", "", "", "Landroid/net/Uri;", "Lp3/o;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lb/a$a;", "e", "(Landroid/content/Context;[Ljava/lang/String;)Lb/a$a;", "", "resultCode", "intent", "f", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    @x0(19)
    /* loaded from: classes3.dex */
    public static class g extends b.a<String[], List<Uri>> {
        @Override // b.a
        @androidx.annotation.i
        @d5.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@d5.d Context context, @d5.d String[] input) {
            l0.p(context, ProtectedSandApp.s("ᰁ"));
            l0.p(input, ProtectedSandApp.s("ᰂ"));
            Intent type = new Intent(ProtectedSandApp.s("ᰃ")).putExtra(ProtectedSandApp.s("ᰄ"), input).putExtra(ProtectedSandApp.s("ᰅ"), true).setType(ProtectedSandApp.s("ᰆ"));
            l0.o(type, ProtectedSandApp.s("ᰇ"));
            return type;
        }

        @Override // b.a
        @d5.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0126a<List<Uri>> b(@d5.d Context context, @d5.d String[] input) {
            l0.p(context, ProtectedSandApp.s("ᰈ"));
            l0.p(input, ProtectedSandApp.s("ᰉ"));
            return null;
        }

        @Override // b.a
        @d5.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final List<Uri> c(int resultCode, @d5.e Intent intent) {
            List<Uri> a6;
            if (!(resultCode == -1)) {
                intent = null;
            }
            return (intent == null || (a6 = d.INSTANCE.a(intent)) == null) ? EmptyList.f23167o : a6;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lb/b$h;", "Lb/a;", "Ljava/lang/Void;", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "", "resultCode", "intent", "e", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class h extends b.a<Void, Uri> {
        @Override // b.a
        @d5.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@d5.d Context context, @d5.e Void input) {
            l0.p(context, ProtectedSandApp.s("ᰊ"));
            Intent type = new Intent(ProtectedSandApp.s("ᰋ")).setType(ProtectedSandApp.s("ᰌ"));
            l0.o(type, ProtectedSandApp.s("ᰍ"));
            return type;
        }

        @Override // b.a
        @d5.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Uri c(int resultCode, @d5.e Intent intent) {
            if (!(resultCode == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00162%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u0017"}, d2 = {"Lb/b$i;", "Lb/a;", "", "", "", "", "Lp3/o;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lb/a$a;", "e", "(Landroid/content/Context;[Ljava/lang/String;)Lb/a$a;", "", "resultCode", "intent", "f", "<init>", "()V", "a", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class i extends b.a<String[], Map<String, Boolean>> {

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        public static final String f10525b = ProtectedSandApp.s("ᰎ");

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        public static final String f10526c = ProtectedSandApp.s("ᰏ");

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        public static final String f10527d = ProtectedSandApp.s("ᰐ");

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        public static final Companion INSTANCE = new Companion(null);

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lb/b$i$a;", "", "", "", "input", "Landroid/content/Intent;", "a", "([Ljava/lang/String;)Landroid/content/Intent;", "ACTION_REQUEST_PERMISSIONS", "Ljava/lang/String;", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
        /* renamed from: b.b$i$a, reason: from kotlin metadata */
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            @d5.d
            public final Intent a(@d5.d String[] input) {
                l0.p(input, ProtectedSandApp.s("r"));
                Intent putExtra = new Intent(ProtectedSandApp.s("s")).putExtra(ProtectedSandApp.s("t"), input);
                l0.o(putExtra, ProtectedSandApp.s("u"));
                return putExtra;
            }

            public Companion(w wVar) {
            }
        }

        @Override // b.a
        @d5.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@d5.d Context context, @d5.d String[] input) {
            l0.p(context, ProtectedSandApp.s("ᰑ"));
            l0.p(input, ProtectedSandApp.s("ᰒ"));
            return INSTANCE.a(input);
        }

        @Override // b.a
        @d5.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a.C0126a<Map<String, Boolean>> b(@d5.d Context context, @d5.d String[] input) {
            int j5;
            Map z5;
            l0.p(context, ProtectedSandApp.s("ᰓ"));
            l0.p(input, ProtectedSandApp.s("ᰔ"));
            boolean z6 = true;
            if (input.length == 0) {
                z5 = f1.z();
                return new a.C0126a<>(z5);
            }
            int length = input.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    break;
                }
                if (!(androidx.core.content.d.a(context, input[i5]) == 0)) {
                    z6 = false;
                    break;
                }
                i5++;
            }
            if (!z6) {
                return null;
            }
            j5 = e1.j(input.length);
            if (j5 < 16) {
                j5 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(j5);
            for (String str : input) {
                Pair pair = new Pair(str, Boolean.TRUE);
                linkedHashMap.put(pair.e(), pair.f());
            }
            return new a.C0126a<>(linkedHashMap);
        }

        @Override // b.a
        @d5.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map<String, Boolean> c(int resultCode, @d5.e Intent intent) {
            Map<String, Boolean> z5;
            List Ta;
            List i6;
            Map<String, Boolean> B0;
            Map<String, Boolean> z6;
            Map<String, Boolean> z7;
            if (resultCode != -1) {
                z7 = f1.z();
                return z7;
            }
            if (intent == null) {
                z6 = f1.z();
                return z6;
            }
            String[] stringArrayExtra = intent.getStringArrayExtra(ProtectedSandApp.s("ᰕ"));
            int[] intArrayExtra = intent.getIntArrayExtra(ProtectedSandApp.s("ᰖ"));
            if (intArrayExtra == null || stringArrayExtra == null) {
                z5 = f1.z();
                return z5;
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i5 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i5 == 0));
            }
            Ta = t.Ta(stringArrayExtra);
            i6 = j0.i6(Ta, arrayList);
            B0 = f1.B0(i6);
            return B0;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, d2 = {"Lb/b$j;", "Lb/a;", "", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "", "resultCode", "intent", "f", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "Lb/a$a;", "e", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class j extends b.a<String, Boolean> {
        @Override // b.a
        @d5.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@d5.d Context context, @d5.d String input) {
            l0.p(context, ProtectedSandApp.s("ᰗ"));
            l0.p(input, ProtectedSandApp.s("ᰘ"));
            return i.INSTANCE.a(new String[]{input});
        }

        @Override // b.a
        @d5.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a.C0126a<Boolean> b(@d5.d Context context, @d5.d String input) {
            l0.p(context, ProtectedSandApp.s("ᰙ"));
            l0.p(input, ProtectedSandApp.s("ᰚ"));
            if (androidx.core.content.d.a(context, input) == 0) {
                return new a.C0126a<>(Boolean.TRUE);
            }
            return null;
        }

        @Override // b.a
        @d5.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean c(int resultCode, @d5.e Intent intent) {
            boolean z5;
            if (intent == null || resultCode != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra(ProtectedSandApp.s("ᰛ"));
            boolean z6 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        z5 = false;
                        break;
                    }
                    if (intArrayExtra[i5] == 0) {
                        z5 = true;
                        break;
                    }
                    i5++;
                }
                if (z5) {
                    z6 = true;
                }
            }
            return Boolean.valueOf(z6);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lb/b$k;", "Lb/a;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "Landroid/content/Context;", "context", "input", "d", "", "resultCode", "intent", "e", "<init>", "()V", "a", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class k extends b.a<Intent, ActivityResult> {

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        public static final String f10529b = ProtectedSandApp.s("ᰜ");

        @Override // b.a
        public ActivityResult c(int i5, Intent intent) {
            return new ActivityResult(i5, intent);
        }

        @Override // b.a
        @d5.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@d5.d Context context, @d5.d Intent input) {
            l0.p(context, ProtectedSandApp.s("ᰝ"));
            l0.p(input, ProtectedSandApp.s("ᰞ"));
            return input;
        }

        @d5.d
        public ActivityResult e(int resultCode, @d5.e Intent intent) {
            return new ActivityResult(resultCode, intent);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u0010"}, d2 = {"Lb/b$l;", "Lb/a;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "", "resultCode", "intent", "e", "<init>", "()V", "a", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class l extends b.a<IntentSenderRequest, ActivityResult> {

        /* renamed from: b, reason: collision with root package name */
        @d5.d
        public static final String f10531b = ProtectedSandApp.s("ᰟ");

        /* renamed from: c, reason: collision with root package name */
        @d5.d
        public static final String f10532c = ProtectedSandApp.s("ᰠ");

        /* renamed from: d, reason: collision with root package name */
        @d5.d
        public static final String f10533d = ProtectedSandApp.s("ᰡ");

        @Override // b.a
        public ActivityResult c(int i5, Intent intent) {
            return new ActivityResult(i5, intent);
        }

        @Override // b.a
        @d5.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@d5.d Context context, @d5.d IntentSenderRequest input) {
            l0.p(context, ProtectedSandApp.s("ᰢ"));
            l0.p(input, ProtectedSandApp.s("ᰣ"));
            Intent putExtra = new Intent(ProtectedSandApp.s("ᰤ")).putExtra(ProtectedSandApp.s("ᰥ"), input);
            l0.o(putExtra, ProtectedSandApp.s("ᰦ"));
            return putExtra;
        }

        @d5.d
        public ActivityResult e(int resultCode, @d5.e Intent intent) {
            return new ActivityResult(resultCode, intent);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001f\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lb/b$m;", "Lb/a;", "Landroid/net/Uri;", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "Lb/a$a;", "e", "", "resultCode", "intent", "f", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static class m extends b.a<Uri, Boolean> {
        @Override // b.a
        @androidx.annotation.i
        @d5.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@d5.d Context context, @d5.d Uri input) {
            l0.p(context, ProtectedSandApp.s("ᰧ"));
            l0.p(input, ProtectedSandApp.s("ᰨ"));
            Intent putExtra = new Intent(ProtectedSandApp.s("ᰩ")).putExtra(ProtectedSandApp.s("ᰪ"), input);
            l0.o(putExtra, ProtectedSandApp.s("ᰫ"));
            return putExtra;
        }

        @Override // b.a
        @d5.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0126a<Boolean> b(@d5.d Context context, @d5.d Uri input) {
            l0.p(context, ProtectedSandApp.s("ᰬ"));
            l0.p(input, ProtectedSandApp.s("ᰭ"));
            return null;
        }

        @Override // b.a
        @d5.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Boolean c(int resultCode, @d5.e Intent intent) {
            return Boolean.valueOf(resultCode == -1);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0017J\"\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¨\u0006\u0011"}, d2 = {"Lb/b$n;", "Lb/a;", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "Lb/a$a;", "e", "", "resultCode", "intent", "f", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static class n extends b.a<Void, Bitmap> {
        @Override // b.a
        @androidx.annotation.i
        @d5.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@d5.d Context context, @d5.e Void input) {
            l0.p(context, ProtectedSandApp.s("ᰮ"));
            return new Intent(ProtectedSandApp.s("ᰯ"));
        }

        @Override // b.a
        @d5.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0126a<Bitmap> b(@d5.d Context context, @d5.e Void input) {
            l0.p(context, ProtectedSandApp.s("ᰰ"));
            return null;
        }

        @Override // b.a
        @d5.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Bitmap c(int resultCode, @d5.e Intent intent) {
            if (!(resultCode == -1)) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra(ProtectedSandApp.s("ᰱ"));
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Deprecated(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007¨\u0006\u0011"}, d2 = {"Lb/b$o;", "Lb/a;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "Lb/a$a;", "e", "", "resultCode", "intent", "f", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static class o extends b.a<Uri, Bitmap> {
        @Override // b.a
        @androidx.annotation.i
        @d5.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@d5.d Context context, @d5.d Uri input) {
            l0.p(context, ProtectedSandApp.s("ᰲ"));
            l0.p(input, ProtectedSandApp.s("ᰳ"));
            Intent putExtra = new Intent(ProtectedSandApp.s("ᰴ")).putExtra(ProtectedSandApp.s("ᰵ"), input);
            l0.o(putExtra, ProtectedSandApp.s("ᰶ"));
            return putExtra;
        }

        @Override // b.a
        @d5.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0126a<Bitmap> b(@d5.d Context context, @d5.d Uri input) {
            l0.p(context, ProtectedSandApp.s("᰷"));
            l0.p(input, ProtectedSandApp.s("\u1c38"));
            return null;
        }

        @Override // b.a
        @d5.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Bitmap c(int resultCode, @d5.e Intent intent) {
            if (!(resultCode == -1)) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra(ProtectedSandApp.s("\u1c39"));
            }
            return null;
        }
    }

    private b() {
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\t\b\u0017¢\u0006\u0004\b\u0012\u0010\u0014J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0017J \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0007R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lb/b$b;", "Lb/a;", "", "Landroid/net/Uri;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "d", "Lb/a$a;", "e", "", "resultCode", "intent", "f", "a", "Ljava/lang/String;", "mimeType", "<init>", "(Ljava/lang/String;)V", "()V", "activity_release"}, k = 1, mv = {1, 6, 0})
    @x0(19)
    /* renamed from: b.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0127b extends b.a<String, Uri> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @d5.d
        private final String mimeType;

        public C0127b(@d5.d String str) {
            l0.p(str, ProtectedSandApp.s("ᯞ"));
            this.mimeType = str;
        }

        @Override // b.a
        @androidx.annotation.i
        @d5.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(@d5.d Context context, @d5.d String input) {
            l0.p(context, ProtectedSandApp.s("ᯟ"));
            l0.p(input, ProtectedSandApp.s("ᯠ"));
            Intent putExtra = new Intent(ProtectedSandApp.s("ᯡ")).setType(this.mimeType).putExtra(ProtectedSandApp.s("ᯢ"), input);
            l0.o(putExtra, ProtectedSandApp.s("ᯣ"));
            return putExtra;
        }

        @Override // b.a
        @d5.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public final a.C0126a<Uri> b(@d5.d Context context, @d5.d String input) {
            l0.p(context, ProtectedSandApp.s("ᯤ"));
            l0.p(input, ProtectedSandApp.s("ᯥ"));
            return null;
        }

        @Override // b.a
        @d5.e
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Uri c(int resultCode, @d5.e Intent intent) {
            if (!(resultCode == -1)) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @Deprecated(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @ReplaceWith(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public C0127b() {
            this(ProtectedSandApp.s("ᯝ"));
        }
    }
}
