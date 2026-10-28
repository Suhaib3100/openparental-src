package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.i;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.g;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import lg.v;
import org.mp4parser.aspectj.lang.c;
import org.mp4parser.aspectj.runtime.reflect.e;
import va.a;

/* loaded from: classes6.dex */
public abstract class AppleDataBox extends AbstractBox {
    private static final /* synthetic */ c.b ajc$tjp_0 = null;
    private static final /* synthetic */ c.b ajc$tjp_1 = null;
    private static final /* synthetic */ c.b ajc$tjp_2 = null;
    private static final /* synthetic */ c.b ajc$tjp_3 = null;
    private static final /* synthetic */ c.b ajc$tjp_4 = null;
    private static final /* synthetic */ c.b ajc$tjp_5 = null;
    private static HashMap<String, String> language;
    int dataCountry;
    int dataLanguage;
    int dataType;

    static {
        ajc$preClinit();
        HashMap<String, String> hashMap = new HashMap<>();
        language = hashMap;
        hashMap.put(ProtectedSandApp.s("࿖\u0001"), ProtectedSandApp.s("࿗\u0001"));
        language.put(ProtectedSandApp.s("࿘\u0001"), ProtectedSandApp.s("࿙\u0001"));
        language.put(ProtectedSandApp.s("࿚\u0001"), ProtectedSandApp.s("\u0fdb\u0001"));
        language.put(ProtectedSandApp.s("\u0fdc\u0001"), ProtectedSandApp.s("\u0fdd\u0001"));
        language.put(ProtectedSandApp.s("\u0fde\u0001"), ProtectedSandApp.s("\u0fdf\u0001"));
        language.put(ProtectedSandApp.s("\u0fe0\u0001"), ProtectedSandApp.s("\u0fe1\u0001"));
        language.put(ProtectedSandApp.s("\u0fe2\u0001"), ProtectedSandApp.s("\u0fe3\u0001"));
        language.put(ProtectedSandApp.s("\u0fe4\u0001"), ProtectedSandApp.s("\u0fe5\u0001"));
        language.put(ProtectedSandApp.s("\u0fe6\u0001"), ProtectedSandApp.s("\u0fe7\u0001"));
        language.put(ProtectedSandApp.s("\u0fe8\u0001"), ProtectedSandApp.s("\u0fe9\u0001"));
        language.put(ProtectedSandApp.s("\u0fea\u0001"), ProtectedSandApp.s("\u0feb\u0001"));
        language.put(ProtectedSandApp.s("\u0fec\u0001"), ProtectedSandApp.s("\u0fed\u0001"));
        language.put(ProtectedSandApp.s("\u0fee\u0001"), ProtectedSandApp.s("\u0fef\u0001"));
        language.put(ProtectedSandApp.s("\u0ff0\u0001"), ProtectedSandApp.s("\u0ff1\u0001"));
        language.put(ProtectedSandApp.s("\u0ff2\u0001"), ProtectedSandApp.s("\u0ff3\u0001"));
        language.put(ProtectedSandApp.s("\u0ff4\u0001"), ProtectedSandApp.s("\u0ff5\u0001"));
        language.put(ProtectedSandApp.s("\u0ff6\u0001"), ProtectedSandApp.s("\u0ff7\u0001"));
        language.put(ProtectedSandApp.s("\u0ff8\u0001"), ProtectedSandApp.s("\u0ff9\u0001"));
        language.put(ProtectedSandApp.s("\u0ffa\u0001"), ProtectedSandApp.s("\u0ffb\u0001"));
        language.put(ProtectedSandApp.s("\u0ffc\u0001"), ProtectedSandApp.s("\u0ffd\u0001"));
        language.put(ProtectedSandApp.s("\u0ffe\u0001"), ProtectedSandApp.s("\u0fff\u0001"));
        language.put(ProtectedSandApp.s("က\u0001"), ProtectedSandApp.s("ခ\u0001"));
        language.put(ProtectedSandApp.s("ဂ\u0001"), ProtectedSandApp.s("ဃ\u0001"));
        language.put(ProtectedSandApp.s("င\u0001"), ProtectedSandApp.s("စ\u0001"));
        language.put(ProtectedSandApp.s("ဆ\u0001"), ProtectedSandApp.s("ဇ\u0001"));
        language.put(ProtectedSandApp.s("ဈ\u0001"), ProtectedSandApp.s("ဉ\u0001"));
        language.put(ProtectedSandApp.s("ည\u0001"), ProtectedSandApp.s("ဋ\u0001"));
        language.put(ProtectedSandApp.s("ဌ\u0001"), ProtectedSandApp.s("ဍ\u0001"));
        language.put(ProtectedSandApp.s("ဎ\u0001"), ProtectedSandApp.s("ဏ\u0001"));
        language.put(ProtectedSandApp.s("တ\u0001"), ProtectedSandApp.s("ထ\u0001"));
        language.put(ProtectedSandApp.s("ဒ\u0001"), ProtectedSandApp.s("ဓ\u0001"));
        language.put(ProtectedSandApp.s("န\u0001"), ProtectedSandApp.s("ပ\u0001"));
        language.put(ProtectedSandApp.s("ဖ\u0001"), ProtectedSandApp.s("ဗ\u0001"));
        language.put(ProtectedSandApp.s("ဘ\u0001"), ProtectedSandApp.s("မ\u0001"));
        language.put(ProtectedSandApp.s("ယ\u0001"), ProtectedSandApp.s("ရ\u0001"));
        language.put(ProtectedSandApp.s("လ\u0001"), ProtectedSandApp.s("ဝ\u0001"));
        language.put(ProtectedSandApp.s("သ\u0001"), ProtectedSandApp.s("ဟ\u0001"));
        language.put(ProtectedSandApp.s("ဠ\u0001"), ProtectedSandApp.s("အ\u0001"));
        language.put(ProtectedSandApp.s("ဢ\u0001"), ProtectedSandApp.s("ဣ\u0001"));
        language.put(ProtectedSandApp.s("ဤ\u0001"), ProtectedSandApp.s("ဥ\u0001"));
        language.put(ProtectedSandApp.s("ဦ\u0001"), ProtectedSandApp.s("ဧ\u0001"));
        language.put(ProtectedSandApp.s("ဨ\u0001"), ProtectedSandApp.s("ဩ\u0001"));
        language.put(ProtectedSandApp.s("ဪ\u0001"), ProtectedSandApp.s("ါ\u0001"));
        language.put(ProtectedSandApp.s("ာ\u0001"), ProtectedSandApp.s("ိ\u0001"));
        language.put(ProtectedSandApp.s("ီ\u0001"), ProtectedSandApp.s("ု\u0001"));
        language.put(ProtectedSandApp.s("ူ\u0001"), ProtectedSandApp.s("ေ\u0001"));
        language.put(ProtectedSandApp.s("ဲ\u0001"), ProtectedSandApp.s("ဳ\u0001"));
        language.put(ProtectedSandApp.s("ဴ\u0001"), ProtectedSandApp.s("ဵ\u0001"));
        language.put(ProtectedSandApp.s("ံ\u0001"), ProtectedSandApp.s("့\u0001"));
        language.put(ProtectedSandApp.s("း\u0001"), ProtectedSandApp.s("္\u0001"));
        language.put(ProtectedSandApp.s("်\u0001"), ProtectedSandApp.s("ျ\u0001"));
        language.put(ProtectedSandApp.s("ြ\u0001"), ProtectedSandApp.s("ွ\u0001"));
        language.put(ProtectedSandApp.s("ှ\u0001"), ProtectedSandApp.s("ဿ\u0001"));
        language.put(ProtectedSandApp.s("၀\u0001"), ProtectedSandApp.s("၁\u0001"));
        language.put(ProtectedSandApp.s("၂\u0001"), ProtectedSandApp.s("၃\u0001"));
        language.put(ProtectedSandApp.s("၄\u0001"), ProtectedSandApp.s("၅\u0001"));
        language.put(ProtectedSandApp.s("၆\u0001"), ProtectedSandApp.s("၇\u0001"));
        language.put(ProtectedSandApp.s("၈\u0001"), ProtectedSandApp.s("၉\u0001"));
        language.put(ProtectedSandApp.s("၊\u0001"), ProtectedSandApp.s("။\u0001"));
        language.put(ProtectedSandApp.s("၌\u0001"), ProtectedSandApp.s("၍\u0001"));
        language.put(ProtectedSandApp.s("၎\u0001"), ProtectedSandApp.s("၏\u0001"));
        language.put(ProtectedSandApp.s("ၐ\u0001"), ProtectedSandApp.s("ၑ\u0001"));
        language.put(ProtectedSandApp.s("ၒ\u0001"), ProtectedSandApp.s("ၓ\u0001"));
        language.put(ProtectedSandApp.s("ၔ\u0001"), ProtectedSandApp.s("ၕ\u0001"));
        language.put(ProtectedSandApp.s("ၖ\u0001"), ProtectedSandApp.s("ၗ\u0001"));
        language.put(ProtectedSandApp.s("ၘ\u0001"), ProtectedSandApp.s("ၙ\u0001"));
        language.put(ProtectedSandApp.s("ၚ\u0001"), ProtectedSandApp.s("ၛ\u0001"));
        language.put(ProtectedSandApp.s("ၜ\u0001"), ProtectedSandApp.s("ၝ\u0001"));
        language.put(ProtectedSandApp.s("ၞ\u0001"), ProtectedSandApp.s("ၟ\u0001"));
        language.put(ProtectedSandApp.s("ၠ\u0001"), ProtectedSandApp.s("ၡ\u0001"));
        language.put(ProtectedSandApp.s("ၢ\u0001"), ProtectedSandApp.s("ၣ\u0001"));
        language.put(ProtectedSandApp.s("ၤ\u0001"), ProtectedSandApp.s("ၥ\u0001"));
        language.put(ProtectedSandApp.s("ၦ\u0001"), ProtectedSandApp.s("ၧ\u0001"));
        language.put(ProtectedSandApp.s("ၨ\u0001"), ProtectedSandApp.s("ၩ\u0001"));
        language.put(ProtectedSandApp.s("ၪ\u0001"), ProtectedSandApp.s("ၫ\u0001"));
        language.put(ProtectedSandApp.s("ၬ\u0001"), ProtectedSandApp.s("ၭ\u0001"));
        language.put(ProtectedSandApp.s("ၮ\u0001"), ProtectedSandApp.s("ၯ\u0001"));
        language.put(ProtectedSandApp.s("ၰ\u0001"), ProtectedSandApp.s("ၱ\u0001"));
        language.put(ProtectedSandApp.s("ၲ\u0001"), ProtectedSandApp.s("ၳ\u0001"));
        language.put(ProtectedSandApp.s("ၴ\u0001"), ProtectedSandApp.s("ၵ\u0001"));
        language.put(ProtectedSandApp.s("ၶ\u0001"), ProtectedSandApp.s("ၷ\u0001"));
        language.put(ProtectedSandApp.s("ၸ\u0001"), ProtectedSandApp.s("ၹ\u0001"));
        language.put(ProtectedSandApp.s("ၺ\u0001"), ProtectedSandApp.s("ၻ\u0001"));
        language.put(ProtectedSandApp.s("ၼ\u0001"), ProtectedSandApp.s("ၽ\u0001"));
        language.put(ProtectedSandApp.s("ၾ\u0001"), ProtectedSandApp.s("ၿ\u0001"));
        language.put(ProtectedSandApp.s("ႀ\u0001"), ProtectedSandApp.s("ႁ\u0001"));
        HashMap<String, String> hashMap2 = language;
        String s4 = ProtectedSandApp.s("ႂ\u0001");
        String s5 = ProtectedSandApp.s("ႃ\u0001");
        hashMap2.put(s5, s4);
        language.put(s5, ProtectedSandApp.s("ႄ\u0001"));
        language.put(ProtectedSandApp.s("ႅ\u0001"), ProtectedSandApp.s("ႆ\u0001"));
        language.put(ProtectedSandApp.s("ႇ\u0001"), ProtectedSandApp.s("ႈ\u0001"));
        language.put(ProtectedSandApp.s("ႉ\u0001"), ProtectedSandApp.s("ႊ\u0001"));
        language.put(ProtectedSandApp.s("ႋ\u0001"), ProtectedSandApp.s("ႌ\u0001"));
        language.put(ProtectedSandApp.s("ႍ\u0001"), ProtectedSandApp.s("ႎ\u0001"));
        language.put(ProtectedSandApp.s("ႏ\u0001"), ProtectedSandApp.s("႐\u0001"));
        language.put(ProtectedSandApp.s("႑\u0001"), ProtectedSandApp.s("႒\u0001"));
        language.put(ProtectedSandApp.s("႓\u0001"), ProtectedSandApp.s("႔\u0001"));
        language.put(ProtectedSandApp.s("႕\u0001"), ProtectedSandApp.s("႖\u0001"));
        language.put(ProtectedSandApp.s("႗\u0001"), ProtectedSandApp.s("႘\u0001"));
        language.put(ProtectedSandApp.s("႙\u0001"), ProtectedSandApp.s("ႚ\u0001"));
        language.put(ProtectedSandApp.s("ႛ\u0001"), ProtectedSandApp.s("ႜ\u0001"));
        language.put(ProtectedSandApp.s("ႝ\u0001"), ProtectedSandApp.s("႞\u0001"));
        language.put(ProtectedSandApp.s("႟\u0001"), ProtectedSandApp.s("Ⴀ\u0001"));
        language.put(ProtectedSandApp.s("Ⴁ\u0001"), ProtectedSandApp.s("Ⴂ\u0001"));
        language.put(ProtectedSandApp.s("Ⴃ\u0001"), ProtectedSandApp.s("Ⴄ\u0001"));
        language.put(ProtectedSandApp.s("Ⴅ\u0001"), ProtectedSandApp.s("Ⴆ\u0001"));
        language.put(ProtectedSandApp.s("Ⴇ\u0001"), ProtectedSandApp.s("Ⴈ\u0001"));
        language.put(ProtectedSandApp.s("Ⴉ\u0001"), ProtectedSandApp.s("Ⴊ\u0001"));
    }

