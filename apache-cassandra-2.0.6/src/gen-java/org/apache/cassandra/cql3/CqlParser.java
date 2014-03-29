// $ANTLR 3.2 Sep 23, 2009 12:02:23 /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g 2014-03-25 01:12:47

    package org.apache.cassandra.cql3;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.Collections;
    import java.util.EnumSet;
    import java.util.HashMap;
    import java.util.LinkedHashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.Set;

    import org.apache.cassandra.auth.Permission;
    import org.apache.cassandra.auth.DataResource;
    import org.apache.cassandra.auth.IResource;
    import org.apache.cassandra.cql3.*;
    import org.apache.cassandra.cql3.statements.*;
    import org.apache.cassandra.cql3.functions.FunctionCall;
    import org.apache.cassandra.db.marshal.CollectionType;
    import org.apache.cassandra.exceptions.ConfigurationException;
    import org.apache.cassandra.exceptions.InvalidRequestException;
    import org.apache.cassandra.exceptions.SyntaxException;
    import org.apache.cassandra.utils.Pair;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class CqlParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "K_USE", "K_SELECT", "K_COUNT", "K_FROM", "K_WHERE", "K_ORDER", "K_BY", "K_LIMIT", "INTEGER", "K_ALLOW", "K_FILTERING", "K_WRITETIME", "K_TTL", "K_AND", "K_ASC", "K_DESC", "K_INSERT", "K_INTO", "K_VALUES", "K_USING", "K_TIMESTAMP", "K_UPDATE", "K_SET", "K_DELETE", "K_BEGIN", "K_UNLOGGED", "K_COUNTER", "K_BATCH", "K_APPLY", "K_CREATE", "K_KEYSPACE", "K_WITH", "K_COLUMNFAMILY", "K_PRIMARY", "K_KEY", "K_COMPACT", "K_STORAGE", "K_CLUSTERING", "K_CUSTOM", "K_INDEX", "IDENT", "K_ON", "STRING_LITERAL", "K_ALTER", "K_TYPE", "K_ADD", "K_RENAME", "K_TO", "K_DROP", "K_TRUNCATE", "K_GRANT", "K_REVOKE", "K_LIST", "K_OF", "K_NORECURSIVE", "K_MODIFY", "K_AUTHORIZE", "K_ALL", "K_PERMISSIONS", "K_PERMISSION", "K_KEYSPACES", "K_USER", "K_SUPERUSER", "K_NOSUPERUSER", "K_USERS", "K_PASSWORD", "QUOTED_NAME", "FLOAT", "BOOLEAN", "UUID", "HEXNUMBER", "K_NULL", "QMARK", "K_TOKEN", "K_IN", "K_ASCII", "K_BIGINT", "K_BLOB", "K_BOOLEAN", "K_DECIMAL", "K_DOUBLE", "K_FLOAT", "K_INET", "K_INT", "K_TEXT", "K_UUID", "K_VARCHAR", "K_VARINT", "K_TIMEUUID", "K_MAP", "S", "E", "L", "C", "T", "F", "R", "O", "M", "W", "H", "A", "N", "D", "K", "Y", "I", "U", "P", "G", "B", "X", "V", "Z", "J", "Q", "DIGIT", "LETTER", "HEX", "EXPONENT", "WS", "COMMENT", "MULTILINE_COMMENT", "';'", "'('", "')'", "','", "'\\*'", "'['", "']'", "'.'", "'{'", "':'", "'}'", "'='", "'+'", "'-'", "'<'", "'<='", "'>'", "'>='"
    };
    public static final int EXPONENT=123;
    public static final int K_PERMISSIONS=62;
    public static final int LETTER=121;
    public static final int K_INT=87;
    public static final int K_PERMISSION=63;
    public static final int K_CREATE=33;
    public static final int K_CLUSTERING=41;
    public static final int K_WRITETIME=15;
    public static final int EOF=-1;
    public static final int K_PRIMARY=37;
    public static final int K_AUTHORIZE=60;
    public static final int K_VALUES=22;
    public static final int K_USE=4;
    public static final int STRING_LITERAL=46;
    public static final int K_GRANT=54;
    public static final int K_ON=45;
    public static final int K_USING=23;
    public static final int K_ADD=49;
    public static final int K_ASC=18;
    public static final int K_CUSTOM=42;
    public static final int K_KEY=38;
    public static final int COMMENT=125;
    public static final int K_TRUNCATE=53;
    public static final int K_ORDER=9;
    public static final int HEXNUMBER=74;
    public static final int K_OF=57;
    public static final int K_ALL=61;
    public static final int D=107;
    public static final int T__139=139;
    public static final int E=95;
    public static final int T__138=138;
    public static final int F=99;
    public static final int T__137=137;
    public static final int G=113;
    public static final int T__136=136;
    public static final int K_COUNT=6;
    public static final int K_KEYSPACE=34;
    public static final int K_TYPE=48;
    public static final int A=105;
    public static final int B=114;
    public static final int C=97;
    public static final int L=96;
    public static final int M=102;
    public static final int N=106;
    public static final int O=101;
    public static final int H=104;
    public static final int I=110;
    public static final int J=118;
    public static final int K_UPDATE=25;
    public static final int K=108;
    public static final int K_FILTERING=14;
    public static final int U=111;
    public static final int T=98;
    public static final int W=103;
    public static final int K_TEXT=88;
    public static final int V=116;
    public static final int Q=119;
    public static final int P=112;
    public static final int K_COMPACT=39;
    public static final int S=94;
    public static final int R=100;
    public static final int T__141=141;
    public static final int T__142=142;
    public static final int K_TTL=16;
    public static final int T__140=140;
    public static final int Y=109;
    public static final int X=115;
    public static final int T__143=143;
    public static final int Z=117;
    public static final int T__144=144;
    public static final int K_INDEX=43;
    public static final int T__128=128;
    public static final int K_INSERT=20;
    public static final int T__127=127;
    public static final int WS=124;
    public static final int T__129=129;
    public static final int K_RENAME=50;
    public static final int K_APPLY=32;
    public static final int K_INET=86;
    public static final int K_STORAGE=40;
    public static final int K_TIMESTAMP=24;
    public static final int K_NULL=75;
    public static final int K_AND=17;
    public static final int K_DESC=19;
    public static final int T__130=130;
    public static final int K_TOKEN=77;
    public static final int QMARK=76;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__134=134;
    public static final int K_UUID=89;
    public static final int T__135=135;
    public static final int K_BATCH=31;
    public static final int K_ASCII=79;
    public static final int UUID=73;
    public static final int K_LIST=56;
    public static final int K_DELETE=27;
    public static final int K_TO=51;
    public static final int K_BY=10;
    public static final int FLOAT=71;
    public static final int K_VARINT=91;
    public static final int K_FLOAT=85;
    public static final int K_SUPERUSER=66;
    public static final int K_DOUBLE=84;
    public static final int K_SELECT=5;
    public static final int K_LIMIT=11;
    public static final int K_BOOLEAN=82;
    public static final int K_ALTER=47;
    public static final int K_SET=26;
    public static final int K_WHERE=8;
    public static final int QUOTED_NAME=70;
    public static final int MULTILINE_COMMENT=126;
    public static final int K_BLOB=81;
    public static final int K_UNLOGGED=29;
    public static final int BOOLEAN=72;
    public static final int HEX=122;
    public static final int K_INTO=21;
    public static final int K_PASSWORD=69;
    public static final int K_REVOKE=55;
    public static final int K_ALLOW=13;
    public static final int K_VARCHAR=90;
    public static final int IDENT=44;
    public static final int DIGIT=120;
    public static final int K_USERS=68;
    public static final int K_BEGIN=28;
    public static final int INTEGER=12;
    public static final int K_KEYSPACES=64;
    public static final int K_COUNTER=30;
    public static final int K_DECIMAL=83;
    public static final int K_WITH=35;
    public static final int K_IN=78;
    public static final int K_NORECURSIVE=58;
    public static final int K_MAP=93;
    public static final int K_FROM=7;
    public static final int K_COLUMNFAMILY=36;
    public static final int K_MODIFY=59;
    public static final int K_DROP=52;
    public static final int K_NOSUPERUSER=67;
    public static final int K_BIGINT=80;
    public static final int K_TIMEUUID=92;
    public static final int K_USER=65;

    // delegates
    // delegators


        public CqlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public CqlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return CqlParser.tokenNames; }
    public String getGrammarFileName() { return "/home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g"; }


        private List<String> recognitionErrors = new ArrayList<String>();
        private int currentBindMarkerIdx = -1;

        public void displayRecognitionError(String[] tokenNames, RecognitionException e)
        {
            String hdr = getErrorHeader(e);
            String msg = getErrorMessage(e, tokenNames);
            recognitionErrors.add(hdr + " " + msg);
        }

        public void addRecognitionError(String msg)
        {
            recognitionErrors.add(msg);
        }

        public List<String> getRecognitionErrors()
        {
            return recognitionErrors;
        }

        public void throwLastRecognitionError() throws SyntaxException
        {
            if (recognitionErrors.size() > 0)
                throw new SyntaxException(recognitionErrors.get((recognitionErrors.size()-1)));
        }

        public Map<String, String> convertPropertyMap(Maps.Literal map)
        {
            if (map == null || map.entries == null || map.entries.isEmpty())
                return Collections.<String, String>emptyMap();

            Map<String, String> res = new HashMap<String, String>(map.entries.size());

            for (Pair<Term.Raw, Term.Raw> entry : map.entries)
            {
                // Because the parser tries to be smart and recover on error (to
                // allow displaying more than one error I suppose), we have null
                // entries in there. Just skip those, a proper error will be thrown in the end.
                if (entry.left == null || entry.right == null)
                    break;

                if (!(entry.left instanceof Constants.Literal))
                {
                    addRecognitionError("Invalid property name: " + entry.left);
                    break;
                }
                if (!(entry.right instanceof Constants.Literal))
                {
                    addRecognitionError("Invalid property value: " + entry.right);
                    break;
                }

                res.put(((Constants.Literal)entry.left).getRawText(), ((Constants.Literal)entry.right).getRawText());
            }

            return res;
        }

        public void addRawUpdate(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations, ColumnIdentifier key, Operation.RawUpdate update)
        {
            for (Pair<ColumnIdentifier, Operation.RawUpdate> p : operations)
            {
                if (p.left.equals(key) && !p.right.isCompatibleWith(update))
                    addRecognitionError("Multiple incompatible setting of column " + key);
            }
            operations.add(Pair.create(key, update));
        }



    // $ANTLR start "query"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:166:1: query returns [ParsedStatement stmnt] : st= cqlStatement ( ';' )* EOF ;
    public final ParsedStatement query() throws RecognitionException {
        ParsedStatement stmnt = null;

        ParsedStatement st = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:169:5: (st= cqlStatement ( ';' )* EOF )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:169:7: st= cqlStatement ( ';' )* EOF
            {
            pushFollow(FOLLOW_cqlStatement_in_query72);
            st=cqlStatement();

            state._fsp--;

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:169:23: ( ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==127) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:169:24: ';'
            	    {
            	    match(input,127,FOLLOW_127_in_query75); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match(input,EOF,FOLLOW_EOF_in_query79); 
             stmnt = st; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmnt;
    }
    // $ANTLR end "query"


    // $ANTLR start "cqlStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:172:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createColumnFamilyStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropColumnFamilyStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement );
    public final ParsedStatement cqlStatement() throws RecognitionException {
        ParsedStatement stmt = null;

        SelectStatement.RawStatement st1 = null;

        UpdateStatement st2 = null;

        UpdateStatement st3 = null;

        BatchStatement st4 = null;

        DeleteStatement st5 = null;

        UseStatement st6 = null;

        TruncateStatement st7 = null;

        CreateKeyspaceStatement st8 = null;

        CreateColumnFamilyStatement.RawStatement st9 = null;

        CreateIndexStatement st10 = null;

        DropKeyspaceStatement st11 = null;

        DropColumnFamilyStatement st12 = null;

        DropIndexStatement st13 = null;

        AlterTableStatement st14 = null;

        AlterKeyspaceStatement st15 = null;

        GrantStatement st16 = null;

        RevokeStatement st17 = null;

        ListPermissionsStatement st18 = null;

        CreateUserStatement st19 = null;

        AlterUserStatement st20 = null;

        DropUserStatement st21 = null;

        ListUsersStatement st22 = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:174:5: (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createColumnFamilyStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropColumnFamilyStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement )
            int alt2=22;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:174:7: st1= selectStatement
                    {
                    pushFollow(FOLLOW_selectStatement_in_cqlStatement113);
                    st1=selectStatement();

                    state._fsp--;

                     stmt = st1; 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:175:7: st2= insertStatement
                    {
                    pushFollow(FOLLOW_insertStatement_in_cqlStatement138);
                    st2=insertStatement();

                    state._fsp--;

                     stmt = st2; 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:176:7: st3= updateStatement
                    {
                    pushFollow(FOLLOW_updateStatement_in_cqlStatement163);
                    st3=updateStatement();

                    state._fsp--;

                     stmt = st3; 

                    }
                    break;
                case 4 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:177:7: st4= batchStatement
                    {
                    pushFollow(FOLLOW_batchStatement_in_cqlStatement188);
                    st4=batchStatement();

                    state._fsp--;

                     stmt = st4; 

                    }
                    break;
                case 5 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:178:7: st5= deleteStatement
                    {
                    pushFollow(FOLLOW_deleteStatement_in_cqlStatement214);
                    st5=deleteStatement();

                    state._fsp--;

                     stmt = st5; 

                    }
                    break;
                case 6 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:179:7: st6= useStatement
                    {
                    pushFollow(FOLLOW_useStatement_in_cqlStatement239);
                    st6=useStatement();

                    state._fsp--;

                     stmt = st6; 

                    }
                    break;
                case 7 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:180:7: st7= truncateStatement
                    {
                    pushFollow(FOLLOW_truncateStatement_in_cqlStatement267);
                    st7=truncateStatement();

                    state._fsp--;

                     stmt = st7; 

                    }
                    break;
                case 8 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:181:7: st8= createKeyspaceStatement
                    {
                    pushFollow(FOLLOW_createKeyspaceStatement_in_cqlStatement290);
                    st8=createKeyspaceStatement();

                    state._fsp--;

                     stmt = st8; 

                    }
                    break;
                case 9 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:182:7: st9= createColumnFamilyStatement
                    {
                    pushFollow(FOLLOW_createColumnFamilyStatement_in_cqlStatement307);
                    st9=createColumnFamilyStatement();

                    state._fsp--;

                     stmt = st9; 

                    }
                    break;
                case 10 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:183:7: st10= createIndexStatement
                    {
                    pushFollow(FOLLOW_createIndexStatement_in_cqlStatement319);
                    st10=createIndexStatement();

                    state._fsp--;

                     stmt = st10; 

                    }
                    break;
                case 11 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:184:7: st11= dropKeyspaceStatement
                    {
                    pushFollow(FOLLOW_dropKeyspaceStatement_in_cqlStatement338);
                    st11=dropKeyspaceStatement();

                    state._fsp--;

                     stmt = st11; 

                    }
                    break;
                case 12 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:185:7: st12= dropColumnFamilyStatement
                    {
                    pushFollow(FOLLOW_dropColumnFamilyStatement_in_cqlStatement356);
                    st12=dropColumnFamilyStatement();

                    state._fsp--;

                     stmt = st12; 

                    }
                    break;
                case 13 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:186:7: st13= dropIndexStatement
                    {
                    pushFollow(FOLLOW_dropIndexStatement_in_cqlStatement370);
                    st13=dropIndexStatement();

                    state._fsp--;

                     stmt = st13; 

                    }
                    break;
                case 14 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:187:7: st14= alterTableStatement
                    {
                    pushFollow(FOLLOW_alterTableStatement_in_cqlStatement391);
                    st14=alterTableStatement();

                    state._fsp--;

                     stmt = st14; 

                    }
                    break;
                case 15 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:188:7: st15= alterKeyspaceStatement
                    {
                    pushFollow(FOLLOW_alterKeyspaceStatement_in_cqlStatement411);
                    st15=alterKeyspaceStatement();

                    state._fsp--;

                     stmt = st15; 

                    }
                    break;
                case 16 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:189:7: st16= grantStatement
                    {
                    pushFollow(FOLLOW_grantStatement_in_cqlStatement428);
                    st16=grantStatement();

                    state._fsp--;

                     stmt = st16; 

                    }
                    break;
                case 17 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:190:7: st17= revokeStatement
                    {
                    pushFollow(FOLLOW_revokeStatement_in_cqlStatement453);
                    st17=revokeStatement();

                    state._fsp--;

                     stmt = st17; 

                    }
                    break;
                case 18 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:191:7: st18= listPermissionsStatement
                    {
                    pushFollow(FOLLOW_listPermissionsStatement_in_cqlStatement477);
                    st18=listPermissionsStatement();

                    state._fsp--;

                     stmt = st18; 

                    }
                    break;
                case 19 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:192:7: st19= createUserStatement
                    {
                    pushFollow(FOLLOW_createUserStatement_in_cqlStatement492);
                    st19=createUserStatement();

                    state._fsp--;

                     stmt = st19; 

                    }
                    break;
                case 20 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:193:7: st20= alterUserStatement
                    {
                    pushFollow(FOLLOW_alterUserStatement_in_cqlStatement512);
                    st20=alterUserStatement();

                    state._fsp--;

                     stmt = st20; 

                    }
                    break;
                case 21 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:194:7: st21= dropUserStatement
                    {
                    pushFollow(FOLLOW_dropUserStatement_in_cqlStatement533);
                    st21=dropUserStatement();

                    state._fsp--;

                     stmt = st21; 

                    }
                    break;
                case 22 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:195:7: st22= listUsersStatement
                    {
                    pushFollow(FOLLOW_listUsersStatement_in_cqlStatement555);
                    st22=listUsersStatement();

                    state._fsp--;

                     stmt = st22; 

                    }
                    break;

            }
             if (stmt != null) stmt.setBoundTerms(currentBindMarkerIdx + 1); 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "cqlStatement"


    // $ANTLR start "useStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:201:1: useStatement returns [UseStatement stmt] : K_USE ks= keyspaceName ;
    public final UseStatement useStatement() throws RecognitionException {
        UseStatement stmt = null;

        String ks = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:202:5: ( K_USE ks= keyspaceName )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:202:7: K_USE ks= keyspaceName
            {
            match(input,K_USE,FOLLOW_K_USE_in_useStatement589); 
            pushFollow(FOLLOW_keyspaceName_in_useStatement593);
            ks=keyspaceName();

            state._fsp--;

             stmt = new UseStatement(ks); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "useStatement"


    // $ANTLR start "selectStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:205:1: selectStatement returns [SelectStatement.RawStatement expr] : K_SELECT (sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= INTEGER )? ( K_ALLOW K_FILTERING )? ;
    public final SelectStatement.RawStatement selectStatement() throws RecognitionException {
        SelectStatement.RawStatement expr = null;

        Token rows=null;
        List<RawSelector> sclause = null;

        CFName cf = null;

        List<Relation> wclause = null;



                boolean isCount = false;
                int limit = Integer.MAX_VALUE;
                Map<ColumnIdentifier, Boolean> orderings = new LinkedHashMap<ColumnIdentifier, Boolean>();
                boolean allowFiltering = false;
            
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:218:5: ( K_SELECT (sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= INTEGER )? ( K_ALLOW K_FILTERING )? )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:218:7: K_SELECT (sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ) ) K_FROM cf= columnFamilyName ( K_WHERE wclause= whereClause )? ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )? ( K_LIMIT rows= INTEGER )? ( K_ALLOW K_FILTERING )?
            {
            match(input,K_SELECT,FOLLOW_K_SELECT_in_selectStatement627); 
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:218:16: (sclause= selectClause | ( K_COUNT '(' sclause= selectCountClause ')' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=K_FILTERING && LA3_0<=K_TTL)||LA3_0==K_VALUES||LA3_0==K_TIMESTAMP||LA3_0==K_COUNTER||(LA3_0>=K_KEY && LA3_0<=K_CUSTOM)||LA3_0==IDENT||LA3_0==K_TYPE||LA3_0==K_LIST||(LA3_0>=K_ALL && LA3_0<=QUOTED_NAME)||LA3_0==K_TOKEN||(LA3_0>=K_ASCII && LA3_0<=K_MAP)||LA3_0==131) ) {
                alt3=1;
            }
            else if ( (LA3_0==K_COUNT) ) {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==128) ) {
                    alt3=2;
                }
                else if ( (LA3_2==K_FROM||LA3_2==130) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:218:18: sclause= selectClause
                    {
                    pushFollow(FOLLOW_selectClause_in_selectStatement633);
                    sclause=selectClause();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:218:41: ( K_COUNT '(' sclause= selectCountClause ')' )
                    {
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:218:41: ( K_COUNT '(' sclause= selectCountClause ')' )
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:218:42: K_COUNT '(' sclause= selectCountClause ')'
                    {
                    match(input,K_COUNT,FOLLOW_K_COUNT_in_selectStatement638); 
                    match(input,128,FOLLOW_128_in_selectStatement640); 
                    pushFollow(FOLLOW_selectCountClause_in_selectStatement644);
                    sclause=selectCountClause();

                    state._fsp--;

                    match(input,129,FOLLOW_129_in_selectStatement646); 
                     isCount = true; 

                    }


                    }
                    break;

            }

            match(input,K_FROM,FOLLOW_K_FROM_in_selectStatement659); 
            pushFollow(FOLLOW_columnFamilyName_in_selectStatement663);
            cf=columnFamilyName();

            state._fsp--;

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:220:7: ( K_WHERE wclause= whereClause )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==K_WHERE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:220:9: K_WHERE wclause= whereClause
                    {
                    match(input,K_WHERE,FOLLOW_K_WHERE_in_selectStatement673); 
                    pushFollow(FOLLOW_whereClause_in_selectStatement677);
                    wclause=whereClause();

                    state._fsp--;


                    }
                    break;

            }

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:221:7: ( K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==K_ORDER) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:221:9: K_ORDER K_BY orderByClause[orderings] ( ',' orderByClause[orderings] )*
                    {
                    match(input,K_ORDER,FOLLOW_K_ORDER_in_selectStatement690); 
                    match(input,K_BY,FOLLOW_K_BY_in_selectStatement692); 
                    pushFollow(FOLLOW_orderByClause_in_selectStatement694);
                    orderByClause(orderings);

                    state._fsp--;

                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:221:47: ( ',' orderByClause[orderings] )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==130) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:221:49: ',' orderByClause[orderings]
                    	    {
                    	    match(input,130,FOLLOW_130_in_selectStatement699); 
                    	    pushFollow(FOLLOW_orderByClause_in_selectStatement701);
                    	    orderByClause(orderings);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:222:7: ( K_LIMIT rows= INTEGER )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==K_LIMIT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:222:9: K_LIMIT rows= INTEGER
                    {
                    match(input,K_LIMIT,FOLLOW_K_LIMIT_in_selectStatement718); 
                    rows=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_selectStatement722); 
                     limit = Integer.parseInt((rows!=null?rows.getText():null)); 

                    }
                    break;

            }

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:223:7: ( K_ALLOW K_FILTERING )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==K_ALLOW) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:223:9: K_ALLOW K_FILTERING
                    {
                    match(input,K_ALLOW,FOLLOW_K_ALLOW_in_selectStatement737); 
                    match(input,K_FILTERING,FOLLOW_K_FILTERING_in_selectStatement739); 
                     allowFiltering = true; 

                    }
                    break;

            }


                      SelectStatement.Parameters params = new SelectStatement.Parameters(limit,
                                                                                         orderings,
                                                                                         isCount,
                                                                                         allowFiltering);
                      expr = new SelectStatement.RawStatement(cf, params, sclause, wclause);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectStatement"


    // $ANTLR start "selectClause"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:233:1: selectClause returns [List<RawSelector> expr] : (t1= selector ( ',' tN= selector )* | '\\*' );
    public final List<RawSelector> selectClause() throws RecognitionException {
        List<RawSelector> expr = null;

        RawSelector t1 = null;

        RawSelector tN = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:234:5: (t1= selector ( ',' tN= selector )* | '\\*' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==K_COUNT||(LA10_0>=K_FILTERING && LA10_0<=K_TTL)||LA10_0==K_VALUES||LA10_0==K_TIMESTAMP||LA10_0==K_COUNTER||(LA10_0>=K_KEY && LA10_0<=K_CUSTOM)||LA10_0==IDENT||LA10_0==K_TYPE||LA10_0==K_LIST||(LA10_0>=K_ALL && LA10_0<=QUOTED_NAME)||LA10_0==K_TOKEN||(LA10_0>=K_ASCII && LA10_0<=K_MAP)) ) {
                alt10=1;
            }
            else if ( (LA10_0==131) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:234:7: t1= selector ( ',' tN= selector )*
                    {
                    pushFollow(FOLLOW_selector_in_selectClause776);
                    t1=selector();

                    state._fsp--;

                     expr = new ArrayList<RawSelector>(); expr.add(t1); 
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:234:76: ( ',' tN= selector )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==130) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:234:77: ',' tN= selector
                    	    {
                    	    match(input,130,FOLLOW_130_in_selectClause781); 
                    	    pushFollow(FOLLOW_selector_in_selectClause785);
                    	    tN=selector();

                    	    state._fsp--;

                    	     expr.add(tN); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:235:7: '\\*'
                    {
                    match(input,131,FOLLOW_131_in_selectClause797); 
                     expr = Collections.<RawSelector>emptyList();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectClause"


    // $ANTLR start "selectionFunctionArgs"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:238:1: selectionFunctionArgs returns [List<RawSelector> a] : ( '(' ')' | '(' s1= selector ( ',' sn= selector )* ')' );
    public final List<RawSelector> selectionFunctionArgs() throws RecognitionException {
        List<RawSelector> a = null;

        RawSelector s1 = null;

        RawSelector sn = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:239:5: ( '(' ')' | '(' s1= selector ( ',' sn= selector )* ')' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==128) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==129) ) {
                    alt12=1;
                }
                else if ( (LA12_1==K_COUNT||(LA12_1>=K_FILTERING && LA12_1<=K_TTL)||LA12_1==K_VALUES||LA12_1==K_TIMESTAMP||LA12_1==K_COUNTER||(LA12_1>=K_KEY && LA12_1<=K_CUSTOM)||LA12_1==IDENT||LA12_1==K_TYPE||LA12_1==K_LIST||(LA12_1>=K_ALL && LA12_1<=QUOTED_NAME)||LA12_1==K_TOKEN||(LA12_1>=K_ASCII && LA12_1<=K_MAP)) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:239:7: '(' ')'
                    {
                    match(input,128,FOLLOW_128_in_selectionFunctionArgs820); 
                    match(input,129,FOLLOW_129_in_selectionFunctionArgs822); 
                     a = Collections.emptyList(); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:240:7: '(' s1= selector ( ',' sn= selector )* ')'
                    {
                    match(input,128,FOLLOW_128_in_selectionFunctionArgs832); 
                    pushFollow(FOLLOW_selector_in_selectionFunctionArgs836);
                    s1=selector();

                    state._fsp--;

                     List<RawSelector> args = new ArrayList<RawSelector>(); args.add(s1); 
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:241:11: ( ',' sn= selector )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==130) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:241:13: ',' sn= selector
                    	    {
                    	    match(input,130,FOLLOW_130_in_selectionFunctionArgs852); 
                    	    pushFollow(FOLLOW_selector_in_selectionFunctionArgs856);
                    	    sn=selector();

                    	    state._fsp--;

                    	     args.add(sn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match(input,129,FOLLOW_129_in_selectionFunctionArgs870); 
                     a = args; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return a;
    }
    // $ANTLR end "selectionFunctionArgs"


    // $ANTLR start "selector"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:245:1: selector returns [RawSelector s] : (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs );
    public final RawSelector selector() throws RecognitionException {
        RawSelector s = null;

        ColumnIdentifier c = null;

        String f = null;

        List<RawSelector> args = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:246:5: (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs )
            int alt13=4;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:246:7: c= cident
                    {
                    pushFollow(FOLLOW_cident_in_selector895);
                    c=cident();

                    state._fsp--;

                     s = c; 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:247:7: K_WRITETIME '(' c= cident ')'
                    {
                    match(input,K_WRITETIME,FOLLOW_K_WRITETIME_in_selector938); 
                    match(input,128,FOLLOW_128_in_selector940); 
                    pushFollow(FOLLOW_cident_in_selector944);
                    c=cident();

                    state._fsp--;

                    match(input,129,FOLLOW_129_in_selector946); 
                     s = new RawSelector.WritetimeOrTTL(c, true); 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:248:7: K_TTL '(' c= cident ')'
                    {
                    match(input,K_TTL,FOLLOW_K_TTL_in_selector969); 
                    match(input,128,FOLLOW_128_in_selector977); 
                    pushFollow(FOLLOW_cident_in_selector981);
                    c=cident();

                    state._fsp--;

                    match(input,129,FOLLOW_129_in_selector983); 
                     s = new RawSelector.WritetimeOrTTL(c, false); 

                    }
                    break;
                case 4 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:249:7: f= functionName args= selectionFunctionArgs
                    {
                    pushFollow(FOLLOW_functionName_in_selector1008);
                    f=functionName();

                    state._fsp--;

                    pushFollow(FOLLOW_selectionFunctionArgs_in_selector1012);
                    args=selectionFunctionArgs();

                    state._fsp--;

                     s = new RawSelector.WithFunction(f, args); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "selector"


    // $ANTLR start "selectCountClause"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:252:1: selectCountClause returns [List<RawSelector> expr] : ( '\\*' | i= INTEGER );
    public final List<RawSelector> selectCountClause() throws RecognitionException {
        List<RawSelector> expr = null;

        Token i=null;

        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:253:5: ( '\\*' | i= INTEGER )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==131) ) {
                alt14=1;
            }
            else if ( (LA14_0==INTEGER) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:253:7: '\\*'
                    {
                    match(input,131,FOLLOW_131_in_selectCountClause1035); 
                     expr = Collections.<RawSelector>emptyList();

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:254:7: i= INTEGER
                    {
                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_selectCountClause1057); 
                     if (!i.getText().equals("1")) addRecognitionError("Only COUNT(1) is supported, got COUNT(" + i.getText() + ")"); expr = Collections.<RawSelector>emptyList();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "selectCountClause"


    // $ANTLR start "whereClause"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:257:1: whereClause returns [List<Relation> clause] : relation[$clause] ( K_AND relation[$clause] )* ;
    public final List<Relation> whereClause() throws RecognitionException {
        List<Relation> clause = null;

         clause = new ArrayList<Relation>(); 
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:259:5: ( relation[$clause] ( K_AND relation[$clause] )* )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:259:7: relation[$clause] ( K_AND relation[$clause] )*
            {
            pushFollow(FOLLOW_relation_in_whereClause1093);
            relation(clause);

            state._fsp--;

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:259:25: ( K_AND relation[$clause] )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==K_AND) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:259:26: K_AND relation[$clause]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_whereClause1097); 
            	    pushFollow(FOLLOW_relation_in_whereClause1099);
            	    relation(clause);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return clause;
    }
    // $ANTLR end "whereClause"


    // $ANTLR start "orderByClause"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:262:1: orderByClause[Map<ColumnIdentifier, Boolean> orderings] : c= cident ( K_ASC | K_DESC )? ;
    public final void orderByClause(Map<ColumnIdentifier, Boolean> orderings) throws RecognitionException {
        ColumnIdentifier c = null;



                ColumnIdentifier orderBy = null;
                boolean reversed = false;
            
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:267:5: (c= cident ( K_ASC | K_DESC )? )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:267:7: c= cident ( K_ASC | K_DESC )?
            {
            pushFollow(FOLLOW_cident_in_orderByClause1130);
            c=cident();

            state._fsp--;

             orderBy = c; 
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:267:33: ( K_ASC | K_DESC )?
            int alt16=3;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==K_ASC) ) {
                alt16=1;
            }
            else if ( (LA16_0==K_DESC) ) {
                alt16=2;
            }
            switch (alt16) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:267:34: K_ASC
                    {
                    match(input,K_ASC,FOLLOW_K_ASC_in_orderByClause1135); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:267:42: K_DESC
                    {
                    match(input,K_DESC,FOLLOW_K_DESC_in_orderByClause1139); 
                     reversed = true; 

                    }
                    break;

            }

             orderings.put(c, reversed); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "orderByClause"


    // $ANTLR start "insertStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:270:1: insertStatement returns [UpdateStatement expr] : K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( usingClause[attrs] )? ;
    public final UpdateStatement insertStatement() throws RecognitionException {
        UpdateStatement expr = null;

        CFName cf = null;

        ColumnIdentifier c1 = null;

        ColumnIdentifier cn = null;

        Term.Raw v1 = null;

        Term.Raw vn = null;



                Attributes attrs = new Attributes();
                List<ColumnIdentifier> columnNames  = new ArrayList<ColumnIdentifier>();
                List<Term.Raw> values = new ArrayList<Term.Raw>();
            
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:282:5: ( K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( usingClause[attrs] )? )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:282:7: K_INSERT K_INTO cf= columnFamilyName '(' c1= cident ( ',' cn= cident )* ')' K_VALUES '(' v1= term ( ',' vn= term )* ')' ( usingClause[attrs] )?
            {
            match(input,K_INSERT,FOLLOW_K_INSERT_in_insertStatement1177); 
            match(input,K_INTO,FOLLOW_K_INTO_in_insertStatement1179); 
            pushFollow(FOLLOW_columnFamilyName_in_insertStatement1183);
            cf=columnFamilyName();

            state._fsp--;

            match(input,128,FOLLOW_128_in_insertStatement1195); 
            pushFollow(FOLLOW_cident_in_insertStatement1199);
            c1=cident();

            state._fsp--;

             columnNames.add(c1); 
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:283:51: ( ',' cn= cident )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==130) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:283:53: ',' cn= cident
            	    {
            	    match(input,130,FOLLOW_130_in_insertStatement1206); 
            	    pushFollow(FOLLOW_cident_in_insertStatement1210);
            	    cn=cident();

            	    state._fsp--;

            	     columnNames.add(cn); 

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            match(input,129,FOLLOW_129_in_insertStatement1217); 
            match(input,K_VALUES,FOLLOW_K_VALUES_in_insertStatement1227); 
            match(input,128,FOLLOW_128_in_insertStatement1239); 
            pushFollow(FOLLOW_term_in_insertStatement1243);
            v1=term();

            state._fsp--;

             values.add(v1); 
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:285:43: ( ',' vn= term )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==130) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:285:45: ',' vn= term
            	    {
            	    match(input,130,FOLLOW_130_in_insertStatement1249); 
            	    pushFollow(FOLLOW_term_in_insertStatement1253);
            	    vn=term();

            	    state._fsp--;

            	     values.add(vn); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            match(input,129,FOLLOW_129_in_insertStatement1260); 
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:286:9: ( usingClause[attrs] )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==K_USING) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:286:11: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_insertStatement1272);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }


                      expr = new UpdateStatement(cf, attrs, columnNames, values);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "insertStatement"


    // $ANTLR start "usingClause"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:292:1: usingClause[Attributes attrs] : K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* ;
    public final void usingClause(Attributes attrs) throws RecognitionException {
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:293:5: ( K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )* )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:293:7: K_USING usingClauseObjective[attrs] ( K_AND usingClauseObjective[attrs] )*
            {
            match(input,K_USING,FOLLOW_K_USING_in_usingClause1302); 
            pushFollow(FOLLOW_usingClauseObjective_in_usingClause1304);
            usingClauseObjective(attrs);

            state._fsp--;

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:293:43: ( K_AND usingClauseObjective[attrs] )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==K_AND) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:293:45: K_AND usingClauseObjective[attrs]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_usingClause1309); 
            	    pushFollow(FOLLOW_usingClauseObjective_in_usingClause1311);
            	    usingClauseObjective(attrs);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClause"


    // $ANTLR start "usingClauseObjective"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:296:1: usingClauseObjective[Attributes attrs] : ( K_TIMESTAMP ts= INTEGER | K_TTL t= INTEGER );
    public final void usingClauseObjective(Attributes attrs) throws RecognitionException {
        Token ts=null;
        Token t=null;

        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:297:5: ( K_TIMESTAMP ts= INTEGER | K_TTL t= INTEGER )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==K_TIMESTAMP) ) {
                alt21=1;
            }
            else if ( (LA21_0==K_TTL) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:297:7: K_TIMESTAMP ts= INTEGER
                    {
                    match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseObjective1333); 
                    ts=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_usingClauseObjective1337); 
                     attrs.timestamp = Long.valueOf((ts!=null?ts.getText():null)); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:298:7: K_TTL t= INTEGER
                    {
                    match(input,K_TTL,FOLLOW_K_TTL_in_usingClauseObjective1347); 
                    t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_usingClauseObjective1351); 
                     attrs.timeToLive = Integer.valueOf((t!=null?t.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClauseObjective"


    // $ANTLR start "updateStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:301:1: updateStatement returns [UpdateStatement expr] : K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause ;
    public final UpdateStatement updateStatement() throws RecognitionException {
        UpdateStatement expr = null;

        CFName cf = null;

        List<Relation> wclause = null;



                Attributes attrs = new Attributes();
                List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations = new ArrayList<Pair<ColumnIdentifier, Operation.RawUpdate>>();
            
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:312:5: ( K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:312:7: K_UPDATE cf= columnFamilyName ( usingClause[attrs] )? K_SET columnOperation[operations] ( ',' columnOperation[operations] )* K_WHERE wclause= whereClause
            {
            match(input,K_UPDATE,FOLLOW_K_UPDATE_in_updateStatement1385); 
            pushFollow(FOLLOW_columnFamilyName_in_updateStatement1389);
            cf=columnFamilyName();

            state._fsp--;

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:313:7: ( usingClause[attrs] )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==K_USING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:313:9: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_updateStatement1399);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }

            match(input,K_SET,FOLLOW_K_SET_in_updateStatement1411); 
            pushFollow(FOLLOW_columnOperation_in_updateStatement1413);
            columnOperation(operations);

            state._fsp--;

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:314:41: ( ',' columnOperation[operations] )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==130) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:314:42: ',' columnOperation[operations]
            	    {
            	    match(input,130,FOLLOW_130_in_updateStatement1417); 
            	    pushFollow(FOLLOW_columnOperation_in_updateStatement1419);
            	    columnOperation(operations);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match(input,K_WHERE,FOLLOW_K_WHERE_in_updateStatement1430); 
            pushFollow(FOLLOW_whereClause_in_updateStatement1434);
            wclause=whereClause();

            state._fsp--;


                      return new UpdateStatement(cf, operations, wclause, attrs);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "updateStatement"


    // $ANTLR start "deleteStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:321:1: deleteStatement returns [DeleteStatement expr] : K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause ;
    public final DeleteStatement deleteStatement() throws RecognitionException {
        DeleteStatement expr = null;

        List<Operation.RawDeletion> dels = null;

        CFName cf = null;

        List<Relation> wclause = null;



                Attributes attrs = new Attributes();
                List<Operation.RawDeletion> columnDeletions = Collections.emptyList();
            
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:332:5: ( K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:332:7: K_DELETE (dels= deleteSelection )? K_FROM cf= columnFamilyName ( usingClauseDelete[attrs] )? K_WHERE wclause= whereClause
            {
            match(input,K_DELETE,FOLLOW_K_DELETE_in_deleteStatement1474); 
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:332:16: (dels= deleteSelection )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==K_COUNT||(LA24_0>=K_FILTERING && LA24_0<=K_TTL)||LA24_0==K_VALUES||LA24_0==K_TIMESTAMP||LA24_0==K_COUNTER||(LA24_0>=K_KEY && LA24_0<=K_CUSTOM)||LA24_0==IDENT||LA24_0==K_TYPE||LA24_0==K_LIST||(LA24_0>=K_ALL && LA24_0<=QUOTED_NAME)||(LA24_0>=K_ASCII && LA24_0<=K_MAP)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:332:18: dels= deleteSelection
                    {
                    pushFollow(FOLLOW_deleteSelection_in_deleteStatement1480);
                    dels=deleteSelection();

                    state._fsp--;

                     columnDeletions = dels; 

                    }
                    break;

            }

            match(input,K_FROM,FOLLOW_K_FROM_in_deleteStatement1493); 
            pushFollow(FOLLOW_columnFamilyName_in_deleteStatement1497);
            cf=columnFamilyName();

            state._fsp--;

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:334:7: ( usingClauseDelete[attrs] )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==K_USING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:334:9: usingClauseDelete[attrs]
                    {
                    pushFollow(FOLLOW_usingClauseDelete_in_deleteStatement1507);
                    usingClauseDelete(attrs);

                    state._fsp--;


                    }
                    break;

            }

            match(input,K_WHERE,FOLLOW_K_WHERE_in_deleteStatement1519); 
            pushFollow(FOLLOW_whereClause_in_deleteStatement1523);
            wclause=whereClause();

            state._fsp--;


                      return new DeleteStatement(cf, columnDeletions, wclause, attrs);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "deleteStatement"


    // $ANTLR start "deleteSelection"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:341:1: deleteSelection returns [List<Operation.RawDeletion> operations] : t1= deleteOp ( ',' tN= deleteOp )* ;
    public final List<Operation.RawDeletion> deleteSelection() throws RecognitionException {
        List<Operation.RawDeletion> operations = null;

        Operation.RawDeletion t1 = null;

        Operation.RawDeletion tN = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:342:5: (t1= deleteOp ( ',' tN= deleteOp )* )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:342:7: t1= deleteOp ( ',' tN= deleteOp )*
            {
             operations = new ArrayList<Operation.RawDeletion>(); 
            pushFollow(FOLLOW_deleteOp_in_deleteSelection1566);
            t1=deleteOp();

            state._fsp--;

             operations.add(t1); 
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:344:11: ( ',' tN= deleteOp )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==130) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:344:12: ',' tN= deleteOp
            	    {
            	    match(input,130,FOLLOW_130_in_deleteSelection1581); 
            	    pushFollow(FOLLOW_deleteOp_in_deleteSelection1585);
            	    tN=deleteOp();

            	    state._fsp--;

            	     operations.add(tN); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return operations;
    }
    // $ANTLR end "deleteSelection"


    // $ANTLR start "deleteOp"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:347:1: deleteOp returns [Operation.RawDeletion op] : (c= cident | c= cident '[' t= term ']' );
    public final Operation.RawDeletion deleteOp() throws RecognitionException {
        Operation.RawDeletion op = null;

        ColumnIdentifier c = null;

        Term.Raw t = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:348:5: (c= cident | c= cident '[' t= term ']' )
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:348:7: c= cident
                    {
                    pushFollow(FOLLOW_cident_in_deleteOp1612);
                    c=cident();

                    state._fsp--;

                     op = new Operation.ColumnDeletion(c); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:349:7: c= cident '[' t= term ']'
                    {
                    pushFollow(FOLLOW_cident_in_deleteOp1639);
                    c=cident();

                    state._fsp--;

                    match(input,132,FOLLOW_132_in_deleteOp1641); 
                    pushFollow(FOLLOW_term_in_deleteOp1645);
                    t=term();

                    state._fsp--;

                    match(input,133,FOLLOW_133_in_deleteOp1647); 
                     op = new Operation.ElementDeletion(c, t); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "deleteOp"


    // $ANTLR start "usingClauseDelete"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:352:1: usingClauseDelete[Attributes attrs] : K_USING K_TIMESTAMP ts= INTEGER ;
    public final void usingClauseDelete(Attributes attrs) throws RecognitionException {
        Token ts=null;

        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:353:5: ( K_USING K_TIMESTAMP ts= INTEGER )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:353:7: K_USING K_TIMESTAMP ts= INTEGER
            {
            match(input,K_USING,FOLLOW_K_USING_in_usingClauseDelete1667); 
            match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_usingClauseDelete1669); 
            ts=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_usingClauseDelete1673); 
             attrs.timestamp = Long.valueOf((ts!=null?ts.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "usingClauseDelete"


    // $ANTLR start "batchStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:356:1: batchStatement returns [BatchStatement expr] : K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )+ K_APPLY K_BATCH ;
    public final BatchStatement batchStatement() throws RecognitionException {
        BatchStatement expr = null;

        ModificationStatement s = null;



                BatchStatement.Type type = BatchStatement.Type.LOGGED;
                List<ModificationStatement> statements = new ArrayList<ModificationStatement>();
                Attributes attrs = new Attributes();
            
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:386:5: ( K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )+ K_APPLY K_BATCH )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:386:7: K_BEGIN ( K_UNLOGGED | K_COUNTER )? K_BATCH ( usingClause[attrs] )? (s= batchStatementObjective ( ';' )? )+ K_APPLY K_BATCH
            {
            match(input,K_BEGIN,FOLLOW_K_BEGIN_in_batchStatement1707); 
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:387:7: ( K_UNLOGGED | K_COUNTER )?
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==K_UNLOGGED) ) {
                alt28=1;
            }
            else if ( (LA28_0==K_COUNTER) ) {
                alt28=2;
            }
            switch (alt28) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:387:9: K_UNLOGGED
                    {
                    match(input,K_UNLOGGED,FOLLOW_K_UNLOGGED_in_batchStatement1717); 
                     type = BatchStatement.Type.UNLOGGED; 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:387:63: K_COUNTER
                    {
                    match(input,K_COUNTER,FOLLOW_K_COUNTER_in_batchStatement1723); 
                     type = BatchStatement.Type.COUNTER; 

                    }
                    break;

            }

            match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement1736); 
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:388:15: ( usingClause[attrs] )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==K_USING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:388:17: usingClause[attrs]
                    {
                    pushFollow(FOLLOW_usingClause_in_batchStatement1740);
                    usingClause(attrs);

                    state._fsp--;


                    }
                    break;

            }

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:389:11: (s= batchStatementObjective ( ';' )? )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==K_INSERT||LA31_0==K_UPDATE||LA31_0==K_DELETE) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:389:13: s= batchStatementObjective ( ';' )?
            	    {
            	    pushFollow(FOLLOW_batchStatementObjective_in_batchStatement1760);
            	    s=batchStatementObjective();

            	    state._fsp--;

            	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:389:39: ( ';' )?
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( (LA30_0==127) ) {
            	        alt30=1;
            	    }
            	    switch (alt30) {
            	        case 1 :
            	            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:389:39: ';'
            	            {
            	            match(input,127,FOLLOW_127_in_batchStatement1762); 

            	            }
            	            break;

            	    }

            	     statements.add(s); 

            	    }
            	    break;

            	default :
            	    if ( cnt31 >= 1 ) break loop31;
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
            } while (true);

            match(input,K_APPLY,FOLLOW_K_APPLY_in_batchStatement1776); 
            match(input,K_BATCH,FOLLOW_K_BATCH_in_batchStatement1778); 

                      return new BatchStatement(type, statements, attrs);
                  

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "batchStatement"


    // $ANTLR start "batchStatementObjective"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:396:1: batchStatementObjective returns [ModificationStatement statement] : (i= insertStatement | u= updateStatement | d= deleteStatement );
    public final ModificationStatement batchStatementObjective() throws RecognitionException {
        ModificationStatement statement = null;

        UpdateStatement i = null;

        UpdateStatement u = null;

        DeleteStatement d = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:397:5: (i= insertStatement | u= updateStatement | d= deleteStatement )
            int alt32=3;
            switch ( input.LA(1) ) {
            case K_INSERT:
                {
                alt32=1;
                }
                break;
            case K_UPDATE:
                {
                alt32=2;
                }
                break;
            case K_DELETE:
                {
                alt32=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:397:7: i= insertStatement
                    {
                    pushFollow(FOLLOW_insertStatement_in_batchStatementObjective1809);
                    i=insertStatement();

                    state._fsp--;

                     statement = i; 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:398:7: u= updateStatement
                    {
                    pushFollow(FOLLOW_updateStatement_in_batchStatementObjective1822);
                    u=updateStatement();

                    state._fsp--;

                     statement = u; 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:399:7: d= deleteStatement
                    {
                    pushFollow(FOLLOW_deleteStatement_in_batchStatementObjective1835);
                    d=deleteStatement();

                    state._fsp--;

                     statement = d; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return statement;
    }
    // $ANTLR end "batchStatementObjective"


    // $ANTLR start "createKeyspaceStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:402:1: createKeyspaceStatement returns [CreateKeyspaceStatement expr] : K_CREATE K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] ;
    public final CreateKeyspaceStatement createKeyspaceStatement() throws RecognitionException {
        CreateKeyspaceStatement expr = null;

        String ks = null;


         KSPropDefs attrs = new KSPropDefs(); 
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:407:5: ( K_CREATE K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:407:7: K_CREATE K_KEYSPACE ks= keyspaceName K_WITH properties[attrs]
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createKeyspaceStatement1870); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_createKeyspaceStatement1872); 
            pushFollow(FOLLOW_keyspaceName_in_createKeyspaceStatement1876);
            ks=keyspaceName();

            state._fsp--;

            match(input,K_WITH,FOLLOW_K_WITH_in_createKeyspaceStatement1884); 
            pushFollow(FOLLOW_properties_in_createKeyspaceStatement1886);
            properties(attrs);

            state._fsp--;

             expr = new CreateKeyspaceStatement(ks, attrs); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createKeyspaceStatement"


    // $ANTLR start "createColumnFamilyStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:411:1: createColumnFamilyStatement returns [CreateColumnFamilyStatement.RawStatement expr] : K_CREATE K_COLUMNFAMILY cf= columnFamilyName cfamDefinition[expr] ;
    public final CreateColumnFamilyStatement.RawStatement createColumnFamilyStatement() throws RecognitionException {
        CreateColumnFamilyStatement.RawStatement expr = null;

        CFName cf = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:419:5: ( K_CREATE K_COLUMNFAMILY cf= columnFamilyName cfamDefinition[expr] )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:419:7: K_CREATE K_COLUMNFAMILY cf= columnFamilyName cfamDefinition[expr]
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createColumnFamilyStatement1912); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_createColumnFamilyStatement1914); 
            pushFollow(FOLLOW_columnFamilyName_in_createColumnFamilyStatement1918);
            cf=columnFamilyName();

            state._fsp--;

             expr = new CreateColumnFamilyStatement.RawStatement(cf); 
            pushFollow(FOLLOW_cfamDefinition_in_createColumnFamilyStatement1928);
            cfamDefinition(expr);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createColumnFamilyStatement"


    // $ANTLR start "cfamDefinition"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:423:1: cfamDefinition[CreateColumnFamilyStatement.RawStatement expr] : '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )? ;
    public final void cfamDefinition(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:424:5: ( '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )? )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:424:7: '(' cfamColumns[expr] ( ',' ( cfamColumns[expr] )? )* ')' ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )?
            {
            match(input,128,FOLLOW_128_in_cfamDefinition1947); 
            pushFollow(FOLLOW_cfamColumns_in_cfamDefinition1949);
            cfamColumns(expr);

            state._fsp--;

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:424:29: ( ',' ( cfamColumns[expr] )? )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==130) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:424:31: ',' ( cfamColumns[expr] )?
            	    {
            	    match(input,130,FOLLOW_130_in_cfamDefinition1954); 
            	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:424:35: ( cfamColumns[expr] )?
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==K_COUNT||(LA33_0>=K_FILTERING && LA33_0<=K_TTL)||LA33_0==K_VALUES||LA33_0==K_TIMESTAMP||LA33_0==K_COUNTER||(LA33_0>=K_PRIMARY && LA33_0<=K_CUSTOM)||LA33_0==IDENT||LA33_0==K_TYPE||LA33_0==K_LIST||(LA33_0>=K_ALL && LA33_0<=QUOTED_NAME)||(LA33_0>=K_ASCII && LA33_0<=K_MAP)) ) {
            	        alt33=1;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:424:35: cfamColumns[expr]
            	            {
            	            pushFollow(FOLLOW_cfamColumns_in_cfamDefinition1956);
            	            cfamColumns(expr);

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            match(input,129,FOLLOW_129_in_cfamDefinition1963); 
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:425:7: ( K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )* )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==K_WITH) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:425:9: K_WITH cfamProperty[expr] ( K_AND cfamProperty[expr] )*
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_cfamDefinition1973); 
                    pushFollow(FOLLOW_cfamProperty_in_cfamDefinition1975);
                    cfamProperty(expr);

                    state._fsp--;

                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:425:35: ( K_AND cfamProperty[expr] )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==K_AND) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:425:37: K_AND cfamProperty[expr]
                    	    {
                    	    match(input,K_AND,FOLLOW_K_AND_in_cfamDefinition1980); 
                    	    pushFollow(FOLLOW_cfamProperty_in_cfamDefinition1982);
                    	    cfamProperty(expr);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamDefinition"


    // $ANTLR start "cfamColumns"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:428:1: cfamColumns[CreateColumnFamilyStatement.RawStatement expr] : (k= cident v= comparatorType ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= cident )* ')' );
    public final void cfamColumns(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;

        CQL3Type v = null;

        ColumnIdentifier c = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:429:5: (k= cident v= comparatorType ( K_PRIMARY K_KEY )? | K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= cident )* ')' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==K_COUNT||(LA39_0>=K_FILTERING && LA39_0<=K_TTL)||LA39_0==K_VALUES||LA39_0==K_TIMESTAMP||LA39_0==K_COUNTER||(LA39_0>=K_KEY && LA39_0<=K_CUSTOM)||LA39_0==IDENT||LA39_0==K_TYPE||LA39_0==K_LIST||(LA39_0>=K_ALL && LA39_0<=QUOTED_NAME)||(LA39_0>=K_ASCII && LA39_0<=K_MAP)) ) {
                alt39=1;
            }
            else if ( (LA39_0==K_PRIMARY) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:429:7: k= cident v= comparatorType ( K_PRIMARY K_KEY )?
                    {
                    pushFollow(FOLLOW_cident_in_cfamColumns2008);
                    k=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_comparatorType_in_cfamColumns2012);
                    v=comparatorType();

                    state._fsp--;

                     expr.addDefinition(k, v); 
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:429:64: ( K_PRIMARY K_KEY )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==K_PRIMARY) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:429:65: K_PRIMARY K_KEY
                            {
                            match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns2017); 
                            match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns2019); 
                             expr.addKeyAliases(Collections.singletonList(k)); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:430:7: K_PRIMARY K_KEY '(' pkDef[expr] ( ',' c= cident )* ')'
                    {
                    match(input,K_PRIMARY,FOLLOW_K_PRIMARY_in_cfamColumns2031); 
                    match(input,K_KEY,FOLLOW_K_KEY_in_cfamColumns2033); 
                    match(input,128,FOLLOW_128_in_cfamColumns2035); 
                    pushFollow(FOLLOW_pkDef_in_cfamColumns2037);
                    pkDef(expr);

                    state._fsp--;

                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:430:39: ( ',' c= cident )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==130) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:430:40: ',' c= cident
                    	    {
                    	    match(input,130,FOLLOW_130_in_cfamColumns2041); 
                    	    pushFollow(FOLLOW_cident_in_cfamColumns2045);
                    	    c=cident();

                    	    state._fsp--;

                    	     expr.addColumnAlias(c); 

                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);

                    match(input,129,FOLLOW_129_in_cfamColumns2052); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamColumns"


    // $ANTLR start "pkDef"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:433:1: pkDef[CreateColumnFamilyStatement.RawStatement expr] : (k= cident | '(' k1= cident ( ',' kn= cident )* ')' );
    public final void pkDef(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;

        ColumnIdentifier k1 = null;

        ColumnIdentifier kn = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:434:5: (k= cident | '(' k1= cident ( ',' kn= cident )* ')' )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==K_COUNT||(LA41_0>=K_FILTERING && LA41_0<=K_TTL)||LA41_0==K_VALUES||LA41_0==K_TIMESTAMP||LA41_0==K_COUNTER||(LA41_0>=K_KEY && LA41_0<=K_CUSTOM)||LA41_0==IDENT||LA41_0==K_TYPE||LA41_0==K_LIST||(LA41_0>=K_ALL && LA41_0<=QUOTED_NAME)||(LA41_0>=K_ASCII && LA41_0<=K_MAP)) ) {
                alt41=1;
            }
            else if ( (LA41_0==128) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:434:7: k= cident
                    {
                    pushFollow(FOLLOW_cident_in_pkDef2072);
                    k=cident();

                    state._fsp--;

                     expr.addKeyAliases(Collections.singletonList(k)); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:435:7: '(' k1= cident ( ',' kn= cident )* ')'
                    {
                    match(input,128,FOLLOW_128_in_pkDef2082); 
                     List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>(); 
                    pushFollow(FOLLOW_cident_in_pkDef2088);
                    k1=cident();

                    state._fsp--;

                     l.add(k1); 
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:435:102: ( ',' kn= cident )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==130) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:435:104: ',' kn= cident
                    	    {
                    	    match(input,130,FOLLOW_130_in_pkDef2094); 
                    	    pushFollow(FOLLOW_cident_in_pkDef2098);
                    	    kn=cident();

                    	    state._fsp--;

                    	     l.add(kn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);

                    match(input,129,FOLLOW_129_in_pkDef2105); 
                     expr.addKeyAliases(l); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "pkDef"


    // $ANTLR start "cfamProperty"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:438:1: cfamProperty[CreateColumnFamilyStatement.RawStatement expr] : ( property[expr.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')' );
    public final void cfamProperty(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:439:5: ( property[expr.properties] | K_COMPACT K_STORAGE | K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')' )
            int alt43=3;
            switch ( input.LA(1) ) {
            case K_COUNT:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_KEY:
            case K_STORAGE:
            case K_CUSTOM:
            case IDENT:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case QUOTED_NAME:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt43=1;
                }
                break;
            case K_COMPACT:
                {
                int LA43_2 = input.LA(2);

                if ( (LA43_2==K_STORAGE) ) {
                    alt43=2;
                }
                else if ( (LA43_2==138) ) {
                    alt43=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 2, input);

                    throw nvae;
                }
                }
                break;
            case K_CLUSTERING:
                {
                int LA43_3 = input.LA(2);

                if ( (LA43_3==K_ORDER) ) {
                    alt43=3;
                }
                else if ( (LA43_3==138) ) {
                    alt43=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 43, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:439:7: property[expr.properties]
                    {
                    pushFollow(FOLLOW_property_in_cfamProperty2125);
                    property(expr.properties);

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:440:7: K_COMPACT K_STORAGE
                    {
                    match(input,K_COMPACT,FOLLOW_K_COMPACT_in_cfamProperty2134); 
                    match(input,K_STORAGE,FOLLOW_K_STORAGE_in_cfamProperty2136); 
                     expr.setCompactStorage(); 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:441:7: K_CLUSTERING K_ORDER K_BY '(' cfamOrdering[expr] ( ',' cfamOrdering[expr] )* ')'
                    {
                    match(input,K_CLUSTERING,FOLLOW_K_CLUSTERING_in_cfamProperty2146); 
                    match(input,K_ORDER,FOLLOW_K_ORDER_in_cfamProperty2148); 
                    match(input,K_BY,FOLLOW_K_BY_in_cfamProperty2150); 
                    match(input,128,FOLLOW_128_in_cfamProperty2152); 
                    pushFollow(FOLLOW_cfamOrdering_in_cfamProperty2154);
                    cfamOrdering(expr);

                    state._fsp--;

                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:441:56: ( ',' cfamOrdering[expr] )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==130) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:441:57: ',' cfamOrdering[expr]
                    	    {
                    	    match(input,130,FOLLOW_130_in_cfamProperty2158); 
                    	    pushFollow(FOLLOW_cfamOrdering_in_cfamProperty2160);
                    	    cfamOrdering(expr);

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    match(input,129,FOLLOW_129_in_cfamProperty2165); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamProperty"


    // $ANTLR start "cfamOrdering"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:444:1: cfamOrdering[CreateColumnFamilyStatement.RawStatement expr] : k= cident ( K_ASC | K_DESC ) ;
    public final void cfamOrdering(CreateColumnFamilyStatement.RawStatement expr) throws RecognitionException {
        ColumnIdentifier k = null;


         boolean reversed=false; 
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:446:5: (k= cident ( K_ASC | K_DESC ) )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:446:7: k= cident ( K_ASC | K_DESC )
            {
            pushFollow(FOLLOW_cident_in_cfamOrdering2193);
            k=cident();

            state._fsp--;

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:446:16: ( K_ASC | K_DESC )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==K_ASC) ) {
                alt44=1;
            }
            else if ( (LA44_0==K_DESC) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:446:17: K_ASC
                    {
                    match(input,K_ASC,FOLLOW_K_ASC_in_cfamOrdering2196); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:446:25: K_DESC
                    {
                    match(input,K_DESC,FOLLOW_K_DESC_in_cfamOrdering2200); 
                     reversed=true;

                    }
                    break;

            }

             expr.setOrdering(k, reversed); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfamOrdering"


    // $ANTLR start "createIndexStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:449:1: createIndexStatement returns [CreateIndexStatement expr] : K_CREATE ( K_CUSTOM )? K_INDEX (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')' ( K_USING cls= STRING_LITERAL )? ;
    public final CreateIndexStatement createIndexStatement() throws RecognitionException {
        CreateIndexStatement expr = null;

        Token idxName=null;
        Token cls=null;
        CFName cf = null;

        ColumnIdentifier id = null;



                boolean isCustom = false;
            
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:457:5: ( K_CREATE ( K_CUSTOM )? K_INDEX (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')' ( K_USING cls= STRING_LITERAL )? )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:457:7: K_CREATE ( K_CUSTOM )? K_INDEX (idxName= IDENT )? K_ON cf= columnFamilyName '(' id= cident ')' ( K_USING cls= STRING_LITERAL )?
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createIndexStatement2238); 
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:457:16: ( K_CUSTOM )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==K_CUSTOM) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:457:17: K_CUSTOM
                    {
                    match(input,K_CUSTOM,FOLLOW_K_CUSTOM_in_createIndexStatement2241); 
                     isCustom = true; 

                    }
                    break;

            }

            match(input,K_INDEX,FOLLOW_K_INDEX_in_createIndexStatement2247); 
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:457:57: (idxName= IDENT )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==IDENT) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:457:58: idxName= IDENT
                    {
                    idxName=(Token)match(input,IDENT,FOLLOW_IDENT_in_createIndexStatement2252); 

                    }
                    break;

            }

            match(input,K_ON,FOLLOW_K_ON_in_createIndexStatement2256); 
            pushFollow(FOLLOW_columnFamilyName_in_createIndexStatement2260);
            cf=columnFamilyName();

            state._fsp--;

            match(input,128,FOLLOW_128_in_createIndexStatement2262); 
            pushFollow(FOLLOW_cident_in_createIndexStatement2266);
            id=cident();

            state._fsp--;

            match(input,129,FOLLOW_129_in_createIndexStatement2268); 
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:458:9: ( K_USING cls= STRING_LITERAL )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==K_USING) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:458:11: K_USING cls= STRING_LITERAL
                    {
                    match(input,K_USING,FOLLOW_K_USING_in_createIndexStatement2280); 
                    cls=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_createIndexStatement2284); 

                    }
                    break;

            }

             expr = new CreateIndexStatement(cf, (idxName!=null?idxName.getText():null), id, isCustom, (cls!=null?cls.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "createIndexStatement"


    // $ANTLR start "alterKeyspaceStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:462:1: alterKeyspaceStatement returns [AlterKeyspaceStatement expr] : K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] ;
    public final AlterKeyspaceStatement alterKeyspaceStatement() throws RecognitionException {
        AlterKeyspaceStatement expr = null;

        String ks = null;


         KSPropDefs attrs = new KSPropDefs(); 
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:467:5: ( K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs] )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:467:7: K_ALTER K_KEYSPACE ks= keyspaceName K_WITH properties[attrs]
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterKeyspaceStatement2327); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement2329); 
            pushFollow(FOLLOW_keyspaceName_in_alterKeyspaceStatement2333);
            ks=keyspaceName();

            state._fsp--;

            match(input,K_WITH,FOLLOW_K_WITH_in_alterKeyspaceStatement2343); 
            pushFollow(FOLLOW_properties_in_alterKeyspaceStatement2345);
            properties(attrs);

            state._fsp--;

             expr = new AlterKeyspaceStatement(ks, attrs); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "alterKeyspaceStatement"


    // $ANTLR start "alterTableStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:472:1: alterTableStatement returns [AlterTableStatement expr] : K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) ;
    public final AlterTableStatement alterTableStatement() throws RecognitionException {
        AlterTableStatement expr = null;

        CFName cf = null;

        ColumnIdentifier id = null;

        CQL3Type v = null;

        ColumnIdentifier id1 = null;

        ColumnIdentifier toId1 = null;

        ColumnIdentifier idn = null;

        ColumnIdentifier toIdn = null;



                AlterTableStatement.Type type = null;
                CFPropDefs props = new CFPropDefs();
                Map<ColumnIdentifier, ColumnIdentifier> renames = new HashMap<ColumnIdentifier, ColumnIdentifier>();
            
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:485:5: ( K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* ) )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:485:7: K_ALTER K_COLUMNFAMILY cf= columnFamilyName ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement2381); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_alterTableStatement2383); 
            pushFollow(FOLLOW_columnFamilyName_in_alterTableStatement2387);
            cf=columnFamilyName();

            state._fsp--;

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:486:11: ( K_ALTER id= cident K_TYPE v= comparatorType | K_ADD id= cident v= comparatorType | K_WITH properties[props] | K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )* )
            int alt49=4;
            switch ( input.LA(1) ) {
            case K_ALTER:
                {
                alt49=1;
                }
                break;
            case K_ADD:
                {
                alt49=2;
                }
                break;
            case K_WITH:
                {
                alt49=3;
                }
                break;
            case K_RENAME:
                {
                alt49=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:486:13: K_ALTER id= cident K_TYPE v= comparatorType
                    {
                    match(input,K_ALTER,FOLLOW_K_ALTER_in_alterTableStatement2401); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2405);
                    id=cident();

                    state._fsp--;

                    match(input,K_TYPE,FOLLOW_K_TYPE_in_alterTableStatement2407); 
                    pushFollow(FOLLOW_comparatorType_in_alterTableStatement2411);
                    v=comparatorType();

                    state._fsp--;

                     type = AlterTableStatement.Type.ALTER; 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:487:13: K_ADD id= cident v= comparatorType
                    {
                    match(input,K_ADD,FOLLOW_K_ADD_in_alterTableStatement2427); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2433);
                    id=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_comparatorType_in_alterTableStatement2437);
                    v=comparatorType();

                    state._fsp--;

                     type = AlterTableStatement.Type.ADD; 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:489:13: K_WITH properties[props]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_alterTableStatement2471); 
                    pushFollow(FOLLOW_properties_in_alterTableStatement2474);
                    properties(props);

                    state._fsp--;

                     type = AlterTableStatement.Type.OPTS; 

                    }
                    break;
                case 4 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:490:13: K_RENAME id1= cident K_TO toId1= cident ( K_AND idn= cident K_TO toIdn= cident )*
                    {
                    match(input,K_RENAME,FOLLOW_K_RENAME_in_alterTableStatement2507); 
                     type = AlterTableStatement.Type.RENAME; 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2561);
                    id1=cident();

                    state._fsp--;

                    match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement2563); 
                    pushFollow(FOLLOW_cident_in_alterTableStatement2567);
                    toId1=cident();

                    state._fsp--;

                     renames.put(id1, toId1); 
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:492:16: ( K_AND idn= cident K_TO toIdn= cident )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==K_AND) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:492:18: K_AND idn= cident K_TO toIdn= cident
                    	    {
                    	    match(input,K_AND,FOLLOW_K_AND_in_alterTableStatement2588); 
                    	    pushFollow(FOLLOW_cident_in_alterTableStatement2592);
                    	    idn=cident();

                    	    state._fsp--;

                    	    match(input,K_TO,FOLLOW_K_TO_in_alterTableStatement2594); 
                    	    pushFollow(FOLLOW_cident_in_alterTableStatement2598);
                    	    toIdn=cident();

                    	    state._fsp--;

                    	     renames.put(idn, toIdn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }


                    expr = new AlterTableStatement(cf, type, id, v, props, renames);
                

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "alterTableStatement"


    // $ANTLR start "dropKeyspaceStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:499:1: dropKeyspaceStatement returns [DropKeyspaceStatement ksp] : K_DROP K_KEYSPACE ks= keyspaceName ;
    public final DropKeyspaceStatement dropKeyspaceStatement() throws RecognitionException {
        DropKeyspaceStatement ksp = null;

        String ks = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:503:5: ( K_DROP K_KEYSPACE ks= keyspaceName )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:503:7: K_DROP K_KEYSPACE ks= keyspaceName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropKeyspaceStatement2644); 
            match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement2646); 
            pushFollow(FOLLOW_keyspaceName_in_dropKeyspaceStatement2650);
            ks=keyspaceName();

            state._fsp--;

             ksp = new DropKeyspaceStatement(ks); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ksp;
    }
    // $ANTLR end "dropKeyspaceStatement"


    // $ANTLR start "dropColumnFamilyStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:506:1: dropColumnFamilyStatement returns [DropColumnFamilyStatement stmt] : K_DROP K_COLUMNFAMILY cf= columnFamilyName ;
    public final DropColumnFamilyStatement dropColumnFamilyStatement() throws RecognitionException {
        DropColumnFamilyStatement stmt = null;

        CFName cf = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:510:5: ( K_DROP K_COLUMNFAMILY cf= columnFamilyName )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:510:7: K_DROP K_COLUMNFAMILY cf= columnFamilyName
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropColumnFamilyStatement2675); 
            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dropColumnFamilyStatement2677); 
            pushFollow(FOLLOW_columnFamilyName_in_dropColumnFamilyStatement2681);
            cf=columnFamilyName();

            state._fsp--;

             stmt = new DropColumnFamilyStatement(cf); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "dropColumnFamilyStatement"


    // $ANTLR start "dropIndexStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:513:1: dropIndexStatement returns [DropIndexStatement expr] : K_DROP K_INDEX index= IDENT ;
    public final DropIndexStatement dropIndexStatement() throws RecognitionException {
        DropIndexStatement expr = null;

        Token index=null;

        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:517:5: ( K_DROP K_INDEX index= IDENT )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:518:7: K_DROP K_INDEX index= IDENT
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropIndexStatement2712); 
            match(input,K_INDEX,FOLLOW_K_INDEX_in_dropIndexStatement2714); 
            index=(Token)match(input,IDENT,FOLLOW_IDENT_in_dropIndexStatement2718); 
             expr = new DropIndexStatement((index!=null?index.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return expr;
    }
    // $ANTLR end "dropIndexStatement"


    // $ANTLR start "truncateStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:522:1: truncateStatement returns [TruncateStatement stmt] : K_TRUNCATE cf= columnFamilyName ;
    public final TruncateStatement truncateStatement() throws RecognitionException {
        TruncateStatement stmt = null;

        CFName cf = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:526:5: ( K_TRUNCATE cf= columnFamilyName )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:526:7: K_TRUNCATE cf= columnFamilyName
            {
            match(input,K_TRUNCATE,FOLLOW_K_TRUNCATE_in_truncateStatement2749); 
            pushFollow(FOLLOW_columnFamilyName_in_truncateStatement2753);
            cf=columnFamilyName();

            state._fsp--;

             stmt = new TruncateStatement(cf); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "truncateStatement"


    // $ANTLR start "grantStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:529:1: grantStatement returns [GrantStatement stmt] : K_GRANT permissionOrAll K_ON resource K_TO username ;
    public final GrantStatement grantStatement() throws RecognitionException {
        GrantStatement stmt = null;

        Set<Permission> permissionOrAll1 = null;

        IResource resource2 = null;

        CqlParser.username_return username3 = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:533:5: ( K_GRANT permissionOrAll K_ON resource K_TO username )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:533:7: K_GRANT permissionOrAll K_ON resource K_TO username
            {
            match(input,K_GRANT,FOLLOW_K_GRANT_in_grantStatement2778); 
            pushFollow(FOLLOW_permissionOrAll_in_grantStatement2790);
            permissionOrAll1=permissionOrAll();

            state._fsp--;

            match(input,K_ON,FOLLOW_K_ON_in_grantStatement2798); 
            pushFollow(FOLLOW_resource_in_grantStatement2810);
            resource2=resource();

            state._fsp--;

            match(input,K_TO,FOLLOW_K_TO_in_grantStatement2818); 
            pushFollow(FOLLOW_username_in_grantStatement2830);
            username3=username();

            state._fsp--;

             stmt = new GrantStatement(permissionOrAll1, resource2, (username3!=null?input.toString(username3.start,username3.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "grantStatement"


    // $ANTLR start "revokeStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:542:1: revokeStatement returns [RevokeStatement stmt] : K_REVOKE permissionOrAll K_ON resource K_FROM username ;
    public final RevokeStatement revokeStatement() throws RecognitionException {
        RevokeStatement stmt = null;

        Set<Permission> permissionOrAll4 = null;

        IResource resource5 = null;

        CqlParser.username_return username6 = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:546:5: ( K_REVOKE permissionOrAll K_ON resource K_FROM username )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:546:7: K_REVOKE permissionOrAll K_ON resource K_FROM username
            {
            match(input,K_REVOKE,FOLLOW_K_REVOKE_in_revokeStatement2861); 
            pushFollow(FOLLOW_permissionOrAll_in_revokeStatement2873);
            permissionOrAll4=permissionOrAll();

            state._fsp--;

            match(input,K_ON,FOLLOW_K_ON_in_revokeStatement2881); 
            pushFollow(FOLLOW_resource_in_revokeStatement2893);
            resource5=resource();

            state._fsp--;

            match(input,K_FROM,FOLLOW_K_FROM_in_revokeStatement2901); 
            pushFollow(FOLLOW_username_in_revokeStatement2913);
            username6=username();

            state._fsp--;

             stmt = new RevokeStatement(permissionOrAll4, resource5, (username6!=null?input.toString(username6.start,username6.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "revokeStatement"


    // $ANTLR start "listPermissionsStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:555:1: listPermissionsStatement returns [ListPermissionsStatement stmt] : K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )? ;
    public final ListPermissionsStatement listPermissionsStatement() throws RecognitionException {
        ListPermissionsStatement stmt = null;

        IResource resource7 = null;

        CqlParser.username_return username8 = null;

        Set<Permission> permissionOrAll9 = null;



                IResource resource = null;
                String username = null;
                boolean recursive = true;
            
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:561:5: ( K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )? )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:561:7: K_LIST permissionOrAll ( K_ON resource )? ( K_OF username )? ( K_NORECURSIVE )?
            {
            match(input,K_LIST,FOLLOW_K_LIST_in_listPermissionsStatement2951); 
            pushFollow(FOLLOW_permissionOrAll_in_listPermissionsStatement2963);
            permissionOrAll9=permissionOrAll();

            state._fsp--;

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:563:7: ( K_ON resource )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==K_ON) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:563:9: K_ON resource
                    {
                    match(input,K_ON,FOLLOW_K_ON_in_listPermissionsStatement2973); 
                    pushFollow(FOLLOW_resource_in_listPermissionsStatement2975);
                    resource7=resource();

                    state._fsp--;

                     resource = resource7; 

                    }
                    break;

            }

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:564:7: ( K_OF username )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==K_OF) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:564:9: K_OF username
                    {
                    match(input,K_OF,FOLLOW_K_OF_in_listPermissionsStatement2990); 
                    pushFollow(FOLLOW_username_in_listPermissionsStatement2992);
                    username8=username();

                    state._fsp--;

                     username = (username8!=null?input.toString(username8.start,username8.stop):null); 

                    }
                    break;

            }

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:565:7: ( K_NORECURSIVE )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==K_NORECURSIVE) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:565:9: K_NORECURSIVE
                    {
                    match(input,K_NORECURSIVE,FOLLOW_K_NORECURSIVE_in_listPermissionsStatement3007); 
                     recursive = false; 

                    }
                    break;

            }

             stmt = new ListPermissionsStatement(permissionOrAll9, resource, username, recursive); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "listPermissionsStatement"


    // $ANTLR start "permission"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:569:1: permission returns [Permission perm] : p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE ) ;
    public final Permission permission() throws RecognitionException {
        Permission perm = null;

        Token p=null;

        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:570:5: (p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE ) )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:570:7: p= ( K_CREATE | K_ALTER | K_DROP | K_SELECT | K_MODIFY | K_AUTHORIZE )
            {
            p=(Token)input.LT(1);
            if ( input.LA(1)==K_SELECT||input.LA(1)==K_CREATE||input.LA(1)==K_ALTER||input.LA(1)==K_DROP||(input.LA(1)>=K_MODIFY && input.LA(1)<=K_AUTHORIZE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

             perm = Permission.valueOf((p!=null?p.getText():null).toUpperCase()); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return perm;
    }
    // $ANTLR end "permission"


    // $ANTLR start "permissionOrAll"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:574:1: permissionOrAll returns [Set<Permission> perms] : ( K_ALL ( K_PERMISSIONS )? | p= permission ( K_PERMISSION )? );
    public final Set<Permission> permissionOrAll() throws RecognitionException {
        Set<Permission> perms = null;

        Permission p = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:575:5: ( K_ALL ( K_PERMISSIONS )? | p= permission ( K_PERMISSION )? )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==K_ALL) ) {
                alt55=1;
            }
            else if ( (LA55_0==K_SELECT||LA55_0==K_CREATE||LA55_0==K_ALTER||LA55_0==K_DROP||(LA55_0>=K_MODIFY && LA55_0<=K_AUTHORIZE)) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:575:7: K_ALL ( K_PERMISSIONS )?
                    {
                    match(input,K_ALL,FOLLOW_K_ALL_in_permissionOrAll3092); 
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:575:13: ( K_PERMISSIONS )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==K_PERMISSIONS) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:575:15: K_PERMISSIONS
                            {
                            match(input,K_PERMISSIONS,FOLLOW_K_PERMISSIONS_in_permissionOrAll3096); 

                            }
                            break;

                    }

                     perms = Permission.ALL_DATA; 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:576:7: p= permission ( K_PERMISSION )?
                    {
                    pushFollow(FOLLOW_permission_in_permissionOrAll3117);
                    p=permission();

                    state._fsp--;

                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:576:20: ( K_PERMISSION )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==K_PERMISSION) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:576:22: K_PERMISSION
                            {
                            match(input,K_PERMISSION,FOLLOW_K_PERMISSION_in_permissionOrAll3121); 

                            }
                            break;

                    }

                     perms = EnumSet.of(p); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return perms;
    }
    // $ANTLR end "permissionOrAll"


    // $ANTLR start "resource"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:579:1: resource returns [IResource res] : r= dataResource ;
    public final IResource resource() throws RecognitionException {
        IResource res = null;

        DataResource r = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:580:5: (r= dataResource )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:580:7: r= dataResource
            {
            pushFollow(FOLLOW_dataResource_in_resource3149);
            r=dataResource();

            state._fsp--;

             res = r; 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return res;
    }
    // $ANTLR end "resource"


    // $ANTLR start "dataResource"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:583:1: dataResource returns [DataResource res] : ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName );
    public final DataResource dataResource() throws RecognitionException {
        DataResource res = null;

        String ks = null;

        CFName cf = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:584:5: ( K_ALL K_KEYSPACES | K_KEYSPACE ks= keyspaceName | ( K_COLUMNFAMILY )? cf= columnFamilyName )
            int alt57=3;
            switch ( input.LA(1) ) {
            case K_ALL:
                {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==K_KEYSPACES) ) {
                    alt57=1;
                }
                else if ( (LA57_1==EOF||LA57_1==K_FROM||LA57_1==K_TO||(LA57_1>=K_OF && LA57_1<=K_NORECURSIVE)||LA57_1==127||LA57_1==134) ) {
                    alt57=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
                }
                break;
            case K_KEYSPACE:
                {
                alt57=2;
                }
                break;
            case K_COUNT:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_COLUMNFAMILY:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case IDENT:
            case K_TYPE:
            case K_LIST:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case QUOTED_NAME:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:584:7: K_ALL K_KEYSPACES
                    {
                    match(input,K_ALL,FOLLOW_K_ALL_in_dataResource3172); 
                    match(input,K_KEYSPACES,FOLLOW_K_KEYSPACES_in_dataResource3174); 
                     res = DataResource.root(); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:585:7: K_KEYSPACE ks= keyspaceName
                    {
                    match(input,K_KEYSPACE,FOLLOW_K_KEYSPACE_in_dataResource3184); 
                    pushFollow(FOLLOW_keyspaceName_in_dataResource3190);
                    ks=keyspaceName();

                    state._fsp--;

                     res = DataResource.keyspace(ks); 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:586:7: ( K_COLUMNFAMILY )? cf= columnFamilyName
                    {
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:586:7: ( K_COLUMNFAMILY )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==K_COLUMNFAMILY) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:586:9: K_COLUMNFAMILY
                            {
                            match(input,K_COLUMNFAMILY,FOLLOW_K_COLUMNFAMILY_in_dataResource3202); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_columnFamilyName_in_dataResource3211);
                    cf=columnFamilyName();

                    state._fsp--;

                     res = DataResource.columnFamily(cf.getKeyspace(), cf.getColumnFamily()); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return res;
    }
    // $ANTLR end "dataResource"


    // $ANTLR start "createUserStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:590:1: createUserStatement returns [CreateUserStatement stmt] : K_CREATE K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
    public final CreateUserStatement createUserStatement() throws RecognitionException {
        CreateUserStatement stmt = null;

        CqlParser.username_return username10 = null;



                UserOptions opts = new UserOptions();
                boolean superuser = false;
            
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:598:5: ( K_CREATE K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:598:7: K_CREATE K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
            {
            match(input,K_CREATE,FOLLOW_K_CREATE_in_createUserStatement3251); 
            match(input,K_USER,FOLLOW_K_USER_in_createUserStatement3253); 
            pushFollow(FOLLOW_username_in_createUserStatement3255);
            username10=username();

            state._fsp--;

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:599:7: ( K_WITH userOptions[opts] )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==K_WITH) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:599:9: K_WITH userOptions[opts]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_createUserStatement3265); 
                    pushFollow(FOLLOW_userOptions_in_createUserStatement3267);
                    userOptions(opts);

                    state._fsp--;


                    }
                    break;

            }

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:600:7: ( K_SUPERUSER | K_NOSUPERUSER )?
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==K_SUPERUSER) ) {
                alt59=1;
            }
            else if ( (LA59_0==K_NOSUPERUSER) ) {
                alt59=2;
            }
            switch (alt59) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:600:9: K_SUPERUSER
                    {
                    match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_createUserStatement3281); 
                     superuser = true; 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:600:45: K_NOSUPERUSER
                    {
                    match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_createUserStatement3287); 
                     superuser = false; 

                    }
                    break;

            }

             stmt = new CreateUserStatement((username10!=null?input.toString(username10.start,username10.stop):null), opts, superuser); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "createUserStatement"


    // $ANTLR start "alterUserStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:604:1: alterUserStatement returns [AlterUserStatement stmt] : K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? ;
    public final AlterUserStatement alterUserStatement() throws RecognitionException {
        AlterUserStatement stmt = null;

        CqlParser.username_return username11 = null;



                UserOptions opts = new UserOptions();
                Boolean superuser = null;
            
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:612:5: ( K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )? )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:612:7: K_ALTER K_USER username ( K_WITH userOptions[opts] )? ( K_SUPERUSER | K_NOSUPERUSER )?
            {
            match(input,K_ALTER,FOLLOW_K_ALTER_in_alterUserStatement3332); 
            match(input,K_USER,FOLLOW_K_USER_in_alterUserStatement3334); 
            pushFollow(FOLLOW_username_in_alterUserStatement3336);
            username11=username();

            state._fsp--;

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:613:7: ( K_WITH userOptions[opts] )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==K_WITH) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:613:9: K_WITH userOptions[opts]
                    {
                    match(input,K_WITH,FOLLOW_K_WITH_in_alterUserStatement3346); 
                    pushFollow(FOLLOW_userOptions_in_alterUserStatement3348);
                    userOptions(opts);

                    state._fsp--;


                    }
                    break;

            }

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:614:7: ( K_SUPERUSER | K_NOSUPERUSER )?
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==K_SUPERUSER) ) {
                alt61=1;
            }
            else if ( (LA61_0==K_NOSUPERUSER) ) {
                alt61=2;
            }
            switch (alt61) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:614:9: K_SUPERUSER
                    {
                    match(input,K_SUPERUSER,FOLLOW_K_SUPERUSER_in_alterUserStatement3362); 
                     superuser = true; 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:614:45: K_NOSUPERUSER
                    {
                    match(input,K_NOSUPERUSER,FOLLOW_K_NOSUPERUSER_in_alterUserStatement3368); 
                     superuser = false; 

                    }
                    break;

            }

             stmt = new AlterUserStatement((username11!=null?input.toString(username11.start,username11.stop):null), opts, superuser); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "alterUserStatement"


    // $ANTLR start "dropUserStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:618:1: dropUserStatement returns [DropUserStatement stmt] : K_DROP K_USER username ;
    public final DropUserStatement dropUserStatement() throws RecognitionException {
        DropUserStatement stmt = null;

        CqlParser.username_return username12 = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:622:5: ( K_DROP K_USER username )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:622:7: K_DROP K_USER username
            {
            match(input,K_DROP,FOLLOW_K_DROP_in_dropUserStatement3404); 
            match(input,K_USER,FOLLOW_K_USER_in_dropUserStatement3406); 
            pushFollow(FOLLOW_username_in_dropUserStatement3408);
            username12=username();

            state._fsp--;

             stmt = new DropUserStatement((username12!=null?input.toString(username12.start,username12.stop):null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "dropUserStatement"


    // $ANTLR start "listUsersStatement"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:625:1: listUsersStatement returns [ListUsersStatement stmt] : K_LIST K_USERS ;
    public final ListUsersStatement listUsersStatement() throws RecognitionException {
        ListUsersStatement stmt = null;

        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:629:5: ( K_LIST K_USERS )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:629:7: K_LIST K_USERS
            {
            match(input,K_LIST,FOLLOW_K_LIST_in_listUsersStatement3433); 
            match(input,K_USERS,FOLLOW_K_USERS_in_listUsersStatement3435); 
             stmt = new ListUsersStatement(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stmt;
    }
    // $ANTLR end "listUsersStatement"


    // $ANTLR start "userOptions"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:632:1: userOptions[UserOptions opts] : userOption[opts] ;
    public final void userOptions(UserOptions opts) throws RecognitionException {
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:633:5: ( userOption[opts] )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:633:7: userOption[opts]
            {
            pushFollow(FOLLOW_userOption_in_userOptions3455);
            userOption(opts);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "userOptions"


    // $ANTLR start "userOption"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:636:1: userOption[UserOptions opts] : k= K_PASSWORD v= STRING_LITERAL ;
    public final void userOption(UserOptions opts) throws RecognitionException {
        Token k=null;
        Token v=null;

        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:637:5: (k= K_PASSWORD v= STRING_LITERAL )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:637:7: k= K_PASSWORD v= STRING_LITERAL
            {
            k=(Token)match(input,K_PASSWORD,FOLLOW_K_PASSWORD_in_userOption3476); 
            v=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_userOption3480); 
             opts.put((k!=null?k.getText():null), (v!=null?v.getText():null)); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "userOption"


    // $ANTLR start "cident"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:640:1: cident returns [ColumnIdentifier id] : (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword );
    public final ColumnIdentifier cident() throws RecognitionException {
        ColumnIdentifier id = null;

        Token t=null;
        String k = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:644:5: (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword )
            int alt62=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt62=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt62=2;
                }
                break;
            case K_COUNT:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt62=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:644:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cident3509); 
                     id = new ColumnIdentifier((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:645:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cident3534); 
                     id = new ColumnIdentifier((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:646:7: k= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_cident3553);
                    k=unreserved_keyword();

                    state._fsp--;

                     id = new ColumnIdentifier(k, false); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "cident"


    // $ANTLR start "keyspaceName"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:650:1: keyspaceName returns [String id] : cfOrKsName[name, true] ;
    public final String keyspaceName() throws RecognitionException {
        String id = null;

         CFName name = new CFName(); 
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:652:5: ( cfOrKsName[name, true] )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:652:7: cfOrKsName[name, true]
            {
            pushFollow(FOLLOW_cfOrKsName_in_keyspaceName3586);
            cfOrKsName(name, true);

            state._fsp--;

             id = name.getKeyspace(); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return id;
    }
    // $ANTLR end "keyspaceName"


    // $ANTLR start "columnFamilyName"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:655:1: columnFamilyName returns [CFName name] : ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false] ;
    public final CFName columnFamilyName() throws RecognitionException {
        CFName name = null;

         name = new CFName(); 
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:657:5: ( ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false] )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:657:7: ( cfOrKsName[name, true] '.' )? cfOrKsName[name, false]
            {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:657:7: ( cfOrKsName[name, true] '.' )?
            int alt63=2;
            alt63 = dfa63.predict(input);
            switch (alt63) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:657:8: cfOrKsName[name, true] '.'
                    {
                    pushFollow(FOLLOW_cfOrKsName_in_columnFamilyName3620);
                    cfOrKsName(name, true);

                    state._fsp--;

                    match(input,134,FOLLOW_134_in_columnFamilyName3623); 

                    }
                    break;

            }

            pushFollow(FOLLOW_cfOrKsName_in_columnFamilyName3627);
            cfOrKsName(name, false);

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return name;
    }
    // $ANTLR end "columnFamilyName"


    // $ANTLR start "cfOrKsName"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:660:1: cfOrKsName[CFName name, boolean isKs] : (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword );
    public final void cfOrKsName(CFName name, boolean isKs) throws RecognitionException {
        Token t=null;
        String k = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:661:5: (t= IDENT | t= QUOTED_NAME | k= unreserved_keyword )
            int alt64=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt64=1;
                }
                break;
            case QUOTED_NAME:
                {
                alt64=2;
                }
                break;
            case K_COUNT:
            case K_FILTERING:
            case K_WRITETIME:
            case K_TTL:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt64=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:661:7: t= IDENT
                    {
                    t=(Token)match(input,IDENT,FOLLOW_IDENT_in_cfOrKsName3648); 
                     if (isKs) name.setKeyspace((t!=null?t.getText():null), false); else name.setColumnFamily((t!=null?t.getText():null), false); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:662:7: t= QUOTED_NAME
                    {
                    t=(Token)match(input,QUOTED_NAME,FOLLOW_QUOTED_NAME_in_cfOrKsName3673); 
                     if (isKs) name.setKeyspace((t!=null?t.getText():null), true); else name.setColumnFamily((t!=null?t.getText():null), true); 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:663:7: k= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_cfOrKsName3692);
                    k=unreserved_keyword();

                    state._fsp--;

                     if (isKs) name.setKeyspace(k, false); else name.setColumnFamily(k, false); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "cfOrKsName"


    // $ANTLR start "constant"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:666:1: constant returns [Constants.Literal constant] : (t= STRING_LITERAL | t= INTEGER | t= FLOAT | t= BOOLEAN | t= UUID | t= HEXNUMBER );
    public final Constants.Literal constant() throws RecognitionException {
        Constants.Literal constant = null;

        Token t=null;

        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:667:5: (t= STRING_LITERAL | t= INTEGER | t= FLOAT | t= BOOLEAN | t= UUID | t= HEXNUMBER )
            int alt65=6;
            switch ( input.LA(1) ) {
            case STRING_LITERAL:
                {
                alt65=1;
                }
                break;
            case INTEGER:
                {
                alt65=2;
                }
                break;
            case FLOAT:
                {
                alt65=3;
                }
                break;
            case BOOLEAN:
                {
                alt65=4;
                }
                break;
            case UUID:
                {
                alt65=5;
                }
                break;
            case HEXNUMBER:
                {
                alt65=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:667:7: t= STRING_LITERAL
                    {
                    t=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_constant3717); 
                     constant = Constants.Literal.string((t!=null?t.getText():null)); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:668:7: t= INTEGER
                    {
                    t=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_constant3729); 
                     constant = Constants.Literal.integer((t!=null?t.getText():null)); 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:669:7: t= FLOAT
                    {
                    t=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constant3748); 
                     constant = Constants.Literal.floatingPoint((t!=null?t.getText():null)); 

                    }
                    break;
                case 4 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:670:7: t= BOOLEAN
                    {
                    t=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_constant3769); 
                     constant = Constants.Literal.bool((t!=null?t.getText():null)); 

                    }
                    break;
                case 5 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:671:7: t= UUID
                    {
                    t=(Token)match(input,UUID,FOLLOW_UUID_in_constant3788); 
                     constant = Constants.Literal.uuid((t!=null?t.getText():null)); 

                    }
                    break;
                case 6 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:672:7: t= HEXNUMBER
                    {
                    t=(Token)match(input,HEXNUMBER,FOLLOW_HEXNUMBER_in_constant3810); 
                     constant = Constants.Literal.hex((t!=null?t.getText():null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return constant;
    }
    // $ANTLR end "constant"


    // $ANTLR start "map_literal"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:675:1: map_literal returns [Maps.Literal map] : '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' ;
    public final Maps.Literal map_literal() throws RecognitionException {
        Maps.Literal map = null;

        Term.Raw k1 = null;

        Term.Raw v1 = null;

        Term.Raw kn = null;

        Term.Raw vn = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:676:5: ( '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}' )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:676:7: '{' (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )? '}'
            {
            match(input,135,FOLLOW_135_in_map_literal3838); 
             List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); 
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:677:11: (k1= term ':' v1= term ( ',' kn= term ':' vn= term )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==INTEGER||LA67_0==K_FILTERING||LA67_0==K_VALUES||LA67_0==K_TIMESTAMP||LA67_0==K_COUNTER||(LA67_0>=K_KEY && LA67_0<=K_CUSTOM)||LA67_0==IDENT||LA67_0==STRING_LITERAL||LA67_0==K_TYPE||LA67_0==K_LIST||(LA67_0>=K_ALL && LA67_0<=K_PASSWORD)||(LA67_0>=FLOAT && LA67_0<=K_TOKEN)||(LA67_0>=K_ASCII && LA67_0<=K_MAP)||LA67_0==128||LA67_0==132||LA67_0==135) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:677:13: k1= term ':' v1= term ( ',' kn= term ':' vn= term )*
                    {
                    pushFollow(FOLLOW_term_in_map_literal3856);
                    k1=term();

                    state._fsp--;

                    match(input,136,FOLLOW_136_in_map_literal3858); 
                    pushFollow(FOLLOW_term_in_map_literal3862);
                    v1=term();

                    state._fsp--;

                     m.add(Pair.create(k1, v1)); 
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:677:65: ( ',' kn= term ':' vn= term )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==130) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:677:67: ',' kn= term ':' vn= term
                    	    {
                    	    match(input,130,FOLLOW_130_in_map_literal3868); 
                    	    pushFollow(FOLLOW_term_in_map_literal3872);
                    	    kn=term();

                    	    state._fsp--;

                    	    match(input,136,FOLLOW_136_in_map_literal3874); 
                    	    pushFollow(FOLLOW_term_in_map_literal3878);
                    	    vn=term();

                    	    state._fsp--;

                    	     m.add(Pair.create(kn, vn)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,137,FOLLOW_137_in_map_literal3894); 
             map = new Maps.Literal(m); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return map;
    }
    // $ANTLR end "map_literal"


    // $ANTLR start "set_or_map"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:681:1: set_or_map[Term.Raw t] returns [Term.Raw value] : ( ':' v= term ( ',' kn= term ':' vn= term )* | ( ',' tn= term )* );
    public final Term.Raw set_or_map(Term.Raw t) throws RecognitionException {
        Term.Raw value = null;

        Term.Raw v = null;

        Term.Raw kn = null;

        Term.Raw vn = null;

        Term.Raw tn = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:682:5: ( ':' v= term ( ',' kn= term ':' vn= term )* | ( ',' tn= term )* )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==136) ) {
                alt70=1;
            }
            else if ( (LA70_0==130||LA70_0==137) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:682:7: ':' v= term ( ',' kn= term ':' vn= term )*
                    {
                    match(input,136,FOLLOW_136_in_set_or_map3918); 
                    pushFollow(FOLLOW_term_in_set_or_map3922);
                    v=term();

                    state._fsp--;

                     List<Pair<Term.Raw, Term.Raw>> m = new ArrayList<Pair<Term.Raw, Term.Raw>>(); m.add(Pair.create(t, v)); 
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:683:11: ( ',' kn= term ':' vn= term )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==130) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:683:13: ',' kn= term ':' vn= term
                    	    {
                    	    match(input,130,FOLLOW_130_in_set_or_map3938); 
                    	    pushFollow(FOLLOW_term_in_set_or_map3942);
                    	    kn=term();

                    	    state._fsp--;

                    	    match(input,136,FOLLOW_136_in_set_or_map3944); 
                    	    pushFollow(FOLLOW_term_in_set_or_map3948);
                    	    vn=term();

                    	    state._fsp--;

                    	     m.add(Pair.create(kn, vn)); 

                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);

                     value = new Maps.Literal(m); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:685:7: ( ',' tn= term )*
                    {
                     List<Term.Raw> s = new ArrayList<Term.Raw>(); s.add(t); 
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:686:11: ( ',' tn= term )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==130) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:686:13: ',' tn= term
                    	    {
                    	    match(input,130,FOLLOW_130_in_set_or_map3983); 
                    	    pushFollow(FOLLOW_term_in_set_or_map3987);
                    	    tn=term();

                    	    state._fsp--;

                    	     s.add(tn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);

                     value = new Sets.Literal(s); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "set_or_map"


    // $ANTLR start "collection_literal"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:690:1: collection_literal returns [Term.Raw value] : ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= set_or_map[t] '}' | '{' '}' );
    public final Term.Raw collection_literal() throws RecognitionException {
        Term.Raw value = null;

        Term.Raw t1 = null;

        Term.Raw tn = null;

        Term.Raw t = null;

        Term.Raw v = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:691:5: ( '[' (t1= term ( ',' tn= term )* )? ']' | '{' t= term v= set_or_map[t] '}' | '{' '}' )
            int alt73=3;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==132) ) {
                alt73=1;
            }
            else if ( (LA73_0==135) ) {
                int LA73_2 = input.LA(2);

                if ( (LA73_2==137) ) {
                    alt73=3;
                }
                else if ( (LA73_2==INTEGER||LA73_2==K_FILTERING||LA73_2==K_VALUES||LA73_2==K_TIMESTAMP||LA73_2==K_COUNTER||(LA73_2>=K_KEY && LA73_2<=K_CUSTOM)||LA73_2==IDENT||LA73_2==STRING_LITERAL||LA73_2==K_TYPE||LA73_2==K_LIST||(LA73_2>=K_ALL && LA73_2<=K_PASSWORD)||(LA73_2>=FLOAT && LA73_2<=K_TOKEN)||(LA73_2>=K_ASCII && LA73_2<=K_MAP)||LA73_2==128||LA73_2==132||LA73_2==135) ) {
                    alt73=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:691:7: '[' (t1= term ( ',' tn= term )* )? ']'
                    {
                    match(input,132,FOLLOW_132_in_collection_literal4021); 
                     List<Term.Raw> l = new ArrayList<Term.Raw>(); 
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:692:11: (t1= term ( ',' tn= term )* )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==INTEGER||LA72_0==K_FILTERING||LA72_0==K_VALUES||LA72_0==K_TIMESTAMP||LA72_0==K_COUNTER||(LA72_0>=K_KEY && LA72_0<=K_CUSTOM)||LA72_0==IDENT||LA72_0==STRING_LITERAL||LA72_0==K_TYPE||LA72_0==K_LIST||(LA72_0>=K_ALL && LA72_0<=K_PASSWORD)||(LA72_0>=FLOAT && LA72_0<=K_TOKEN)||(LA72_0>=K_ASCII && LA72_0<=K_MAP)||LA72_0==128||LA72_0==132||LA72_0==135) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:692:13: t1= term ( ',' tn= term )*
                            {
                            pushFollow(FOLLOW_term_in_collection_literal4039);
                            t1=term();

                            state._fsp--;

                             l.add(t1); 
                            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:692:36: ( ',' tn= term )*
                            loop71:
                            do {
                                int alt71=2;
                                int LA71_0 = input.LA(1);

                                if ( (LA71_0==130) ) {
                                    alt71=1;
                                }


                                switch (alt71) {
                            	case 1 :
                            	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:692:38: ',' tn= term
                            	    {
                            	    match(input,130,FOLLOW_130_in_collection_literal4045); 
                            	    pushFollow(FOLLOW_term_in_collection_literal4049);
                            	    tn=term();

                            	    state._fsp--;

                            	     l.add(tn); 

                            	    }
                            	    break;

                            	default :
                            	    break loop71;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,133,FOLLOW_133_in_collection_literal4065); 
                     value = new Lists.Literal(l); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:694:7: '{' t= term v= set_or_map[t] '}'
                    {
                    match(input,135,FOLLOW_135_in_collection_literal4075); 
                    pushFollow(FOLLOW_term_in_collection_literal4079);
                    t=term();

                    state._fsp--;

                    pushFollow(FOLLOW_set_or_map_in_collection_literal4083);
                    v=set_or_map(t);

                    state._fsp--;

                     value = v; 
                    match(input,137,FOLLOW_137_in_collection_literal4088); 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:697:7: '{' '}'
                    {
                    match(input,135,FOLLOW_135_in_collection_literal4106); 
                    match(input,137,FOLLOW_137_in_collection_literal4108); 
                     value = new Sets.Literal(Collections.<Term.Raw>emptyList()); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "collection_literal"


    // $ANTLR start "value"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:700:1: value returns [Term.Raw value] : (c= constant | l= collection_literal | K_NULL | QMARK );
    public final Term.Raw value() throws RecognitionException {
        Term.Raw value = null;

        Constants.Literal c = null;

        Term.Raw l = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:701:5: (c= constant | l= collection_literal | K_NULL | QMARK )
            int alt74=4;
            switch ( input.LA(1) ) {
            case INTEGER:
            case STRING_LITERAL:
            case FLOAT:
            case BOOLEAN:
            case UUID:
            case HEXNUMBER:
                {
                alt74=1;
                }
                break;
            case 132:
            case 135:
                {
                alt74=2;
                }
                break;
            case K_NULL:
                {
                alt74=3;
                }
                break;
            case QMARK:
                {
                alt74=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:701:7: c= constant
                    {
                    pushFollow(FOLLOW_constant_in_value4133);
                    c=constant();

                    state._fsp--;

                     value = c; 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:702:7: l= collection_literal
                    {
                    pushFollow(FOLLOW_collection_literal_in_value4155);
                    l=collection_literal();

                    state._fsp--;

                     value = l; 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:703:7: K_NULL
                    {
                    match(input,K_NULL,FOLLOW_K_NULL_in_value4165); 
                     value = Constants.NULL_LITERAL; 

                    }
                    break;
                case 4 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:704:7: QMARK
                    {
                    match(input,QMARK,FOLLOW_QMARK_in_value4189); 
                     value = new AbstractMarker.Raw(++currentBindMarkerIdx); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "value"


    // $ANTLR start "functionName"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:707:1: functionName returns [String s] : (f= IDENT | u= unreserved_function_keyword | K_TOKEN );
    public final String functionName() throws RecognitionException {
        String s = null;

        Token f=null;
        String u = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:708:5: (f= IDENT | u= unreserved_function_keyword | K_TOKEN )
            int alt75=3;
            switch ( input.LA(1) ) {
            case IDENT:
                {
                alt75=1;
                }
                break;
            case K_FILTERING:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt75=2;
                }
                break;
            case K_TOKEN:
                {
                alt75=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:708:7: f= IDENT
                    {
                    f=(Token)match(input,IDENT,FOLLOW_IDENT_in_functionName4229); 
                     s = (f!=null?f.getText():null); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:709:7: u= unreserved_function_keyword
                    {
                    pushFollow(FOLLOW_unreserved_function_keyword_in_functionName4263);
                    u=unreserved_function_keyword();

                    state._fsp--;

                     s = u; 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:710:7: K_TOKEN
                    {
                    match(input,K_TOKEN,FOLLOW_K_TOKEN_in_functionName4273); 
                     s = "token"; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return s;
    }
    // $ANTLR end "functionName"


    // $ANTLR start "functionArgs"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:713:1: functionArgs returns [List<Term.Raw> a] : ( '(' ')' | '(' t1= term ( ',' tn= term )* ')' );
    public final List<Term.Raw> functionArgs() throws RecognitionException {
        List<Term.Raw> a = null;

        Term.Raw t1 = null;

        Term.Raw tn = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:714:5: ( '(' ')' | '(' t1= term ( ',' tn= term )* ')' )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==128) ) {
                int LA77_1 = input.LA(2);

                if ( (LA77_1==129) ) {
                    alt77=1;
                }
                else if ( (LA77_1==INTEGER||LA77_1==K_FILTERING||LA77_1==K_VALUES||LA77_1==K_TIMESTAMP||LA77_1==K_COUNTER||(LA77_1>=K_KEY && LA77_1<=K_CUSTOM)||LA77_1==IDENT||LA77_1==STRING_LITERAL||LA77_1==K_TYPE||LA77_1==K_LIST||(LA77_1>=K_ALL && LA77_1<=K_PASSWORD)||(LA77_1>=FLOAT && LA77_1<=K_TOKEN)||(LA77_1>=K_ASCII && LA77_1<=K_MAP)||LA77_1==128||LA77_1==132||LA77_1==135) ) {
                    alt77=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 77, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:714:7: '(' ')'
                    {
                    match(input,128,FOLLOW_128_in_functionArgs4318); 
                    match(input,129,FOLLOW_129_in_functionArgs4320); 
                     a = Collections.emptyList(); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:715:7: '(' t1= term ( ',' tn= term )* ')'
                    {
                    match(input,128,FOLLOW_128_in_functionArgs4330); 
                    pushFollow(FOLLOW_term_in_functionArgs4334);
                    t1=term();

                    state._fsp--;

                     List<Term.Raw> args = new ArrayList<Term.Raw>(); args.add(t1); 
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:716:11: ( ',' tn= term )*
                    loop76:
                    do {
                        int alt76=2;
                        int LA76_0 = input.LA(1);

                        if ( (LA76_0==130) ) {
                            alt76=1;
                        }


                        switch (alt76) {
                    	case 1 :
                    	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:716:13: ',' tn= term
                    	    {
                    	    match(input,130,FOLLOW_130_in_functionArgs4350); 
                    	    pushFollow(FOLLOW_term_in_functionArgs4354);
                    	    tn=term();

                    	    state._fsp--;

                    	     args.add(tn); 

                    	    }
                    	    break;

                    	default :
                    	    break loop76;
                        }
                    } while (true);

                    match(input,129,FOLLOW_129_in_functionArgs4368); 
                     a = args; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return a;
    }
    // $ANTLR end "functionArgs"


    // $ANTLR start "term"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:720:1: term returns [Term.Raw term] : (v= value | f= functionName args= functionArgs | '(' c= comparatorType ')' t= term );
    public final Term.Raw term() throws RecognitionException {
        Term.Raw term = null;

        Term.Raw v = null;

        String f = null;

        List<Term.Raw> args = null;

        CQL3Type c = null;

        Term.Raw t = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:721:5: (v= value | f= functionName args= functionArgs | '(' c= comparatorType ')' t= term )
            int alt78=3;
            switch ( input.LA(1) ) {
            case INTEGER:
            case STRING_LITERAL:
            case FLOAT:
            case BOOLEAN:
            case UUID:
            case HEXNUMBER:
            case K_NULL:
            case QMARK:
            case 132:
            case 135:
                {
                alt78=1;
                }
                break;
            case K_FILTERING:
            case K_VALUES:
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_KEY:
            case K_COMPACT:
            case K_STORAGE:
            case K_CLUSTERING:
            case K_CUSTOM:
            case IDENT:
            case K_TYPE:
            case K_LIST:
            case K_ALL:
            case K_PERMISSIONS:
            case K_PERMISSION:
            case K_KEYSPACES:
            case K_USER:
            case K_SUPERUSER:
            case K_NOSUPERUSER:
            case K_USERS:
            case K_PASSWORD:
            case K_TOKEN:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
            case K_MAP:
                {
                alt78=2;
                }
                break;
            case 128:
                {
                alt78=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:721:7: v= value
                    {
                    pushFollow(FOLLOW_value_in_term4393);
                    v=value();

                    state._fsp--;

                     term = v; 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:722:7: f= functionName args= functionArgs
                    {
                    pushFollow(FOLLOW_functionName_in_term4430);
                    f=functionName();

                    state._fsp--;

                    pushFollow(FOLLOW_functionArgs_in_term4434);
                    args=functionArgs();

                    state._fsp--;

                     term = new FunctionCall.Raw(f, args); 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:723:7: '(' c= comparatorType ')' t= term
                    {
                    match(input,128,FOLLOW_128_in_term4444); 
                    pushFollow(FOLLOW_comparatorType_in_term4448);
                    c=comparatorType();

                    state._fsp--;

                    match(input,129,FOLLOW_129_in_term4450); 
                    pushFollow(FOLLOW_term_in_term4454);
                    t=term();

                    state._fsp--;

                     term = new TypeCast(c, t); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return term;
    }
    // $ANTLR end "term"


    // $ANTLR start "columnOperation"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:726:1: columnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations] : (key= cident '=' t= term ( '+' c= cident )? | key= cident '=' c= cident sig= ( '+' | '-' ) t= term | key= cident '=' c= cident i= INTEGER | key= cident '[' k= term ']' '=' t= term );
    public final void columnOperation(List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations) throws RecognitionException {
        Token sig=null;
        Token i=null;
        ColumnIdentifier key = null;

        Term.Raw t = null;

        ColumnIdentifier c = null;

        Term.Raw k = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:727:5: (key= cident '=' t= term ( '+' c= cident )? | key= cident '=' c= cident sig= ( '+' | '-' ) t= term | key= cident '=' c= cident i= INTEGER | key= cident '[' k= term ']' '=' t= term )
            int alt80=4;
            alt80 = dfa80.predict(input);
            switch (alt80) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:727:7: key= cident '=' t= term ( '+' c= cident )?
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation4477);
                    key=cident();

                    state._fsp--;

                    match(input,138,FOLLOW_138_in_columnOperation4479); 
                    pushFollow(FOLLOW_term_in_columnOperation4483);
                    t=term();

                    state._fsp--;

                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:727:29: ( '+' c= cident )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==139) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:727:30: '+' c= cident
                            {
                            match(input,139,FOLLOW_139_in_columnOperation4486); 
                            pushFollow(FOLLOW_cident_in_columnOperation4490);
                            c=cident();

                            state._fsp--;


                            }
                            break;

                    }


                              if (c == null)
                              {
                                  addRawUpdate(operations, key, new Operation.SetValue(t));
                              }
                              else
                              {
                                  if (!key.equals(c))
                                      addRecognitionError("Only expressions of the form X = <value> + X are supported.");
                                  addRawUpdate(operations, key, new Operation.Prepend(t));
                              }
                          

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:740:7: key= cident '=' c= cident sig= ( '+' | '-' ) t= term
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation4511);
                    key=cident();

                    state._fsp--;

                    match(input,138,FOLLOW_138_in_columnOperation4513); 
                    pushFollow(FOLLOW_cident_in_columnOperation4517);
                    c=cident();

                    state._fsp--;

                    sig=(Token)input.LT(1);
                    if ( (input.LA(1)>=139 && input.LA(1)<=140) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    pushFollow(FOLLOW_term_in_columnOperation4531);
                    t=term();

                    state._fsp--;


                              if (!key.equals(c))
                                  addRecognitionError("Only expressions of the form X = X " + (sig!=null?sig.getText():null) + "<value> are supported.");
                              addRawUpdate(operations, key, (sig!=null?sig.getText():null).equals("+") ? new Operation.Addition(t) : new Operation.Substraction(t));
                          

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:746:7: key= cident '=' c= cident i= INTEGER
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation4549);
                    key=cident();

                    state._fsp--;

                    match(input,138,FOLLOW_138_in_columnOperation4551); 
                    pushFollow(FOLLOW_cident_in_columnOperation4555);
                    c=cident();

                    state._fsp--;

                    i=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_columnOperation4559); 

                              // Note that this production *is* necessary because X = X - 3 will in fact be lexed as [ X, '=', X, INTEGER].
                              if (!key.equals(c))
                                  // We don't yet allow a '+' in front of an integer, but we could in the future really, so let's be future-proof in our error message
                                  addRecognitionError("Only expressions of the form X = X " + ((i!=null?i.getText():null).charAt(0) == '-' ? '-' : '+') + " <value> are supported.");
                              addRawUpdate(operations, key, new Operation.Addition(Constants.Literal.integer((i!=null?i.getText():null))));
                          

                    }
                    break;
                case 4 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:754:7: key= cident '[' k= term ']' '=' t= term
                    {
                    pushFollow(FOLLOW_cident_in_columnOperation4577);
                    key=cident();

                    state._fsp--;

                    match(input,132,FOLLOW_132_in_columnOperation4579); 
                    pushFollow(FOLLOW_term_in_columnOperation4583);
                    k=term();

                    state._fsp--;

                    match(input,133,FOLLOW_133_in_columnOperation4585); 
                    match(input,138,FOLLOW_138_in_columnOperation4587); 
                    pushFollow(FOLLOW_term_in_columnOperation4591);
                    t=term();

                    state._fsp--;


                              addRawUpdate(operations, key, new Operation.SetElement(k, t));
                          

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "columnOperation"


    // $ANTLR start "properties"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:760:1: properties[PropertyDefinitions props] : property[props] ( K_AND property[props] )* ;
    public final void properties(PropertyDefinitions props) throws RecognitionException {
        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:761:5: ( property[props] ( K_AND property[props] )* )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:761:7: property[props] ( K_AND property[props] )*
            {
            pushFollow(FOLLOW_property_in_properties4617);
            property(props);

            state._fsp--;

            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:761:23: ( K_AND property[props] )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==K_AND) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:761:24: K_AND property[props]
            	    {
            	    match(input,K_AND,FOLLOW_K_AND_in_properties4621); 
            	    pushFollow(FOLLOW_property_in_properties4623);
            	    property(props);

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "properties"


    // $ANTLR start "property"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:764:1: property[PropertyDefinitions props] : k= cident '=' (simple= propertyValue | map= map_literal ) ;
    public final void property(PropertyDefinitions props) throws RecognitionException {
        ColumnIdentifier k = null;

        String simple = null;

        Maps.Literal map = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:765:5: (k= cident '=' (simple= propertyValue | map= map_literal ) )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:765:7: k= cident '=' (simple= propertyValue | map= map_literal )
            {
            pushFollow(FOLLOW_cident_in_property4646);
            k=cident();

            state._fsp--;

            match(input,138,FOLLOW_138_in_property4648); 
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:765:20: (simple= propertyValue | map= map_literal )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==K_COUNT||LA82_0==INTEGER||(LA82_0>=K_FILTERING && LA82_0<=K_TTL)||LA82_0==K_VALUES||LA82_0==K_TIMESTAMP||LA82_0==K_COUNTER||(LA82_0>=K_KEY && LA82_0<=K_CUSTOM)||LA82_0==STRING_LITERAL||LA82_0==K_TYPE||LA82_0==K_LIST||(LA82_0>=K_ALL && LA82_0<=K_PASSWORD)||(LA82_0>=FLOAT && LA82_0<=HEXNUMBER)||(LA82_0>=K_ASCII && LA82_0<=K_MAP)) ) {
                alt82=1;
            }
            else if ( (LA82_0==135) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:765:21: simple= propertyValue
                    {
                    pushFollow(FOLLOW_propertyValue_in_property4653);
                    simple=propertyValue();

                    state._fsp--;

                     try { props.addProperty(k.toString(), simple); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:766:24: map= map_literal
                    {
                    pushFollow(FOLLOW_map_literal_in_property4682);
                    map=map_literal();

                    state._fsp--;

                     try { props.addProperty(k.toString(), convertPropertyMap(map)); } catch (SyntaxException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "property"


    // $ANTLR start "propertyValue"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:769:1: propertyValue returns [String str] : (c= constant | u= unreserved_keyword );
    public final String propertyValue() throws RecognitionException {
        String str = null;

        Constants.Literal c = null;

        String u = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:770:5: (c= constant | u= unreserved_keyword )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==INTEGER||LA83_0==STRING_LITERAL||(LA83_0>=FLOAT && LA83_0<=HEXNUMBER)) ) {
                alt83=1;
            }
            else if ( (LA83_0==K_COUNT||(LA83_0>=K_FILTERING && LA83_0<=K_TTL)||LA83_0==K_VALUES||LA83_0==K_TIMESTAMP||LA83_0==K_COUNTER||(LA83_0>=K_KEY && LA83_0<=K_CUSTOM)||LA83_0==K_TYPE||LA83_0==K_LIST||(LA83_0>=K_ALL && LA83_0<=K_PASSWORD)||(LA83_0>=K_ASCII && LA83_0<=K_MAP)) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:770:7: c= constant
                    {
                    pushFollow(FOLLOW_constant_in_propertyValue4710);
                    c=constant();

                    state._fsp--;

                     str = c.getRawText(); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:771:7: u= unreserved_keyword
                    {
                    pushFollow(FOLLOW_unreserved_keyword_in_propertyValue4732);
                    u=unreserved_keyword();

                    state._fsp--;

                     str = u; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "propertyValue"


    // $ANTLR start "relationType"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:774:1: relationType returns [Relation.Type op] : ( '=' | '<' | '<=' | '>' | '>=' );
    public final Relation.Type relationType() throws RecognitionException {
        Relation.Type op = null;

        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:775:5: ( '=' | '<' | '<=' | '>' | '>=' )
            int alt84=5;
            switch ( input.LA(1) ) {
            case 138:
                {
                alt84=1;
                }
                break;
            case 141:
                {
                alt84=2;
                }
                break;
            case 142:
                {
                alt84=3;
                }
                break;
            case 143:
                {
                alt84=4;
                }
                break;
            case 144:
                {
                alt84=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:775:7: '='
                    {
                    match(input,138,FOLLOW_138_in_relationType4755); 
                     op = Relation.Type.EQ; 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:776:7: '<'
                    {
                    match(input,141,FOLLOW_141_in_relationType4766); 
                     op = Relation.Type.LT; 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:777:7: '<='
                    {
                    match(input,142,FOLLOW_142_in_relationType4777); 
                     op = Relation.Type.LTE; 

                    }
                    break;
                case 4 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:778:7: '>'
                    {
                    match(input,143,FOLLOW_143_in_relationType4787); 
                     op = Relation.Type.GT; 

                    }
                    break;
                case 5 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:779:7: '>='
                    {
                    match(input,144,FOLLOW_144_in_relationType4798); 
                     op = Relation.Type.GTE; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "relationType"


    // $ANTLR start "relation"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:782:1: relation[List<Relation> clauses] : (name= cident type= relationType t= term | K_TOKEN '(' name1= cident ( ',' namen= cident )* ')' type= relationType t= term | name= cident K_IN '(' (f1= term ( ',' fN= term )* )? ')' );
    public final void relation(List<Relation> clauses) throws RecognitionException {
        ColumnIdentifier name = null;

        Relation.Type type = null;

        Term.Raw t = null;

        ColumnIdentifier name1 = null;

        ColumnIdentifier namen = null;

        Term.Raw f1 = null;

        Term.Raw fN = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:783:5: (name= cident type= relationType t= term | K_TOKEN '(' name1= cident ( ',' namen= cident )* ')' type= relationType t= term | name= cident K_IN '(' (f1= term ( ',' fN= term )* )? ')' )
            int alt88=3;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:783:7: name= cident type= relationType t= term
                    {
                    pushFollow(FOLLOW_cident_in_relation4820);
                    name=cident();

                    state._fsp--;

                    pushFollow(FOLLOW_relationType_in_relation4824);
                    type=relationType();

                    state._fsp--;

                    pushFollow(FOLLOW_term_in_relation4828);
                    t=term();

                    state._fsp--;

                     clauses.add(new Relation(name, type, t)); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:784:7: K_TOKEN '(' name1= cident ( ',' namen= cident )* ')' type= relationType t= term
                    {
                    match(input,K_TOKEN,FOLLOW_K_TOKEN_in_relation4838); 
                     List<ColumnIdentifier> l = new ArrayList<ColumnIdentifier>(); 
                    match(input,128,FOLLOW_128_in_relation4861); 
                    pushFollow(FOLLOW_cident_in_relation4865);
                    name1=cident();

                    state._fsp--;

                     l.add(name1); 
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:786:46: ( ',' namen= cident )*
                    loop85:
                    do {
                        int alt85=2;
                        int LA85_0 = input.LA(1);

                        if ( (LA85_0==130) ) {
                            alt85=1;
                        }


                        switch (alt85) {
                    	case 1 :
                    	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:786:48: ',' namen= cident
                    	    {
                    	    match(input,130,FOLLOW_130_in_relation4871); 
                    	    pushFollow(FOLLOW_cident_in_relation4875);
                    	    namen=cident();

                    	    state._fsp--;

                    	     l.add(namen); 

                    	    }
                    	    break;

                    	default :
                    	    break loop85;
                        }
                    } while (true);

                    match(input,129,FOLLOW_129_in_relation4881); 
                    pushFollow(FOLLOW_relationType_in_relation4893);
                    type=relationType();

                    state._fsp--;

                    pushFollow(FOLLOW_term_in_relation4897);
                    t=term();

                    state._fsp--;


                                for (ColumnIdentifier id : l)
                                    clauses.add(new Relation(id, type, t, true));
                            

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:792:7: name= cident K_IN '(' (f1= term ( ',' fN= term )* )? ')'
                    {
                    pushFollow(FOLLOW_cident_in_relation4917);
                    name=cident();

                    state._fsp--;

                    match(input,K_IN,FOLLOW_K_IN_in_relation4919); 
                     Relation rel = Relation.createInRelation(name); 
                    match(input,128,FOLLOW_128_in_relation4930); 
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:793:12: (f1= term ( ',' fN= term )* )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==INTEGER||LA87_0==K_FILTERING||LA87_0==K_VALUES||LA87_0==K_TIMESTAMP||LA87_0==K_COUNTER||(LA87_0>=K_KEY && LA87_0<=K_CUSTOM)||LA87_0==IDENT||LA87_0==STRING_LITERAL||LA87_0==K_TYPE||LA87_0==K_LIST||(LA87_0>=K_ALL && LA87_0<=K_PASSWORD)||(LA87_0>=FLOAT && LA87_0<=K_TOKEN)||(LA87_0>=K_ASCII && LA87_0<=K_MAP)||LA87_0==128||LA87_0==132||LA87_0==135) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:793:14: f1= term ( ',' fN= term )*
                            {
                            pushFollow(FOLLOW_term_in_relation4936);
                            f1=term();

                            state._fsp--;

                             rel.addInValue(f1); 
                            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:793:46: ( ',' fN= term )*
                            loop86:
                            do {
                                int alt86=2;
                                int LA86_0 = input.LA(1);

                                if ( (LA86_0==130) ) {
                                    alt86=1;
                                }


                                switch (alt86) {
                            	case 1 :
                            	    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:793:47: ',' fN= term
                            	    {
                            	    match(input,130,FOLLOW_130_in_relation4941); 
                            	    pushFollow(FOLLOW_term_in_relation4945);
                            	    fN=term();

                            	    state._fsp--;

                            	     rel.addInValue(fN); 

                            	    }
                            	    break;

                            	default :
                            	    break loop86;
                                }
                            } while (true);


                            }
                            break;

                    }

                    match(input,129,FOLLOW_129_in_relation4955); 
                     clauses.add(rel); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "relation"


    // $ANTLR start "comparatorType"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:796:1: comparatorType returns [CQL3Type t] : (c= native_type | c= collection_type | s= STRING_LITERAL );
    public final CQL3Type comparatorType() throws RecognitionException {
        CQL3Type t = null;

        Token s=null;
        CQL3Type c = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:797:5: (c= native_type | c= collection_type | s= STRING_LITERAL )
            int alt89=3;
            switch ( input.LA(1) ) {
            case K_TIMESTAMP:
            case K_COUNTER:
            case K_ASCII:
            case K_BIGINT:
            case K_BLOB:
            case K_BOOLEAN:
            case K_DECIMAL:
            case K_DOUBLE:
            case K_FLOAT:
            case K_INET:
            case K_INT:
            case K_TEXT:
            case K_UUID:
            case K_VARCHAR:
            case K_VARINT:
            case K_TIMEUUID:
                {
                alt89=1;
                }
                break;
            case K_SET:
            case K_LIST:
            case K_MAP:
                {
                alt89=2;
                }
                break;
            case STRING_LITERAL:
                {
                alt89=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:797:7: c= native_type
                    {
                    pushFollow(FOLLOW_native_type_in_comparatorType4980);
                    c=native_type();

                    state._fsp--;

                     t = c; 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:798:7: c= collection_type
                    {
                    pushFollow(FOLLOW_collection_type_in_comparatorType4996);
                    c=collection_type();

                    state._fsp--;

                     t = c; 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:799:7: s= STRING_LITERAL
                    {
                    s=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_comparatorType5008); 

                            try {
                                t = new CQL3Type.Custom((s!=null?s.getText():null));
                            } catch (SyntaxException e) {
                                addRecognitionError("Cannot parse type " + (s!=null?s.getText():null) + ": " + e.getMessage());
                            } catch (ConfigurationException e) {
                                addRecognitionError("Error setting type " + (s!=null?s.getText():null) + ": " + e.getMessage());
                            }
                          

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "comparatorType"


    // $ANTLR start "native_type"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:811:1: native_type returns [CQL3Type t] : ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID );
    public final CQL3Type native_type() throws RecognitionException {
        CQL3Type t = null;

        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:812:5: ( K_ASCII | K_BIGINT | K_BLOB | K_BOOLEAN | K_COUNTER | K_DECIMAL | K_DOUBLE | K_FLOAT | K_INET | K_INT | K_TEXT | K_TIMESTAMP | K_UUID | K_VARCHAR | K_VARINT | K_TIMEUUID )
            int alt90=16;
            switch ( input.LA(1) ) {
            case K_ASCII:
                {
                alt90=1;
                }
                break;
            case K_BIGINT:
                {
                alt90=2;
                }
                break;
            case K_BLOB:
                {
                alt90=3;
                }
                break;
            case K_BOOLEAN:
                {
                alt90=4;
                }
                break;
            case K_COUNTER:
                {
                alt90=5;
                }
                break;
            case K_DECIMAL:
                {
                alt90=6;
                }
                break;
            case K_DOUBLE:
                {
                alt90=7;
                }
                break;
            case K_FLOAT:
                {
                alt90=8;
                }
                break;
            case K_INET:
                {
                alt90=9;
                }
                break;
            case K_INT:
                {
                alt90=10;
                }
                break;
            case K_TEXT:
                {
                alt90=11;
                }
                break;
            case K_TIMESTAMP:
                {
                alt90=12;
                }
                break;
            case K_UUID:
                {
                alt90=13;
                }
                break;
            case K_VARCHAR:
                {
                alt90=14;
                }
                break;
            case K_VARINT:
                {
                alt90=15;
                }
                break;
            case K_TIMEUUID:
                {
                alt90=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:812:7: K_ASCII
                    {
                    match(input,K_ASCII,FOLLOW_K_ASCII_in_native_type5037); 
                     t = CQL3Type.Native.ASCII; 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:813:7: K_BIGINT
                    {
                    match(input,K_BIGINT,FOLLOW_K_BIGINT_in_native_type5051); 
                     t = CQL3Type.Native.BIGINT; 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:814:7: K_BLOB
                    {
                    match(input,K_BLOB,FOLLOW_K_BLOB_in_native_type5064); 
                     t = CQL3Type.Native.BLOB; 

                    }
                    break;
                case 4 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:815:7: K_BOOLEAN
                    {
                    match(input,K_BOOLEAN,FOLLOW_K_BOOLEAN_in_native_type5079); 
                     t = CQL3Type.Native.BOOLEAN; 

                    }
                    break;
                case 5 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:816:7: K_COUNTER
                    {
                    match(input,K_COUNTER,FOLLOW_K_COUNTER_in_native_type5091); 
                     t = CQL3Type.Native.COUNTER; 

                    }
                    break;
                case 6 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:817:7: K_DECIMAL
                    {
                    match(input,K_DECIMAL,FOLLOW_K_DECIMAL_in_native_type5103); 
                     t = CQL3Type.Native.DECIMAL; 

                    }
                    break;
                case 7 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:818:7: K_DOUBLE
                    {
                    match(input,K_DOUBLE,FOLLOW_K_DOUBLE_in_native_type5115); 
                     t = CQL3Type.Native.DOUBLE; 

                    }
                    break;
                case 8 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:819:7: K_FLOAT
                    {
                    match(input,K_FLOAT,FOLLOW_K_FLOAT_in_native_type5128); 
                     t = CQL3Type.Native.FLOAT; 

                    }
                    break;
                case 9 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:820:7: K_INET
                    {
                    match(input,K_INET,FOLLOW_K_INET_in_native_type5142); 
                     t = CQL3Type.Native.INET;

                    }
                    break;
                case 10 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:821:7: K_INT
                    {
                    match(input,K_INT,FOLLOW_K_INT_in_native_type5157); 
                     t = CQL3Type.Native.INT; 

                    }
                    break;
                case 11 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:822:7: K_TEXT
                    {
                    match(input,K_TEXT,FOLLOW_K_TEXT_in_native_type5173); 
                     t = CQL3Type.Native.TEXT; 

                    }
                    break;
                case 12 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:823:7: K_TIMESTAMP
                    {
                    match(input,K_TIMESTAMP,FOLLOW_K_TIMESTAMP_in_native_type5188); 
                     t = CQL3Type.Native.TIMESTAMP; 

                    }
                    break;
                case 13 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:824:7: K_UUID
                    {
                    match(input,K_UUID,FOLLOW_K_UUID_in_native_type5198); 
                     t = CQL3Type.Native.UUID; 

                    }
                    break;
                case 14 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:825:7: K_VARCHAR
                    {
                    match(input,K_VARCHAR,FOLLOW_K_VARCHAR_in_native_type5213); 
                     t = CQL3Type.Native.VARCHAR; 

                    }
                    break;
                case 15 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:826:7: K_VARINT
                    {
                    match(input,K_VARINT,FOLLOW_K_VARINT_in_native_type5225); 
                     t = CQL3Type.Native.VARINT; 

                    }
                    break;
                case 16 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:827:7: K_TIMEUUID
                    {
                    match(input,K_TIMEUUID,FOLLOW_K_TIMEUUID_in_native_type5238); 
                     t = CQL3Type.Native.TIMEUUID; 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return t;
    }
    // $ANTLR end "native_type"


    // $ANTLR start "collection_type"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:830:1: collection_type returns [CQL3Type pt] : ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' );
    public final CQL3Type collection_type() throws RecognitionException {
        CQL3Type pt = null;

        CQL3Type t1 = null;

        CQL3Type t2 = null;

        CQL3Type t = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:831:5: ( K_MAP '<' t1= comparatorType ',' t2= comparatorType '>' | K_LIST '<' t= comparatorType '>' | K_SET '<' t= comparatorType '>' )
            int alt91=3;
            switch ( input.LA(1) ) {
            case K_MAP:
                {
                alt91=1;
                }
                break;
            case K_LIST:
                {
                alt91=2;
                }
                break;
            case K_SET:
                {
                alt91=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:831:7: K_MAP '<' t1= comparatorType ',' t2= comparatorType '>'
                    {
                    match(input,K_MAP,FOLLOW_K_MAP_in_collection_type5262); 
                    match(input,141,FOLLOW_141_in_collection_type5265); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type5269);
                    t1=comparatorType();

                    state._fsp--;

                    match(input,130,FOLLOW_130_in_collection_type5271); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type5275);
                    t2=comparatorType();

                    state._fsp--;

                    match(input,143,FOLLOW_143_in_collection_type5277); 
                     try {
                                // if we can't parse either t1 or t2, antlr will "recover" and we may have t1 or t2 null.
                                if (t1 != null && t2 != null)
                                    pt = CQL3Type.Collection.map(t1, t2);
                              } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:837:7: K_LIST '<' t= comparatorType '>'
                    {
                    match(input,K_LIST,FOLLOW_K_LIST_in_collection_type5295); 
                    match(input,141,FOLLOW_141_in_collection_type5297); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type5301);
                    t=comparatorType();

                    state._fsp--;

                    match(input,143,FOLLOW_143_in_collection_type5303); 
                     try { if (t != null) pt = CQL3Type.Collection.list(t); } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;
                case 3 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:839:7: K_SET '<' t= comparatorType '>'
                    {
                    match(input,K_SET,FOLLOW_K_SET_in_collection_type5321); 
                    match(input,141,FOLLOW_141_in_collection_type5324); 
                    pushFollow(FOLLOW_comparatorType_in_collection_type5328);
                    t=comparatorType();

                    state._fsp--;

                    match(input,143,FOLLOW_143_in_collection_type5330); 
                     try { if (t != null) pt = CQL3Type.Collection.set(t); } catch (InvalidRequestException e) { addRecognitionError(e.getMessage()); } 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return pt;
    }
    // $ANTLR end "collection_type"

    public static class username_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "username"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:843:1: username : ( IDENT | STRING_LITERAL );
    public final CqlParser.username_return username() throws RecognitionException {
        CqlParser.username_return retval = new CqlParser.username_return();
        retval.start = input.LT(1);

        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:844:5: ( IDENT | STRING_LITERAL )
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:
            {
            if ( input.LA(1)==IDENT||input.LA(1)==STRING_LITERAL ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "username"


    // $ANTLR start "unreserved_keyword"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:848:1: unreserved_keyword returns [String str] : (u= unreserved_function_keyword | k= ( K_TTL | K_COUNT | K_WRITETIME ) );
    public final String unreserved_keyword() throws RecognitionException {
        String str = null;

        Token k=null;
        String u = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:849:5: (u= unreserved_function_keyword | k= ( K_TTL | K_COUNT | K_WRITETIME ) )
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==K_FILTERING||LA92_0==K_VALUES||LA92_0==K_TIMESTAMP||LA92_0==K_COUNTER||(LA92_0>=K_KEY && LA92_0<=K_CUSTOM)||LA92_0==K_TYPE||LA92_0==K_LIST||(LA92_0>=K_ALL && LA92_0<=K_PASSWORD)||(LA92_0>=K_ASCII && LA92_0<=K_MAP)) ) {
                alt92=1;
            }
            else if ( (LA92_0==K_COUNT||(LA92_0>=K_WRITETIME && LA92_0<=K_TTL)) ) {
                alt92=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }
            switch (alt92) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:849:7: u= unreserved_function_keyword
                    {
                    pushFollow(FOLLOW_unreserved_function_keyword_in_unreserved_keyword5388);
                    u=unreserved_function_keyword();

                    state._fsp--;

                     str = u; 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:850:7: k= ( K_TTL | K_COUNT | K_WRITETIME )
                    {
                    k=(Token)input.LT(1);
                    if ( input.LA(1)==K_COUNT||(input.LA(1)>=K_WRITETIME && input.LA(1)<=K_TTL) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     str = (k!=null?k.getText():null); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "unreserved_keyword"


    // $ANTLR start "unreserved_function_keyword"
    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:853:1: unreserved_function_keyword returns [String str] : (k= ( K_KEY | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_CUSTOM ) | t= native_type );
    public final String unreserved_function_keyword() throws RecognitionException {
        String str = null;

        Token k=null;
        CQL3Type t = null;


        try {
            // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:854:5: (k= ( K_KEY | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_CUSTOM ) | t= native_type )
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==K_FILTERING||LA93_0==K_VALUES||(LA93_0>=K_KEY && LA93_0<=K_CUSTOM)||LA93_0==K_TYPE||LA93_0==K_LIST||(LA93_0>=K_ALL && LA93_0<=K_PASSWORD)||LA93_0==K_MAP) ) {
                alt93=1;
            }
            else if ( (LA93_0==K_TIMESTAMP||LA93_0==K_COUNTER||(LA93_0>=K_ASCII && LA93_0<=K_TIMEUUID)) ) {
                alt93=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }
            switch (alt93) {
                case 1 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:854:7: k= ( K_KEY | K_CLUSTERING | K_COMPACT | K_STORAGE | K_TYPE | K_VALUES | K_MAP | K_LIST | K_FILTERING | K_PERMISSION | K_PERMISSIONS | K_KEYSPACES | K_ALL | K_USER | K_USERS | K_SUPERUSER | K_NOSUPERUSER | K_PASSWORD | K_CUSTOM )
                    {
                    k=(Token)input.LT(1);
                    if ( input.LA(1)==K_FILTERING||input.LA(1)==K_VALUES||(input.LA(1)>=K_KEY && input.LA(1)<=K_CUSTOM)||input.LA(1)==K_TYPE||input.LA(1)==K_LIST||(input.LA(1)>=K_ALL && input.LA(1)<=K_PASSWORD)||input.LA(1)==K_MAP ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                     str = (k!=null?k.getText():null); 

                    }
                    break;
                case 2 :
                    // /home/ubuntu/cassandra-src/src/java/org/apache/cassandra/cql3/Cql.g:874:7: t= native_type
                    {
                    pushFollow(FOLLOW_native_type_in_unreserved_function_keyword5679);
                    t=native_type();

                    state._fsp--;

                     str = t.toString(); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return str;
    }
    // $ANTLR end "unreserved_function_keyword"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA63 dfa63 = new DFA63(this);
    protected DFA80 dfa80 = new DFA80(this);
    protected DFA88 dfa88 = new DFA88(this);
    static final String DFA2_eotS =
        "\33\uffff";
    static final String DFA2_eofS =
        "\33\uffff";
    static final String DFA2_minS =
        "\1\4\7\uffff\3\42\2\uffff\1\5\15\uffff";
    static final String DFA2_maxS =
        "\1\70\7\uffff\3\101\2\uffff\1\104\15\uffff";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\3\uffff\1\20\1\21\1\uffff\1"+
        "\10\1\11\1\23\1\12\1\13\1\14\1\15\1\25\1\16\1\17\1\24\1\26\1\22";
    static final String DFA2_specialS =
        "\33\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\6\1\1\16\uffff\1\2\4\uffff\1\3\1\uffff\1\5\1\4\4\uffff\1"+
            "\10\15\uffff\1\12\4\uffff\1\11\1\7\1\13\1\14\1\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\16\1\uffff\1\17\5\uffff\2\21\25\uffff\1\20",
            "\1\22\1\uffff\1\23\6\uffff\1\24\25\uffff\1\25",
            "\1\27\1\uffff\1\26\34\uffff\1\30",
            "",
            "",
            "\1\32\33\uffff\1\32\15\uffff\1\32\4\uffff\1\32\6\uffff\3\32"+
            "\6\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "172:1: cqlStatement returns [ParsedStatement stmt] : (st1= selectStatement | st2= insertStatement | st3= updateStatement | st4= batchStatement | st5= deleteStatement | st6= useStatement | st7= truncateStatement | st8= createKeyspaceStatement | st9= createColumnFamilyStatement | st10= createIndexStatement | st11= dropKeyspaceStatement | st12= dropColumnFamilyStatement | st13= dropIndexStatement | st14= alterTableStatement | st15= alterKeyspaceStatement | st16= grantStatement | st17= revokeStatement | st18= listPermissionsStatement | st19= createUserStatement | st20= alterUserStatement | st21= dropUserStatement | st22= listUsersStatement );";
        }
    }
    static final String DFA13_eotS =
        "\31\uffff";
    static final String DFA13_eofS =
        "\31\uffff";
    static final String DFA13_minS =
        "\1\6\1\7\1\uffff\23\7\3\uffff";
    static final String DFA13_maxS =
        "\1\135\1\u0082\1\uffff\23\u0082\3\uffff";
    static final String DFA13_acceptS =
        "\2\uffff\1\1\23\uffff\1\4\1\2\1\3";
    static final String DFA13_specialS =
        "\31\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\2\7\uffff\1\3\1\24\1\25\5\uffff\1\3\1\uffff\1\17\5\uffff"+
            "\1\10\7\uffff\5\3\1\uffff\1\1\3\uffff\1\3\7\uffff\1\3\4\uffff"+
            "\11\3\1\2\6\uffff\1\26\1\uffff\1\4\1\5\1\6\1\7\1\11\1\12\1\13"+
            "\1\14\1\15\1\16\1\20\1\21\1\22\1\23\1\3",
            "\1\2\170\uffff\1\26\2\2",
            "",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\26\2\2",
            "\1\2\170\uffff\1\27\2\2",
            "\1\2\170\uffff\1\30\2\2",
            "",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "245:1: selector returns [RawSelector s] : (c= cident | K_WRITETIME '(' c= cident ')' | K_TTL '(' c= cident ')' | f= functionName args= selectionFunctionArgs );";
        }
    }
    static final String DFA27_eotS =
        "\27\uffff";
    static final String DFA27_eofS =
        "\27\uffff";
    static final String DFA27_minS =
        "\1\6\24\7\2\uffff";
    static final String DFA27_maxS =
        "\1\135\24\u0084\2\uffff";
    static final String DFA27_acceptS =
        "\25\uffff\1\2\1\1";
    static final String DFA27_specialS =
        "\27\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\24\7\uffff\1\3\2\24\5\uffff\1\3\1\uffff\1\17\5\uffff\1\10"+
            "\7\uffff\5\3\1\uffff\1\1\3\uffff\1\3\7\uffff\1\3\4\uffff\11"+
            "\3\1\2\10\uffff\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\20\1\21\1\22\1\23\1\3",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "\1\26\172\uffff\1\26\1\uffff\1\25",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "347:1: deleteOp returns [Operation.RawDeletion op] : (c= cident | c= cident '[' t= term ']' );";
        }
    }
    static final String DFA63_eotS =
        "\27\uffff";
    static final String DFA63_eofS =
        "\1\uffff\24\25\2\uffff";
    static final String DFA63_minS =
        "\1\6\24\7\2\uffff";
    static final String DFA63_maxS =
        "\1\135\24\u0086\2\uffff";
    static final String DFA63_acceptS =
        "\25\uffff\1\2\1\1";
    static final String DFA63_specialS =
        "\27\uffff}>";
    static final String[] DFA63_transitionS = {
            "\1\24\7\uffff\1\3\2\24\5\uffff\1\3\1\uffff\1\17\5\uffff\1\10"+
            "\7\uffff\5\3\1\uffff\1\1\3\uffff\1\3\7\uffff\1\3\4\uffff\11"+
            "\3\1\2\10\uffff\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\20\1\21\1\22\1\23\1\3",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "\3\25\1\uffff\1\25\1\uffff\1\25\11\uffff\1\25\2\uffff\1\25"+
            "\10\uffff\1\25\13\uffff\1\25\1\uffff\3\25\5\uffff\2\25\104\uffff"+
            "\2\25\5\uffff\1\26",
            "",
            ""
    };

    static final short[] DFA63_eot = DFA.unpackEncodedString(DFA63_eotS);
    static final short[] DFA63_eof = DFA.unpackEncodedString(DFA63_eofS);
    static final char[] DFA63_min = DFA.unpackEncodedStringToUnsignedChars(DFA63_minS);
    static final char[] DFA63_max = DFA.unpackEncodedStringToUnsignedChars(DFA63_maxS);
    static final short[] DFA63_accept = DFA.unpackEncodedString(DFA63_acceptS);
    static final short[] DFA63_special = DFA.unpackEncodedString(DFA63_specialS);
    static final short[][] DFA63_transition;

    static {
        int numStates = DFA63_transitionS.length;
        DFA63_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA63_transition[i] = DFA.unpackEncodedString(DFA63_transitionS[i]);
        }
    }

    class DFA63 extends DFA {

        public DFA63(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 63;
            this.eot = DFA63_eot;
            this.eof = DFA63_eof;
            this.min = DFA63_min;
            this.max = DFA63_max;
            this.accept = DFA63_accept;
            this.special = DFA63_special;
            this.transition = DFA63_transition;
        }
        public String getDescription() {
            return "657:7: ( cfOrKsName[name, true] '.' )?";
        }
    }
    static final String DFA80_eotS =
        "\56\uffff";
    static final String DFA80_eofS =
        "\56\uffff";
    static final String DFA80_minS =
        "\1\6\24\u0084\1\6\1\uffff\24\14\3\uffff";
    static final String DFA80_maxS =
        "\1\135\24\u008a\1\u0087\1\uffff\24\u008c\3\uffff";
    static final String DFA80_acceptS =
        "\26\uffff\1\4\24\uffff\1\1\1\2\1\3";
    static final String DFA80_specialS =
        "\56\uffff}>";
    static final String[] DFA80_transitionS = {
            "\1\24\7\uffff\1\3\2\24\5\uffff\1\3\1\uffff\1\17\5\uffff\1\10"+
            "\7\uffff\5\3\1\uffff\1\1\3\uffff\1\3\7\uffff\1\3\4\uffff\11"+
            "\3\1\2\10\uffff\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\20\1\21\1\22\1\23\1\3",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\26\5\uffff\1\25",
            "\1\52\5\uffff\1\53\1\uffff\1\31\2\52\5\uffff\1\31\1\uffff\1"+
            "\45\5\uffff\1\36\7\uffff\5\31\1\uffff\1\27\1\uffff\1\53\1\uffff"+
            "\1\31\7\uffff\1\31\4\uffff\11\31\1\30\7\53\1\uffff\1\32\1\33"+
            "\1\34\1\35\1\37\1\40\1\41\1\42\1\43\1\44\1\46\1\47\1\50\1\51"+
            "\1\31\42\uffff\1\53\3\uffff\1\53\2\uffff\1\53",
            "",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\176\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\163\uffff\1\53\12\uffff\2\54",
            "\1\55\176\uffff\2\54",
            "",
            "",
            ""
    };

    static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
    static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
    static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
    static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
    static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
    static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
    static final short[][] DFA80_transition;

    static {
        int numStates = DFA80_transitionS.length;
        DFA80_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
        }
    }

    class DFA80 extends DFA {

        public DFA80(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 80;
            this.eot = DFA80_eot;
            this.eof = DFA80_eof;
            this.min = DFA80_min;
            this.max = DFA80_max;
            this.accept = DFA80_accept;
            this.special = DFA80_special;
            this.transition = DFA80_transition;
        }
        public String getDescription() {
            return "726:1: columnOperation[List<Pair<ColumnIdentifier, Operation.RawUpdate>> operations] : (key= cident '=' t= term ( '+' c= cident )? | key= cident '=' c= cident sig= ( '+' | '-' ) t= term | key= cident '=' c= cident i= INTEGER | key= cident '[' k= term ']' '=' t= term );";
        }
    }
    static final String DFA88_eotS =
        "\30\uffff";
    static final String DFA88_eofS =
        "\30\uffff";
    static final String DFA88_minS =
        "\1\6\24\116\3\uffff";
    static final String DFA88_maxS =
        "\1\135\24\u0090\3\uffff";
    static final String DFA88_acceptS =
        "\25\uffff\1\2\1\3\1\1";
    static final String DFA88_specialS =
        "\30\uffff}>";
    static final String[] DFA88_transitionS = {
            "\1\24\7\uffff\1\3\2\24\5\uffff\1\3\1\uffff\1\17\5\uffff\1\10"+
            "\7\uffff\5\3\1\uffff\1\1\3\uffff\1\3\7\uffff\1\3\4\uffff\11"+
            "\3\1\2\6\uffff\1\25\1\uffff\1\4\1\5\1\6\1\7\1\11\1\12\1\13\1"+
            "\14\1\15\1\16\1\20\1\21\1\22\1\23\1\3",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "\1\26\73\uffff\1\27\2\uffff\4\27",
            "",
            "",
            ""
    };

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "782:1: relation[List<Relation> clauses] : (name= cident type= relationType t= term | K_TOKEN '(' name1= cident ( ',' namen= cident )* ')' type= relationType t= term | name= cident K_IN '(' (f1= term ( ',' fN= term )* )? ')' );";
        }
    }
 

    public static final BitSet FOLLOW_cqlStatement_in_query72 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_query75 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_EOF_in_query79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectStatement_in_cqlStatement113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertStatement_in_cqlStatement138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateStatement_in_cqlStatement163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_batchStatement_in_cqlStatement188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteStatement_in_cqlStatement214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_useStatement_in_cqlStatement239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_truncateStatement_in_cqlStatement267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createKeyspaceStatement_in_cqlStatement290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createColumnFamilyStatement_in_cqlStatement307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createIndexStatement_in_cqlStatement319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropKeyspaceStatement_in_cqlStatement338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropColumnFamilyStatement_in_cqlStatement356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropIndexStatement_in_cqlStatement370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterTableStatement_in_cqlStatement391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterKeyspaceStatement_in_cqlStatement411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grantStatement_in_cqlStatement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_revokeStatement_in_cqlStatement453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listPermissionsStatement_in_cqlStatement477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createUserStatement_in_cqlStatement492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterUserStatement_in_cqlStatement512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropUserStatement_in_cqlStatement533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listUsersStatement_in_cqlStatement555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USE_in_useStatement589 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_keyspaceName_in_useStatement593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SELECT_in_selectStatement627 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFFA07FL,0x0000000000000008L});
    public static final BitSet FOLLOW_selectClause_in_selectStatement633 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_K_COUNT_in_selectStatement638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_selectStatement640 = new BitSet(new long[]{0x0000000000001000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_selectCountClause_in_selectStatement644 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_selectStatement646 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_K_FROM_in_selectStatement659 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_columnFamilyName_in_selectStatement663 = new BitSet(new long[]{0x0000000000002B02L});
    public static final BitSet FOLLOW_K_WHERE_in_selectStatement673 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFFA07FL});
    public static final BitSet FOLLOW_whereClause_in_selectStatement677 = new BitSet(new long[]{0x0000000000002A02L});
    public static final BitSet FOLLOW_K_ORDER_in_selectStatement690 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_K_BY_in_selectStatement692 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_orderByClause_in_selectStatement694 = new BitSet(new long[]{0x0000000000002802L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_selectStatement699 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_orderByClause_in_selectStatement701 = new BitSet(new long[]{0x0000000000002802L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_K_LIMIT_in_selectStatement718 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEGER_in_selectStatement722 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_K_ALLOW_in_selectStatement737 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_K_FILTERING_in_selectStatement739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selector_in_selectClause776 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_selectClause781 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFFA07FL});
    public static final BitSet FOLLOW_selector_in_selectClause785 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_131_in_selectClause797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_selectionFunctionArgs820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_selectionFunctionArgs822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_selectionFunctionArgs832 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFFA07FL});
    public static final BitSet FOLLOW_selector_in_selectionFunctionArgs836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_130_in_selectionFunctionArgs852 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFFA07FL});
    public static final BitSet FOLLOW_selector_in_selectionFunctionArgs856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_129_in_selectionFunctionArgs870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_selector895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_WRITETIME_in_selector938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_selector940 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_selector944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_selector946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TTL_in_selector969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_selector977 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_selector981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_selector983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionName_in_selector1008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_selectionFunctionArgs_in_selector1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_selectCountClause1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_selectCountClause1057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relation_in_whereClause1093 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_K_AND_in_whereClause1097 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFFA07FL});
    public static final BitSet FOLLOW_relation_in_whereClause1099 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_cident_in_orderByClause1130 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_K_ASC_in_orderByClause1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DESC_in_orderByClause1139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INSERT_in_insertStatement1177 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_K_INTO_in_insertStatement1179 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_columnFamilyName_in_insertStatement1183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_insertStatement1195 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_insertStatement1199 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_130_in_insertStatement1206 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_insertStatement1210 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_129_in_insertStatement1217 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_K_VALUES_in_insertStatement1227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_insertStatement1239 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_insertStatement1243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_130_in_insertStatement1249 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_insertStatement1253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_129_in_insertStatement1260 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_usingClause_in_insertStatement1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USING_in_usingClause1302 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_usingClauseObjective_in_usingClause1304 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_K_AND_in_usingClause1309 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_usingClauseObjective_in_usingClause1311 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseObjective1333 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEGER_in_usingClauseObjective1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TTL_in_usingClauseObjective1347 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEGER_in_usingClauseObjective1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_UPDATE_in_updateStatement1385 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_columnFamilyName_in_updateStatement1389 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_usingClause_in_updateStatement1399 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_K_SET_in_updateStatement1411 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_columnOperation_in_updateStatement1413 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_updateStatement1417 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_columnOperation_in_updateStatement1419 = new BitSet(new long[]{0x0000000000000100L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_K_WHERE_in_updateStatement1430 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFFA07FL});
    public static final BitSet FOLLOW_whereClause_in_updateStatement1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DELETE_in_deleteStatement1474 = new BitSet(new long[]{0xE10117C04141C0C0L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_deleteSelection_in_deleteStatement1480 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_K_FROM_in_deleteStatement1493 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_columnFamilyName_in_deleteStatement1497 = new BitSet(new long[]{0x0000000000800100L});
    public static final BitSet FOLLOW_usingClauseDelete_in_deleteStatement1507 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_K_WHERE_in_deleteStatement1519 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFFA07FL});
    public static final BitSet FOLLOW_whereClause_in_deleteStatement1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteOp_in_deleteSelection1566 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_deleteSelection1581 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_deleteOp_in_deleteSelection1585 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_cident_in_deleteOp1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_deleteOp1639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_deleteOp1641 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_deleteOp1645 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_deleteOp1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_USING_in_usingClauseDelete1667 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_usingClauseDelete1669 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEGER_in_usingClauseDelete1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BEGIN_in_batchStatement1707 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_K_UNLOGGED_in_batchStatement1717 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_K_COUNTER_in_batchStatement1723 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_K_BATCH_in_batchStatement1736 = new BitSet(new long[]{0x000000000A900000L});
    public static final BitSet FOLLOW_usingClause_in_batchStatement1740 = new BitSet(new long[]{0x000000000A900000L});
    public static final BitSet FOLLOW_batchStatementObjective_in_batchStatement1760 = new BitSet(new long[]{0x000000010A900000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_batchStatement1762 = new BitSet(new long[]{0x000000010A900000L});
    public static final BitSet FOLLOW_K_APPLY_in_batchStatement1776 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_K_BATCH_in_batchStatement1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertStatement_in_batchStatementObjective1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateStatement_in_batchStatementObjective1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteStatement_in_batchStatementObjective1835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createKeyspaceStatement1870 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_createKeyspaceStatement1872 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_keyspaceName_in_createKeyspaceStatement1876 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_K_WITH_in_createKeyspaceStatement1884 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_properties_in_createKeyspaceStatement1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createColumnFamilyStatement1912 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_createColumnFamilyStatement1914 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_columnFamilyName_in_createColumnFamilyStatement1918 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_cfamDefinition_in_createColumnFamilyStatement1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_cfamDefinition1947 = new BitSet(new long[]{0xE10117E04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition1949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_130_in_cfamDefinition1954 = new BitSet(new long[]{0xE10117E04141C040L,0x000000003FFF807FL,0x0000000000000006L});
    public static final BitSet FOLLOW_cfamColumns_in_cfamDefinition1956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_129_in_cfamDefinition1963 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_K_WITH_in_cfamDefinition1973 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition1975 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_K_AND_in_cfamDefinition1980 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cfamProperty_in_cfamDefinition1982 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_cident_in_cfamColumns2008 = new BitSet(new long[]{0xE10147C045404000L,0x000000003FFF803FL});
    public static final BitSet FOLLOW_comparatorType_in_cfamColumns2012 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns2017 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_K_KEY_in_cfamColumns2019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PRIMARY_in_cfamColumns2031 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_K_KEY_in_cfamColumns2033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_cfamColumns2035 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL,0x0000000000000001L});
    public static final BitSet FOLLOW_pkDef_in_cfamColumns2037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_130_in_cfamColumns2041 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_cfamColumns2045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_129_in_cfamColumns2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_pkDef2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_pkDef2082 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_pkDef2088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_130_in_pkDef2094 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_pkDef2098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_129_in_pkDef2105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_cfamProperty2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COMPACT_in_cfamProperty2134 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_K_STORAGE_in_cfamProperty2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CLUSTERING_in_cfamProperty2146 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_K_ORDER_in_cfamProperty2148 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_K_BY_in_cfamProperty2150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_cfamProperty2152 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty2154 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_130_in_cfamProperty2158 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cfamOrdering_in_cfamProperty2160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_129_in_cfamProperty2165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_cfamOrdering2193 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_K_ASC_in_cfamOrdering2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DESC_in_cfamOrdering2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createIndexStatement2238 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_K_CUSTOM_in_createIndexStatement2241 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_K_INDEX_in_createIndexStatement2247 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_IDENT_in_createIndexStatement2252 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_K_ON_in_createIndexStatement2256 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_columnFamilyName_in_createIndexStatement2260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_createIndexStatement2262 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_createIndexStatement2266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_createIndexStatement2268 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_K_USING_in_createIndexStatement2280 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_createIndexStatement2284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterKeyspaceStatement2327 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_alterKeyspaceStatement2329 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_keyspaceName_in_alterKeyspaceStatement2333 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_K_WITH_in_alterKeyspaceStatement2343 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_properties_in_alterKeyspaceStatement2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement2381 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_alterTableStatement2383 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_columnFamilyName_in_alterTableStatement2387 = new BitSet(new long[]{0x0006800800000000L});
    public static final BitSet FOLLOW_K_ALTER_in_alterTableStatement2401 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2405 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_K_TYPE_in_alterTableStatement2407 = new BitSet(new long[]{0xE10147C045404000L,0x000000003FFF803FL});
    public static final BitSet FOLLOW_comparatorType_in_alterTableStatement2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ADD_in_alterTableStatement2427 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2433 = new BitSet(new long[]{0xE10147C045404000L,0x000000003FFF803FL});
    public static final BitSet FOLLOW_comparatorType_in_alterTableStatement2437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_WITH_in_alterTableStatement2471 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_properties_in_alterTableStatement2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_RENAME_in_alterTableStatement2507 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2561 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_K_TO_in_alterTableStatement2563 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2567 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_K_AND_in_alterTableStatement2588 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2592 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_K_TO_in_alterTableStatement2594 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_alterTableStatement2598 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_K_DROP_in_dropKeyspaceStatement2644 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_dropKeyspaceStatement2646 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_keyspaceName_in_dropKeyspaceStatement2650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropColumnFamilyStatement2675 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dropColumnFamilyStatement2677 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_columnFamilyName_in_dropColumnFamilyStatement2681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropIndexStatement2712 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_K_INDEX_in_dropIndexStatement2714 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_IDENT_in_dropIndexStatement2718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TRUNCATE_in_truncateStatement2749 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_columnFamilyName_in_truncateStatement2753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_GRANT_in_grantStatement2778 = new BitSet(new long[]{0x3810800200000020L});
    public static final BitSet FOLLOW_permissionOrAll_in_grantStatement2790 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_K_ON_in_grantStatement2798 = new BitSet(new long[]{0xE10117D44141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_resource_in_grantStatement2810 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_K_TO_in_grantStatement2818 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_username_in_grantStatement2830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_REVOKE_in_revokeStatement2861 = new BitSet(new long[]{0x3810800200000020L});
    public static final BitSet FOLLOW_permissionOrAll_in_revokeStatement2873 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_K_ON_in_revokeStatement2881 = new BitSet(new long[]{0xE10117D44141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_resource_in_revokeStatement2893 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_K_FROM_in_revokeStatement2901 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_username_in_revokeStatement2913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_listPermissionsStatement2951 = new BitSet(new long[]{0x3810800200000020L});
    public static final BitSet FOLLOW_permissionOrAll_in_listPermissionsStatement2963 = new BitSet(new long[]{0x0600200000000002L});
    public static final BitSet FOLLOW_K_ON_in_listPermissionsStatement2973 = new BitSet(new long[]{0xE10117D44141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_resource_in_listPermissionsStatement2975 = new BitSet(new long[]{0x0600000000000002L});
    public static final BitSet FOLLOW_K_OF_in_listPermissionsStatement2990 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_username_in_listPermissionsStatement2992 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_K_NORECURSIVE_in_listPermissionsStatement3007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_permission3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALL_in_permissionOrAll3092 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_K_PERMISSIONS_in_permissionOrAll3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_permission_in_permissionOrAll3117 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_K_PERMISSION_in_permissionOrAll3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataResource_in_resource3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALL_in_dataResource3172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_K_KEYSPACES_in_dataResource3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_KEYSPACE_in_dataResource3184 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_keyspaceName_in_dataResource3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COLUMNFAMILY_in_dataResource3202 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_columnFamilyName_in_dataResource3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_CREATE_in_createUserStatement3251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_K_USER_in_createUserStatement3253 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_username_in_createUserStatement3255 = new BitSet(new long[]{0x0000000800000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_K_WITH_in_createUserStatement3265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_userOptions_in_createUserStatement3267 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_K_SUPERUSER_in_createUserStatement3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NOSUPERUSER_in_createUserStatement3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ALTER_in_alterUserStatement3332 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_K_USER_in_alterUserStatement3334 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_username_in_alterUserStatement3336 = new BitSet(new long[]{0x0000000800000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_K_WITH_in_alterUserStatement3346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_userOptions_in_alterUserStatement3348 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_K_SUPERUSER_in_alterUserStatement3362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NOSUPERUSER_in_alterUserStatement3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DROP_in_dropUserStatement3404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_K_USER_in_dropUserStatement3406 = new BitSet(new long[]{0x0000500000000000L});
    public static final BitSet FOLLOW_username_in_dropUserStatement3408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_listUsersStatement3433 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_K_USERS_in_listUsersStatement3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_userOption_in_userOptions3455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_PASSWORD_in_userOption3476 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_userOption3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cident3509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_cident3534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_cident3553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfOrKsName_in_keyspaceName3586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cfOrKsName_in_columnFamilyName3620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_columnFamilyName3623 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cfOrKsName_in_columnFamilyName3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_cfOrKsName3648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTED_NAME_in_cfOrKsName3673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_cfOrKsName3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_constant3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_constant3729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constant3748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_constant3769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UUID_in_constant3788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_HEXNUMBER_in_constant3810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_map_literal3838 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000291L});
    public static final BitSet FOLLOW_term_in_map_literal3856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_map_literal3858 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_map_literal3862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_130_in_map_literal3868 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_map_literal3872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_map_literal3874 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_map_literal3878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000204L});
    public static final BitSet FOLLOW_137_in_map_literal3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_set_or_map3918 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_set_or_map3922 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_set_or_map3938 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_set_or_map3942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_set_or_map3944 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_set_or_map3948 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_set_or_map3983 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_set_or_map3987 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_132_in_collection_literal4021 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x00000000000000B1L});
    public static final BitSet FOLLOW_term_in_collection_literal4039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_130_in_collection_literal4045 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_collection_literal4049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_133_in_collection_literal4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_collection_literal4075 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_collection_literal4079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000304L});
    public static final BitSet FOLLOW_set_or_map_in_collection_literal4083 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_collection_literal4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_collection_literal4106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_collection_literal4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_value4133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_literal_in_value4155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_NULL_in_value4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QMARK_in_value4189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IDENT_in_functionName4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_function_keyword_in_functionName4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TOKEN_in_functionName4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_functionArgs4318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_functionArgs4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_functionArgs4330 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_functionArgs4334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_130_in_functionArgs4350 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_functionArgs4354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_129_in_functionArgs4368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_term4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionName_in_term4430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_functionArgs_in_term4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_term4444 = new BitSet(new long[]{0xE10147C045404000L,0x000000003FFF803FL});
    public static final BitSet FOLLOW_comparatorType_in_term4448 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_term4450 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_term4454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation4477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_columnOperation4479 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_columnOperation4483 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_139_in_columnOperation4486 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_columnOperation4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation4511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_columnOperation4513 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_columnOperation4517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_set_in_columnOperation4521 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_columnOperation4531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation4549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_columnOperation4551 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_columnOperation4555 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_INTEGER_in_columnOperation4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_columnOperation4577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_132_in_columnOperation4579 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_columnOperation4583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_columnOperation4585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_columnOperation4587 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_columnOperation4591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_property_in_properties4617 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_K_AND_in_properties4621 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_property_in_properties4623 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_cident_in_property4646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_property4648 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFF87FFL,0x0000000000000080L});
    public static final BitSet FOLLOW_propertyValue_in_property4653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_map_literal_in_property4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_propertyValue4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_keyword_in_propertyValue4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_relationType4755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_relationType4766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_relationType4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_relationType4787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_relationType4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation4820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000001E400L});
    public static final BitSet FOLLOW_relationType_in_relation4824 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_relation4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TOKEN_in_relation4838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_relation4861 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_relation4865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_130_in_relation4871 = new BitSet(new long[]{0xE10117C04141C040L,0x000000003FFF807FL});
    public static final BitSet FOLLOW_cident_in_relation4875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_129_in_relation4881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000001E400L});
    public static final BitSet FOLLOW_relationType_in_relation4893 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_relation4897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_cident_in_relation4917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_K_IN_in_relation4919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_relation4930 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000093L});
    public static final BitSet FOLLOW_term_in_relation4936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_130_in_relation4941 = new BitSet(new long[]{0xE10157C04141D040L,0x000000003FFFBFFFL,0x0000000000000091L});
    public static final BitSet FOLLOW_term_in_relation4945 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_129_in_relation4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_comparatorType4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_collection_type_in_comparatorType4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_comparatorType5008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_ASCII_in_native_type5037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BIGINT_in_native_type5051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BLOB_in_native_type5064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_BOOLEAN_in_native_type5079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_COUNTER_in_native_type5091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DECIMAL_in_native_type5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_DOUBLE_in_native_type5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_FLOAT_in_native_type5128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INET_in_native_type5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_INT_in_native_type5157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TEXT_in_native_type5173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TIMESTAMP_in_native_type5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_UUID_in_native_type5198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_VARCHAR_in_native_type5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_VARINT_in_native_type5225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_TIMEUUID_in_native_type5238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_MAP_in_collection_type5262 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_collection_type5265 = new BitSet(new long[]{0xE10147C045404000L,0x000000003FFF803FL});
    public static final BitSet FOLLOW_comparatorType_in_collection_type5269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_collection_type5271 = new BitSet(new long[]{0xE10147C045404000L,0x000000003FFF803FL});
    public static final BitSet FOLLOW_comparatorType_in_collection_type5275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_collection_type5277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_LIST_in_collection_type5295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_collection_type5297 = new BitSet(new long[]{0xE10147C045404000L,0x000000003FFF803FL});
    public static final BitSet FOLLOW_comparatorType_in_collection_type5301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_collection_type5303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_K_SET_in_collection_type5321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_collection_type5324 = new BitSet(new long[]{0xE10147C045404000L,0x000000003FFF803FL});
    public static final BitSet FOLLOW_comparatorType_in_collection_type5328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_collection_type5330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_username0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_unreserved_function_keyword_in_unreserved_keyword5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unreserved_keyword5404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_unreserved_function_keyword5439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_native_type_in_unreserved_function_keyword5679 = new BitSet(new long[]{0x0000000000000002L});

}