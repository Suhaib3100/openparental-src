package okio;

import androidx.compose.material3.s3;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.jvm.internal.t1;
import kotlin.x0;

/* compiled from: Buffer.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002ä\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u0019J\u000f\u0010\u001f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0001H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0016¢\u0006\u0004\b'\u0010(J+\u0010+\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u001a2\b\b\u0002\u0010*\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b+\u0010,J'\u0010-\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020\t¢\u0006\u0004\b/\u00100J!\u00101\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u001a2\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\t¢\u0006\u0004\b7\u00108J\u000f\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0018\u0010=\u001a\u0002092\u0006\u0010<\u001a\u00020\tH\u0087\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\tH\u0016¢\u0006\u0004\bE\u00108J\u000f\u0010F\u001a\u00020?H\u0016¢\u0006\u0004\bF\u0010AJ\u000f\u0010G\u001a\u00020BH\u0016¢\u0006\u0004\bG\u0010DJ\u000f\u0010H\u001a\u00020\tH\u0016¢\u0006\u0004\bH\u00108J\u000f\u0010I\u001a\u00020\tH\u0016¢\u0006\u0004\bI\u00108J\u000f\u0010J\u001a\u00020\tH\u0016¢\u0006\u0004\bJ\u00108J\u000f\u0010K\u001a\u00020\u0012H\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020B2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u001f\u0010T\u001a\u00020\r2\u0006\u0010S\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u00020\t2\u0006\u0010S\u001a\u00020VH\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0010H\u0016¢\u0006\u0004\bY\u0010ZJ\u0017\u0010[\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b[\u0010\\J\u0017\u0010_\u001a\u00020\u00102\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\b_\u0010`J\u001f\u0010a\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0004\ba\u0010bJ\u0011\u0010c\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\bc\u0010ZJ\u000f\u0010d\u001a\u00020\u0010H\u0016¢\u0006\u0004\bd\u0010ZJ\u0017\u0010f\u001a\u00020\u00102\u0006\u0010e\u001a\u00020\tH\u0016¢\u0006\u0004\bf\u0010\\J\u000f\u0010g\u001a\u00020BH\u0016¢\u0006\u0004\bg\u0010DJ\u000f\u0010i\u001a\u00020hH\u0016¢\u0006\u0004\bi\u0010jJ\u0017\u0010k\u001a\u00020h2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020B2\u0006\u0010S\u001a\u00020hH\u0016¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\r2\u0006\u0010S\u001a\u00020hH\u0016¢\u0006\u0004\bo\u0010pJ'\u0010m\u001a\u00020B2\u0006\u0010S\u001a\u00020h2\u0006\u0010*\u001a\u00020B2\u0006\u0010\n\u001a\u00020BH\u0016¢\u0006\u0004\bm\u0010qJ\u0017\u0010m\u001a\u00020B2\u0006\u0010S\u001a\u00020rH\u0016¢\u0006\u0004\bm\u0010sJ\r\u0010t\u001a\u00020\r¢\u0006\u0004\bt\u0010\u0006J\u0017\u0010u\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\bu\u0010\"J\u0017\u0010w\u001a\u00020\u00002\u0006\u0010v\u001a\u00020\u0012H\u0016¢\u0006\u0004\bw\u0010xJ'\u0010y\u001a\u00020\u00002\u0006\u0010v\u001a\u00020\u00122\u0006\u0010*\u001a\u00020B2\u0006\u0010\n\u001a\u00020BH\u0016¢\u0006\u0004\by\u0010zJ\u0017\u0010|\u001a\u00020\u00002\u0006\u0010{\u001a\u00020\u0010H\u0016¢\u0006\u0004\b|\u0010}J*\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010{\u001a\u00020\u00102\u0006\u0010~\u001a\u00020B2\u0006\u0010\u007f\u001a\u00020BH\u0016¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u001b\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020BH\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\"\u0010\u0085\u0001\u001a\u00020\u00002\u0006\u0010{\u001a\u00020\u00102\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J2\u0010\u0087\u0001\u001a\u00020\u00002\u0006\u0010{\u001a\u00020\u00102\u0006\u0010~\u001a\u00020B2\u0006\u0010\u007f\u001a\u00020B2\u0006\u0010^\u001a\u00020]H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001b\u0010\u008a\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020hH\u0016¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J+\u0010\u008c\u0001\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020h2\u0006\u0010*\u001a\u00020B2\u0006\u0010\n\u001a\u00020BH\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001a\u0010\u008e\u0001\u001a\u00020B2\u0007\u0010\u0089\u0001\u001a\u00020rH\u0016¢\u0006\u0005\b\u008e\u0001\u0010sJ\u001c\u0010\u0090\u0001\u001a\u00020\t2\b\u0010\u0089\u0001\u001a\u00030\u008f\u0001H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J$\u0010\u0092\u0001\u001a\u00020\u00002\b\u0010\u0089\u0001\u001a\u00030\u008f\u00012\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001b\u0010\u0095\u0001\u001a\u00020\u00002\u0007\u0010\u0094\u0001\u001a\u00020BH\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u0084\u0001J\u001b\u0010\u0097\u0001\u001a\u00020\u00002\u0007\u0010\u0096\u0001\u001a\u00020BH\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0084\u0001J\u001b\u0010\u0098\u0001\u001a\u00020\u00002\u0007\u0010\u0096\u0001\u001a\u00020BH\u0016¢\u0006\u0006\b\u0098\u0001\u0010\u0084\u0001J\u001b\u0010\u009a\u0001\u001a\u00020\u00002\u0007\u0010\u0099\u0001\u001a\u00020BH\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u0084\u0001J\u001b\u0010\u009b\u0001\u001a\u00020\u00002\u0007\u0010\u0099\u0001\u001a\u00020BH\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u0084\u0001J\u001b\u0010\u009d\u0001\u001a\u00020\u00002\u0007\u0010\u009c\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001b\u0010\u009f\u0001\u001a\u00020\u00002\u0007\u0010\u009c\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b\u009f\u0001\u0010\u009e\u0001J\u001b\u0010 \u0001\u001a\u00020\u00002\u0007\u0010\u009c\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b \u0001\u0010\u009e\u0001J\u001b\u0010¡\u0001\u001a\u00020\u00002\u0007\u0010\u009c\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b¡\u0001\u0010\u009e\u0001J\u001c\u0010¤\u0001\u001a\u00030£\u00012\u0007\u0010¢\u0001\u001a\u00020BH\u0000¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\"\u0010\u008e\u0001\u001a\u00020\r2\u0007\u0010\u0089\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0005\b\u008e\u0001\u0010UJ\"\u0010¦\u0001\u001a\u00020\t2\u0006\u0010S\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u001b\u0010¨\u0001\u001a\u00020\t2\u0007\u0010\u0094\u0001\u001a\u000209H\u0016¢\u0006\u0006\b¨\u0001\u0010©\u0001J$\u0010«\u0001\u001a\u00020\t2\u0007\u0010\u0094\u0001\u001a\u0002092\u0007\u0010ª\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J-\u0010®\u0001\u001a\u00020\t2\u0007\u0010\u0094\u0001\u001a\u0002092\u0007\u0010ª\u0001\u001a\u00020\t2\u0007\u0010\u00ad\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001b\u0010±\u0001\u001a\u00020\t2\u0007\u0010°\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0006\b±\u0001\u0010²\u0001J$\u0010³\u0001\u001a\u00020\t2\u0007\u0010°\u0001\u001a\u00020\u00122\u0007\u0010ª\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b³\u0001\u0010´\u0001J\u001b\u0010¶\u0001\u001a\u00020\t2\u0007\u0010µ\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0006\b¶\u0001\u0010²\u0001J$\u0010·\u0001\u001a\u00020\t2\u0007\u0010µ\u0001\u001a\u00020\u00122\u0007\u0010ª\u0001\u001a\u00020\tH\u0016¢\u0006\u0006\b·\u0001\u0010´\u0001J#\u0010¸\u0001\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\t2\u0007\u0010°\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0006\b¸\u0001\u0010¹\u0001J4\u0010»\u0001\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\t2\u0007\u0010°\u0001\u001a\u00020\u00122\u0007\u0010º\u0001\u001a\u00020B2\u0006\u0010\n\u001a\u00020BH\u0016¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u0011\u0010½\u0001\u001a\u00020\rH\u0016¢\u0006\u0005\b½\u0001\u0010\u0006J\u0011\u0010¾\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b¾\u0001\u0010 J\u0011\u0010¿\u0001\u001a\u00020\rH\u0016¢\u0006\u0005\b¿\u0001\u0010\u0006J\u0013\u0010Á\u0001\u001a\u00030À\u0001H\u0016¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J\u000f\u0010Ã\u0001\u001a\u00020\u0012¢\u0006\u0005\bÃ\u0001\u0010LJ\u000f\u0010Ä\u0001\u001a\u00020\u0012¢\u0006\u0005\bÄ\u0001\u0010LJ\u000f\u0010Å\u0001\u001a\u00020\u0012¢\u0006\u0005\bÅ\u0001\u0010LJ\u000f\u0010Æ\u0001\u001a\u00020\u0012¢\u0006\u0005\bÆ\u0001\u0010LJ\u0018\u0010Ç\u0001\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u0018\u0010É\u0001\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0006\bÉ\u0001\u0010È\u0001J\u0018\u0010Ê\u0001\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0006\bÊ\u0001\u0010È\u0001J\u001f\u0010Í\u0001\u001a\u00020\u000b2\n\u0010Ì\u0001\u001a\u0005\u0018\u00010Ë\u0001H\u0096\u0002¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J\u0011\u0010Ï\u0001\u001a\u00020BH\u0016¢\u0006\u0005\bÏ\u0001\u0010DJ\u0011\u0010Ð\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bÐ\u0001\u0010ZJ\u000f\u0010Ñ\u0001\u001a\u00020\u0000¢\u0006\u0005\bÑ\u0001\u0010\u0019J\u0011\u0010Ò\u0001\u001a\u00020\u0000H\u0016¢\u0006\u0005\bÒ\u0001\u0010\u0019J\u000f\u0010Ó\u0001\u001a\u00020\u0012¢\u0006\u0005\bÓ\u0001\u0010LJ\u0018\u0010Ô\u0001\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020B¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u001f\u0010Ø\u0001\u001a\u00030Ö\u00012\n\b\u0002\u0010×\u0001\u001a\u00030Ö\u0001H\u0007¢\u0006\u0006\bØ\u0001\u0010Ù\u0001J\u001f\u0010Ú\u0001\u001a\u00030Ö\u00012\n\b\u0002\u0010×\u0001\u001a\u00030Ö\u0001H\u0007¢\u0006\u0006\bÚ\u0001\u0010Ù\u0001J\u001a\u0010\u0094\u0001\u001a\u0002092\u0007\u0010Û\u0001\u001a\u00020\tH\u0007¢\u0006\u0005\b\u0094\u0001\u0010>J\u0011\u0010Ü\u0001\u001a\u00020\tH\u0007¢\u0006\u0005\bÜ\u0001\u00108R\u001c\u0010Þ\u0001\u001a\u0005\u0018\u00010£\u00018\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010Ý\u0001R/\u0010à\u0001\u001a\u00020\t2\u0007\u0010ß\u0001\u001a\u00020\t8G@@X\u0086\u000e¢\u0006\u0015\n\u0005\bÜ\u0001\u00103\u001a\u0005\bà\u0001\u00108\"\u0005\bá\u0001\u0010\"R\u0016\u0010ã\u0001\u001a\u00020\u00008VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bâ\u0001\u0010\u0019¨\u0006å\u0001"}, d2 = {"Lokio/m;", "Lokio/o;", "Lokio/n;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "Ljava/io/InputStream;", "input", "", "byteCount", "", "forever", "Lkotlin/k2;", "M", "(Ljava/io/InputStream;JZ)V", "", "algorithm", "Lokio/p;", "t", "(Ljava/lang/String;)Lokio/p;", "key", "B", "(Ljava/lang/String;Lokio/p;)Lokio/p;", "r", "()Lokio/m;", "Ljava/io/OutputStream;", "G3", "()Ljava/io/OutputStream;", "y", "u", "t2", "()Z", "J1", "(J)V", "h1", "(J)Z", "peek", "()Lokio/o;", "J3", "()Ljava/io/InputStream;", "out", "offset", "l", "(Ljava/io/OutputStream;JJ)Lokio/m;", "n", "(Lokio/m;JJ)Lokio/m;", "m", "(Lokio/m;J)Lokio/m;", "S1", "(Ljava/io/OutputStream;J)Lokio/m;", "J", "(Ljava/io/InputStream;)Lokio/m;", "K", "(Ljava/io/InputStream;J)Lokio/m;", "f", "()J", "", "readByte", "()B", "pos", "z", "(J)B", "", "readShort", "()S", "", "readInt", "()I", "readLong", "v1", "k3", "z1", "y2", "H3", "b3", "()Lokio/p;", "b2", "(J)Lokio/p;", "Lokio/d0;", "options", "K3", "(Lokio/d0;)I", "sink", "t0", "(Lokio/m;J)V", "Lokio/m0;", "z3", "(Lokio/m0;)J", "n3", "()Ljava/lang/String;", "V1", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "X2", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "q3", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "x0", "m1", "limit", "D0", "Z2", "", "p2", "()[B", "q1", "(J)[B", "read", "([B)I", "readFully", "([B)V", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "d", "skip", "byteString", "C0", "(Lokio/p;)Lokio/m;", "H0", "(Lokio/p;II)Lokio/m;", "string", "W1", "(Ljava/lang/String;)Lokio/m;", "beginIndex", "endIndex", "a2", "(Ljava/lang/String;II)Lokio/m;", "codePoint", "d2", "(I)Lokio/m;", "L1", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lokio/m;", "K1", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lokio/m;", "source", "N0", "([B)Lokio/m;", "S0", "([BII)Lokio/m;", "write", "Lokio/o0;", "b1", "(Lokio/o0;)J", "M0", "(Lokio/o0;J)Lokio/m;", "b", "U0", "s", "t1", "y1", "i", "e1", "g1", "v", "j1", "(J)Lokio/m;", "k1", "c1", "d1", "minimumCapacity", "Lokio/j0;", "B0", "(I)Lokio/j0;", "w3", "(Lokio/m;J)J", "Q1", "(B)J", "fromIndex", "s0", "(BJ)J", "toIndex", "v0", "(BJJ)J", "bytes", "m0", "(Lokio/p;)J", "V", "(Lokio/p;J)J", "targetBytes", "w0", "I1", "T0", "(JLokio/p;)Z", "bytesOffset", "o1", "(JLokio/p;II)Z", "flush", "isOpen", "close", "Lokio/q0;", "timeout", "()Lokio/q0;", "F", "c0", "o0", "q0", "C", "(Lokio/p;)Lokio/p;", "D", "E", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "g", "e", "u0", "A0", "(I)Lokio/p;", "Lokio/m$a;", "unsafeCursor", "O", "(Lokio/m$a;)Lokio/m$a;", "H", "index", "c", "Lokio/j0;", "head", "<set-?>", "size", "Y", "getBuffer", "buffer", "a", "okio"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class m implements o, n, Cloneable, ByteChannel {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @fg.m
    @kd.f
    public j0 head;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010#¨\u0006'"}, d2 = {"Lokio/m$a;", "Ljava/io/Closeable;", "<init>", "()V", "", "b", "()I", "", "offset", "d", "(J)I", "newSize", "c", "(J)J", "minByteCount", "a", "(I)J", "Lkotlin/k2;", "close", "Lokio/m;", "Lokio/m;", "buffer", "", "Z", "readWrite", "Lokio/j0;", "Lokio/j0;", "segment", "e", "J", "", "f", "[B", "data", "g", "I", "start", "h", "end", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class a implements Closeable {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @fg.m
        @kd.f
        public m buffer;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public boolean readWrite;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private j0 segment;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        @fg.m
        @kd.f
        public byte[] data;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public long offset = -1;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public int start = -1;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        @kd.f
        public int end = -1;

        public final long a(int minByteCount) {
            if (!(minByteCount > 0)) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("ῃ"), minByteCount).toString());
            }
            if (!(minByteCount <= 8192)) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("ῂ"), minByteCount).toString());
            }
            m mVar = this.buffer;
            if (mVar == null) {
                throw new IllegalStateException(ProtectedSandApp.s("῁"));
            }
            if (!this.readWrite) {
                throw new IllegalStateException(ProtectedSandApp.s("῀"));
            }
            long size = mVar.size();
            j0 B0 = mVar.B0(minByteCount);
            int i4 = 8192 - B0.limit;
            B0.limit = 8192;
            long j4 = i4;
            mVar.Y(size + j4);
            this.segment = B0;
            this.offset = size;
            this.data = B0.data;
            this.start = 8192 - i4;
            this.end = 8192;
            return j4;
        }

        public final int b() {
            long j4 = this.offset;
            m mVar = this.buffer;
            kotlin.jvm.internal.l0.m(mVar);
            if (!(j4 != mVar.size())) {
                throw new IllegalStateException(ProtectedSandApp.s("ῄ"));
            }
            long j5 = this.offset;
            return d(j5 == -1 ? 0L : j5 + (this.end - this.start));
        }

        public final long c(long newSize) {
            m mVar = this.buffer;
            if (mVar == null) {
                throw new IllegalStateException(ProtectedSandApp.s("῁"));
            }
            if (!this.readWrite) {
                throw new IllegalStateException(ProtectedSandApp.s("ῆ"));
            }
            long size = mVar.size();
            int i4 = 1;
            if (newSize <= size) {
                if (!(newSize >= 0)) {
                    throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("\u1fc5"), newSize).toString());
                }
                long j4 = size - newSize;
                while (true) {
                    if (j4 <= 0) {
                        break;
                    }
                    j0 j0Var = mVar.head;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j0 j0Var2 = j0Var.prev;
                    kotlin.jvm.internal.l0.m(j0Var2);
                    int i5 = j0Var2.limit;
                    long j5 = i5 - j0Var2.pos;
                    if (j5 > j4) {
                        j0Var2.limit = i5 - ((int) j4);
                        break;
                    }
                    mVar.head = j0Var2.b();
                    k0.d(j0Var2);
                    j4 -= j5;
                }
                this.segment = null;
                this.offset = newSize;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (newSize > size) {
                long j6 = newSize - size;
                boolean z4 = true;
                while (j6 > 0) {
                    j0 B0 = mVar.B0(i4);
                    int min = (int) Math.min(j6, 8192 - B0.limit);
                    int i6 = B0.limit + min;
                    B0.limit = i6;
                    j6 -= min;
                    if (z4) {
                        this.segment = B0;
                        this.offset = size;
                        this.data = B0.data;
                        this.start = i6 - min;
                        this.end = i6;
                        z4 = false;
                    }
                    i4 = 1;
                }
            }
            mVar.Y(newSize);
            return size;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.buffer != null)) {
                throw new IllegalStateException(ProtectedSandApp.s("῁"));
            }
            this.buffer = null;
            this.segment = null;
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final int d(long offset) {
            j0 j0Var;
            m mVar = this.buffer;
            if (mVar == null) {
                throw new IllegalStateException(ProtectedSandApp.s("῁"));
            }
            if (offset < -1 || offset > mVar.size()) {
                t1 t1Var = t1.f75371a;
                throw new ArrayIndexOutOfBoundsException(s3.a(new Object[]{Long.valueOf(offset), Long.valueOf(mVar.size())}, 2, ProtectedSandApp.s("ῇ"), ProtectedSandApp.s("Ὲ")));
            }
            if (offset == -1 || offset == mVar.size()) {
                this.segment = null;
                this.offset = offset;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = mVar.size();
            j0 j0Var2 = mVar.head;
            j0 j0Var3 = this.segment;
            long j4 = 0;
            if (j0Var3 != null) {
                long j5 = this.offset;
                int i4 = this.start;
                kotlin.jvm.internal.l0.m(j0Var3);
                long j6 = j5 - (i4 - j0Var3.pos);
                if (j6 > offset) {
                    j0Var = j0Var2;
                    j0Var2 = this.segment;
                    size = j6;
                } else {
                    j0Var = this.segment;
                    j4 = j6;
                }
            } else {
                j0Var = j0Var2;
            }
            if (size - offset > offset - j4) {
                while (true) {
                    kotlin.jvm.internal.l0.m(j0Var);
                    int i5 = j0Var.limit;
                    int i6 = j0Var.pos;
                    if (offset < (i5 - i6) + j4) {
                        break;
                    }
                    j4 += i5 - i6;
                    j0Var = j0Var.next;
                }
            } else {
                while (size > offset) {
                    kotlin.jvm.internal.l0.m(j0Var2);
                    j0Var2 = j0Var2.prev;
                    kotlin.jvm.internal.l0.m(j0Var2);
                    size -= j0Var2.limit - j0Var2.pos;
                }
                j4 = size;
                j0Var = j0Var2;
            }
            if (this.readWrite) {
                kotlin.jvm.internal.l0.m(j0Var);
                if (j0Var.shared) {
                    j0 f4 = j0Var.f();
                    if (mVar.head == j0Var) {
                        mVar.head = f4;
                    }
                    j0Var = j0Var.c(f4);
                    j0 j0Var4 = j0Var.prev;
                    kotlin.jvm.internal.l0.m(j0Var4);
                    j0Var4.b();
                }
            }
            this.segment = j0Var;
            this.offset = offset;
            kotlin.jvm.internal.l0.m(j0Var);
            this.data = j0Var.data;
            int i7 = j0Var.pos + ((int) (offset - j4));
            this.start = i7;
            int i10 = j0Var.limit;
            this.end = i10;
            return i10 - i7;
        }
    }

    /* compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"okio/m$c", "Ljava/io/OutputStream;", "", "b", "Lkotlin/k2;", "write", "(I)V", "", "data", "offset", "byteCount", "([BII)V", "flush", "()V", "close", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class c extends OutputStream {
        c() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        @fg.l
        public String toString() {
            return m.this + ProtectedSandApp.s("Ή");
        }

        @Override // java.io.OutputStream
        public void write(int b5) {
            m.this.writeByte(b5);
        }

        @Override // java.io.OutputStream
        public void write(@fg.l byte[] data, int offset, int byteCount) {
            kotlin.jvm.internal.l0.p(data, ProtectedSandApp.s("ῌ"));
            m.this.write(data, offset, byteCount);
        }
    }

    private final p B(String algorithm, p key) {
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.getData(), algorithm));
            j0 j0Var = this.head;
            if (j0Var != null) {
                byte[] bArr = j0Var.data;
                int i4 = j0Var.pos;
                mac.update(bArr, i4, j0Var.limit - i4);
                j0 j0Var2 = j0Var.next;
                kotlin.jvm.internal.l0.m(j0Var2);
                while (j0Var2 != j0Var) {
                    byte[] bArr2 = j0Var2.data;
                    int i5 = j0Var2.pos;
                    mac.update(bArr2, i5, j0Var2.limit - i5);
                    j0Var2 = j0Var2.next;
                    kotlin.jvm.internal.l0.m(j0Var2);
                }
            }
            byte[] doFinal = mac.doFinal();
            kotlin.jvm.internal.l0.o(doFinal, ProtectedSandApp.s("῍"));
            return new p(doFinal);
        } catch (InvalidKeyException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static /* synthetic */ a I(m mVar, a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = new a();
        }
        return mVar.H(aVar);
    }

    private final void M(InputStream input, long byteCount, boolean forever) throws IOException {
        while (true) {
            if (byteCount <= 0 && !forever) {
                return;
            }
            j0 B0 = B0(1);
            int read = input.read(B0.data, B0.limit, (int) Math.min(byteCount, 8192 - B0.limit));
            if (read == -1) {
                if (B0.pos == B0.limit) {
                    this.head = B0.b();
                    k0.d(B0);
                }
                if (!forever) {
                    throw new EOFException();
                }
                return;
            }
            B0.limit += read;
            long j4 = read;
            this.size += j4;
            byteCount -= j4;
        }
    }

    public static /* synthetic */ a S(m mVar, a aVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aVar = new a();
        }
        return mVar.O(aVar);
    }

    public static /* synthetic */ m T1(m mVar, OutputStream outputStream, long j4, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            j4 = mVar.size;
        }
        return mVar.S1(outputStream, j4);
    }

    public static /* synthetic */ m o(m mVar, OutputStream outputStream, long j4, long j5, int i4, Object obj) throws IOException {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        long j6 = j4;
        if ((i4 & 4) != 0) {
            j5 = mVar.size - j6;
        }
        return mVar.l(outputStream, j6, j5);
    }

    public static /* synthetic */ m q(m mVar, m mVar2, long j4, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        return mVar.m(mVar2, j4);
    }

    public static /* synthetic */ m s(m mVar, m mVar2, long j4, long j5, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j4 = 0;
        }
        return mVar.n(mVar2, j4, j5);
    }

    private final p t(String algorithm) {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        j0 j0Var = this.head;
        if (j0Var != null) {
            byte[] bArr = j0Var.data;
            int i4 = j0Var.pos;
            messageDigest.update(bArr, i4, j0Var.limit - i4);
            j0 j0Var2 = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var2);
            while (j0Var2 != j0Var) {
                byte[] bArr2 = j0Var2.data;
                int i5 = j0Var2.pos;
                messageDigest.update(bArr2, i5, j0Var2.limit - i5);
                j0Var2 = j0Var2.next;
                kotlin.jvm.internal.l0.m(j0Var2);
            }
        }
        byte[] digest = messageDigest.digest();
        kotlin.jvm.internal.l0.o(digest, ProtectedSandApp.s("῎"));
        return new p(digest);
    }

    @fg.l
    public final p A0(int byteCount) {
        if (byteCount == 0) {
            return p.f85244f;
        }
        j.e(this.size, 0L, byteCount);
        j0 j0Var = this.head;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i5 < byteCount) {
            kotlin.jvm.internal.l0.m(j0Var);
            int i7 = j0Var.limit;
            int i10 = j0Var.pos;
            if (i7 == i10) {
                throw new AssertionError(ProtectedSandApp.s("῏"));
            }
            i5 += i7 - i10;
            i6++;
            j0Var = j0Var.next;
        }
        byte[][] bArr = new byte[i6][];
        int[] iArr = new int[i6 * 2];
        j0 j0Var2 = this.head;
        int i11 = 0;
        while (i4 < byteCount) {
            kotlin.jvm.internal.l0.m(j0Var2);
            bArr[i11] = j0Var2.data;
            i4 += j0Var2.limit - j0Var2.pos;
            iArr[i11] = Math.min(i4, byteCount);
            iArr[i11 + i6] = j0Var2.pos;
            j0Var2.shared = true;
            i11++;
            j0Var2 = j0Var2.next;
        }
        return new l0(bArr, iArr);
    }

    @fg.l
    public final j0 B0(int minimumCapacity) {
        if (!(minimumCapacity >= 1 && minimumCapacity <= 8192)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ῐ"));
        }
        j0 j0Var = this.head;
        if (j0Var != null) {
            kotlin.jvm.internal.l0.m(j0Var);
            j0 j0Var2 = j0Var.prev;
            kotlin.jvm.internal.l0.m(j0Var2);
            return (j0Var2.limit + minimumCapacity > 8192 || !j0Var2.owner) ? j0Var2.c(k0.e()) : j0Var2;
        }
        j0 e4 = k0.e();
        this.head = e4;
        e4.prev = e4;
        e4.next = e4;
        return e4;
    }

    @fg.l
    public final p C(@fg.l p key) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("ῑ"));
        return B(ProtectedSandApp.s("ῒ"), key);
    }

    @Override // okio.n
    @fg.l
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public m t3(@fg.l p byteString) {
        kotlin.jvm.internal.l0.p(byteString, ProtectedSandApp.s("ΐ"));
        byteString.r0(this, 0, byteString.q());
        return this;
    }

    @fg.l
    public final p D(@fg.l p key) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("ῑ"));
        return B(ProtectedSandApp.s("\u1fd4"), key);
    }

    @Override // okio.o
    @fg.l
    public String D0(long limit) throws EOFException {
        if (!(limit >= 0)) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("ῗ"), limit).toString());
        }
        long j4 = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        byte b5 = (byte) 10;
        long v02 = v0(b5, 0L, j4);
        if (v02 != -1) {
            return ve.a.b0(this, v02);
        }
        if (j4 < this.size && z(j4 - 1) == ((byte) 13) && z(j4) == b5) {
            return ve.a.b0(this, j4);
        }
        m mVar = new m();
        n(mVar, 0L, Math.min(32, this.size));
        throw new EOFException(ProtectedSandApp.s("\u1fd5") + Math.min(this.size, limit) + ProtectedSandApp.s("ῖ") + mVar.b2(mVar.size).s() + kotlin.text.m0.ellipsis);
    }

    @fg.l
    public final p E(@fg.l p key) {
        kotlin.jvm.internal.l0.p(key, ProtectedSandApp.s("ῑ"));
        return B(ProtectedSandApp.s("Ῐ"), key);
    }

    @fg.l
    public final p F() {
        return t(ProtectedSandApp.s("Ῑ"));
    }

    @fg.l
    @kd.j
    public final a G() {
        return I(this, null, 1, null);
    }

    @Override // okio.n
    @fg.l
    public OutputStream G3() {
        return new c();
    }

    @fg.l
    @kd.j
    public final a H(@fg.l a unsafeCursor) {
        kotlin.jvm.internal.l0.p(unsafeCursor, ProtectedSandApp.s("Ὶ"));
        if (!(unsafeCursor.buffer == null)) {
            throw new IllegalStateException(ProtectedSandApp.s("Ί"));
        }
        unsafeCursor.buffer = this;
        unsafeCursor.readWrite = true;
        return unsafeCursor;
    }

    @Override // okio.n
    @fg.l
    /* renamed from: H0, reason: merged with bridge method [inline-methods] */
    public m h2(@fg.l p byteString, int offset, int byteCount) {
        kotlin.jvm.internal.l0.p(byteString, ProtectedSandApp.s("ΐ"));
        byteString.r0(this, offset, byteCount);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ae A[EDGE_INSN: B:39:0x00ae->B:36:0x00ae BREAK  A[LOOP:0: B:4:0x000b->B:38:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    @Override // okio.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long H3() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb5
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            okio.j0 r6 = r14.head
            kotlin.jvm.internal.l0.m(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L16:
            if (r8 >= r9) goto L9a
            r10 = r7[r8]
            r11 = 48
            byte r11 = (byte) r11
            if (r10 < r11) goto L27
            r12 = 57
            byte r12 = (byte) r12
            if (r10 > r12) goto L27
            int r11 = r10 - r11
            goto L41
        L27:
            r11 = 97
            byte r11 = (byte) r11
            if (r10 < r11) goto L36
            r12 = 102(0x66, float:1.43E-43)
            byte r12 = (byte) r12
            if (r10 > r12) goto L36
        L31:
            int r11 = r10 - r11
            int r11 = r11 + 10
            goto L41
        L36:
            r11 = 65
            byte r11 = (byte) r11
            if (r10 < r11) goto L7a
            r12 = 70
            byte r12 = (byte) r12
            if (r10 > r12) goto L7a
            goto L31
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L51
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L51:
            okio.m r0 = new okio.m
            r0.<init>()
            okio.m r0 = r0.a3(r4)
            okio.m r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "\u1fdc"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            r2.<init>(r3)
            java.lang.String r0 = r0.n3()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L7a:
            if (r0 == 0) goto L7e
            r1 = 1
            goto L9a
        L7e:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "῝"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r1.<init>(r2)
            java.lang.String r2 = okio.j.m(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9a:
            if (r8 != r9) goto La6
            okio.j0 r7 = r6.b()
            r14.head = r7
            okio.k0.d(r6)
            goto La8
        La6:
            r6.pos = r8
        La8:
            if (r1 != 0) goto Lae
            okio.j0 r6 = r14.head
            if (r6 != 0) goto Lb
        Lae:
            long r1 = r14.size
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.size = r1
            return r4
        Lb5:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.m.H3():long");
    }

    @Override // okio.o
    public long I1(@fg.l p targetBytes, long fromIndex) {
        int i4;
        int i5;
        int i6;
        int i7;
        kotlin.jvm.internal.l0.p(targetBytes, ProtectedSandApp.s("῞"));
        long j4 = 0;
        if (!(fromIndex >= 0)) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("῟"), fromIndex).toString());
        }
        j0 j0Var = this.head;
        if (j0Var == null) {
            return -1L;
        }
        long j5 = this.size;
        if (j5 - fromIndex < fromIndex) {
            while (j5 > fromIndex) {
                j0Var = j0Var.prev;
                kotlin.jvm.internal.l0.m(j0Var);
                j5 -= j0Var.limit - j0Var.pos;
            }
            if (targetBytes.q() == 2) {
                byte G = targetBytes.G(0);
                byte G2 = targetBytes.G(1);
                while (j5 < this.size) {
                    byte[] bArr = j0Var.data;
                    i6 = (int) ((j0Var.pos + fromIndex) - j5);
                    int i10 = j0Var.limit;
                    while (i6 < i10) {
                        byte b5 = bArr[i6];
                        if (b5 == G || b5 == G2) {
                            i7 = j0Var.pos;
                        } else {
                            i6++;
                        }
                    }
                    j5 += j0Var.limit - j0Var.pos;
                    j0Var = j0Var.next;
                    kotlin.jvm.internal.l0.m(j0Var);
                    fromIndex = j5;
                }
                return -1L;
            }
            byte[] data = targetBytes.getData();
            while (j5 < this.size) {
                byte[] bArr2 = j0Var.data;
                i6 = (int) ((j0Var.pos + fromIndex) - j5);
                int i11 = j0Var.limit;
                while (i6 < i11) {
                    byte b6 = bArr2[i6];
                    for (byte b7 : data) {
                        if (b6 == b7) {
                            i7 = j0Var.pos;
                        }
                    }
                    i6++;
                }
                j5 += j0Var.limit - j0Var.pos;
                j0Var = j0Var.next;
                kotlin.jvm.internal.l0.m(j0Var);
                fromIndex = j5;
            }
            return -1L;
            return (i6 - i7) + j5;
        }
        while (true) {
            long j6 = (j0Var.limit - j0Var.pos) + j4;
            if (j6 > fromIndex) {
                break;
            }
            j0Var = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var);
            j4 = j6;
        }
        if (targetBytes.q() == 2) {
            byte G3 = targetBytes.G(0);
            byte G4 = targetBytes.G(1);
            while (j4 < this.size) {
                byte[] bArr3 = j0Var.data;
                i4 = (int) ((j0Var.pos + fromIndex) - j4);
                int i12 = j0Var.limit;
                while (i4 < i12) {
                    byte b10 = bArr3[i4];
                    if (b10 == G3 || b10 == G4) {
                        i5 = j0Var.pos;
                    } else {
                        i4++;
                    }
                }
                j4 += j0Var.limit - j0Var.pos;
                j0Var = j0Var.next;
                kotlin.jvm.internal.l0.m(j0Var);
                fromIndex = j4;
            }
            return -1L;
        }
        byte[] data2 = targetBytes.getData();
        while (j4 < this.size) {
            byte[] bArr4 = j0Var.data;
            i4 = (int) ((j0Var.pos + fromIndex) - j4);
            int i13 = j0Var.limit;
            while (i4 < i13) {
                byte b11 = bArr4[i4];
                for (byte b12 : data2) {
                    if (b11 == b12) {
                        i5 = j0Var.pos;
                    }
                }
                i4++;
            }
            j4 += j0Var.limit - j0Var.pos;
            j0Var = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var);
            fromIndex = j4;
        }
        return -1L;
        return (i4 - i5) + j4;
    }

    @fg.l
    public final m J(@fg.l InputStream input) throws IOException {
        kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("ῠ"));
        M(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // okio.o
    public void J1(long byteCount) throws EOFException {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }

    @Override // okio.o
    @fg.l
    public InputStream J3() {
        return new b();
    }

    @fg.l
    public final m K(@fg.l InputStream input, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(input, ProtectedSandApp.s("ῠ"));
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("ῡ"), byteCount).toString());
        }
        M(input, byteCount, false);
        return this;
    }

    @Override // okio.n
    @fg.l
    /* renamed from: K1, reason: merged with bridge method [inline-methods] */
    public m G1(@fg.l String string, int beginIndex, int endIndex, @fg.l Charset charset) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("ῢ"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("ΰ"));
        if (!(beginIndex >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("Ύ"), beginIndex).toString());
        }
        if (!(endIndex >= beginIndex)) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("Ῡ"), endIndex, ProtectedSandApp.s("Ὺ"), beginIndex).toString());
        }
        if (!(endIndex <= string.length())) {
            StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("ῧ"), endIndex, ProtectedSandApp.s("Ῠ"));
            a5.append(string.length());
            throw new IllegalArgumentException(a5.toString().toString());
        }
        if (kotlin.jvm.internal.l0.g(charset, kotlin.text.f.UTF_8)) {
            return a1(string, beginIndex, endIndex);
        }
        String substring = string.substring(beginIndex, endIndex);
        kotlin.jvm.internal.l0.o(substring, ProtectedSandApp.s("ῤ"));
        if (substring == null) {
            throw new NullPointerException(ProtectedSandApp.s("ῦ"));
        }
        byte[] bytes = substring.getBytes(charset);
        kotlin.jvm.internal.l0.o(bytes, ProtectedSandApp.s("ῥ"));
        return write(bytes, 0, bytes.length);
    }

    @Override // okio.o
    public int K3(@fg.l d0 options) {
        kotlin.jvm.internal.l0.p(options, ProtectedSandApp.s("Ῥ"));
        int e02 = ve.a.e0(this, options, false, 2, null);
        if (e02 == -1) {
            return -1;
        }
        skip(options.getByteStrings()[e02].q());
        return e02;
    }

    @Override // okio.n
    @fg.l
    /* renamed from: L1, reason: merged with bridge method [inline-methods] */
    public m c3(@fg.l String string, @fg.l Charset charset) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("ῢ"));
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("ΰ"));
        return G1(string, 0, string.length(), charset);
    }

    @Override // okio.n
    @fg.l
    /* renamed from: M0, reason: merged with bridge method [inline-methods] */
    public m f3(@fg.l o0 source, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("῭"));
        while (byteCount > 0) {
            long w32 = source.w3(this, byteCount);
            if (w32 == -1) {
                throw new EOFException();
            }
            byteCount -= w32;
        }
        return this;
    }

    @fg.l
    @kd.j
    public final m M1(@fg.l OutputStream outputStream) throws IOException {
        return T1(this, outputStream, 0L, 2, null);
    }

    @fg.l
    @kd.j
    public final a N() {
        return S(this, null, 1, null);
    }

    @Override // okio.n
    @fg.l
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public m write(@fg.l byte[] source) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("῭"));
        return write(source, 0, source.length);
    }

    @fg.l
    @kd.j
    public final a O(@fg.l a unsafeCursor) {
        kotlin.jvm.internal.l0.p(unsafeCursor, ProtectedSandApp.s("Ὶ"));
        if (!(unsafeCursor.buffer == null)) {
            throw new IllegalStateException(ProtectedSandApp.s("Ί"));
        }
        unsafeCursor.buffer = this;
        unsafeCursor.readWrite = false;
        return unsafeCursor;
    }

    @Override // okio.o
    public long Q1(byte b5) {
        return v0(b5, 0L, Long.MAX_VALUE);
    }

    @Override // okio.n
    @fg.l
    /* renamed from: S0, reason: merged with bridge method [inline-methods] */
    public m write(@fg.l byte[] source, int offset, int byteCount) {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("῭"));
        long j4 = byteCount;
        j.e(source.length, offset, j4);
        int i4 = byteCount + offset;
        while (offset < i4) {
            j0 B0 = B0(1);
            int min = Math.min(i4 - offset, 8192 - B0.limit);
            int i5 = offset + min;
            kotlin.collections.l.v0(source, B0.data, B0.limit, offset, i5);
            B0.limit += min;
            offset = i5;
        }
        this.size += j4;
        return this;
    }

    @fg.l
    @kd.j
    public final m S1(@fg.l OutputStream out, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(out, ProtectedSandApp.s("΅"));
        j.e(this.size, 0L, byteCount);
        j0 j0Var = this.head;
        while (byteCount > 0) {
            kotlin.jvm.internal.l0.m(j0Var);
            int min = (int) Math.min(byteCount, j0Var.limit - j0Var.pos);
            out.write(j0Var.data, j0Var.pos, min);
            int i4 = j0Var.pos + min;
            j0Var.pos = i4;
            long j4 = min;
            this.size -= j4;
            byteCount -= j4;
            if (i4 == j0Var.limit) {
                j0 b5 = j0Var.b();
                this.head = b5;
                k0.d(j0Var);
                j0Var = b5;
            }
        }
        return this;
    }

    @Override // okio.o
    public boolean T0(long offset, @fg.l p bytes) {
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("`"));
        return o1(offset, bytes, 0, bytes.q());
    }

    @Override // okio.n
    @fg.l
    /* renamed from: U0, reason: merged with bridge method [inline-methods] */
    public m writeByte(int b5) {
        j0 B0 = B0(1);
        byte[] bArr = B0.data;
        int i4 = B0.limit;
        B0.limit = i4 + 1;
        bArr[i4] = (byte) b5;
        this.size++;
        return this;
    }

    @Override // okio.o
    public long V(@fg.l p bytes, long fromIndex) throws IOException {
        long j4 = fromIndex;
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("`"));
        if (!(bytes.q() > 0)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u1ff0"));
        }
        long j5 = 0;
        if (!(j4 >= 0)) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("῟"), j4).toString());
        }
        j0 j0Var = this.head;
        if (j0Var != null) {
            long j6 = this.size;
            if (j6 - j4 < j4) {
                while (j6 > j4) {
                    j0Var = j0Var.prev;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j6 -= j0Var.limit - j0Var.pos;
                }
                byte[] data = bytes.getData();
                byte b5 = data[0];
                int q4 = bytes.q();
                long j7 = (this.size - q4) + 1;
                while (j6 < j7) {
                    byte[] bArr = j0Var.data;
                    long j10 = j7;
                    int min = (int) Math.min(j0Var.limit, (j0Var.pos + j7) - j6);
                    for (int i4 = (int) ((j0Var.pos + j4) - j6); i4 < min; i4++) {
                        if (bArr[i4] == b5 && ve.a.a0(j0Var, i4 + 1, data, 1, q4)) {
                            return (i4 - j0Var.pos) + j6;
                        }
                    }
                    j6 += j0Var.limit - j0Var.pos;
                    j0Var = j0Var.next;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j4 = j6;
                    j7 = j10;
                }
            } else {
                while (true) {
                    long j11 = (j0Var.limit - j0Var.pos) + j5;
                    if (j11 > j4) {
                        break;
                    }
                    j0Var = j0Var.next;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j5 = j11;
                }
                byte[] data2 = bytes.getData();
                byte b6 = data2[0];
                int q5 = bytes.q();
                long j12 = (this.size - q5) + 1;
                while (j5 < j12) {
                    byte[] bArr2 = j0Var.data;
                    long j13 = j12;
                    int min2 = (int) Math.min(j0Var.limit, (j0Var.pos + j12) - j5);
                    for (int i5 = (int) ((j0Var.pos + j4) - j5); i5 < min2; i5++) {
                        if (bArr2[i5] == b6 && ve.a.a0(j0Var, i5 + 1, data2, 1, q5)) {
                            return (i5 - j0Var.pos) + j5;
                        }
                    }
                    j5 += j0Var.limit - j0Var.pos;
                    j0Var = j0Var.next;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j4 = j5;
                    j12 = j13;
                }
            }
        }
        return -1L;
    }

    @Override // okio.o
    @fg.l
    public String V1(long byteCount) throws EOFException {
        return q3(byteCount, kotlin.text.f.UTF_8);
    }

    @Override // okio.n
    @fg.l
    /* renamed from: W1, reason: merged with bridge method [inline-methods] */
    public m Q0(@fg.l String string) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("ῢ"));
        return a1(string, 0, string.length());
    }

    @Override // okio.o
    @fg.l
    public String X2(@fg.l Charset charset) {
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("ΰ"));
        return q3(this.size, charset);
    }

    public final void Y(long j4) {
        this.size = j4;
    }

    @Override // okio.o
    public int Z2() throws EOFException {
        int i4;
        int i5;
        int i6;
        if (this.size == 0) {
            throw new EOFException();
        }
        byte z4 = z(0L);
        if ((z4 & 128) == 0) {
            i4 = z4 & Byte.MAX_VALUE;
            i6 = 0;
            i5 = 1;
        } else if ((z4 & 224) == 192) {
            i4 = z4 & com.google.common.base.c.I;
            i5 = 2;
            i6 = 128;
        } else if ((z4 & 240) == 224) {
            i4 = z4 & com.google.common.base.c.f54871q;
            i5 = 3;
            i6 = 2048;
        } else {
            if ((z4 & 248) != 240) {
                skip(1L);
                return r0.f85267c;
            }
            i4 = z4 & 7;
            i5 = 4;
            i6 = 65536;
        }
        long j4 = i5;
        if (this.size < j4) {
            StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("\u1ff1"), i5, ProtectedSandApp.s("ῲ"));
            a5.append(this.size);
            a5.append(ProtectedSandApp.s("ῳ"));
            a5.append(j.m(z4));
            a5.append(')');
            throw new EOFException(a5.toString());
        }
        for (int i7 = 1; i7 < i5; i7++) {
            long j5 = i7;
            byte z5 = z(j5);
            if ((z5 & 192) != 128) {
                skip(j5);
                return r0.f85267c;
            }
            i4 = (i4 << 6) | (z5 & r0.f85265a);
        }
        skip(j4);
        return i4 > 1114111 ? r0.f85267c : ((55296 <= i4 && 57343 >= i4) || i4 < i6) ? r0.f85267c : i4;
    }

    @Override // okio.n
    @fg.l
    /* renamed from: a2, reason: merged with bridge method [inline-methods] */
    public m a1(@fg.l String string, int beginIndex, int endIndex) {
        kotlin.jvm.internal.l0.p(string, ProtectedSandApp.s("ῢ"));
        if (!(beginIndex >= 0)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("Ύ"), beginIndex).toString());
        }
        if (!(endIndex >= beginIndex)) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("Ῡ"), endIndex, ProtectedSandApp.s("Ὺ"), beginIndex).toString());
        }
        if (!(endIndex <= string.length())) {
            StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("ῧ"), endIndex, ProtectedSandApp.s("Ῠ"));
            a5.append(string.length());
            throw new IllegalArgumentException(a5.toString().toString());
        }
        while (beginIndex < endIndex) {
            char charAt = string.charAt(beginIndex);
            if (charAt < 128) {
                j0 B0 = B0(1);
                byte[] bArr = B0.data;
                int i4 = B0.limit - beginIndex;
                int min = Math.min(endIndex, 8192 - i4);
                int i5 = beginIndex + 1;
                bArr[beginIndex + i4] = (byte) charAt;
                while (i5 < min) {
                    char charAt2 = string.charAt(i5);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i5 + i4] = (byte) charAt2;
                    i5++;
                }
                int i6 = B0.limit;
                int i7 = (i4 + i5) - i6;
                B0.limit = i6 + i7;
                this.size += i7;
                beginIndex = i5;
            } else {
                if (charAt < 2048) {
                    j0 B02 = B0(2);
                    byte[] bArr2 = B02.data;
                    int i10 = B02.limit;
                    bArr2[i10] = (byte) ((charAt >> 6) | 192);
                    bArr2[i10 + 1] = (byte) ((charAt & '?') | 128);
                    B02.limit = i10 + 2;
                    this.size += 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    j0 B03 = B0(3);
                    byte[] bArr3 = B03.data;
                    int i11 = B03.limit;
                    bArr3[i11] = (byte) ((charAt >> '\f') | 224);
                    bArr3[i11 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                    bArr3[i11 + 2] = (byte) ((charAt & '?') | 128);
                    B03.limit = i11 + 3;
                    this.size += 3;
                } else {
                    int i12 = beginIndex + 1;
                    char charAt3 = i12 < endIndex ? string.charAt(i12) : (char) 0;
                    if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                        writeByte(63);
                        beginIndex = i12;
                    } else {
                        int i13 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        j0 B04 = B0(4);
                        byte[] bArr4 = B04.data;
                        int i14 = B04.limit;
                        bArr4[i14] = (byte) ((i13 >> 18) | 240);
                        bArr4[i14 + 1] = (byte) (((i13 >> 12) & 63) | 128);
                        bArr4[i14 + 2] = (byte) (((i13 >> 6) & 63) | 128);
                        bArr4[i14 + 3] = (byte) ((i13 & 63) | 128);
                        B04.limit = i14 + 4;
                        this.size += 4;
                        beginIndex += 2;
                    }
                }
                beginIndex++;
            }
        }
        return this;
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to operator function", replaceWith = @x0(expression = "this[index]", imports = {}))
    @kd.i(name = "-deprecated_getByte")
    public final byte b(long index) {
        return z(index);
    }

    @Override // okio.n
    public long b1(@fg.l o0 source) throws IOException {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("῭"));
        long j4 = 0;
        while (true) {
            long w32 = source.w3(this, 8192);
            if (w32 == -1) {
                return j4;
            }
            j4 += w32;
        }
    }

    @Override // okio.o
    @fg.l
    public p b2(long byteCount) throws EOFException {
        if (!(byteCount >= 0 && byteCount <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("ῴ"), byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount < 4096) {
            return new p(q1(byteCount));
        }
        p A0 = A0((int) byteCount);
        skip(byteCount);
        return A0;
    }

    @Override // okio.o
    @fg.l
    public p b3() {
        return b2(this.size);
    }

    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @x0(expression = "size", imports = {}))
    @kd.i(name = "-deprecated_size")
    /* renamed from: c, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    @fg.l
    public final p c0() {
        return t(ProtectedSandApp.s("\u1ff5"));
    }

    @Override // okio.n
    @fg.l
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public m N1(long v4) {
        boolean z4;
        if (v4 == 0) {
            return writeByte(48);
        }
        int i4 = 1;
        if (v4 < 0) {
            v4 = -v4;
            if (v4 < 0) {
                return Q0(ProtectedSandApp.s("ῶ"));
            }
            z4 = true;
        } else {
            z4 = false;
        }
        if (v4 >= 100000000) {
            i4 = v4 < 1000000000000L ? v4 < okhttp3.internal.connection.f.f84407v ? v4 < 1000000000 ? 9 : 10 : v4 < 100000000000L ? 11 : 12 : v4 < 1000000000000000L ? v4 < 10000000000000L ? 13 : v4 < 100000000000000L ? 14 : 15 : v4 < 100000000000000000L ? v4 < 10000000000000000L ? 16 : 17 : v4 < 1000000000000000000L ? 18 : 19;
        } else if (v4 >= androidx.work.i0.f35991f) {
            i4 = v4 < 1000000 ? v4 < 100000 ? 5 : 6 : v4 < 10000000 ? 7 : 8;
        } else if (v4 >= 100) {
            i4 = v4 < 1000 ? 3 : 4;
        } else if (v4 >= 10) {
            i4 = 2;
        }
        if (z4) {
            i4++;
        }
        j0 B0 = B0(i4);
        byte[] bArr = B0.data;
        int i5 = B0.limit + i4;
        while (v4 != 0) {
            long j4 = 10;
            i5--;
            bArr[i5] = ve.a.Z()[(int) (v4 % j4)];
            v4 /= j4;
        }
        if (z4) {
            bArr[i5 - 1] = (byte) 45;
        }
        B0.limit += i4;
        this.size += i4;
        return this;
    }

    public Object clone() {
        return g();
    }

    @Override // okio.o0, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void d() {
        skip(this.size);
    }

    @Override // okio.n
    public n d0() {
        return this;
    }

    @Override // okio.n
    @fg.l
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public m a3(long v4) {
        if (v4 == 0) {
            return writeByte(48);
        }
        long j4 = (v4 >>> 1) | v4;
        long j5 = j4 | (j4 >>> 2);
        long j6 = j5 | (j5 >>> 4);
        long j7 = j6 | (j6 >>> 8);
        long j10 = j7 | (j7 >>> 16);
        long j11 = j10 | (j10 >>> 32);
        long j12 = j11 - ((j11 >>> 1) & 6148914691236517205L);
        long j13 = ((j12 >>> 2) & 3689348814741910323L) + (j12 & 3689348814741910323L);
        long j14 = ((j13 >>> 4) + j13) & 1085102592571150095L;
        long j15 = j14 + (j14 >>> 8);
        long j16 = j15 + (j15 >>> 16);
        int i4 = (int) ((((j16 & 63) + ((j16 >>> 32) & 63)) + 3) / 4);
        j0 B0 = B0(i4);
        byte[] bArr = B0.data;
        int i5 = B0.limit;
        for (int i6 = (i5 + i4) - 1; i6 >= i5; i6--) {
            bArr[i6] = ve.a.Z()[(int) (15 & v4)];
            v4 >>>= 4;
        }
        B0.limit += i4;
        this.size += i4;
        return this;
    }

    @Override // okio.n
    @fg.l
    /* renamed from: d2, reason: merged with bridge method [inline-methods] */
    public m f0(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
        } else if (codePoint < 2048) {
            j0 B0 = B0(2);
            byte[] bArr = B0.data;
            int i4 = B0.limit;
            bArr[i4] = (byte) ((codePoint >> 6) | 192);
            bArr[i4 + 1] = (byte) ((codePoint & 63) | 128);
            B0.limit = i4 + 2;
            this.size += 2;
        } else if (55296 <= codePoint && 57343 >= codePoint) {
            writeByte(63);
        } else if (codePoint < 65536) {
            j0 B02 = B0(3);
            byte[] bArr2 = B02.data;
            int i5 = B02.limit;
            bArr2[i5] = (byte) ((codePoint >> 12) | 224);
            bArr2[i5 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i5 + 2] = (byte) ((codePoint & 63) | 128);
            B02.limit = i5 + 3;
            this.size += 3;
        } else {
            if (codePoint > 1114111) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ῷ") + j.n(codePoint));
            }
            j0 B03 = B0(4);
            byte[] bArr3 = B03.data;
            int i6 = B03.limit;
            bArr3[i6] = (byte) ((codePoint >> 18) | 240);
            bArr3[i6 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
            bArr3[i6 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr3[i6 + 3] = (byte) ((codePoint & 63) | 128);
            B03.limit = i6 + 4;
            this.size += 4;
        }
        return this;
    }

    @fg.l
    public m e() {
        return g();
    }

    @Override // okio.n
    @fg.l
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public m writeInt(int i4) {
        j0 B0 = B0(4);
        byte[] bArr = B0.data;
        int i5 = B0.limit;
        bArr[i5] = (byte) ((i4 >>> 24) & 255);
        bArr[i5 + 1] = (byte) ((i4 >>> 16) & 255);
        bArr[i5 + 2] = (byte) ((i4 >>> 8) & 255);
        bArr[i5 + 3] = (byte) (i4 & 255);
        B0.limit = i5 + 4;
        this.size += 4;
        return this;
    }

    public boolean equals(@fg.m Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof m) {
            long j4 = this.size;
            m mVar = (m) other;
            if (j4 == mVar.size) {
                if (j4 == 0) {
                    return true;
                }
                j0 j0Var = this.head;
                kotlin.jvm.internal.l0.m(j0Var);
                j0 j0Var2 = mVar.head;
                kotlin.jvm.internal.l0.m(j0Var2);
                int i4 = j0Var.pos;
                int i5 = j0Var2.pos;
                long j5 = 0;
                while (j5 < this.size) {
                    long min = Math.min(j0Var.limit - i4, j0Var2.limit - i5);
                    long j6 = 0;
                    while (j6 < min) {
                        int i6 = i4 + 1;
                        int i7 = i5 + 1;
                        if (j0Var.data[i4] == j0Var2.data[i5]) {
                            j6++;
                            i4 = i6;
                            i5 = i7;
                        }
                    }
                    if (i4 == j0Var.limit) {
                        j0Var = j0Var.next;
                        kotlin.jvm.internal.l0.m(j0Var);
                        i4 = j0Var.pos;
                    }
                    if (i5 == j0Var2.limit) {
                        j0Var2 = j0Var2.next;
                        kotlin.jvm.internal.l0.m(j0Var2);
                        i5 = j0Var2.pos;
                    }
                    j5 += min;
                }
                return true;
            }
        }
        return false;
    }

    public final long f() {
        long j4 = this.size;
        if (j4 == 0) {
            return 0L;
        }
        j0 j0Var = this.head;
        kotlin.jvm.internal.l0.m(j0Var);
        j0 j0Var2 = j0Var.prev;
        kotlin.jvm.internal.l0.m(j0Var2);
        if (j0Var2.limit < 8192 && j0Var2.owner) {
            j4 -= r3 - j0Var2.pos;
        }
        return j4;
    }

    @Override // okio.n, okio.m0, java.io.Flushable
    public void flush() {
    }

    @fg.l
    public final m g() {
        m mVar = new m();
        if (this.size != 0) {
            j0 j0Var = this.head;
            kotlin.jvm.internal.l0.m(j0Var);
            j0 d5 = j0Var.d();
            mVar.head = d5;
            d5.prev = d5;
            d5.next = d5;
            for (j0 j0Var2 = j0Var.next; j0Var2 != j0Var; j0Var2 = j0Var2.next) {
                j0 j0Var3 = d5.prev;
                kotlin.jvm.internal.l0.m(j0Var3);
                kotlin.jvm.internal.l0.m(j0Var2);
                j0Var3.c(j0Var2.d());
            }
            mVar.size = this.size;
        }
        return mVar;
    }

    @Override // okio.n
    @fg.l
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public m s2(int i4) {
        return writeInt(j.h(i4));
    }

    @Override // okio.o
    @fg.l
    /* renamed from: getBuffer */
    public m getBufferField() {
        return this;
    }

    @Override // okio.o
    public boolean h1(long byteCount) {
        return this.size >= byteCount;
    }

    public int hashCode() {
        j0 j0Var = this.head;
        if (j0Var == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i5 = j0Var.limit;
            for (int i6 = j0Var.pos; i6 < i5; i6++) {
                i4 = (i4 * 31) + j0Var.data[i6];
            }
            j0Var = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var);
        } while (j0Var != this.head);
        return i4;
    }

    @fg.l
    @kd.j
    public final m i(@fg.l OutputStream outputStream) throws IOException {
        return o(this, outputStream, 0L, 0L, 6, null);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // okio.n
    @fg.l
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public m writeLong(long v4) {
        j0 B0 = B0(8);
        byte[] bArr = B0.data;
        int i4 = B0.limit;
        bArr[i4] = (byte) ((v4 >>> 56) & 255);
        bArr[i4 + 1] = (byte) ((v4 >>> 48) & 255);
        bArr[i4 + 2] = (byte) ((v4 >>> 40) & 255);
        bArr[i4 + 3] = (byte) ((v4 >>> 32) & 255);
        bArr[i4 + 4] = (byte) ((v4 >>> 24) & 255);
        bArr[i4 + 5] = (byte) ((v4 >>> 16) & 255);
        bArr[i4 + 6] = (byte) ((v4 >>> 8) & 255);
        bArr[i4 + 7] = (byte) (v4 & 255);
        B0.limit = i4 + 8;
        this.size += 8;
        return this;
    }

    @fg.l
    @kd.j
    public final m k(@fg.l OutputStream outputStream, long j4) throws IOException {
        return o(this, outputStream, j4, 0L, 4, null);
    }

    @Override // okio.n
    @fg.l
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public m i0(long v4) {
        return writeLong(j.i(v4));
    }

    @Override // okio.o
    public int k3() throws EOFException {
        return j.h(readInt());
    }

    @fg.l
    @kd.j
    public final m l(@fg.l OutputStream out, long offset, long byteCount) throws IOException {
        kotlin.jvm.internal.l0.p(out, ProtectedSandApp.s("΅"));
        j.e(this.size, offset, byteCount);
        if (byteCount == 0) {
            return this;
        }
        j0 j0Var = this.head;
        while (true) {
            kotlin.jvm.internal.l0.m(j0Var);
            int i4 = j0Var.limit;
            int i5 = j0Var.pos;
            if (offset < i4 - i5) {
                break;
            }
            offset -= i4 - i5;
            j0Var = j0Var.next;
        }
        while (byteCount > 0) {
            kotlin.jvm.internal.l0.m(j0Var);
            int min = (int) Math.min(j0Var.limit - r9, byteCount);
            out.write(j0Var.data, (int) (j0Var.pos + offset), min);
            byteCount -= min;
            j0Var = j0Var.next;
            offset = 0;
        }
        return this;
    }

    @fg.l
    public final m m(@fg.l m out, long offset) {
        kotlin.jvm.internal.l0.p(out, ProtectedSandApp.s("΅"));
        return n(out, offset, this.size - offset);
    }

    @Override // okio.o
    public long m0(@fg.l p bytes) throws IOException {
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("`"));
        return V(bytes, 0L);
    }

    @Override // okio.o
    @fg.l
    public String m1() throws EOFException {
        return D0(Long.MAX_VALUE);
    }

    @fg.l
    public final m n(@fg.l m out, long offset, long byteCount) {
        kotlin.jvm.internal.l0.p(out, ProtectedSandApp.s("΅"));
        j.e(this.size, offset, byteCount);
        if (byteCount != 0) {
            out.size += byteCount;
            j0 j0Var = this.head;
            while (true) {
                kotlin.jvm.internal.l0.m(j0Var);
                int i4 = j0Var.limit;
                int i5 = j0Var.pos;
                if (offset < i4 - i5) {
                    break;
                }
                offset -= i4 - i5;
                j0Var = j0Var.next;
            }
            while (byteCount > 0) {
                kotlin.jvm.internal.l0.m(j0Var);
                j0 d5 = j0Var.d();
                int i6 = d5.pos + ((int) offset);
                d5.pos = i6;
                d5.limit = Math.min(i6 + ((int) byteCount), d5.limit);
                j0 j0Var2 = out.head;
                if (j0Var2 == null) {
                    d5.prev = d5;
                    d5.next = d5;
                    out.head = d5;
                } else {
                    kotlin.jvm.internal.l0.m(j0Var2);
                    j0 j0Var3 = j0Var2.prev;
                    kotlin.jvm.internal.l0.m(j0Var3);
                    j0Var3.c(d5);
                }
                byteCount -= d5.limit - d5.pos;
                j0Var = j0Var.next;
                offset = 0;
            }
        }
        return this;
    }

    @Override // okio.o
    @fg.l
    public String n3() {
        return q3(this.size, kotlin.text.f.UTF_8);
    }

    @fg.l
    public final p o0() {
        return t(ProtectedSandApp.s("Ὸ"));
    }

    @Override // okio.o
    public boolean o1(long offset, @fg.l p bytes, int bytesOffset, int byteCount) {
        kotlin.jvm.internal.l0.p(bytes, ProtectedSandApp.s("`"));
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || this.size - offset < byteCount || bytes.q() - bytesOffset < byteCount) {
            return false;
        }
        for (int i4 = 0; i4 < byteCount; i4++) {
            if (z(i4 + offset) != bytes.G(bytesOffset + i4)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.o
    @fg.l
    public byte[] p2() {
        return q1(this.size);
    }

    @Override // okio.o
    @fg.l
    public o peek() {
        return c0.c(new f0(this));
    }

    @fg.l
    public final p q0() {
        return t(ProtectedSandApp.s("Ό"));
    }

    @Override // okio.o
    @fg.l
    public byte[] q1(long byteCount) throws EOFException {
        if (!(byteCount >= 0 && byteCount <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("ῴ"), byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.o
    @fg.l
    public String q3(long byteCount, @fg.l Charset charset) throws EOFException {
        kotlin.jvm.internal.l0.p(charset, ProtectedSandApp.s("ΰ"));
        if (!(byteCount >= 0 && byteCount <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("ῴ"), byteCount).toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        j0 j0Var = this.head;
        kotlin.jvm.internal.l0.m(j0Var);
        int i4 = j0Var.pos;
        if (i4 + byteCount > j0Var.limit) {
            return new String(q1(byteCount), charset);
        }
        int i5 = (int) byteCount;
        String str = new String(j0Var.data, i4, i5, charset);
        int i6 = j0Var.pos + i5;
        j0Var.pos = i6;
        this.size -= byteCount;
        if (i6 == j0Var.limit) {
            this.head = j0Var.b();
            k0.d(j0Var);
        }
        return str;
    }

    @Override // okio.o
    @fg.l
    public m r() {
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@fg.l ByteBuffer sink) throws IOException {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("Ὼ"));
        j0 j0Var = this.head;
        if (j0Var == null) {
            return -1;
        }
        int min = Math.min(sink.remaining(), j0Var.limit - j0Var.pos);
        sink.put(j0Var.data, j0Var.pos, min);
        int i4 = j0Var.pos + min;
        j0Var.pos = i4;
        this.size -= min;
        if (i4 == j0Var.limit) {
            this.head = j0Var.b();
            k0.d(j0Var);
        }
        return min;
    }

    @Override // okio.o
    public byte readByte() throws EOFException {
        if (this.size == 0) {
            throw new EOFException();
        }
        j0 j0Var = this.head;
        kotlin.jvm.internal.l0.m(j0Var);
        int i4 = j0Var.pos;
        int i5 = j0Var.limit;
        int i6 = i4 + 1;
        byte b5 = j0Var.data[i4];
        this.size--;
        if (i6 == i5) {
            this.head = j0Var.b();
            k0.d(j0Var);
        } else {
            j0Var.pos = i6;
        }
        return b5;
    }

    @Override // okio.o
    public void readFully(@fg.l byte[] sink) throws EOFException {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("Ὼ"));
        int i4 = 0;
        while (i4 < sink.length) {
            int read = read(sink, i4, sink.length - i4);
            if (read == -1) {
                throw new EOFException();
            }
            i4 += read;
        }
    }

    @Override // okio.o
    public int readInt() throws EOFException {
        if (this.size < 4) {
            throw new EOFException();
        }
        j0 j0Var = this.head;
        kotlin.jvm.internal.l0.m(j0Var);
        int i4 = j0Var.pos;
        int i5 = j0Var.limit;
        if (i5 - i4 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = j0Var.data;
        int i6 = i4 + 3;
        int i7 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 2] & 255) << 8);
        int i10 = i4 + 4;
        int i11 = (bArr[i6] & 255) | i7;
        this.size -= 4;
        if (i10 == i5) {
            this.head = j0Var.b();
            k0.d(j0Var);
        } else {
            j0Var.pos = i10;
        }
        return i11;
    }

    @Override // okio.o
    public long readLong() throws EOFException {
        if (this.size < 8) {
            throw new EOFException();
        }
        j0 j0Var = this.head;
        kotlin.jvm.internal.l0.m(j0Var);
        int i4 = j0Var.pos;
        int i5 = j0Var.limit;
        if (i5 - i4 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = j0Var.data;
        int i6 = i4 + 7;
        long j4 = ((bArr[i4] & 255) << 56) | ((bArr[i4 + 1] & 255) << 48) | ((bArr[i4 + 2] & 255) << 40) | ((bArr[i4 + 3] & 255) << 32) | ((bArr[i4 + 4] & 255) << 24) | ((bArr[i4 + 5] & 255) << 16) | ((bArr[i4 + 6] & 255) << 8);
        int i7 = i4 + 8;
        long j5 = j4 | (bArr[i6] & 255);
        this.size -= 8;
        if (i7 == i5) {
            this.head = j0Var.b();
            k0.d(j0Var);
        } else {
            j0Var.pos = i7;
        }
        return j5;
    }

    @Override // okio.o
    public short readShort() throws EOFException {
        if (this.size < 2) {
            throw new EOFException();
        }
        j0 j0Var = this.head;
        kotlin.jvm.internal.l0.m(j0Var);
        int i4 = j0Var.pos;
        int i5 = j0Var.limit;
        if (i5 - i4 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = j0Var.data;
        int i6 = i4 + 1;
        int i7 = (bArr[i4] & 255) << 8;
        int i10 = i4 + 2;
        int i11 = (bArr[i6] & 255) | i7;
        this.size -= 2;
        if (i10 == i5) {
            this.head = j0Var.b();
            k0.d(j0Var);
        } else {
            j0Var.pos = i10;
        }
        return (short) i11;
    }

    @Override // okio.o
    public long s0(byte b5, long fromIndex) {
        return v0(b5, fromIndex, Long.MAX_VALUE);
    }

    @kd.i(name = "size")
    public final long size() {
        return this.size;
    }

    @Override // okio.o
    public void skip(long byteCount) throws EOFException {
        while (byteCount > 0) {
            j0 j0Var = this.head;
            if (j0Var == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(byteCount, j0Var.limit - j0Var.pos);
            long j4 = min;
            this.size -= j4;
            byteCount -= j4;
            int i4 = j0Var.pos + min;
            j0Var.pos = i4;
            if (i4 == j0Var.limit) {
                this.head = j0Var.b();
                k0.d(j0Var);
            }
        }
    }

    @Override // okio.o
    public void t0(@fg.l m sink, long byteCount) throws EOFException {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("Ὼ"));
        long j4 = this.size;
        if (j4 >= byteCount) {
            sink.write(this, byteCount);
        } else {
            sink.write(this, j4);
            throw new EOFException();
        }
    }

    @Override // okio.n
    @fg.l
    /* renamed from: t1, reason: merged with bridge method [inline-methods] */
    public m writeShort(int s4) {
        j0 B0 = B0(2);
        byte[] bArr = B0.data;
        int i4 = B0.limit;
        bArr[i4] = (byte) ((s4 >>> 8) & 255);
        bArr[i4 + 1] = (byte) (s4 & 255);
        B0.limit = i4 + 2;
        this.size += 2;
        return this;
    }

    @Override // okio.o
    public boolean t2() {
        return this.size == 0;
    }

    @Override // okio.o0
    @fg.l
    /* renamed from: timeout */
    public q0 getTimeout() {
        return q0.f85260d;
    }

    @fg.l
    public String toString() {
        return u0().toString();
    }

    @fg.l
    public m u() {
        return this;
    }

    @fg.l
    public final p u0() {
        long j4 = this.size;
        if (j4 <= ((long) Integer.MAX_VALUE)) {
            return A0((int) j4);
        }
        throw new IllegalStateException((ProtectedSandApp.s("Ώ") + this.size).toString());
    }

    @Override // okio.o
    public long v0(byte b5, long fromIndex, long toIndex) {
        j0 j0Var;
        long j4 = fromIndex;
        long j5 = toIndex;
        long j6 = 0;
        if (!(0 <= j4 && j5 >= j4)) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("ῼ"));
            sb.append(this.size);
            androidx.multidex.c.a(sb, ProtectedSandApp.s("´"), j4, ProtectedSandApp.s("῾"));
            sb.append(j5);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j7 = this.size;
        if (j5 > j7) {
            j5 = j7;
        }
        if (j4 != j5 && (j0Var = this.head) != null) {
            if (j7 - j4 < j4) {
                while (j7 > j4) {
                    j0Var = j0Var.prev;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j7 -= j0Var.limit - j0Var.pos;
                }
                while (j7 < j5) {
                    byte[] bArr = j0Var.data;
                    int min = (int) Math.min(j0Var.limit, (j0Var.pos + j5) - j7);
                    for (int i4 = (int) ((j0Var.pos + j4) - j7); i4 < min; i4++) {
                        if (bArr[i4] == b5) {
                            return (i4 - j0Var.pos) + j7;
                        }
                    }
                    j7 += j0Var.limit - j0Var.pos;
                    j0Var = j0Var.next;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j4 = j7;
                }
            } else {
                while (true) {
                    long j10 = (j0Var.limit - j0Var.pos) + j6;
                    if (j10 > j4) {
                        break;
                    }
                    j0Var = j0Var.next;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j6 = j10;
                }
                while (j6 < j5) {
                    byte[] bArr2 = j0Var.data;
                    int min2 = (int) Math.min(j0Var.limit, (j0Var.pos + j5) - j6);
                    for (int i5 = (int) ((j0Var.pos + j4) - j6); i5 < min2; i5++) {
                        if (bArr2[i5] == b5) {
                            return (i5 - j0Var.pos) + j6;
                        }
                    }
                    j6 += j0Var.limit - j0Var.pos;
                    j0Var = j0Var.next;
                    kotlin.jvm.internal.l0.m(j0Var);
                    j4 = j6;
                }
            }
        }
        return -1L;
    }

    @Override // okio.o
    public short v1() throws EOFException {
        return j.j(readShort());
    }

    @Override // okio.o
    public long w0(@fg.l p targetBytes) {
        kotlin.jvm.internal.l0.p(targetBytes, ProtectedSandApp.s("῞"));
        return I1(targetBytes, 0L);
    }

    @Override // okio.o0
    public long w3(@fg.l m sink, long byteCount) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("Ὼ"));
        if (!(byteCount >= 0)) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("ῡ"), byteCount).toString());
        }
        long j4 = this.size;
        if (j4 == 0) {
            return -1L;
        }
        if (byteCount > j4) {
            byteCount = j4;
        }
        sink.write(this, byteCount);
        return byteCount;
    }

    @Override // okio.o
    @fg.m
    public String x0() throws EOFException {
        long Q1 = Q1((byte) 10);
        if (Q1 != -1) {
            return ve.a.b0(this, Q1);
        }
        long j4 = this.size;
        if (j4 != 0) {
            return q3(j4, kotlin.text.f.UTF_8);
        }
        return null;
    }

    @fg.l
    public m y() {
        return this;
    }

    @Override // okio.n
    public n y0() {
        return this;
    }

    @Override // okio.n
    @fg.l
    /* renamed from: y1, reason: merged with bridge method [inline-methods] */
    public m J2(int s4) {
        return writeShort(j.j((short) s4));
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3 A[EDGE_INSN: B:46:0x00b3->B:40:0x00b3 BREAK  A[LOOP:0: B:4:0x000f->B:45:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    @Override // okio.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long y2() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.size
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lbe
            r0 = 0
            r4 = -7
            r1 = r0
            r5 = r4
            r3 = r2
            r2 = r1
        Lf:
            okio.j0 r7 = r15.head
            kotlin.jvm.internal.l0.m(r7)
            byte[] r8 = r7.data
            int r9 = r7.pos
            int r10 = r7.limit
        L1a:
            if (r9 >= r10) goto L9f
            r11 = r8[r9]
            r12 = 48
            byte r12 = (byte) r12
            if (r11 < r12) goto L6e
            r13 = 57
            byte r13 = (byte) r13
            if (r11 > r13) goto L6e
            int r12 = r12 - r11
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 < 0) goto L40
            if (r13 != 0) goto L3a
            long r13 = (long) r12
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L3a
            goto L40
        L3a:
            r13 = 10
            long r3 = r3 * r13
            long r11 = (long) r12
            long r3 = r3 + r11
            goto L7a
        L40:
            okio.m r0 = new okio.m
            r0.<init>()
            okio.m r0 = r0.N1(r3)
            okio.m r0 = r0.writeByte(r11)
            if (r1 != 0) goto L52
            r0.readByte()
        L52:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "\u1fdc"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            r2.<init>(r3)
            java.lang.String r0 = r0.n3()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L6e:
            r12 = 45
            byte r12 = (byte) r12
            r13 = 1
            if (r11 != r12) goto L7f
            if (r0 != 0) goto L7f
            r11 = 1
            long r5 = r5 - r11
            r1 = r13
        L7a:
            int r9 = r9 + 1
            int r0 = r0 + 1
            goto L1a
        L7f:
            if (r0 == 0) goto L83
            r2 = r13
            goto L9f
        L83:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\u2000"
            java.lang.String r2 = com.flashget.parentalcontrol.ProtectedSandApp.s(r2)
            r1.<init>(r2)
            java.lang.String r2 = okio.j.m(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9f:
            if (r9 != r10) goto Lab
            okio.j0 r8 = r7.b()
            r15.head = r8
            okio.k0.d(r7)
            goto Lad
        Lab:
            r7.pos = r9
        Lad:
            if (r2 != 0) goto Lb3
            okio.j0 r7 = r15.head
            if (r7 != 0) goto Lf
        Lb3:
            long r5 = r15.size
            long r7 = (long) r0
            long r5 = r5 - r7
            r15.size = r5
            if (r1 == 0) goto Lbc
            goto Lbd
        Lbc:
            long r3 = -r3
        Lbd:
            return r3
        Lbe:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.m.y2():long");
    }

    @kd.i(name = "getByte")
    public final byte z(long pos) {
        j.e(this.size, pos, 1L);
        j0 j0Var = this.head;
        if (j0Var == null) {
            kotlin.jvm.internal.l0.m(null);
            throw null;
        }
        long j4 = this.size;
        if (j4 - pos < pos) {
            while (j4 > pos) {
                j0Var = j0Var.prev;
                kotlin.jvm.internal.l0.m(j0Var);
                j4 -= j0Var.limit - j0Var.pos;
            }
            kotlin.jvm.internal.l0.m(j0Var);
            return j0Var.data[(int) ((j0Var.pos + pos) - j4)];
        }
        long j5 = 0;
        while (true) {
            long j6 = (j0Var.limit - j0Var.pos) + j5;
            if (j6 > pos) {
                kotlin.jvm.internal.l0.m(j0Var);
                return j0Var.data[(int) ((j0Var.pos + pos) - j5)];
            }
            j0Var = j0Var.next;
            kotlin.jvm.internal.l0.m(j0Var);
            j5 = j6;
        }
    }

    @Override // okio.o
    public long z1() throws EOFException {
        return j.i(readLong());
    }

    @Override // okio.o
    public long z3(@fg.l m0 sink) throws IOException {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("Ὼ"));
        long j4 = this.size;
        if (j4 > 0) {
            sink.write(this, j4);
        }
        return j4;
    }

    /* compiled from: Buffer.kt */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"okio/m$b", "Ljava/io/InputStream;", "", "read", "()I", "", "sink", "offset", "byteCount", "([BII)I", "available", "Lkotlin/k2;", "close", "()V", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 4, 0})
    public static final class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(m.this.size(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            if (m.this.size() > 0) {
                return m.this.readByte() & 255;
            }
            return -1;
        }

        @fg.l
        public String toString() {
            return m.this + ProtectedSandApp.s("Ὴ");
        }

        @Override // java.io.InputStream
        public int read(@fg.l byte[] sink, int offset, int byteCount) {
            kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("Έ"));
            return m.this.read(sink, offset, byteCount);
        }
    }

    @Override // okio.m0
    public void write(@fg.l m source, long byteCount) {
        j0 j0Var;
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("῭"));
        if (source != this) {
            j.e(source.size, 0L, byteCount);
            while (byteCount > 0) {
                j0 j0Var2 = source.head;
                kotlin.jvm.internal.l0.m(j0Var2);
                int i4 = j0Var2.limit;
                kotlin.jvm.internal.l0.m(source.head);
                if (byteCount < i4 - r2.pos) {
                    j0 j0Var3 = this.head;
                    if (j0Var3 != null) {
                        kotlin.jvm.internal.l0.m(j0Var3);
                        j0Var = j0Var3.prev;
                    } else {
                        j0Var = null;
                    }
                    if (j0Var != null && j0Var.owner) {
                        if ((j0Var.limit + byteCount) - (j0Var.shared ? 0 : j0Var.pos) <= 8192) {
                            j0 j0Var4 = source.head;
                            kotlin.jvm.internal.l0.m(j0Var4);
                            j0Var4.g(j0Var, (int) byteCount);
                            source.size -= byteCount;
                            this.size += byteCount;
                            return;
                        }
                    }
                    j0 j0Var5 = source.head;
                    kotlin.jvm.internal.l0.m(j0Var5);
                    source.head = j0Var5.e((int) byteCount);
                }
                j0 j0Var6 = source.head;
                kotlin.jvm.internal.l0.m(j0Var6);
                long j4 = j0Var6.limit - j0Var6.pos;
                source.head = j0Var6.b();
                j0 j0Var7 = this.head;
                if (j0Var7 == null) {
                    this.head = j0Var6;
                    j0Var6.prev = j0Var6;
                    j0Var6.next = j0Var6;
                } else {
                    kotlin.jvm.internal.l0.m(j0Var7);
                    j0 j0Var8 = j0Var7.prev;
                    kotlin.jvm.internal.l0.m(j0Var8);
                    j0Var8.c(j0Var6).a();
                }
                source.size -= j4;
                this.size += j4;
                byteCount -= j4;
            }
            return;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("\u1fff"));
    }

    @Override // okio.o
    public int read(@fg.l byte[] sink) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("Ὼ"));
        return read(sink, 0, sink.length);
    }

    @Override // okio.o
    public int read(@fg.l byte[] sink, int offset, int byteCount) {
        kotlin.jvm.internal.l0.p(sink, ProtectedSandApp.s("Ὼ"));
        j.e(sink.length, offset, byteCount);
        j0 j0Var = this.head;
        if (j0Var == null) {
            return -1;
        }
        int min = Math.min(byteCount, j0Var.limit - j0Var.pos);
        byte[] bArr = j0Var.data;
        int i4 = j0Var.pos;
        kotlin.collections.l.v0(bArr, sink, offset, i4, i4 + min);
        int i5 = j0Var.pos + min;
        j0Var.pos = i5;
        this.size -= min;
        if (i5 != j0Var.limit) {
            return min;
        }
        this.head = j0Var.b();
        k0.d(j0Var);
        return min;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@fg.l ByteBuffer source) throws IOException {
        kotlin.jvm.internal.l0.p(source, ProtectedSandApp.s("῭"));
        int remaining = source.remaining();
        int i4 = remaining;
        while (i4 > 0) {
            j0 B0 = B0(1);
            int min = Math.min(i4, 8192 - B0.limit);
            source.get(B0.data, B0.limit, min);
            i4 -= min;
            B0.limit += min;
        }
        this.size += remaining;
        return remaining;
    }
}
