package org.apache.http.message;

import androidx.collection.s;
import java.util.NoSuchElementException;
import org.apache.http.HeaderIterator;
import org.apache.http.ParseException;
import org.apache.http.TokenIterator;
import org.apache.http.annotation.NotThreadSafe;
import org.apache.http.util.Args;

@NotThreadSafe
/* loaded from: classes3.dex */
public class BasicTokenIterator implements TokenIterator {
    public static final String HTTP_SEPARATORS = " ,;=()<>@:\\\"/[]?{}\t";
    protected String currentHeader;
    protected String currentToken;
    protected final HeaderIterator headerIt;
    protected int searchPos = findNext(-1);

    public BasicTokenIterator(HeaderIterator headerIterator) {
        this.headerIt = (HeaderIterator) Args.notNull(headerIterator, "Header iterator");
    }

    protected String createToken(String str, int i4, int i5) {
        return str.substring(i4, i5);
    }

    protected int findNext(int i4) throws ParseException {
        int findTokenSeparator;
        if (i4 >= 0) {
            findTokenSeparator = findTokenSeparator(i4);
        } else {
            if (!this.headerIt.hasNext()) {
                return -1;
            }
            this.currentHeader = this.headerIt.nextHeader().getValue();
            findTokenSeparator = 0;
        }
        int findTokenStart = findTokenStart(findTokenSeparator);
        if (findTokenStart < 0) {
            this.currentToken = null;
            return -1;
        }
        int findTokenEnd = findTokenEnd(findTokenStart);
        this.currentToken = createToken(this.currentHeader, findTokenStart, findTokenEnd);
        return findTokenEnd;
    }

    protected int findTokenEnd(int i4) {
        Args.notNegative(i4, "Search position");
        int length = this.currentHeader.length();
        do {
            i4++;
            if (i4 >= length) {
                break;
            }
        } while (isTokenChar(this.currentHeader.charAt(i4)));
        return i4;
    }

    protected int findTokenSeparator(int i4) {
        int notNegative = Args.notNegative(i4, "Search position");
        int length = this.currentHeader.length();
        boolean z4 = false;
        while (!z4 && notNegative < length) {
            char charAt = this.currentHeader.charAt(notNegative);
            if (isTokenSeparator(charAt)) {
                z4 = true;
            } else {
                if (!isWhitespace(charAt)) {
                    if (isTokenChar(charAt)) {
                        StringBuilder a5 = s.a("Tokens without separator (pos ", notNegative, "): ");
                        a5.append(this.currentHeader);
                        throw new ParseException(a5.toString());
                    }
                    StringBuilder a6 = s.a("Invalid character after token (pos ", notNegative, "): ");
                    a6.append(this.currentHeader);
                    throw new ParseException(a6.toString());
                }
                notNegative++;
            }
        }
        return notNegative;
    }

    protected int findTokenStart(int i4) {
        int notNegative = Args.notNegative(i4, "Search position");
        boolean z4 = false;
        while (!z4) {
            String str = this.currentHeader;
            if (str == null) {
                break;
            }
            int length = str.length();
            while (!z4 && notNegative < length) {
                char charAt = this.currentHeader.charAt(notNegative);
                if (isTokenSeparator(charAt) || isWhitespace(charAt)) {
                    notNegative++;
                } else {
                    if (!isTokenChar(this.currentHeader.charAt(notNegative))) {
                        StringBuilder a5 = s.a("Invalid character before token (pos ", notNegative, "): ");
                        a5.append(this.currentHeader);
                        throw new ParseException(a5.toString());
                    }
                    z4 = true;
                }
            }
            if (!z4) {
                if (this.headerIt.hasNext()) {
                    this.currentHeader = this.headerIt.nextHeader().getValue();
                    notNegative = 0;
                } else {
                    this.currentHeader = null;
                }
            }
        }
        if (z4) {
            return notNegative;
        }
        return -1;
    }

    @Override // org.apache.http.TokenIterator, java.util.Iterator
    public boolean hasNext() {
        return this.currentToken != null;
    }

    protected boolean isHttpSeparator(char c5) {
        return " ,;=()<>@:\\\"/[]?{}\t".indexOf(c5) >= 0;
    }

    protected boolean isTokenChar(char c5) {
        if (Character.isLetterOrDigit(c5)) {
            return true;
        }
        return (Character.isISOControl(c5) || isHttpSeparator(c5)) ? false : true;
    }

    protected boolean isTokenSeparator(char c5) {
        return c5 == ',';
    }

    protected boolean isWhitespace(char c5) {
        return c5 == '\t' || Character.isSpaceChar(c5);
    }

    @Override // java.util.Iterator
    public final Object next() throws NoSuchElementException, ParseException {
        return nextToken();
    }

    @Override // org.apache.http.TokenIterator
    public String nextToken() throws NoSuchElementException, ParseException {
        String str = this.currentToken;
        if (str == null) {
            throw new NoSuchElementException("Iteration already finished.");
        }
        this.searchPos = findNext(this.searchPos);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Removing tokens is not supported.");
    }
}
