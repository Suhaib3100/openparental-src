package androidx.credentials.provider;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.credentials.CreateEntry;
import androidx.annotation.c1;
import java.time.Instant;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: CreateEntry.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b \b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0004\u001b\u001f#\u001dBU\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bk\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0016J\u000f\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b'\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010+R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Landroidx/credentials/provider/e0;", "", "", "accountName", "Landroid/app/PendingIntent;", "pendingIntent", "Landroid/graphics/drawable/Icon;", "icon", "description", "Ljava/time/Instant;", "lastUsedTime", "", "", "", "credentialCountInformationMap", "", "isAutoSelectAllowed", "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/graphics/drawable/Icon;Ljava/lang/CharSequence;Ljava/time/Instant;Ljava/util/Map;Z)V", "passwordCredentialCount", "publicKeyCredentialCount", "totalCredentialCount", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;Ljava/lang/CharSequence;Ljava/time/Instant;Landroid/graphics/drawable/Icon;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "h", "()Ljava/lang/Integer;", "j", "k", "a", "Ljava/lang/CharSequence;", "d", "()Ljava/lang/CharSequence;", "b", "Landroid/app/PendingIntent;", "i", "()Landroid/app/PendingIntent;", "c", "Landroid/graphics/drawable/Icon;", "f", "()Landroid/graphics/drawable/Icon;", "e", "Ljava/time/Instant;", "g", "()Ljava/time/Instant;", "Ljava/util/Map;", "Z", "l", "()Z", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@androidx.annotation.x0(26)
@kotlin.jvm.internal.r1({"SMAP\nCreateEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateEntry.kt\nandroidx/credentials/provider/CreateEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,494:1\n1#2:495\n*E\n"})
/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: j, reason: collision with root package name */
    private static final int f28006j = 300;

    /* renamed from: v, reason: collision with root package name */
    private static final int f28018v = 1;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final CharSequence accountName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final PendingIntent pendingIntent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Icon icon;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final CharSequence description;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @fg.m
    private final Instant lastUsedTime;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @fg.l
    private final Map<String, Integer> credentialCountInformationMap;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isAutoSelectAllowed;

    /* renamed from: p, reason: collision with root package name */
    @fg.l
    private static final String f28012p = "androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS";

    /* renamed from: q, reason: collision with root package name */
    @fg.l
    private static final String f28013q = "androidx.credentials.provider.createEntry.SLICE_HINT_PENDING_INTENT";

    /* renamed from: r, reason: collision with root package name */
    @fg.l
    private static final String f28014r = "androidx.credentials.provider.createEntry.SLICE_HINT_AUTO_SELECT_ALLOWED";

    /* renamed from: s, reason: collision with root package name */
    @fg.l
    private static final String f28015s = "true";

    /* renamed from: t, reason: collision with root package name */
    @fg.l
    private static final String f28016t = "false";

    /* renamed from: u, reason: collision with root package name */
    @fg.l
    private static final String f28017u = "CreateEntry";

    /* renamed from: i, reason: collision with root package name */
    @fg.l
    private static final String f28005i = "CreateEntry";

    /* renamed from: k, reason: collision with root package name */
    @fg.l
    public static final String f28007k = "TOTAL_CREDENTIAL_COUNT_TYPE";

    /* renamed from: l, reason: collision with root package name */
    @fg.l
    private static final String f28008l = "androidx.credentials.provider.createEntry.SLICE_HINT_USER_PROVIDER_ACCOUNT_NAME";

    /* renamed from: m, reason: collision with root package name */
    @fg.l
    private static final String f28009m = "androidx.credentials.provider.createEntry.SLICE_HINT_NOTE";

    /* renamed from: n, reason: collision with root package name */
    @fg.l
    private static final String f28010n = "androidx.credentials.provider.createEntry.SLICE_HINT_PROFILE_ICON";

    /* renamed from: o, reason: collision with root package name */
    @fg.l
    private static final String f28011o = "androidx.credentials.provider.createEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION";

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @fg.l
    public static final Companion INSTANCE = new Companion();

    /* compiled from: CreateEntry.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000eH\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/credentials/provider/e0$a;", "", "<init>", "()V", "Landroidx/credentials/provider/e0;", "createEntry", "Landroid/app/slice/Slice;", "d", "(Landroidx/credentials/provider/e0;)Landroid/app/slice/Slice;", "slice", "c", "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/e0;", "Landroid/os/Bundle;", "bundle", "", "", "", "a", "(Landroid/os/Bundle;)Ljava/util/Map;", "credentialCountInformationMap", "b", "(Ljava/util/Map;)Landroid/os/Bundle;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(28)
    @kotlin.jvm.internal.r1({"SMAP\nCreateEntry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateEntry.kt\nandroidx/credentials/provider/CreateEntry$Api28Impl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,494:1\n1855#2,2:495\n1855#2,2:497\n215#3,2:499\n*S KotlinDebug\n*F\n+ 1 CreateEntry.kt\nandroidx/credentials/provider/CreateEntry$Api28Impl\n*L\n337#1:495,2\n382#1:497,2\n398#1:499,2\n*E\n"})
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final a f28026a = new a();

        private a() {
        }

        @fg.l
        @kd.n
        public static final Map<String, Integer> a(@fg.m Bundle bundle) {
            HashMap hashMap = new HashMap();
            if (bundle == null) {
                return hashMap;
            }
            Set<String> keySet = bundle.keySet();
            kotlin.jvm.internal.l0.o(keySet, "bundle.keySet()");
            for (String it : keySet) {
                try {
                    kotlin.jvm.internal.l0.o(it, "it");
                    hashMap.put(it, Integer.valueOf(bundle.getInt(it)));
                } catch (Exception e4) {
                    e4.getMessage();
                }
            }
            return hashMap;
        }

        @fg.m
        @kd.n
        public static final Bundle b(@fg.l Map<String, Integer> credentialCountInformationMap) {
            kotlin.jvm.internal.l0.p(credentialCountInformationMap, "credentialCountInformationMap");
            Bundle bundle = new Bundle();
            boolean z4 = false;
            for (Map.Entry<String, Integer> entry : credentialCountInformationMap.entrySet()) {
                if (entry.getValue() != null) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    kotlin.jvm.internal.l0.m(value);
                    bundle.putInt(key, value.intValue());
                    z4 = true;
                }
            }
            if (z4) {
                return bundle;
            }
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map] */
        @SuppressLint({"WrongConstant"})
        @fg.m
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public static final e0 c(@fg.l Slice slice) {
            kotlin.jvm.internal.l0.p(slice, "slice");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<SliceItem> items = slice.getItems();
            kotlin.jvm.internal.l0.o(items, "slice.items");
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            CharSequence charSequence = null;
            PendingIntent pendingIntent = null;
            Icon icon = null;
            CharSequence charSequence2 = null;
            Instant instant = null;
            boolean z4 = false;
            for (SliceItem sliceItem : items) {
                if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_USER_PROVIDER_ACCOUNT_NAME")) {
                    charSequence = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_PROFILE_ICON")) {
                    icon = sliceItem.getIcon();
                } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_PENDING_INTENT")) {
                    pendingIntent = sliceItem.getAction();
                } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION")) {
                    Map<String, Integer> a5 = a(sliceItem.getBundle());
                    kotlin.jvm.internal.l0.n(a5, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Int?>");
                    linkedHashMap2 = kotlin.jvm.internal.u1.k(a5);
                } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS")) {
                    instant = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_NOTE")) {
                    charSequence2 = sliceItem.getText();
                } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS")) {
                    instant = Instant.ofEpochMilli(sliceItem.getLong());
                } else if (sliceItem.hasHint("androidx.credentials.provider.createEntry.SLICE_HINT_AUTO_SELECT_ALLOWED") && kotlin.jvm.internal.l0.g(sliceItem.getText(), "true")) {
                    z4 = true;
                }
            }
            try {
                kotlin.jvm.internal.l0.m(charSequence);
                kotlin.jvm.internal.l0.m(pendingIntent);
                return new e0(charSequence, pendingIntent, icon, charSequence2, instant, linkedHashMap2, z4);
            } catch (Exception e4) {
                e4.getMessage();
                return null;
            }
        }

        @fg.l
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public static final Slice d(@fg.l e0 createEntry) {
            kotlin.jvm.internal.l0.p(createEntry, "createEntry");
            CharSequence accountName = createEntry.getAccountName();
            Icon icon = createEntry.getIcon();
            CharSequence description = createEntry.getDescription();
            Instant lastUsedTime = createEntry.getLastUsedTime();
            Map map = createEntry.credentialCountInformationMap;
            PendingIntent pendingIntent = createEntry.getPendingIntent();
            Slice.Builder builder = new Slice.Builder(Uri.EMPTY, new SliceSpec("CreateEntry", 1));
            String str = createEntry.getIsAutoSelectAllowed() ? "true" : "false";
            builder.addText(accountName, null, kotlin.collections.w.k("androidx.credentials.provider.createEntry.SLICE_HINT_USER_PROVIDER_ACCOUNT_NAME"));
            if (lastUsedTime != null) {
                builder.addLong(lastUsedTime.toEpochMilli(), null, kotlin.collections.w.k("androidx.credentials.provider.createEntry.SLICE_HINT_LAST_USED_TIME_MILLIS"));
            }
            if (description != null) {
                builder.addText(description, null, kotlin.collections.w.k("androidx.credentials.provider.createEntry.SLICE_HINT_NOTE"));
            }
            if (icon != null) {
                builder.addIcon(icon, null, kotlin.collections.w.k("androidx.credentials.provider.createEntry.SLICE_HINT_PROFILE_ICON"));
            }
            if (b(map) != null) {
                builder.addBundle(b(map), null, kotlin.collections.w.k("androidx.credentials.provider.createEntry.SLICE_HINT_CREDENTIAL_COUNT_INFORMATION"));
            }
            builder.addAction(pendingIntent, new Slice.Builder(builder).addHints(Collections.singletonList("androidx.credentials.provider.createEntry.SLICE_HINT_PENDING_INTENT")).build(), null).addText(str, null, kotlin.collections.w.k("androidx.credentials.provider.createEntry.SLICE_HINT_AUTO_SELECT_ALLOWED"));
            Slice build = builder.build();
            kotlin.jvm.internal.l0.o(build, "sliceBuilder.build()");
            return build;
        }
    }

    /* compiled from: CreateEntry.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/credentials/provider/e0$b;", "", "<init>", "()V", "Landroid/service/credentials/CreateEntry;", "createEntry", "Landroidx/credentials/provider/e0;", "a", "(Landroid/service/credentials/CreateEntry;)Landroidx/credentials/provider/e0;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @androidx.annotation.x0(34)
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        @fg.l
        public static final b f28027a = new b();

        private b() {
        }

        @fg.m
        @kd.n
        public static final e0 a(@fg.l CreateEntry createEntry) {
            kotlin.jvm.internal.l0.p(createEntry, "createEntry");
            Slice slice = createEntry.getSlice();
            kotlin.jvm.internal.l0.o(slice, "createEntry.slice");
            return e0.INSTANCE.b(slice);
        }
    }

    /* compiled from: CreateEntry.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R$\u0010%\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0006\u0012\u0004\u0018\u00010\f0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010&R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010 R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010(R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Landroidx/credentials/provider/e0$c;", "", "", "accountName", "Landroid/app/PendingIntent;", "pendingIntent", "<init>", "(Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V", "", "autoSelectAllowed", "b", "(Z)Landroidx/credentials/provider/e0$c;", "", "count", "f", "(I)Landroidx/credentials/provider/e0$c;", "g", "h", "Landroid/graphics/drawable/Icon;", "icon", "d", "(Landroid/graphics/drawable/Icon;)Landroidx/credentials/provider/e0$c;", "description", "c", "(Ljava/lang/CharSequence;)Landroidx/credentials/provider/e0$c;", "Ljava/time/Instant;", "lastUsedTime", "e", "(Ljava/time/Instant;)Landroidx/credentials/provider/e0$c;", "Landroidx/credentials/provider/e0;", "a", "()Landroidx/credentials/provider/e0;", "Ljava/lang/CharSequence;", "Landroid/app/PendingIntent;", "", "", "Ljava/util/Map;", "credentialCountInformationMap", "Landroid/graphics/drawable/Icon;", "Ljava/time/Instant;", "Ljava/lang/Integer;", "passwordCredentialCount", "publicKeyCredentialCount", "i", "totalCredentialCount", "j", "Z", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final CharSequence accountName;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private final PendingIntent pendingIntent;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @fg.l
        private Map<String, Integer> credentialCountInformationMap;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Icon icon;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private CharSequence description;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Instant lastUsedTime;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Integer passwordCredentialCount;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Integer publicKeyCredentialCount;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        @fg.m
        private Integer totalCredentialCount;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean autoSelectAllowed;

        public c(@fg.l CharSequence accountName, @fg.l PendingIntent pendingIntent) {
            kotlin.jvm.internal.l0.p(accountName, "accountName");
            kotlin.jvm.internal.l0.p(pendingIntent, "pendingIntent");
            this.accountName = accountName;
            this.pendingIntent = pendingIntent;
            this.credentialCountInformationMap = new LinkedHashMap();
        }

        @fg.l
        public final e0 a() {
            return new e0(this.accountName, this.pendingIntent, this.icon, this.description, this.lastUsedTime, this.credentialCountInformationMap, this.autoSelectAllowed);
        }

        @fg.l
        public final c b(boolean autoSelectAllowed) {
            this.autoSelectAllowed = autoSelectAllowed;
            return this;
        }

        @fg.l
        public final c c(@fg.m CharSequence description) {
            if ((description != null ? Integer.valueOf(description.length()) : null) != null && description.length() > 300) {
                throw new IllegalArgumentException("Description must follow a limit of 300 characters.");
            }
            this.description = description;
            return this;
        }

        @fg.l
        public final c d(@fg.m Icon icon) {
            this.icon = icon;
            return this;
        }

        @fg.l
        public final c e(@fg.m Instant lastUsedTime) {
            this.lastUsedTime = lastUsedTime;
            return this;
        }

        @fg.l
        public final c f(int count) {
            this.passwordCredentialCount = Integer.valueOf(count);
            this.credentialCountInformationMap.put("android.credentials.TYPE_PASSWORD_CREDENTIAL", Integer.valueOf(count));
            return this;
        }

        @fg.l
        public final c g(int count) {
            this.publicKeyCredentialCount = Integer.valueOf(count);
            this.credentialCountInformationMap.put("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", Integer.valueOf(count));
            return this;
        }

        @fg.l
        public final c h(int count) {
            this.totalCredentialCount = Integer.valueOf(count);
            this.credentialCountInformationMap.put("TOTAL_CREDENTIAL_COUNT_TYPE", Integer.valueOf(count));
            return this;
        }
    }

    /* compiled from: CreateEntry.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0011R\u0014\u0010\u0019\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0011R\u0014\u0010\u001d\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001e\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0011R\u0014\u0010 \u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Landroidx/credentials/provider/e0$d;", "", "<init>", "()V", "Landroidx/credentials/provider/e0;", "createEntry", "Landroid/app/slice/Slice;", "c", "(Landroidx/credentials/provider/e0;)Landroid/app/slice/Slice;", "slice", "b", "(Landroid/app/slice/Slice;)Landroidx/credentials/provider/e0;", "Landroid/service/credentials/CreateEntry;", "a", "(Landroid/service/credentials/CreateEntry;)Landroidx/credentials/provider/e0;", "", "AUTO_SELECT_FALSE_STRING", "Ljava/lang/String;", "AUTO_SELECT_TRUE_STRING", "", "DESCRIPTION_MAX_CHAR_LIMIT", "I", "REVISION_ID", "SLICE_HINT_ACCOUNT_NAME", "SLICE_HINT_AUTO_SELECT_ALLOWED", "SLICE_HINT_CREDENTIAL_COUNT_INFORMATION", "SLICE_HINT_ICON", "SLICE_HINT_LAST_USED_TIME_MILLIS", "SLICE_HINT_NOTE", "SLICE_HINT_PENDING_INTENT", "SLICE_SPEC_TYPE", "TAG", "TYPE_TOTAL_CREDENTIAL", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.credentials.provider.e0$d, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @fg.m
        @kd.n
        public final e0 a(@fg.l CreateEntry createEntry) {
            kotlin.jvm.internal.l0.p(createEntry, "createEntry");
            if (Build.VERSION.SDK_INT >= 34) {
                return b.a(createEntry);
            }
            return null;
        }

        @fg.m
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public final e0 b(@fg.l Slice slice) {
            kotlin.jvm.internal.l0.p(slice, "slice");
            if (Build.VERSION.SDK_INT >= 28) {
                return a.c(slice);
            }
            return null;
        }

        @fg.m
        @kd.n
        @androidx.annotation.c1({c1.a.LIBRARY})
        public final Slice c(@fg.l e0 createEntry) {
            kotlin.jvm.internal.l0.p(createEntry, "createEntry");
            if (Build.VERSION.SDK_INT >= 28) {
                return a.d(createEntry);
            }
            return null;
        }

        public Companion(kotlin.jvm.internal.w wVar) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e0(@fg.l CharSequence accountName, @fg.l PendingIntent pendingIntent, @fg.m CharSequence charSequence, @fg.m Instant instant, @fg.m Icon icon, @fg.m Integer num, @fg.m Integer num2, @fg.m Integer num3, boolean z4) {
        this(accountName, pendingIntent, icon, charSequence, instant, kotlin.collections.z0.j0(new kotlin.q0("android.credentials.TYPE_PASSWORD_CREDENTIAL", num), new kotlin.q0("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", num2), new kotlin.q0("TOTAL_CREDENTIAL_COUNT_TYPE", num3)), z4);
        kotlin.jvm.internal.l0.p(accountName, "accountName");
        kotlin.jvm.internal.l0.p(pendingIntent, "pendingIntent");
    }

    @fg.m
    @kd.n
    public static final e0 b(@fg.l CreateEntry createEntry) {
        return INSTANCE.a(createEntry);
    }

    @fg.m
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final e0 c(@fg.l Slice slice) {
        return INSTANCE.b(slice);
    }

    @fg.m
    @kd.n
    @androidx.annotation.c1({c1.a.LIBRARY})
    public static final Slice m(@fg.l e0 e0Var) {
        return INSTANCE.c(e0Var);
    }

    @fg.l
    /* renamed from: d, reason: from getter */
    public final CharSequence getAccountName() {
        return this.accountName;
    }

    @fg.m
    /* renamed from: e, reason: from getter */
    public final CharSequence getDescription() {
        return this.description;
    }

    @fg.m
    /* renamed from: f, reason: from getter */
    public final Icon getIcon() {
        return this.icon;
    }

    @fg.m
    /* renamed from: g, reason: from getter */
    public final Instant getLastUsedTime() {
        return this.lastUsedTime;
    }

    @fg.m
    public final Integer h() {
        return this.credentialCountInformationMap.get("android.credentials.TYPE_PASSWORD_CREDENTIAL");
    }

    @fg.l
    /* renamed from: i, reason: from getter */
    public final PendingIntent getPendingIntent() {
        return this.pendingIntent;
    }

    @fg.m
    public final Integer j() {
        return this.credentialCountInformationMap.get("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL");
    }

    @fg.m
    public final Integer k() {
        return this.credentialCountInformationMap.get("TOTAL_CREDENTIAL_COUNT_TYPE");
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    public e0(@fg.l CharSequence accountName, @fg.l PendingIntent pendingIntent, @fg.m Icon icon, @fg.m CharSequence charSequence, @fg.m Instant instant, @fg.l Map<String, Integer> credentialCountInformationMap, boolean z4) {
        kotlin.jvm.internal.l0.p(accountName, "accountName");
        kotlin.jvm.internal.l0.p(pendingIntent, "pendingIntent");
        kotlin.jvm.internal.l0.p(credentialCountInformationMap, "credentialCountInformationMap");
        this.accountName = accountName;
        this.pendingIntent = pendingIntent;
        this.icon = icon;
        this.description = charSequence;
        this.lastUsedTime = instant;
        this.credentialCountInformationMap = credentialCountInformationMap;
        this.isAutoSelectAllowed = z4;
        if (accountName.length() > 0) {
            if (charSequence != null && charSequence.length() > 300) {
                throw new IllegalArgumentException("Description must follow a limit of 300 characters.");
            }
            return;
        }
        throw new IllegalArgumentException("accountName must not be empty");
    }

    public /* synthetic */ e0(CharSequence charSequence, PendingIntent pendingIntent, CharSequence charSequence2, Instant instant, Icon icon, Integer num, Integer num2, Integer num3, boolean z4, int i4, kotlin.jvm.internal.w wVar) {
        this(charSequence, pendingIntent, (i4 & 4) != 0 ? null : charSequence2, (i4 & 8) != 0 ? null : instant, (i4 & 16) != 0 ? null : icon, (i4 & 32) != 0 ? null : num, (i4 & 64) != 0 ? null : num2, (i4 & 128) != 0 ? null : num3, (i4 & 256) != 0 ? false : z4);
    }
}