    protected AppleDataBox(String str, int i4) {
        super(str);
        this.dataType = i4;
    }

    private static /* synthetic */ void ajc$preClinit() {
        e eVar = new e(ProtectedSandApp.s("Ⴋ\u0001"), AppleDataBox.class);
        v E = eVar.E(ProtectedSandApp.s("࿘\u0001"), ProtectedSandApp.s("Ⴍ\u0001"), ProtectedSandApp.s("Ⴎ\u0001"), "", "", "", ProtectedSandApp.s("Ⴌ\u0001"));
        String s4 = ProtectedSandApp.s("Ⴏ\u0001");
        ajc$tjp_0 = eVar.H(s4, E, 25);
        ajc$tjp_1 = eVar.H(s4, eVar.E(ProtectedSandApp.s("࿘\u0001"), ProtectedSandApp.s("Ⴑ\u0001"), ProtectedSandApp.s("Ⴎ\u0001"), "", "", "", ProtectedSandApp.s("Ⴐ\u0001")), 43);
        ajc$tjp_2 = eVar.H(s4, eVar.E(ProtectedSandApp.s("࿘\u0001"), ProtectedSandApp.s("Ⴒ\u0001"), ProtectedSandApp.s("Ⴎ\u0001"), "", "", "", ProtectedSandApp.s("Ⴐ\u0001")), 47);
        ajc$tjp_3 = eVar.H(s4, eVar.E(ProtectedSandApp.s("࿘\u0001"), ProtectedSandApp.s("Ⴔ\u0001"), ProtectedSandApp.s("Ⴎ\u0001"), ProtectedSandApp.s("Ⴐ\u0001"), ProtectedSandApp.s("Ⴕ\u0001"), "", ProtectedSandApp.s("Ⴓ\u0001")), 51);
        ajc$tjp_4 = eVar.H(s4, eVar.E(ProtectedSandApp.s("࿘\u0001"), ProtectedSandApp.s("Ⴖ\u0001"), ProtectedSandApp.s("Ⴎ\u0001"), "", "", "", ProtectedSandApp.s("Ⴐ\u0001")), 55);
        ajc$tjp_5 = eVar.H(s4, eVar.E(ProtectedSandApp.s("࿘\u0001"), ProtectedSandApp.s("Ⴗ\u0001"), ProtectedSandApp.s("Ⴎ\u0001"), ProtectedSandApp.s("Ⴐ\u0001"), ProtectedSandApp.s("Ⴘ\u0001"), "", ProtectedSandApp.s("Ⴓ\u0001")), 59);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseData(parseDataLength4ccTypeCountryLanguageAndReturnRest(byteBuffer));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected void getContent(ByteBuffer byteBuffer) {
        writeDataLength4ccTypeCountryLanguage(byteBuffer);
        byteBuffer.put(writeData());
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    protected long getContentSize() {
        return getDataLength() + 16;
    }

    public int getDataCountry() {
        g.b().c(e.v(ajc$tjp_2, this, this));
        return this.dataCountry;
    }

    public int getDataLanguage() {
        g.b().c(e.v(ajc$tjp_4, this, this));
        return this.dataLanguage;
    }

    protected abstract int getDataLength();

    public int getDataType() {
        g.b().c(e.v(ajc$tjp_1, this, this));
        return this.dataType;
    }

    public String getLanguageString() {
        g.b().c(e.v(ajc$tjp_0, this, this));
        HashMap<String, String> hashMap = language;
        StringBuilder sb = new StringBuilder();
        sb.append(this.dataLanguage);
        String str = hashMap.get(sb.toString());
        if (str != null) {
            return str;
        }
        ByteBuffer wrap = ByteBuffer.wrap(new byte[2]);
        i.f(wrap, this.dataLanguage);
        wrap.reset();
        return new Locale(com.coremedia.iso.g.f(wrap)).getDisplayLanguage();
    }

    protected abstract void parseData(ByteBuffer byteBuffer);

    @a
    protected ByteBuffer parseDataLength4ccTypeCountryLanguageAndReturnRest(ByteBuffer byteBuffer) {
        int i4 = byteBuffer.getInt();
        byteBuffer.getInt();
        this.dataType = byteBuffer.getInt();
        short s4 = byteBuffer.getShort();
        this.dataCountry = s4;
        if (s4 < 0) {
            this.dataCountry = s4 + 65536;
        }
        short s5 = byteBuffer.getShort();
        this.dataLanguage = s5;
        if (s5 < 0) {
            this.dataLanguage = s5 + 65536;
        }
        int i5 = i4 - 16;
        ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.duplicate().slice().limit(i5);
        byteBuffer.position(byteBuffer.position() + i5);
        return byteBuffer2;
    }

    public void setDataCountry(int i4) {
        g.b().c(e.w(ajc$tjp_3, this, this, new Integer(i4)));
        this.dataCountry = i4;
    }

    public void setDataLanguage(int i4) {
        g.b().c(e.w(ajc$tjp_5, this, this, new Integer(i4)));
        this.dataLanguage = i4;
    }

    protected abstract byte[] writeData();

    @a
    protected void writeDataLength4ccTypeCountryLanguage(ByteBuffer byteBuffer) {
        byteBuffer.putInt(getDataLength() + 16);
        byteBuffer.put(ProtectedSandApp.s("Ⴙ\u0001").getBytes());
        byteBuffer.putInt(this.dataType);
        i.f(byteBuffer, this.dataCountry);
        i.f(byteBuffer, this.dataLanguage);
    }
}
