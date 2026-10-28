package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.support.v4.media.a;
import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes5.dex */
public abstract class FastJsonResponse {

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @ShowFirstParty
    public interface FieldConverter<I, O> {
        int zaa();

        int zab();

        @q0
        Object zac(@o0 Object obj);

        @o0
        Object zad(@o0 Object obj);
    }

    @o0
    protected static final Object zaD(@o0 Field field, @q0 Object obj) {
        return field.zak != null ? field.zaf(obj) : obj;
    }

    private final void zaE(Field field, @q0 Object obj) {
        int i4 = field.zac;
        Object zae = field.zae(obj);
        String str = field.zae;
        switch (i4) {
            case 0:
                if (zae != null) {
                    setIntegerInternal(field, str, ((Integer) zae).intValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 1:
                zaf(field, str, (BigInteger) zae);
                return;
            case 2:
                if (zae != null) {
                    setLongInternal(field, str, ((Long) zae).longValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 3:
            default:
                throw new IllegalStateException(a.a(ProtectedSandApp.s("이"), i4));
            case 4:
                if (zae != null) {
                    zan(field, str, ((Double) zae).doubleValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 5:
                zab(field, str, (BigDecimal) zae);
                return;
            case 6:
                if (zae != null) {
                    setBooleanInternal(field, str, ((Boolean) zae).booleanValue());
                    return;
                } else {
                    zaG(str);
                    return;
                }
            case 7:
                setStringInternal(field, str, (String) zae);
                return;
            case 8:
            case 9:
                if (zae != null) {
                    setDecodedBytesInternal(field, str, (byte[]) zae);
                    return;
                } else {
                    zaG(str);
                    return;
                }
        }
    }

    private static final void zaF(StringBuilder sb, Field field, Object obj) {
        int i4 = field.zaa;
        if (i4 == 11) {
            Class cls = field.zag;
            Preconditions.checkNotNull(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else {
            if (i4 != 7) {
                sb.append(obj);
                return;
            }
            String s4 = ProtectedSandApp.s("익");
            sb.append(s4);
            sb.append(JsonUtils.escapeString((String) obj));
            sb.append(s4);
        }
    }

    private static final void zaG(String str) {
        Log.isLoggable(ProtectedSandApp.s("읶"), 6);
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeArrayInternal(@o0 Field field, @o0 String str, @q0 ArrayList<T> arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("읷"));
    }

    @KeepForSdk
    public <T extends FastJsonResponse> void addConcreteTypeInternal(@o0 Field field, @o0 String str, @o0 T t4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("인"));
    }

    @o0
    @KeepForSdk
    public abstract Map<String, Field<?, ?>> getFieldMappings();

    @q0
    @KeepForSdk
    protected Object getFieldValue(@o0 Field field) {
        String s4 = ProtectedSandApp.s("읹");
        String str = field.zae;
        if (field.zag == null) {
            return getValueObject(str);
        }
        Preconditions.checkState(getValueObject(str) == null, ProtectedSandApp.s("읺"), field.zae);
        try {
            return getClass().getMethod(s4 + Character.toUpperCase(str.charAt(0)) + str.substring(1), null).invoke(this, null);
        } catch (Exception e4) {
            throw new RuntimeException(e4);
        }
    }

    @q0
    @KeepForSdk
    protected abstract Object getValueObject(@o0 String str);

    @KeepForSdk
    protected boolean isFieldSet(@o0 Field field) {
        if (field.zac != 11) {
            return isPrimitiveFieldSet(field.zae);
        }
        if (field.zad) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("읻"));
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("일"));
    }

    @KeepForSdk
    protected abstract boolean isPrimitiveFieldSet(@o0 String str);

    @KeepForSdk
    protected void setBooleanInternal(@o0 Field<?, ?> field, @o0 String str, boolean z4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("읽"));
    }

    @KeepForSdk
    protected void setDecodedBytesInternal(@o0 Field<?, ?> field, @o0 String str, @q0 byte[] bArr) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("읾"));
    }

    @KeepForSdk
    protected void setIntegerInternal(@o0 Field<?, ?> field, @o0 String str, int i4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("읿"));
    }

    @KeepForSdk
    protected void setLongInternal(@o0 Field<?, ?> field, @o0 String str, long j4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("잀"));
    }

