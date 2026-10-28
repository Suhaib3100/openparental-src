package b;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import androidx.annotation.x0;
import androidx.view.result.ActivityResult;
import androidx.view.result.IntentSenderRequest;
import b.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.j0;
import kotlin.collections.z0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.q0;

/* compiled from: ActivityResultContracts.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0015"}, d2 = {"Lb/b;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb/b$a;", "Lb/a;", "Landroid/net/Uri;", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "Lb/a$a;", "b", "(Landroid/content/Context;Landroid/net/Uri;)Lb/a$a;", "", "resultCode", "intent", "c", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class a extends b.a<Uri, Boolean> {
        @Override // b.a
        @fg.l
        @androidx.annotation.i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@fg.l Context context, @fg.l Uri input) {
            l0.p(context, "context");
            l0.p(input, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            l0.o(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @Override // b.a
        @fg.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a.C0651a<Boolean> getSynchronousResult(@fg.l Context context, @fg.l Uri input) {
            l0.p(context, "context");
            l0.p(input, "input");
            return null;
        }

        @Override // b.a
        @fg.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean parseResult(int resultCode, @fg.m Intent intent) {
            return Boolean.valueOf(resultCode == -1);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0017¢\u0006\u0004\b\u0005\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u0017"}, d2 = {"Lb/b$b;", "Lb/a;", "", "Landroid/net/Uri;", "mimeType", "<init>", "(Ljava/lang/String;)V", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "Lb/a$a;", "a", "(Landroid/content/Context;Ljava/lang/String;)Lb/a$a;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Landroid/net/Uri;", "Ljava/lang/String;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x0(19)
    @r1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$CreateDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,960:1\n1#2:961\n*E\n"})
    /* renamed from: b.b$b, reason: collision with other inner class name */
    public static class C0652b extends b.a<String, Uri> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final String mimeType;

        public C0652b(@fg.l String mimeType) {
            l0.p(mimeType, "mimeType");
            this.mimeType = mimeType;
        }

        @Override // b.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.C0651a<Uri> getSynchronousResult(@fg.l Context context, @fg.l String input) {
            l0.p(context, "context");
            l0.p(input, "input");
            return null;
        }

        @Override // b.a
        @fg.l
        @androidx.annotation.i
        public Intent createIntent(@fg.l Context context, @fg.l String input) {
            l0.p(context, "context");
            l0.p(input, "input");
            Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.mimeType).putExtra("android.intent.extra.TITLE", input);
            l0.o(putExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return putExtra;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // b.a
        @fg.m
        public final Uri parseResult(int resultCode, @fg.m Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @kotlin.k(message = "Using a wildcard mime type with CreateDocument is not recommended as it breaks the automatic handling of file extensions. Instead, specify the mime type by using the constructor that takes an concrete mime type (e.g.., CreateDocument(\"image/png\")).", replaceWith = @kotlin.x0(expression = "CreateDocument(\"todo/todo\")", imports = {}))
        public C0652b() {
            this("*/*");
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb/b$c;", "Lb/a;", "", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "Lb/a$a;", "a", "(Landroid/content/Context;Ljava/lang/String;)Lb/a$a;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Landroid/net/Uri;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$GetContent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,960:1\n1#2:961\n*E\n"})
    public static class c extends b.a<String, Uri> {
        @Override // b.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.C0651a<Uri> getSynchronousResult(@fg.l Context context, @fg.l String input) {
            l0.p(context, "context");
            l0.p(input, "input");
            return null;
        }

        @Override // b.a
        @fg.l
        @androidx.annotation.i
        public Intent createIntent(@fg.l Context context, @fg.l String input) {
            l0.p(context, "context");
            l0.p(input, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input);
            l0.o(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // b.a
        @fg.m
        public final Uri parseResult(int resultCode, @fg.m Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u0000 \u000f2\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lb/b$d;", "Lb/a;", "", "", "Landroid/net/Uri;", "Lkd/o;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "Lb/a$a;", "a", "(Landroid/content/Context;Ljava/lang/String;)Lb/a$a;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/util/List;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x0(18)
    public static class d extends b.a<String, List<Uri>> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lb/b$d$a;", "", "<init>", "()V", "Landroid/content/Intent;", "", "Landroid/net/Uri;", "a", "(Landroid/content/Intent;)Ljava/util/List;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @x0(18)
        /* renamed from: b.b$d$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final List<Uri> a(@fg.l Intent intent) {
                l0.p(intent, "<this>");
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return j0.f74919b;
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i4 = 0; i4 < itemCount; i4++) {
                        Uri uri = clipData.getItemAt(i4).getUri();
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
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.C0651a<List<Uri>> getSynchronousResult(@fg.l Context context, @fg.l String input) {
            l0.p(context, "context");
            l0.p(input, "input");
            return null;
        }

        @Override // b.a
        @fg.l
        @androidx.annotation.i
        public Intent createIntent(@fg.l Context context, @fg.l String input) {
            l0.p(context, "context");
            l0.p(input, "input");
            Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            l0.o(putExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return putExtra;
        }

        @Override // b.a
        @fg.l
        public final List<Uri> parseResult(int resultCode, @fg.m Intent intent) {
            List<Uri> a5;
            if (resultCode != -1) {
                intent = null;
            }
            return (intent == null || (a5 = INSTANCE.a(intent)) == null) ? j0.f74919b : a5;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lb/b$e;", "Lb/a;", "", "", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lb/a$a;", "b", "(Landroid/content/Context;[Ljava/lang/String;)Lb/a$a;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Landroid/net/Uri;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x0(19)
    @r1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocument\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,960:1\n1#2:961\n*E\n"})
    public static class e extends b.a<String[], Uri> {
        @Override // b.a
        @fg.l
        @androidx.annotation.i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@fg.l Context context, @fg.l String[] input) {
            l0.p(context, "context");
            l0.p(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).setType("*/*");
            l0.o(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // b.a
        @fg.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a.C0651a<Uri> getSynchronousResult(@fg.l Context context, @fg.l String[] input) {
            l0.p(context, "context");
            l0.p(input, "input");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // b.a
        @fg.m
        public final Uri parseResult(int resultCode, @fg.m Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\t\u0010\nJ)\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lb/b$f;", "Lb/a;", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "Lb/a$a;", "b", "(Landroid/content/Context;Landroid/net/Uri;)Lb/a$a;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Landroid/net/Uri;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x0(21)
    @r1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$OpenDocumentTree\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,960:1\n1#2:961\n*E\n"})
    public static class f extends b.a<Uri, Uri> {
        @Override // b.a
        @fg.l
        @androidx.annotation.i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@fg.l Context context, @fg.m Uri input) {
            l0.p(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (Build.VERSION.SDK_INT >= 26 && input != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", input);
            }
            return intent;
        }

        @Override // b.a
        @fg.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a.C0651a<Uri> getSynchronousResult(@fg.l Context context, @fg.m Uri input) {
            l0.p(context, "context");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // b.a
        @fg.m
        public final Uri parseResult(int resultCode, @fg.m Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lb/b$g;", "Lb/a;", "", "", "", "Landroid/net/Uri;", "Lkd/o;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lb/a$a;", "b", "(Landroid/content/Context;[Ljava/lang/String;)Lb/a$a;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/util/List;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x0(19)
    public static class g extends b.a<String[], List<Uri>> {
        @Override // b.a
        @fg.l
        @androidx.annotation.i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@fg.l Context context, @fg.l String[] input) {
            l0.p(context, "context");
            l0.p(input, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", input).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            l0.o(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // b.a
        @fg.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a.C0651a<List<Uri>> getSynchronousResult(@fg.l Context context, @fg.l String[] input) {
            l0.p(context, "context");
            l0.p(input, "input");
            return null;
        }

        @Override // b.a
        @fg.l
        public final List<Uri> parseResult(int resultCode, @fg.m Intent intent) {
            List<Uri> a5;
            if (resultCode != -1) {
                intent = null;
            }
            return (intent == null || (a5 = d.INSTANCE.a(intent)) == null) ? j0.f74919b : a5;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb/b$h;", "Lb/a;", "Ljava/lang/Void;", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/Void;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Landroid/net/Uri;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickContact\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,960:1\n1#2:961\n*E\n"})
    public static final class h extends b.a<Void, Uri> {
        @Override // b.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@fg.l Context context, @fg.m Void input) {
            l0.p(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            l0.o(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // b.a
        @fg.m
        public Uri parseResult(int resultCode, @fg.m Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u0000 \u00112\u0019\u0012\u0004\u0012\u00020\u0002\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u00030\u0001:\u0001\u000eB\u0011\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0011\u001a\u0015\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0004¢\u0006\u0002\b\u00050\u0003\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u0018"}, d2 = {"Lb/b$i;", "Lb/a;", "Landroidx/activity/result/k;", "", "Landroid/net/Uri;", "Lkd/o;", "", "maxItems", "<init>", "(I)V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Landroidx/activity/result/k;)Landroid/content/Intent;", "Lb/a$a;", "b", "(Landroid/content/Context;Landroidx/activity/result/k;)Lb/a$a;", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/util/List;", "I", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x0(19)
    public static class i extends b.a<androidx.view.result.k, List<Uri>> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int maxItems;

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb/b$i$a;", "", "<init>", "()V", "", "a", "()I", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: b.b$i$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @SuppressLint({"NewApi", "ClassVerificationFailure"})
            public final int a() {
                int pickImagesMaxLimit;
                if (!j.INSTANCE.j()) {
                    return Integer.MAX_VALUE;
                }
                pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                return pickImagesMaxLimit;
            }

            public Companion(w wVar) {
            }
        }

        public i() {
            this(0, 1, null);
        }

        @Override // b.a
        @fg.l
        @androidx.annotation.i
        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@fg.l Context context, @fg.l androidx.view.result.k input) {
            int pickImagesMaxLimit;
            l0.p(context, "context");
            l0.p(input, "input");
            j.Companion companion = j.INSTANCE;
            if (companion.j()) {
                Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                intent.setType(companion.e(input.getMediaType()));
                int i4 = this.maxItems;
                pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
                if (i4 > pickImagesMaxLimit) {
                    throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()");
                }
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.maxItems);
                return intent;
            }
            if (companion.i(context)) {
                ResolveInfo d5 = companion.d(context);
                if (d5 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo = d5.activityInfo;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(companion.e(input.getMediaType()));
                intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", this.maxItems);
                return intent2;
            }
            if (companion.f(context)) {
                ResolveInfo c5 = companion.c(context);
                if (c5 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo2 = c5.activityInfo;
                Intent intent3 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
                intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent3.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.maxItems);
                return intent3;
            }
            Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent4.setType(companion.e(input.getMediaType()));
            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent4.getType() != null) {
                return intent4;
            }
            intent4.setType("*/*");
            intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            return intent4;
        }

        @Override // b.a
        @fg.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a.C0651a<List<Uri>> getSynchronousResult(@fg.l Context context, @fg.l androidx.view.result.k input) {
            l0.p(context, "context");
            l0.p(input, "input");
            return null;
        }

        public /* synthetic */ i(int i4, int i5, w wVar) {
            this((i5 & 1) != 0 ? INSTANCE.a() : i4);
        }

        @Override // b.a
        @fg.l
        public final List<Uri> parseResult(int resultCode, @fg.m Intent intent) {
            List<Uri> a5;
            if (resultCode != -1) {
                intent = null;
            }
            return (intent == null || (a5 = d.INSTANCE.a(intent)) == null) ? j0.f74919b : a5;
        }

        public i(int i4) {
            this.maxItems = i4;
            if (i4 <= 1) {
                throw new IllegalArgumentException("Max items must be higher than 1");
            }
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0017\u0018\u0000 \n2\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0006\n\u0014\r\u0015\u0016\u0017B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lb/b$j;", "Lb/a;", "Landroidx/activity/result/k;", "Landroid/net/Uri;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Landroidx/activity/result/k;)Landroid/content/Intent;", "Lb/a$a;", "c", "(Landroid/content/Context;Landroidx/activity/result/k;)Lb/a$a;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Landroid/net/Uri;", "b", "d", "e", "f", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @x0(19)
    @r1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,960:1\n1#2:961\n*E\n"})
    public static class j extends b.a<androidx.view.result.k, Uri> {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final String f36628b = "androidx.activity.result.contract.action.PICK_IMAGES";

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        public static final String f36629c = "androidx.activity.result.contract.extra.PICK_IMAGES_MAX";

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final String f36630d = "com.google.android.gms.provider.action.PICK_IMAGES";

        /* renamed from: e, reason: collision with root package name */
        @fg.l
        public static final String f36631e = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX";

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\u0011\u0010\u000fJ\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00148\u0006X\u0086T¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u0019\u0010\u0003R\u001a\u0010\u001a\u001a\u00020\u00148\u0006X\u0086T¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u0012\u0004\b\u001b\u0010\u0003R\u0014\u0010\u001c\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00148\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018¨\u0006\u001e"}, d2 = {"Lb/b$j$a;", "", "<init>", "()V", "", "g", "()Z", "Landroid/content/Context;", "context", "h", "(Landroid/content/Context;)Z", "j", "i", "Landroid/content/pm/ResolveInfo;", "d", "(Landroid/content/Context;)Landroid/content/pm/ResolveInfo;", "f", "c", "Lb/b$j$f;", "input", "", "e", "(Lb/b$j$f;)Ljava/lang/String;", "ACTION_SYSTEM_FALLBACK_PICK_IMAGES", "Ljava/lang/String;", "a", "EXTRA_SYSTEM_FALLBACK_PICK_IMAGES_MAX", "b", "GMS_ACTION_PICK_IMAGES", "GMS_EXTRA_PICK_IMAGES_MAX", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: b.b$j$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public static /* synthetic */ void a() {
            }

            public static /* synthetic */ void b() {
            }

            @fg.m
            @kd.n
            public final ResolveInfo c(@fg.l Context context) {
                l0.p(context, "context");
                return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
            }

            @fg.m
            @kd.n
            public final ResolveInfo d(@fg.l Context context) {
                l0.p(context, "context");
                return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
            }

            @fg.m
            public final String e(@fg.l f input) {
                l0.p(input, "input");
                if (input instanceof c) {
                    return "image/*";
                }
                if (input instanceof e) {
                    return "video/*";
                }
                if (input instanceof d) {
                    return ((d) input).getMimeType();
                }
                if (input instanceof C0653b) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }

            @kd.n
            public final boolean f(@fg.l Context context) {
                l0.p(context, "context");
                return c(context) != null;
            }

            @kd.n
            @kotlin.k(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @kotlin.x0(expression = "isPhotoPickerAvailable(context)", imports = {}))
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean g() {
                return j();
            }

            @kd.n
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean h(@fg.l Context context) {
                l0.p(context, "context");
                return j() || i(context) || f(context);
            }

            @kd.n
            public final boolean i(@fg.l Context context) {
                l0.p(context, "context");
                return d(context) != null;
            }

            @kd.n
            @SuppressLint({"ClassVerificationFailure", "NewApi"})
            public final boolean j() {
                int extensionVersion;
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 33) {
                    return true;
                }
                if (i4 >= 30) {
                    extensionVersion = SdkExtensions.getExtensionVersion(30);
                    if (extensionVersion >= 2) {
                        return true;
                    }
                }
                return false;
            }

            public Companion(w wVar) {
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb/b$j$b;", "Lb/b$j$f;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: b.b$j$b, reason: collision with other inner class name */
        public static final class C0653b implements f {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            public static final C0653b f36632a = new C0653b();

            private C0653b() {
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb/b$j$c;", "Lb/b$j$f;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class c implements f {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            public static final c f36633a = new c();

            private c() {
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lb/b$j$d;", "Lb/b$j$f;", "", "mimeType", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class d implements f {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            @fg.l
            private final String mimeType;

            public d(@fg.l String mimeType) {
                l0.p(mimeType, "mimeType");
                this.mimeType = mimeType;
            }

            @fg.l
            /* renamed from: a, reason: from getter */
            public final String getMimeType() {
                return this.mimeType;
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb/b$j$e;", "Lb/b$j$f;", "<init>", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class e implements f {

            /* renamed from: a, reason: collision with root package name */
            @fg.l
            public static final e f36635a = new e();

            private e() {
            }
        }

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lb/b$j$f;", "", "Lb/b$j$b;", "Lb/b$j$c;", "Lb/b$j$d;", "Lb/b$j$e;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public interface f {
        }

        @fg.m
        @kd.n
        public static final ResolveInfo b(@fg.l Context context) {
            return INSTANCE.c(context);
        }

        @fg.m
        @kd.n
        public static final ResolveInfo d(@fg.l Context context) {
            return INSTANCE.d(context);
        }

        @kd.n
        public static final boolean e(@fg.l Context context) {
            return INSTANCE.f(context);
        }

        @kd.n
        @kotlin.k(message = "This method is deprecated in favor of isPhotoPickerAvailable(context) to support the picker provided by updatable system apps", replaceWith = @kotlin.x0(expression = "isPhotoPickerAvailable(context)", imports = {}))
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean f() {
            return INSTANCE.j();
        }

        @kd.n
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean g(@fg.l Context context) {
            return INSTANCE.h(context);
        }

        @kd.n
        public static final boolean h(@fg.l Context context) {
            return INSTANCE.i(context);
        }

        @kd.n
        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        public static final boolean i() {
            return INSTANCE.j();
        }

        @Override // b.a
        @fg.l
        @androidx.annotation.i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@fg.l Context context, @fg.l androidx.view.result.k input) {
            Intent intent;
            l0.p(context, "context");
            l0.p(input, "input");
            Companion companion = INSTANCE;
            if (companion.j()) {
                Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
                intent2.setType(companion.e(input.getMediaType()));
                return intent2;
            }
            if (companion.i(context)) {
                ResolveInfo d5 = companion.d(context);
                if (d5 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo = d5.activityInfo;
                intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent.setType(companion.e(input.getMediaType()));
            } else {
                if (!companion.f(context)) {
                    Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent3.setType(companion.e(input.getMediaType()));
                    if (intent3.getType() != null) {
                        return intent3;
                    }
                    intent3.setType("*/*");
                    intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent3;
                }
                ResolveInfo c5 = companion.c(context);
                if (c5 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo2 = c5.activityInfo;
                intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
                intent.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent.setType(companion.e(input.getMediaType()));
            }
            return intent;
        }

        @Override // b.a
        @fg.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final a.C0651a<Uri> getSynchronousResult(@fg.l Context context, @fg.l androidx.view.result.k input) {
            l0.p(context, "context");
            l0.p(input, "input");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // b.a
        @fg.m
        public final Uri parseResult(int resultCode, @fg.m Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            if (data == null) {
                data = (Uri) kotlin.collections.w.G2(d.INSTANCE.a(intent));
            }
            return data;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \r2%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020\u0003\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00040\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0010\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lb/b$k;", "Lb/a;", "", "", "", "", "Lkd/o;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;[Ljava/lang/String;)Landroid/content/Intent;", "Lb/a$a;", "b", "(Landroid/content/Context;[Ljava/lang/String;)Lb/a$a;", "", "resultCode", "intent", "c", "(ILandroid/content/Intent;)Ljava/util/Map;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,960:1\n12541#2,2:961\n8676#2,2:963\n9358#2,4:965\n11365#2:969\n11700#2,3:970\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions\n*L\n189#1:961,2\n196#1:963,2\n196#1:965,4\n209#1:969\n209#1:970,3\n*E\n"})
    public static final class k extends b.a<String[], Map<String, Boolean>> {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final String f36637b = "androidx.activity.result.contract.action.REQUEST_PERMISSIONS";

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        public static final String f36638c = "androidx.activity.result.contract.extra.PERMISSIONS";

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final String f36639d = "androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS";

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        public static final Companion INSTANCE = new Companion();

        /* compiled from: ActivityResultContracts.kt */
        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lb/b$k$a;", "", "<init>", "()V", "", "", "input", "Landroid/content/Intent;", "a", "([Ljava/lang/String;)Landroid/content/Intent;", "ACTION_REQUEST_PERMISSIONS", "Ljava/lang/String;", "EXTRA_PERMISSIONS", "EXTRA_PERMISSION_GRANT_RESULTS", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: b.b$k$a, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @fg.l
            public final Intent a(@fg.l String[] input) {
                l0.p(input, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
                l0.o(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            }

            public Companion(w wVar) {
            }
        }

        @Override // b.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@fg.l Context context, @fg.l String[] input) {
            l0.p(context, "context");
            l0.p(input, "input");
            return INSTANCE.a(input);
        }

        @Override // b.a
        @fg.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a.C0651a<Map<String, Boolean>> getSynchronousResult(@fg.l Context context, @fg.l String[] input) {
            l0.p(context, "context");
            l0.p(input, "input");
            if (input.length == 0) {
                return new a.C0651a<>(z0.z());
            }
            for (String str : input) {
                if (androidx.core.content.d.checkSelfPermission(context, str) != 0) {
                    return null;
                }
            }
            int j4 = z0.j(input.length);
            if (j4 < 16) {
                j4 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(j4);
            for (String str2 : input) {
                q0 q0Var = new q0(str2, Boolean.TRUE);
                linkedHashMap.put(q0Var.e(), q0Var.f());
            }
            return new a.C0651a<>(linkedHashMap);
        }

        @Override // b.a
        @fg.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map<String, Boolean> parseResult(int resultCode, @fg.m Intent intent) {
            if (resultCode != -1) {
                return z0.z();
            }
            if (intent == null) {
                return z0.z();
            }
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return z0.z();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i4 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i4 == 0));
            }
            return z0.B0(kotlin.collections.w.i6(kotlin.collections.l.Ta(stringArrayExtra), arrayList));
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb/b$l;", "Lb/a;", "", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "", "resultCode", "intent", "b", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "Lb/a$a;", "a", "(Landroid/content/Context;Ljava/lang/String;)Lb/a$a;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,960:1\n12774#2,2:961\n*S KotlinDebug\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$RequestPermission\n*L\n229#1:961,2\n*E\n"})
    public static final class l extends b.a<String, Boolean> {
        @Override // b.a
        @fg.m
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a.C0651a<Boolean> getSynchronousResult(@fg.l Context context, @fg.l String input) {
            l0.p(context, "context");
            l0.p(input, "input");
            if (androidx.core.content.d.checkSelfPermission(context, input) == 0) {
                return new a.C0651a<>(Boolean.TRUE);
            }
            return null;
        }

        @Override // b.a
        @fg.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean parseResult(int resultCode, @fg.m Intent intent) {
            if (intent == null || resultCode != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean z4 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    if (intArrayExtra[i4] == 0) {
                        z4 = true;
                        break;
                    }
                    i4++;
                }
            }
            return Boolean.valueOf(z4);
        }

        @Override // b.a
        @fg.l
        public Intent createIntent(@fg.l Context context, @fg.l String input) {
            l0.p(context, "context");
            l0.p(input, "input");
            return k.INSTANCE.a(new String[]{input});
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lb/b$m;", "Lb/a;", "Landroid/content/Intent;", "Landroidx/activity/result/ActivityResult;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "a", "(Landroid/content/Context;Landroid/content/Intent;)Landroid/content/Intent;", "", "resultCode", "intent", "b", "(ILandroid/content/Intent;)Landroidx/activity/result/ActivityResult;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class m extends b.a<Intent, ActivityResult> {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final String f36641b = "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE";

        @Override // b.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@fg.l Context context, @fg.l Intent input) {
            l0.p(context, "context");
            l0.p(input, "input");
            return input;
        }

        @fg.l
        public ActivityResult b(int resultCode, @fg.m Intent intent) {
            return new ActivityResult(resultCode, intent);
        }

        @Override // b.a
        public ActivityResult parseResult(int i4, Intent intent) {
            return new ActivityResult(i4, intent);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lb/b$n;", "Lb/a;", "Landroidx/activity/result/IntentSenderRequest;", "Landroidx/activity/result/ActivityResult;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Landroidx/activity/result/IntentSenderRequest;)Landroid/content/Intent;", "", "resultCode", "intent", "b", "(ILandroid/content/Intent;)Landroidx/activity/result/ActivityResult;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class n extends b.a<IntentSenderRequest, ActivityResult> {

        /* renamed from: b, reason: collision with root package name */
        @fg.l
        public static final String f36643b = "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST";

        /* renamed from: c, reason: collision with root package name */
        @fg.l
        public static final String f36644c = "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST";

        /* renamed from: d, reason: collision with root package name */
        @fg.l
        public static final String f36645d = "androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION";

        @Override // b.a
        @fg.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@fg.l Context context, @fg.l IntentSenderRequest input) {
            l0.p(context, "context");
            l0.p(input, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", input);
            l0.o(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return putExtra;
        }

        @fg.l
        public ActivityResult b(int resultCode, @fg.m Intent intent) {
            return new ActivityResult(resultCode, intent);
        }

        @Override // b.a
        public ActivityResult parseResult(int i4, Intent intent) {
            return new ActivityResult(i4, intent);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb/b$o;", "Lb/a;", "Landroid/net/Uri;", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "Lb/a$a;", "b", "(Landroid/content/Context;Landroid/net/Uri;)Lb/a$a;", "", "resultCode", "intent", "c", "(ILandroid/content/Intent;)Ljava/lang/Boolean;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class o extends b.a<Uri, Boolean> {
        @Override // b.a
        @fg.l
        @androidx.annotation.i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@fg.l Context context, @fg.l Uri input) {
            l0.p(context, "context");
            l0.p(input, "input");
            Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra("output", input);
            l0.o(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @Override // b.a
        @fg.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a.C0651a<Boolean> getSynchronousResult(@fg.l Context context, @fg.l Uri input) {
            l0.p(context, "context");
            l0.p(input, "input");
            return null;
        }

        @Override // b.a
        @fg.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean parseResult(int resultCode, @fg.m Intent intent) {
            return Boolean.valueOf(resultCode == -1);
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb/b$p;", "Lb/a;", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/Void;)Landroid/content/Intent;", "Lb/a$a;", "b", "(Landroid/content/Context;Ljava/lang/Void;)Lb/a$a;", "", "resultCode", "intent", "c", "(ILandroid/content/Intent;)Landroid/graphics/Bitmap;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakePicturePreview\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,960:1\n1#2:961\n*E\n"})
    public static class p extends b.a<Void, Bitmap> {
        @Override // b.a
        @fg.l
        @androidx.annotation.i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@fg.l Context context, @fg.m Void input) {
            l0.p(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @Override // b.a
        @fg.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a.C0651a<Bitmap> getSynchronousResult(@fg.l Context context, @fg.m Void input) {
            l0.p(context, "context");
            return null;
        }

        @Override // b.a
        @fg.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bitmap parseResult(int resultCode, @fg.m Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    /* compiled from: ActivityResultContracts.kt */
    @kotlin.k(message = "The thumbnail bitmap is rarely returned and is not a good signal to determine\n      whether the video was actually successfully captured. Use {@link CaptureVideo} instead.")
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lb/b$q;", "Lb/a;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "Lb/a$a;", "b", "(Landroid/content/Context;Landroid/net/Uri;)Lb/a$a;", "", "resultCode", "intent", "c", "(ILandroid/content/Intent;)Landroid/graphics/Bitmap;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nActivityResultContracts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultContracts.kt\nandroidx/activity/result/contract/ActivityResultContracts$TakeVideo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,960:1\n1#2:961\n*E\n"})
    public static class q extends b.a<Uri, Bitmap> {
        @Override // b.a
        @fg.l
        @androidx.annotation.i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Intent createIntent(@fg.l Context context, @fg.l Uri input) {
            l0.p(context, "context");
            l0.p(input, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
            l0.o(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @Override // b.a
        @fg.m
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a.C0651a<Bitmap> getSynchronousResult(@fg.l Context context, @fg.l Uri input) {
            l0.p(context, "context");
            l0.p(input, "input");
            return null;
        }

        @Override // b.a
        @fg.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Bitmap parseResult(int resultCode, @fg.m Intent intent) {
            if (resultCode != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    private b() {
    }
}