    @KeepForSdk
    protected void setStringInternal(@o0 Field<?, ?> field, @o0 String str, @q0 String str2) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("잁"));
    }

    @KeepForSdk
    protected void setStringMapInternal(@o0 Field<?, ?> field, @o0 String str, @q0 Map<String, String> map) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("잂"));
    }

    @KeepForSdk
    protected void setStringsInternal(@o0 Field<?, ?> field, @o0 String str, @q0 ArrayList<String> arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("잃"));
    }

    @o0
    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> fieldMappings = getFieldMappings();
        StringBuilder sb = new StringBuilder(100);
        for (String str : fieldMappings.keySet()) {
            Field<?, ?> field = fieldMappings.get(str);
            if (isFieldSet(field)) {
                Object zaD = zaD(field, getFieldValue(field));
                int length = sb.length();
                String s4 = ProtectedSandApp.s("임");
                if (length == 0) {
                    sb.append(ProtectedSandApp.s("입"));
                } else {
                    sb.append(s4);
                }
                String s5 = ProtectedSandApp.s("익");
                androidx.concurrent.futures.a.a(sb, s5, str, ProtectedSandApp.s("잆"));
                if (zaD != null) {
                    switch (field.zac) {
                        case 8:
                            sb.append(s5);
                            sb.append(Base64Utils.encode((byte[]) zaD));
                            sb.append(s5);
                            break;
                        case 9:
                            sb.append(s5);
                            sb.append(Base64Utils.encodeUrlSafe((byte[]) zaD));
                            sb.append(s5);
                            break;
                        case 10:
                            MapUtils.writeStringMapToJson(sb, (HashMap) zaD);
                            break;
                        default:
                            if (field.zab) {
                                ArrayList arrayList = (ArrayList) zaD;
                                sb.append(ProtectedSandApp.s("있"));
                                int size = arrayList.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    if (i4 > 0) {
                                        sb.append(s4);
                                    }
                                    Object obj = arrayList.get(i4);
                                    if (obj != null) {
                                        zaF(sb, field, obj);
                                    }
                                }
                                sb.append(ProtectedSandApp.s("잉"));
                                break;
                            } else {
                                zaF(sb, field, zaD);
                                break;
                            }
                    }
                } else {
                    sb.append(ProtectedSandApp.s("잇"));
                }
            }
        }
        if (sb.length() > 0) {
            sb.append(ProtectedSandApp.s("잊"));
        } else {
            sb.append(ProtectedSandApp.s("잋"));
        }
        return sb.toString();
    }

    public final void zaA(@o0 Field field, @q0 String str) {
        if (field.zak != null) {
            zaE(field, str);
        } else {
            setStringInternal(field, field.zae, str);
        }
    }

    public final void zaB(@o0 Field field, @q0 Map map) {
        if (field.zak != null) {
            zaE(field, map);
        } else {
            setStringMapInternal(field, field.zae, map);
        }
    }

    public final void zaC(@o0 Field field, @q0 ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            setStringsInternal(field, field.zae, arrayList);
        }
    }

    public final void zaa(@o0 Field field, @q0 BigDecimal bigDecimal) {
        if (field.zak != null) {
            zaE(field, bigDecimal);
        } else {
            zab(field, field.zae, bigDecimal);
        }
    }

    protected void zab(@o0 Field field, @o0 String str, @q0 BigDecimal bigDecimal) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("잌"));
    }

    public final void zac(@o0 Field field, @q0 ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zad(field, field.zae, arrayList);
        }
    }

    protected void zad(@o0 Field field, @o0 String str, @q0 ArrayList arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("잍"));
    }

    public final void zae(@o0 Field field, @q0 BigInteger bigInteger) {
        if (field.zak != null) {
            zaE(field, bigInteger);
        } else {
            zaf(field, field.zae, bigInteger);
        }
    }

    protected void zaf(@o0 Field field, @o0 String str, @q0 BigInteger bigInteger) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("잎"));
    }

    public final void zag(@o0 Field field, @q0 ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zah(field, field.zae, arrayList);
        }
    }

    protected void zah(@o0 Field field, @o0 String str, @q0 ArrayList arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("잏"));
    }

    public final void zai(@o0 Field field, boolean z4) {
        if (field.zak != null) {
            zaE(field, Boolean.valueOf(z4));
        } else {
            setBooleanInternal(field, field.zae, z4);
        }
    }

    public final void zaj(@o0 Field field, @q0 ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zak(field, field.zae, arrayList);
        }
    }

    protected void zak(@o0 Field field, @o0 String str, @q0 ArrayList arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("자"));
    }

    public final void zal(@o0 Field field, @q0 byte[] bArr) {
        if (field.zak != null) {
            zaE(field, bArr);
        } else {
            setDecodedBytesInternal(field, field.zae, bArr);
        }
    }

    public final void zam(@o0 Field field, double d5) {
        if (field.zak != null) {
            zaE(field, Double.valueOf(d5));
        } else {
            zan(field, field.zae, d5);
        }
    }

    protected void zan(@o0 Field field, @o0 String str, double d5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("작"));
    }

    public final void zao(@o0 Field field, @q0 ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zap(field, field.zae, arrayList);
        }
    }

    protected void zap(@o0 Field field, @o0 String str, @q0 ArrayList arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("잒"));
    }

    public final void zaq(@o0 Field field, float f4) {
        if (field.zak != null) {
            zaE(field, Float.valueOf(f4));
        } else {
            zar(field, field.zae, f4);
        }
    }

    protected void zar(@o0 Field field, @o0 String str, float f4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("잓"));
    }

    public final void zas(@o0 Field field, @q0 ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zat(field, field.zae, arrayList);
        }
    }

    protected void zat(@o0 Field field, @o0 String str, @q0 ArrayList arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("잔"));
    }

    public final void zau(@o0 Field field, int i4) {
        if (field.zak != null) {
            zaE(field, Integer.valueOf(i4));
        } else {
            setIntegerInternal(field, field.zae, i4);
        }
    }

    public final void zav(@o0 Field field, @q0 ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zaw(field, field.zae, arrayList);
        }
    }

    protected void zaw(@o0 Field field, @o0 String str, @q0 ArrayList arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("잕"));
    }

    public final void zax(@o0 Field field, long j4) {
        if (field.zak != null) {
            zaE(field, Long.valueOf(j4));
        } else {
            setLongInternal(field, field.zae, j4);
        }
    }

    public final void zay(@o0 Field field, @q0 ArrayList arrayList) {
        if (field.zak != null) {
            zaE(field, arrayList);
        } else {
            zaz(field, field.zae, arrayList);
        }
    }

    protected void zaz(@o0 Field field, @o0 String str, @q0 ArrayList arrayList) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("잖"));
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    @SafeParcelable.Class(creator = "FieldCreator")
    @ShowFirstParty
    @KeepForSdk
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();

        @SafeParcelable.Field(getter = "getTypeIn", id = 2)
        protected final int zaa;

        @SafeParcelable.Field(getter = "isTypeInArray", id = 3)
        protected final boolean zab;

        @SafeParcelable.Field(getter = "getTypeOut", id = 4)
        protected final int zac;

        @SafeParcelable.Field(getter = "isTypeOutArray", id = 5)
        protected final boolean zad;

        @o0
        @SafeParcelable.Field(getter = "getOutputFieldName", id = 6)
        protected final String zae;

        @SafeParcelable.Field(getter = "getSafeParcelableFieldId", id = 7)
        protected final int zaf;

        @q0
        protected final Class zag;

        @q0
        @SafeParcelable.Field(getter = "getConcreteTypeName", id = 8)
        protected final String zah;

        @SafeParcelable.VersionField(getter = "getVersionCode", id = 1)
        private final int zai;
        private zan zaj;

        @q0
        @SafeParcelable.Field(getter = "getWrappedConverter", id = 9, type = "com.google.android.gms.common.server.converter.ConverterWrapper")
        private final FieldConverter zak;

        @SafeParcelable.Constructor
        Field(@SafeParcelable.Param(id = 1) int i4, @SafeParcelable.Param(id = 2) int i5, @SafeParcelable.Param(id = 3) boolean z4, @SafeParcelable.Param(id = 4) int i6, @SafeParcelable.Param(id = 5) boolean z5, @SafeParcelable.Param(id = 6) String str, @SafeParcelable.Param(id = 7) int i7, @q0 @SafeParcelable.Param(id = 8) String str2, @q0 @SafeParcelable.Param(id = 9) com.google.android.gms.common.server.converter.zaa zaaVar) {
            this.zai = i4;
            this.zaa = i5;
            this.zab = z4;
            this.zac = i6;
            this.zad = z5;
            this.zae = str;
            this.zaf = i7;
            if (str2 == null) {
                this.zag = null;
                this.zah = null;
            } else {
                this.zag = SafeParcelResponse.class;
                this.zah = str2;
            }
            if (zaaVar == null) {
                this.zak = null;
            } else {
                this.zak = zaaVar.zab();
            }
        }

        @o0
        @KeepForSdk
        public static Field<byte[], byte[]> forBase64(@o0 String str, int i4) {
            return new Field<>(8, false, 8, false, str, i4, null, null);
        }

        @o0
        @KeepForSdk
        public static Field<Boolean, Boolean> forBoolean(@o0 String str, int i4) {
            return new Field<>(6, false, 6, false, str, i4, null, null);
        }

        @o0
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<T, T> forConcreteType(@o0 String str, int i4, @o0 Class<T> cls) {
            return new Field<>(11, false, 11, false, str, i4, cls, null);
        }

        @o0
        @KeepForSdk
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> forConcreteTypeArray(@o0 String str, int i4, @o0 Class<T> cls) {
            return new Field<>(11, true, 11, true, str, i4, cls, null);
        }

        @o0
        @KeepForSdk
        public static Field<Double, Double> forDouble(@o0 String str, int i4) {
            return new Field<>(4, false, 4, false, str, i4, null, null);
        }

        @o0
        @KeepForSdk
        public static Field<Float, Float> forFloat(@o0 String str, int i4) {
            return new Field<>(3, false, 3, false, str, i4, null, null);
        }

        @o0
        @KeepForSdk
        public static Field<Integer, Integer> forInteger(@o0 String str, int i4) {
            return new Field<>(0, false, 0, false, str, i4, null, null);
        }

        @o0
        @KeepForSdk
        public static Field<Long, Long> forLong(@o0 String str, int i4) {
            return new Field<>(2, false, 2, false, str, i4, null, null);
        }

        @o0
        @KeepForSdk
        public static Field<String, String> forString(@o0 String str, int i4) {
            return new Field<>(7, false, 7, false, str, i4, null, null);
        }

        @o0
        @KeepForSdk
        public static Field<HashMap<String, String>, HashMap<String, String>> forStringMap(@o0 String str, int i4) {
            return new Field<>(10, false, 10, false, str, i4, null, null);
        }

        @o0
        @KeepForSdk
        public static Field<ArrayList<String>, ArrayList<String>> forStrings(@o0 String str, int i4) {
            return new Field<>(7, true, 7, true, str, i4, null, null);
        }

        @o0
        @KeepForSdk
        public static Field withConverter(@o0 String str, int i4, @o0 FieldConverter<?, ?> fieldConverter, boolean z4) {
            fieldConverter.zaa();
            fieldConverter.zab();
            return new Field(7, z4, 0, false, str, i4, null, fieldConverter);
        }

        @KeepForSdk
        public int getSafeParcelableFieldId() {
            return this.zaf;
        }

        @o0
        public final String toString() {
            Objects.ToStringHelper add = Objects.toStringHelper(this).add(ProtectedSandApp.s("쭽"), Integer.valueOf(this.zai)).add(ProtectedSandApp.s("쭾"), Integer.valueOf(this.zaa)).add(ProtectedSandApp.s("쭿"), Boolean.valueOf(this.zab)).add(ProtectedSandApp.s("쮀"), Integer.valueOf(this.zac)).add(ProtectedSandApp.s("쮁"), Boolean.valueOf(this.zad)).add(ProtectedSandApp.s("쮂"), this.zae).add(ProtectedSandApp.s("쮃"), Integer.valueOf(this.zaf)).add(ProtectedSandApp.s("쮄"), zag());
            Class cls = this.zag;
            if (cls != null) {
                add.add(ProtectedSandApp.s("쮅"), cls.getCanonicalName());
            }
            FieldConverter fieldConverter = this.zak;
            if (fieldConverter != null) {
                add.add(ProtectedSandApp.s("쮆"), fieldConverter.getClass().getCanonicalName());
            }
            return add.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@o0 Parcel parcel, int i4) {
            int i5 = this.zai;
            int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
            SafeParcelWriter.writeInt(parcel, 1, i5);
            SafeParcelWriter.writeInt(parcel, 2, this.zaa);
            SafeParcelWriter.writeBoolean(parcel, 3, this.zab);
            SafeParcelWriter.writeInt(parcel, 4, this.zac);
            SafeParcelWriter.writeBoolean(parcel, 5, this.zad);
            SafeParcelWriter.writeString(parcel, 6, this.zae, false);
            SafeParcelWriter.writeInt(parcel, 7, getSafeParcelableFieldId());
            SafeParcelWriter.writeString(parcel, 8, zag(), false);
            SafeParcelWriter.writeParcelable(parcel, 9, zaa(), i4, false);
            SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        }

        @q0
        final com.google.android.gms.common.server.converter.zaa zaa() {
            FieldConverter fieldConverter = this.zak;
            if (fieldConverter == null) {
                return null;
            }
            return com.google.android.gms.common.server.converter.zaa.zaa(fieldConverter);
        }

        @o0
        public final Field zab() {
            return new Field(this.zai, this.zaa, this.zab, this.zac, this.zad, this.zae, this.zaf, this.zah, zaa());
        }

        @o0
        public final FastJsonResponse zad() throws InstantiationException, IllegalAccessException {
            Preconditions.checkNotNull(this.zag);
            Class cls = this.zag;
            if (cls != SafeParcelResponse.class) {
                return (FastJsonResponse) cls.newInstance();
            }
            Preconditions.checkNotNull(this.zah);
            Preconditions.checkNotNull(this.zaj, ProtectedSandApp.s("쮇"));
            return new SafeParcelResponse(this.zaj, this.zah);
        }

        @o0
        public final Object zae(@q0 Object obj) {
            Preconditions.checkNotNull(this.zak);
            return Preconditions.checkNotNull(this.zak.zac(obj));
        }

        @o0
        public final Object zaf(@o0 Object obj) {
            Preconditions.checkNotNull(this.zak);
            return this.zak.zad(obj);
        }

        @q0
        final String zag() {
            String str = this.zah;
            if (str == null) {
                return null;
            }
            return str;
        }

        @o0
        public final Map zah() {
            Preconditions.checkNotNull(this.zah);
            Preconditions.checkNotNull(this.zaj);
            return (Map) Preconditions.checkNotNull(this.zaj.zab(this.zah));
        }

        public final void zai(zan zanVar) {
            this.zaj = zanVar;
        }

        public final boolean zaj() {
            return this.zak != null;
        }

        protected Field(int i4, boolean z4, int i5, boolean z5, @o0 String str, int i6, @q0 Class cls, @q0 FieldConverter fieldConverter) {
            this.zai = 1;
            this.zaa = i4;
            this.zab = z4;
            this.zac = i5;
            this.zad = z5;
            this.zae = str;
            this.zaf = i6;
            this.zag = cls;
            if (cls == null) {
                this.zah = null;
            } else {
                this.zah = cls.getCanonicalName();
            }
            this.zak = fieldConverter;
        }
    }
}
