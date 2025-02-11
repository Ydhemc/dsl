package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'MM'", "'KM'", "'CM'", "'M'", "'DM'", "'HM'", "'DAM'", "'RAD'", "'INF'", "'SUP'", "'INF_EQ'", "'EQ'", "'SUP_EQ'", "'NEQ'", "'OR'", "'AND'", "'ADD'", "'SUB'", "'DIV'", "'MULT'", "'Variable'", "'{'", "'}'", "'name'", "'type'", "'Negative'", "'expression'", "'variable'", "','", "'BinaryArithmetic'", "'operation'", "'Type'", "'Bool'", "'Real'", "'unit'", "'CallExpr'", "'fonction'", "'parameters'", "'VarExpr'", "'variableRef'", "'Not'", "'BinaryBool'", "'SensorExpr'", "'sensor'", "'Sensor'", "'SensorDistance'", "'SensorTime'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:53:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleType EOF )
            // InternalMyDsl.g:55:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:62:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Type__Alternatives ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Type__Alternatives ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Type__Alternatives ) )
            // InternalMyDsl.g:68:3: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:69:3: ( rule__Type__Alternatives )
            // InternalMyDsl.g:69:4: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:78:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleExpression EOF )
            // InternalMyDsl.g:80:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:87:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Expression__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Expression__Alternatives )
            // InternalMyDsl.g:94:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:103:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleVariable EOF )
            // InternalMyDsl.g:105:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:112:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Variable__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Variable__Group__0 )
            // InternalMyDsl.g:119:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleNegative"
    // InternalMyDsl.g:128:1: entryRuleNegative : ruleNegative EOF ;
    public final void entryRuleNegative() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleNegative EOF )
            // InternalMyDsl.g:130:1: ruleNegative EOF
            {
             before(grammarAccess.getNegativeRule()); 
            pushFollow(FOLLOW_1);
            ruleNegative();

            state._fsp--;

             after(grammarAccess.getNegativeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNegative"


    // $ANTLR start "ruleNegative"
    // InternalMyDsl.g:137:1: ruleNegative : ( ( rule__Negative__Group__0 ) ) ;
    public final void ruleNegative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Negative__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Negative__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Negative__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Negative__Group__0 )
            {
             before(grammarAccess.getNegativeAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Negative__Group__0 )
            // InternalMyDsl.g:144:4: rule__Negative__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Negative__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNegativeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegative"


    // $ANTLR start "entryRuleBinaryArithmetic"
    // InternalMyDsl.g:153:1: entryRuleBinaryArithmetic : ruleBinaryArithmetic EOF ;
    public final void entryRuleBinaryArithmetic() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleBinaryArithmetic EOF )
            // InternalMyDsl.g:155:1: ruleBinaryArithmetic EOF
            {
             before(grammarAccess.getBinaryArithmeticRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryArithmetic();

            state._fsp--;

             after(grammarAccess.getBinaryArithmeticRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBinaryArithmetic"


    // $ANTLR start "ruleBinaryArithmetic"
    // InternalMyDsl.g:162:1: ruleBinaryArithmetic : ( ( rule__BinaryArithmetic__Group__0 ) ) ;
    public final void ruleBinaryArithmetic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__BinaryArithmetic__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__BinaryArithmetic__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__BinaryArithmetic__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__BinaryArithmetic__Group__0 )
            {
             before(grammarAccess.getBinaryArithmeticAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__BinaryArithmetic__Group__0 )
            // InternalMyDsl.g:169:4: rule__BinaryArithmetic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryArithmeticAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryArithmetic"


    // $ANTLR start "entryRuleType_Impl"
    // InternalMyDsl.g:178:1: entryRuleType_Impl : ruleType_Impl EOF ;
    public final void entryRuleType_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleType_Impl EOF )
            // InternalMyDsl.g:180:1: ruleType_Impl EOF
            {
             before(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleType_Impl();

            state._fsp--;

             after(grammarAccess.getType_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalMyDsl.g:187:1: ruleType_Impl : ( ( rule__Type_Impl__Group__0 ) ) ;
    public final void ruleType_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Type_Impl__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Type_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Type_Impl__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Type_Impl__Group__0 )
            {
             before(grammarAccess.getType_ImplAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Type_Impl__Group__0 )
            // InternalMyDsl.g:194:4: rule__Type_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getType_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleString0"
    // InternalMyDsl.g:203:1: entryRuleString0 : ruleString0 EOF ;
    public final void entryRuleString0() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleString0 EOF )
            // InternalMyDsl.g:205:1: ruleString0 EOF
            {
             before(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getString0Rule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalMyDsl.g:212:1: ruleString0 : ( 'String' ) ;
    public final void ruleString0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( 'String' ) )
            // InternalMyDsl.g:217:2: ( 'String' )
            {
            // InternalMyDsl.g:217:2: ( 'String' )
            // InternalMyDsl.g:218:3: 'String'
            {
             before(grammarAccess.getString0Access().getStringKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getString0Access().getStringKeyword()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleBool"
    // InternalMyDsl.g:228:1: entryRuleBool : ruleBool EOF ;
    public final void entryRuleBool() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleBool EOF )
            // InternalMyDsl.g:230:1: ruleBool EOF
            {
             before(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            ruleBool();

            state._fsp--;

             after(grammarAccess.getBoolRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalMyDsl.g:237:1: ruleBool : ( ( rule__Bool__Group__0 ) ) ;
    public final void ruleBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Bool__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Bool__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Bool__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Bool__Group__0 )
            {
             before(grammarAccess.getBoolAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Bool__Group__0 )
            // InternalMyDsl.g:244:4: rule__Bool__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBoolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleReal"
    // InternalMyDsl.g:253:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleReal EOF )
            // InternalMyDsl.g:255:1: ruleReal EOF
            {
             before(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_1);
            ruleReal();

            state._fsp--;

             after(grammarAccess.getRealRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalMyDsl.g:262:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Real__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Real__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Real__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Real__Group__0 )
            {
             before(grammarAccess.getRealAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Real__Group__0 )
            // InternalMyDsl.g:269:4: rule__Real__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleCallExpr"
    // InternalMyDsl.g:278:1: entryRuleCallExpr : ruleCallExpr EOF ;
    public final void entryRuleCallExpr() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleCallExpr EOF )
            // InternalMyDsl.g:280:1: ruleCallExpr EOF
            {
             before(grammarAccess.getCallExprRule()); 
            pushFollow(FOLLOW_1);
            ruleCallExpr();

            state._fsp--;

             after(grammarAccess.getCallExprRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCallExpr"


    // $ANTLR start "ruleCallExpr"
    // InternalMyDsl.g:287:1: ruleCallExpr : ( ( rule__CallExpr__Group__0 ) ) ;
    public final void ruleCallExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__CallExpr__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__CallExpr__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__CallExpr__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__CallExpr__Group__0 )
            {
             before(grammarAccess.getCallExprAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__CallExpr__Group__0 )
            // InternalMyDsl.g:294:4: rule__CallExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CallExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCallExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCallExpr"


    // $ANTLR start "entryRuleVarExpr"
    // InternalMyDsl.g:303:1: entryRuleVarExpr : ruleVarExpr EOF ;
    public final void entryRuleVarExpr() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleVarExpr EOF )
            // InternalMyDsl.g:305:1: ruleVarExpr EOF
            {
             before(grammarAccess.getVarExprRule()); 
            pushFollow(FOLLOW_1);
            ruleVarExpr();

            state._fsp--;

             after(grammarAccess.getVarExprRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVarExpr"


    // $ANTLR start "ruleVarExpr"
    // InternalMyDsl.g:312:1: ruleVarExpr : ( ( rule__VarExpr__Group__0 ) ) ;
    public final void ruleVarExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__VarExpr__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__VarExpr__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__VarExpr__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__VarExpr__Group__0 )
            {
             before(grammarAccess.getVarExprAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__VarExpr__Group__0 )
            // InternalMyDsl.g:319:4: rule__VarExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVarExpr"


    // $ANTLR start "entryRuleNot"
    // InternalMyDsl.g:328:1: entryRuleNot : ruleNot EOF ;
    public final void entryRuleNot() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleNot EOF )
            // InternalMyDsl.g:330:1: ruleNot EOF
            {
             before(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            ruleNot();

            state._fsp--;

             after(grammarAccess.getNotRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalMyDsl.g:337:1: ruleNot : ( ( rule__Not__Group__0 ) ) ;
    public final void ruleNot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Not__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Not__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Not__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Not__Group__0 )
            {
             before(grammarAccess.getNotAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Not__Group__0 )
            // InternalMyDsl.g:344:4: rule__Not__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleBinaryBool"
    // InternalMyDsl.g:353:1: entryRuleBinaryBool : ruleBinaryBool EOF ;
    public final void entryRuleBinaryBool() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleBinaryBool EOF )
            // InternalMyDsl.g:355:1: ruleBinaryBool EOF
            {
             before(grammarAccess.getBinaryBoolRule()); 
            pushFollow(FOLLOW_1);
            ruleBinaryBool();

            state._fsp--;

             after(grammarAccess.getBinaryBoolRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBinaryBool"


    // $ANTLR start "ruleBinaryBool"
    // InternalMyDsl.g:362:1: ruleBinaryBool : ( ( rule__BinaryBool__Group__0 ) ) ;
    public final void ruleBinaryBool() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__BinaryBool__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__BinaryBool__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__BinaryBool__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__BinaryBool__Group__0 )
            {
             before(grammarAccess.getBinaryBoolAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__BinaryBool__Group__0 )
            // InternalMyDsl.g:369:4: rule__BinaryBool__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBinaryBoolAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBinaryBool"


    // $ANTLR start "entryRuleSensorExpr"
    // InternalMyDsl.g:378:1: entryRuleSensorExpr : ruleSensorExpr EOF ;
    public final void entryRuleSensorExpr() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleSensorExpr EOF )
            // InternalMyDsl.g:380:1: ruleSensorExpr EOF
            {
             before(grammarAccess.getSensorExprRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorExpr();

            state._fsp--;

             after(grammarAccess.getSensorExprRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensorExpr"


    // $ANTLR start "ruleSensorExpr"
    // InternalMyDsl.g:387:1: ruleSensorExpr : ( ( rule__SensorExpr__Group__0 ) ) ;
    public final void ruleSensorExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__SensorExpr__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__SensorExpr__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__SensorExpr__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__SensorExpr__Group__0 )
            {
             before(grammarAccess.getSensorExprAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__SensorExpr__Group__0 )
            // InternalMyDsl.g:394:4: rule__SensorExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorExpr__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorExprAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorExpr"


    // $ANTLR start "entryRuleSensor_Impl"
    // InternalMyDsl.g:403:1: entryRuleSensor_Impl : ruleSensor_Impl EOF ;
    public final void entryRuleSensor_Impl() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleSensor_Impl EOF )
            // InternalMyDsl.g:405:1: ruleSensor_Impl EOF
            {
             before(grammarAccess.getSensor_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor_Impl();

            state._fsp--;

             after(grammarAccess.getSensor_ImplRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensor_Impl"


    // $ANTLR start "ruleSensor_Impl"
    // InternalMyDsl.g:412:1: ruleSensor_Impl : ( ( rule__Sensor_Impl__Group__0 ) ) ;
    public final void ruleSensor_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Sensor_Impl__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Sensor_Impl__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Sensor_Impl__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Sensor_Impl__Group__0 )
            {
             before(grammarAccess.getSensor_ImplAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Sensor_Impl__Group__0 )
            // InternalMyDsl.g:419:4: rule__Sensor_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sensor_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensor_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor_Impl"


    // $ANTLR start "entryRuleSensorDistance"
    // InternalMyDsl.g:428:1: entryRuleSensorDistance : ruleSensorDistance EOF ;
    public final void entryRuleSensorDistance() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleSensorDistance EOF )
            // InternalMyDsl.g:430:1: ruleSensorDistance EOF
            {
             before(grammarAccess.getSensorDistanceRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorDistance();

            state._fsp--;

             after(grammarAccess.getSensorDistanceRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensorDistance"


    // $ANTLR start "ruleSensorDistance"
    // InternalMyDsl.g:437:1: ruleSensorDistance : ( ( rule__SensorDistance__Group__0 ) ) ;
    public final void ruleSensorDistance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__SensorDistance__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__SensorDistance__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__SensorDistance__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__SensorDistance__Group__0 )
            {
             before(grammarAccess.getSensorDistanceAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__SensorDistance__Group__0 )
            // InternalMyDsl.g:444:4: rule__SensorDistance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorDistance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorDistanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorDistance"


    // $ANTLR start "entryRuleSensorTime"
    // InternalMyDsl.g:453:1: entryRuleSensorTime : ruleSensorTime EOF ;
    public final void entryRuleSensorTime() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleSensorTime EOF )
            // InternalMyDsl.g:455:1: ruleSensorTime EOF
            {
             before(grammarAccess.getSensorTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleSensorTime();

            state._fsp--;

             after(grammarAccess.getSensorTimeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSensorTime"


    // $ANTLR start "ruleSensorTime"
    // InternalMyDsl.g:462:1: ruleSensorTime : ( ( rule__SensorTime__Group__0 ) ) ;
    public final void ruleSensorTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__SensorTime__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__SensorTime__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__SensorTime__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__SensorTime__Group__0 )
            {
             before(grammarAccess.getSensorTimeAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__SensorTime__Group__0 )
            // InternalMyDsl.g:469:4: rule__SensorTime__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SensorTime__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSensorTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensorTime"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:478:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleEString EOF )
            // InternalMyDsl.g:480:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:487:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:493:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:494:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:494:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleUnit"
    // InternalMyDsl.g:503:1: ruleUnit : ( ( rule__Unit__Alternatives ) ) ;
    public final void ruleUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:507:1: ( ( ( rule__Unit__Alternatives ) ) )
            // InternalMyDsl.g:508:2: ( ( rule__Unit__Alternatives ) )
            {
            // InternalMyDsl.g:508:2: ( ( rule__Unit__Alternatives ) )
            // InternalMyDsl.g:509:3: ( rule__Unit__Alternatives )
            {
             before(grammarAccess.getUnitAccess().getAlternatives()); 
            // InternalMyDsl.g:510:3: ( rule__Unit__Alternatives )
            // InternalMyDsl.g:510:4: rule__Unit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Unit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "ruleBoolOperation"
    // InternalMyDsl.g:519:1: ruleBoolOperation : ( ( rule__BoolOperation__Alternatives ) ) ;
    public final void ruleBoolOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:523:1: ( ( ( rule__BoolOperation__Alternatives ) ) )
            // InternalMyDsl.g:524:2: ( ( rule__BoolOperation__Alternatives ) )
            {
            // InternalMyDsl.g:524:2: ( ( rule__BoolOperation__Alternatives ) )
            // InternalMyDsl.g:525:3: ( rule__BoolOperation__Alternatives )
            {
             before(grammarAccess.getBoolOperationAccess().getAlternatives()); 
            // InternalMyDsl.g:526:3: ( rule__BoolOperation__Alternatives )
            // InternalMyDsl.g:526:4: rule__BoolOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoolOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoolOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolOperation"


    // $ANTLR start "ruleArithmeticOperation"
    // InternalMyDsl.g:535:1: ruleArithmeticOperation : ( ( rule__ArithmeticOperation__Alternatives ) ) ;
    public final void ruleArithmeticOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:539:1: ( ( ( rule__ArithmeticOperation__Alternatives ) ) )
            // InternalMyDsl.g:540:2: ( ( rule__ArithmeticOperation__Alternatives ) )
            {
            // InternalMyDsl.g:540:2: ( ( rule__ArithmeticOperation__Alternatives ) )
            // InternalMyDsl.g:541:3: ( rule__ArithmeticOperation__Alternatives )
            {
             before(grammarAccess.getArithmeticOperationAccess().getAlternatives()); 
            // InternalMyDsl.g:542:3: ( rule__ArithmeticOperation__Alternatives )
            // InternalMyDsl.g:542:4: rule__ArithmeticOperation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ArithmeticOperation__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArithmeticOperationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArithmeticOperation"


    // $ANTLR start "rule__Type__Alternatives"
    // InternalMyDsl.g:550:1: rule__Type__Alternatives : ( ( ruleType_Impl ) | ( ruleBool ) | ( ruleReal ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:554:1: ( ( ruleType_Impl ) | ( ruleBool ) | ( ruleReal ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt1=1;
                }
                break;
            case 44:
                {
                alt1=2;
                }
                break;
            case 45:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:555:2: ( ruleType_Impl )
                    {
                    // InternalMyDsl.g:555:2: ( ruleType_Impl )
                    // InternalMyDsl.g:556:3: ruleType_Impl
                    {
                     before(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleType_Impl();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:561:2: ( ruleBool )
                    {
                    // InternalMyDsl.g:561:2: ( ruleBool )
                    // InternalMyDsl.g:562:3: ruleBool
                    {
                     before(grammarAccess.getTypeAccess().getBoolParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBool();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getBoolParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:567:2: ( ruleReal )
                    {
                    // InternalMyDsl.g:567:2: ( ruleReal )
                    // InternalMyDsl.g:568:3: ruleReal
                    {
                     before(grammarAccess.getTypeAccess().getRealParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleReal();

                    state._fsp--;

                     after(grammarAccess.getTypeAccess().getRealParserRuleCall_2()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMyDsl.g:577:1: rule__Expression__Alternatives : ( ( ruleCallExpr ) | ( ruleVarExpr ) | ( ruleNegative ) | ( ruleBinaryArithmetic ) | ( ruleNot ) | ( ruleBinaryBool ) | ( ruleSensorExpr ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:581:1: ( ( ruleCallExpr ) | ( ruleVarExpr ) | ( ruleNegative ) | ( ruleBinaryArithmetic ) | ( ruleNot ) | ( ruleBinaryBool ) | ( ruleSensorExpr ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt2=1;
                }
                break;
            case 50:
                {
                alt2=2;
                }
                break;
            case 37:
                {
                alt2=3;
                }
                break;
            case 41:
                {
                alt2=4;
                }
                break;
            case 52:
                {
                alt2=5;
                }
                break;
            case 53:
                {
                alt2=6;
                }
                break;
            case 54:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:582:2: ( ruleCallExpr )
                    {
                    // InternalMyDsl.g:582:2: ( ruleCallExpr )
                    // InternalMyDsl.g:583:3: ruleCallExpr
                    {
                     before(grammarAccess.getExpressionAccess().getCallExprParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCallExpr();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getCallExprParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:588:2: ( ruleVarExpr )
                    {
                    // InternalMyDsl.g:588:2: ( ruleVarExpr )
                    // InternalMyDsl.g:589:3: ruleVarExpr
                    {
                     before(grammarAccess.getExpressionAccess().getVarExprParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVarExpr();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getVarExprParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:594:2: ( ruleNegative )
                    {
                    // InternalMyDsl.g:594:2: ( ruleNegative )
                    // InternalMyDsl.g:595:3: ruleNegative
                    {
                     before(grammarAccess.getExpressionAccess().getNegativeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleNegative();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getNegativeParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:600:2: ( ruleBinaryArithmetic )
                    {
                    // InternalMyDsl.g:600:2: ( ruleBinaryArithmetic )
                    // InternalMyDsl.g:601:3: ruleBinaryArithmetic
                    {
                     before(grammarAccess.getExpressionAccess().getBinaryArithmeticParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBinaryArithmetic();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBinaryArithmeticParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:606:2: ( ruleNot )
                    {
                    // InternalMyDsl.g:606:2: ( ruleNot )
                    // InternalMyDsl.g:607:3: ruleNot
                    {
                     before(grammarAccess.getExpressionAccess().getNotParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleNot();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getNotParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:612:2: ( ruleBinaryBool )
                    {
                    // InternalMyDsl.g:612:2: ( ruleBinaryBool )
                    // InternalMyDsl.g:613:3: ruleBinaryBool
                    {
                     before(grammarAccess.getExpressionAccess().getBinaryBoolParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleBinaryBool();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getBinaryBoolParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:618:2: ( ruleSensorExpr )
                    {
                    // InternalMyDsl.g:618:2: ( ruleSensorExpr )
                    // InternalMyDsl.g:619:3: ruleSensorExpr
                    {
                     before(grammarAccess.getExpressionAccess().getSensorExprParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleSensorExpr();

                    state._fsp--;

                     after(grammarAccess.getExpressionAccess().getSensorExprParserRuleCall_6()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:628:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:632:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:633:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:633:2: ( RULE_STRING )
                    // InternalMyDsl.g:634:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:639:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:639:2: ( RULE_ID )
                    // InternalMyDsl.g:640:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Unit__Alternatives"
    // InternalMyDsl.g:649:1: rule__Unit__Alternatives : ( ( ( 'MM' ) ) | ( ( 'KM' ) ) | ( ( 'CM' ) ) | ( ( 'M' ) ) | ( ( 'DM' ) ) | ( ( 'HM' ) ) | ( ( 'DAM' ) ) | ( ( 'RAD' ) ) );
    public final void rule__Unit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:653:1: ( ( ( 'MM' ) ) | ( ( 'KM' ) ) | ( ( 'CM' ) ) | ( ( 'M' ) ) | ( ( 'DM' ) ) | ( ( 'HM' ) ) | ( ( 'DAM' ) ) | ( ( 'RAD' ) ) )
            int alt4=8;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            case 15:
                {
                alt4=4;
                }
                break;
            case 16:
                {
                alt4=5;
                }
                break;
            case 17:
                {
                alt4=6;
                }
                break;
            case 18:
                {
                alt4=7;
                }
                break;
            case 19:
                {
                alt4=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:654:2: ( ( 'MM' ) )
                    {
                    // InternalMyDsl.g:654:2: ( ( 'MM' ) )
                    // InternalMyDsl.g:655:3: ( 'MM' )
                    {
                     before(grammarAccess.getUnitAccess().getMMEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:656:3: ( 'MM' )
                    // InternalMyDsl.g:656:4: 'MM'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnitAccess().getMMEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:660:2: ( ( 'KM' ) )
                    {
                    // InternalMyDsl.g:660:2: ( ( 'KM' ) )
                    // InternalMyDsl.g:661:3: ( 'KM' )
                    {
                     before(grammarAccess.getUnitAccess().getKMEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:662:3: ( 'KM' )
                    // InternalMyDsl.g:662:4: 'KM'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnitAccess().getKMEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:666:2: ( ( 'CM' ) )
                    {
                    // InternalMyDsl.g:666:2: ( ( 'CM' ) )
                    // InternalMyDsl.g:667:3: ( 'CM' )
                    {
                     before(grammarAccess.getUnitAccess().getCMEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:668:3: ( 'CM' )
                    // InternalMyDsl.g:668:4: 'CM'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnitAccess().getCMEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:672:2: ( ( 'M' ) )
                    {
                    // InternalMyDsl.g:672:2: ( ( 'M' ) )
                    // InternalMyDsl.g:673:3: ( 'M' )
                    {
                     before(grammarAccess.getUnitAccess().getMEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:674:3: ( 'M' )
                    // InternalMyDsl.g:674:4: 'M'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnitAccess().getMEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:678:2: ( ( 'DM' ) )
                    {
                    // InternalMyDsl.g:678:2: ( ( 'DM' ) )
                    // InternalMyDsl.g:679:3: ( 'DM' )
                    {
                     before(grammarAccess.getUnitAccess().getDMEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:680:3: ( 'DM' )
                    // InternalMyDsl.g:680:4: 'DM'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnitAccess().getDMEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:684:2: ( ( 'HM' ) )
                    {
                    // InternalMyDsl.g:684:2: ( ( 'HM' ) )
                    // InternalMyDsl.g:685:3: ( 'HM' )
                    {
                     before(grammarAccess.getUnitAccess().getHMEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:686:3: ( 'HM' )
                    // InternalMyDsl.g:686:4: 'HM'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnitAccess().getHMEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:690:2: ( ( 'DAM' ) )
                    {
                    // InternalMyDsl.g:690:2: ( ( 'DAM' ) )
                    // InternalMyDsl.g:691:3: ( 'DAM' )
                    {
                     before(grammarAccess.getUnitAccess().getDAMEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:692:3: ( 'DAM' )
                    // InternalMyDsl.g:692:4: 'DAM'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnitAccess().getDAMEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:696:2: ( ( 'RAD' ) )
                    {
                    // InternalMyDsl.g:696:2: ( ( 'RAD' ) )
                    // InternalMyDsl.g:697:3: ( 'RAD' )
                    {
                     before(grammarAccess.getUnitAccess().getRADEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:698:3: ( 'RAD' )
                    // InternalMyDsl.g:698:4: 'RAD'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getUnitAccess().getRADEnumLiteralDeclaration_7()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Unit__Alternatives"


    // $ANTLR start "rule__BoolOperation__Alternatives"
    // InternalMyDsl.g:706:1: rule__BoolOperation__Alternatives : ( ( ( 'INF' ) ) | ( ( 'SUP' ) ) | ( ( 'INF_EQ' ) ) | ( ( 'EQ' ) ) | ( ( 'SUP_EQ' ) ) | ( ( 'NEQ' ) ) | ( ( 'OR' ) ) | ( ( 'AND' ) ) );
    public final void rule__BoolOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:710:1: ( ( ( 'INF' ) ) | ( ( 'SUP' ) ) | ( ( 'INF_EQ' ) ) | ( ( 'EQ' ) ) | ( ( 'SUP_EQ' ) ) | ( ( 'NEQ' ) ) | ( ( 'OR' ) ) | ( ( 'AND' ) ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            case 25:
                {
                alt5=6;
                }
                break;
            case 26:
                {
                alt5=7;
                }
                break;
            case 27:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:711:2: ( ( 'INF' ) )
                    {
                    // InternalMyDsl.g:711:2: ( ( 'INF' ) )
                    // InternalMyDsl.g:712:3: ( 'INF' )
                    {
                     before(grammarAccess.getBoolOperationAccess().getINFEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:713:3: ( 'INF' )
                    // InternalMyDsl.g:713:4: 'INF'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolOperationAccess().getINFEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:717:2: ( ( 'SUP' ) )
                    {
                    // InternalMyDsl.g:717:2: ( ( 'SUP' ) )
                    // InternalMyDsl.g:718:3: ( 'SUP' )
                    {
                     before(grammarAccess.getBoolOperationAccess().getSUPEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:719:3: ( 'SUP' )
                    // InternalMyDsl.g:719:4: 'SUP'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolOperationAccess().getSUPEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:723:2: ( ( 'INF_EQ' ) )
                    {
                    // InternalMyDsl.g:723:2: ( ( 'INF_EQ' ) )
                    // InternalMyDsl.g:724:3: ( 'INF_EQ' )
                    {
                     before(grammarAccess.getBoolOperationAccess().getINF_EQEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:725:3: ( 'INF_EQ' )
                    // InternalMyDsl.g:725:4: 'INF_EQ'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolOperationAccess().getINF_EQEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:729:2: ( ( 'EQ' ) )
                    {
                    // InternalMyDsl.g:729:2: ( ( 'EQ' ) )
                    // InternalMyDsl.g:730:3: ( 'EQ' )
                    {
                     before(grammarAccess.getBoolOperationAccess().getEQEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:731:3: ( 'EQ' )
                    // InternalMyDsl.g:731:4: 'EQ'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolOperationAccess().getEQEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:735:2: ( ( 'SUP_EQ' ) )
                    {
                    // InternalMyDsl.g:735:2: ( ( 'SUP_EQ' ) )
                    // InternalMyDsl.g:736:3: ( 'SUP_EQ' )
                    {
                     before(grammarAccess.getBoolOperationAccess().getSUP_EQEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:737:3: ( 'SUP_EQ' )
                    // InternalMyDsl.g:737:4: 'SUP_EQ'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolOperationAccess().getSUP_EQEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:741:2: ( ( 'NEQ' ) )
                    {
                    // InternalMyDsl.g:741:2: ( ( 'NEQ' ) )
                    // InternalMyDsl.g:742:3: ( 'NEQ' )
                    {
                     before(grammarAccess.getBoolOperationAccess().getNEQEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:743:3: ( 'NEQ' )
                    // InternalMyDsl.g:743:4: 'NEQ'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolOperationAccess().getNEQEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:747:2: ( ( 'OR' ) )
                    {
                    // InternalMyDsl.g:747:2: ( ( 'OR' ) )
                    // InternalMyDsl.g:748:3: ( 'OR' )
                    {
                     before(grammarAccess.getBoolOperationAccess().getOREnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:749:3: ( 'OR' )
                    // InternalMyDsl.g:749:4: 'OR'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolOperationAccess().getOREnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:753:2: ( ( 'AND' ) )
                    {
                    // InternalMyDsl.g:753:2: ( ( 'AND' ) )
                    // InternalMyDsl.g:754:3: ( 'AND' )
                    {
                     before(grammarAccess.getBoolOperationAccess().getANDEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:755:3: ( 'AND' )
                    // InternalMyDsl.g:755:4: 'AND'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getBoolOperationAccess().getANDEnumLiteralDeclaration_7()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoolOperation__Alternatives"


    // $ANTLR start "rule__ArithmeticOperation__Alternatives"
    // InternalMyDsl.g:763:1: rule__ArithmeticOperation__Alternatives : ( ( ( 'ADD' ) ) | ( ( 'SUB' ) ) | ( ( 'DIV' ) ) | ( ( 'MULT' ) ) );
    public final void rule__ArithmeticOperation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( ( ( 'ADD' ) ) | ( ( 'SUB' ) ) | ( ( 'DIV' ) ) | ( ( 'MULT' ) ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            case 31:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:768:2: ( ( 'ADD' ) )
                    {
                    // InternalMyDsl.g:768:2: ( ( 'ADD' ) )
                    // InternalMyDsl.g:769:3: ( 'ADD' )
                    {
                     before(grammarAccess.getArithmeticOperationAccess().getADDEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:770:3: ( 'ADD' )
                    // InternalMyDsl.g:770:4: 'ADD'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getArithmeticOperationAccess().getADDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:774:2: ( ( 'SUB' ) )
                    {
                    // InternalMyDsl.g:774:2: ( ( 'SUB' ) )
                    // InternalMyDsl.g:775:3: ( 'SUB' )
                    {
                     before(grammarAccess.getArithmeticOperationAccess().getSUBEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:776:3: ( 'SUB' )
                    // InternalMyDsl.g:776:4: 'SUB'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getArithmeticOperationAccess().getSUBEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:780:2: ( ( 'DIV' ) )
                    {
                    // InternalMyDsl.g:780:2: ( ( 'DIV' ) )
                    // InternalMyDsl.g:781:3: ( 'DIV' )
                    {
                     before(grammarAccess.getArithmeticOperationAccess().getDIVEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:782:3: ( 'DIV' )
                    // InternalMyDsl.g:782:4: 'DIV'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getArithmeticOperationAccess().getDIVEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:786:2: ( ( 'MULT' ) )
                    {
                    // InternalMyDsl.g:786:2: ( ( 'MULT' ) )
                    // InternalMyDsl.g:787:3: ( 'MULT' )
                    {
                     before(grammarAccess.getArithmeticOperationAccess().getMULTEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:788:3: ( 'MULT' )
                    // InternalMyDsl.g:788:4: 'MULT'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getArithmeticOperationAccess().getMULTEnumLiteralDeclaration_3()); 

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArithmeticOperation__Alternatives"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMyDsl.g:796:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:800:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMyDsl.g:801:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalMyDsl.g:808:1: rule__Variable__Group__0__Impl : ( () ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:812:1: ( ( () ) )
            // InternalMyDsl.g:813:1: ( () )
            {
            // InternalMyDsl.g:813:1: ( () )
            // InternalMyDsl.g:814:2: ()
            {
             before(grammarAccess.getVariableAccess().getVariableAction_0()); 
            // InternalMyDsl.g:815:2: ()
            // InternalMyDsl.g:815:3: 
            {
            }

             after(grammarAccess.getVariableAccess().getVariableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalMyDsl.g:823:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:827:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMyDsl.g:828:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalMyDsl.g:835:1: rule__Variable__Group__1__Impl : ( 'Variable' ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:839:1: ( ( 'Variable' ) )
            // InternalMyDsl.g:840:1: ( 'Variable' )
            {
            // InternalMyDsl.g:840:1: ( 'Variable' )
            // InternalMyDsl.g:841:2: 'Variable'
            {
             before(grammarAccess.getVariableAccess().getVariableKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVariableKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalMyDsl.g:850:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:854:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalMyDsl.g:855:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalMyDsl.g:862:1: rule__Variable__Group__2__Impl : ( '{' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:1: ( ( '{' ) )
            // InternalMyDsl.g:867:1: ( '{' )
            {
            // InternalMyDsl.g:867:1: ( '{' )
            // InternalMyDsl.g:868:2: '{'
            {
             before(grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalMyDsl.g:877:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl rule__Variable__Group__4 ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:881:1: ( rule__Variable__Group__3__Impl rule__Variable__Group__4 )
            // InternalMyDsl.g:882:2: rule__Variable__Group__3__Impl rule__Variable__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Variable__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalMyDsl.g:889:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__Group_3__0 )? ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:893:1: ( ( ( rule__Variable__Group_3__0 )? ) )
            // InternalMyDsl.g:894:1: ( ( rule__Variable__Group_3__0 )? )
            {
            // InternalMyDsl.g:894:1: ( ( rule__Variable__Group_3__0 )? )
            // InternalMyDsl.g:895:2: ( rule__Variable__Group_3__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_3()); 
            // InternalMyDsl.g:896:2: ( rule__Variable__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==35) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:896:3: rule__Variable__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__Variable__Group__4"
    // InternalMyDsl.g:904:1: rule__Variable__Group__4 : rule__Variable__Group__4__Impl rule__Variable__Group__5 ;
    public final void rule__Variable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:908:1: ( rule__Variable__Group__4__Impl rule__Variable__Group__5 )
            // InternalMyDsl.g:909:2: rule__Variable__Group__4__Impl rule__Variable__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Variable__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4"


    // $ANTLR start "rule__Variable__Group__4__Impl"
    // InternalMyDsl.g:916:1: rule__Variable__Group__4__Impl : ( ( rule__Variable__Group_4__0 )? ) ;
    public final void rule__Variable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( ( ( rule__Variable__Group_4__0 )? ) )
            // InternalMyDsl.g:921:1: ( ( rule__Variable__Group_4__0 )? )
            {
            // InternalMyDsl.g:921:1: ( ( rule__Variable__Group_4__0 )? )
            // InternalMyDsl.g:922:2: ( rule__Variable__Group_4__0 )?
            {
             before(grammarAccess.getVariableAccess().getGroup_4()); 
            // InternalMyDsl.g:923:2: ( rule__Variable__Group_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:923:3: rule__Variable__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Variable__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVariableAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__4__Impl"


    // $ANTLR start "rule__Variable__Group__5"
    // InternalMyDsl.g:931:1: rule__Variable__Group__5 : rule__Variable__Group__5__Impl ;
    public final void rule__Variable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:935:1: ( rule__Variable__Group__5__Impl )
            // InternalMyDsl.g:936:2: rule__Variable__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__5"


    // $ANTLR start "rule__Variable__Group__5__Impl"
    // InternalMyDsl.g:942:1: rule__Variable__Group__5__Impl : ( '}' ) ;
    public final void rule__Variable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:946:1: ( ( '}' ) )
            // InternalMyDsl.g:947:1: ( '}' )
            {
            // InternalMyDsl.g:947:1: ( '}' )
            // InternalMyDsl.g:948:2: '}'
            {
             before(grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group__5__Impl"


    // $ANTLR start "rule__Variable__Group_3__0"
    // InternalMyDsl.g:958:1: rule__Variable__Group_3__0 : rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1 ;
    public final void rule__Variable__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:962:1: ( rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1 )
            // InternalMyDsl.g:963:2: rule__Variable__Group_3__0__Impl rule__Variable__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Variable__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3__0"


    // $ANTLR start "rule__Variable__Group_3__0__Impl"
    // InternalMyDsl.g:970:1: rule__Variable__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__Variable__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( ( 'name' ) )
            // InternalMyDsl.g:975:1: ( 'name' )
            {
            // InternalMyDsl.g:975:1: ( 'name' )
            // InternalMyDsl.g:976:2: 'name'
            {
             before(grammarAccess.getVariableAccess().getNameKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3__0__Impl"


    // $ANTLR start "rule__Variable__Group_3__1"
    // InternalMyDsl.g:985:1: rule__Variable__Group_3__1 : rule__Variable__Group_3__1__Impl ;
    public final void rule__Variable__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:989:1: ( rule__Variable__Group_3__1__Impl )
            // InternalMyDsl.g:990:2: rule__Variable__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3__1"


    // $ANTLR start "rule__Variable__Group_3__1__Impl"
    // InternalMyDsl.g:996:1: rule__Variable__Group_3__1__Impl : ( ( rule__Variable__NameAssignment_3_1 ) ) ;
    public final void rule__Variable__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1000:1: ( ( ( rule__Variable__NameAssignment_3_1 ) ) )
            // InternalMyDsl.g:1001:1: ( ( rule__Variable__NameAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1001:1: ( ( rule__Variable__NameAssignment_3_1 ) )
            // InternalMyDsl.g:1002:2: ( rule__Variable__NameAssignment_3_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_3_1()); 
            // InternalMyDsl.g:1003:2: ( rule__Variable__NameAssignment_3_1 )
            // InternalMyDsl.g:1003:3: rule__Variable__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_3__1__Impl"


    // $ANTLR start "rule__Variable__Group_4__0"
    // InternalMyDsl.g:1012:1: rule__Variable__Group_4__0 : rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 ;
    public final void rule__Variable__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1016:1: ( rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1 )
            // InternalMyDsl.g:1017:2: rule__Variable__Group_4__0__Impl rule__Variable__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Variable__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__0"


    // $ANTLR start "rule__Variable__Group_4__0__Impl"
    // InternalMyDsl.g:1024:1: rule__Variable__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Variable__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1028:1: ( ( 'type' ) )
            // InternalMyDsl.g:1029:1: ( 'type' )
            {
            // InternalMyDsl.g:1029:1: ( 'type' )
            // InternalMyDsl.g:1030:2: 'type'
            {
             before(grammarAccess.getVariableAccess().getTypeKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getTypeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__0__Impl"


    // $ANTLR start "rule__Variable__Group_4__1"
    // InternalMyDsl.g:1039:1: rule__Variable__Group_4__1 : rule__Variable__Group_4__1__Impl ;
    public final void rule__Variable__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1043:1: ( rule__Variable__Group_4__1__Impl )
            // InternalMyDsl.g:1044:2: rule__Variable__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__1"


    // $ANTLR start "rule__Variable__Group_4__1__Impl"
    // InternalMyDsl.g:1050:1: rule__Variable__Group_4__1__Impl : ( ( rule__Variable__TypeAssignment_4_1 ) ) ;
    public final void rule__Variable__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1054:1: ( ( ( rule__Variable__TypeAssignment_4_1 ) ) )
            // InternalMyDsl.g:1055:1: ( ( rule__Variable__TypeAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1055:1: ( ( rule__Variable__TypeAssignment_4_1 ) )
            // InternalMyDsl.g:1056:2: ( rule__Variable__TypeAssignment_4_1 )
            {
             before(grammarAccess.getVariableAccess().getTypeAssignment_4_1()); 
            // InternalMyDsl.g:1057:2: ( rule__Variable__TypeAssignment_4_1 )
            // InternalMyDsl.g:1057:3: rule__Variable__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__Group_4__1__Impl"


    // $ANTLR start "rule__Negative__Group__0"
    // InternalMyDsl.g:1066:1: rule__Negative__Group__0 : rule__Negative__Group__0__Impl rule__Negative__Group__1 ;
    public final void rule__Negative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1070:1: ( rule__Negative__Group__0__Impl rule__Negative__Group__1 )
            // InternalMyDsl.g:1071:2: rule__Negative__Group__0__Impl rule__Negative__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Negative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negative__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group__0"


    // $ANTLR start "rule__Negative__Group__0__Impl"
    // InternalMyDsl.g:1078:1: rule__Negative__Group__0__Impl : ( 'Negative' ) ;
    public final void rule__Negative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1082:1: ( ( 'Negative' ) )
            // InternalMyDsl.g:1083:1: ( 'Negative' )
            {
            // InternalMyDsl.g:1083:1: ( 'Negative' )
            // InternalMyDsl.g:1084:2: 'Negative'
            {
             before(grammarAccess.getNegativeAccess().getNegativeKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getNegativeAccess().getNegativeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group__0__Impl"


    // $ANTLR start "rule__Negative__Group__1"
    // InternalMyDsl.g:1093:1: rule__Negative__Group__1 : rule__Negative__Group__1__Impl rule__Negative__Group__2 ;
    public final void rule__Negative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1097:1: ( rule__Negative__Group__1__Impl rule__Negative__Group__2 )
            // InternalMyDsl.g:1098:2: rule__Negative__Group__1__Impl rule__Negative__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Negative__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negative__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group__1"


    // $ANTLR start "rule__Negative__Group__1__Impl"
    // InternalMyDsl.g:1105:1: rule__Negative__Group__1__Impl : ( '{' ) ;
    public final void rule__Negative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1109:1: ( ( '{' ) )
            // InternalMyDsl.g:1110:1: ( '{' )
            {
            // InternalMyDsl.g:1110:1: ( '{' )
            // InternalMyDsl.g:1111:2: '{'
            {
             before(grammarAccess.getNegativeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNegativeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group__1__Impl"


    // $ANTLR start "rule__Negative__Group__2"
    // InternalMyDsl.g:1120:1: rule__Negative__Group__2 : rule__Negative__Group__2__Impl rule__Negative__Group__3 ;
    public final void rule__Negative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( rule__Negative__Group__2__Impl rule__Negative__Group__3 )
            // InternalMyDsl.g:1125:2: rule__Negative__Group__2__Impl rule__Negative__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Negative__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negative__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group__2"


    // $ANTLR start "rule__Negative__Group__2__Impl"
    // InternalMyDsl.g:1132:1: rule__Negative__Group__2__Impl : ( ( rule__Negative__Group_2__0 )? ) ;
    public final void rule__Negative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1136:1: ( ( ( rule__Negative__Group_2__0 )? ) )
            // InternalMyDsl.g:1137:1: ( ( rule__Negative__Group_2__0 )? )
            {
            // InternalMyDsl.g:1137:1: ( ( rule__Negative__Group_2__0 )? )
            // InternalMyDsl.g:1138:2: ( rule__Negative__Group_2__0 )?
            {
             before(grammarAccess.getNegativeAccess().getGroup_2()); 
            // InternalMyDsl.g:1139:2: ( rule__Negative__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==39) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1139:3: rule__Negative__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Negative__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNegativeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group__2__Impl"


    // $ANTLR start "rule__Negative__Group__3"
    // InternalMyDsl.g:1147:1: rule__Negative__Group__3 : rule__Negative__Group__3__Impl rule__Negative__Group__4 ;
    public final void rule__Negative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1151:1: ( rule__Negative__Group__3__Impl rule__Negative__Group__4 )
            // InternalMyDsl.g:1152:2: rule__Negative__Group__3__Impl rule__Negative__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Negative__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negative__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group__3"


    // $ANTLR start "rule__Negative__Group__3__Impl"
    // InternalMyDsl.g:1159:1: rule__Negative__Group__3__Impl : ( 'expression' ) ;
    public final void rule__Negative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1163:1: ( ( 'expression' ) )
            // InternalMyDsl.g:1164:1: ( 'expression' )
            {
            // InternalMyDsl.g:1164:1: ( 'expression' )
            // InternalMyDsl.g:1165:2: 'expression'
            {
             before(grammarAccess.getNegativeAccess().getExpressionKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNegativeAccess().getExpressionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group__3__Impl"


    // $ANTLR start "rule__Negative__Group__4"
    // InternalMyDsl.g:1174:1: rule__Negative__Group__4 : rule__Negative__Group__4__Impl rule__Negative__Group__5 ;
    public final void rule__Negative__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1178:1: ( rule__Negative__Group__4__Impl rule__Negative__Group__5 )
            // InternalMyDsl.g:1179:2: rule__Negative__Group__4__Impl rule__Negative__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Negative__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negative__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group__4"


    // $ANTLR start "rule__Negative__Group__4__Impl"
    // InternalMyDsl.g:1186:1: rule__Negative__Group__4__Impl : ( ( rule__Negative__ExpressionAssignment_4 ) ) ;
    public final void rule__Negative__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1190:1: ( ( ( rule__Negative__ExpressionAssignment_4 ) ) )
            // InternalMyDsl.g:1191:1: ( ( rule__Negative__ExpressionAssignment_4 ) )
            {
            // InternalMyDsl.g:1191:1: ( ( rule__Negative__ExpressionAssignment_4 ) )
            // InternalMyDsl.g:1192:2: ( rule__Negative__ExpressionAssignment_4 )
            {
             before(grammarAccess.getNegativeAccess().getExpressionAssignment_4()); 
            // InternalMyDsl.g:1193:2: ( rule__Negative__ExpressionAssignment_4 )
            // InternalMyDsl.g:1193:3: rule__Negative__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Negative__ExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNegativeAccess().getExpressionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group__4__Impl"


    // $ANTLR start "rule__Negative__Group__5"
    // InternalMyDsl.g:1201:1: rule__Negative__Group__5 : rule__Negative__Group__5__Impl ;
    public final void rule__Negative__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1205:1: ( rule__Negative__Group__5__Impl )
            // InternalMyDsl.g:1206:2: rule__Negative__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Negative__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group__5"


    // $ANTLR start "rule__Negative__Group__5__Impl"
    // InternalMyDsl.g:1212:1: rule__Negative__Group__5__Impl : ( '}' ) ;
    public final void rule__Negative__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1216:1: ( ( '}' ) )
            // InternalMyDsl.g:1217:1: ( '}' )
            {
            // InternalMyDsl.g:1217:1: ( '}' )
            // InternalMyDsl.g:1218:2: '}'
            {
             before(grammarAccess.getNegativeAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNegativeAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group__5__Impl"


    // $ANTLR start "rule__Negative__Group_2__0"
    // InternalMyDsl.g:1228:1: rule__Negative__Group_2__0 : rule__Negative__Group_2__0__Impl rule__Negative__Group_2__1 ;
    public final void rule__Negative__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1232:1: ( rule__Negative__Group_2__0__Impl rule__Negative__Group_2__1 )
            // InternalMyDsl.g:1233:2: rule__Negative__Group_2__0__Impl rule__Negative__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Negative__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negative__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group_2__0"


    // $ANTLR start "rule__Negative__Group_2__0__Impl"
    // InternalMyDsl.g:1240:1: rule__Negative__Group_2__0__Impl : ( 'variable' ) ;
    public final void rule__Negative__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1244:1: ( ( 'variable' ) )
            // InternalMyDsl.g:1245:1: ( 'variable' )
            {
            // InternalMyDsl.g:1245:1: ( 'variable' )
            // InternalMyDsl.g:1246:2: 'variable'
            {
             before(grammarAccess.getNegativeAccess().getVariableKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNegativeAccess().getVariableKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group_2__0__Impl"


    // $ANTLR start "rule__Negative__Group_2__1"
    // InternalMyDsl.g:1255:1: rule__Negative__Group_2__1 : rule__Negative__Group_2__1__Impl rule__Negative__Group_2__2 ;
    public final void rule__Negative__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( rule__Negative__Group_2__1__Impl rule__Negative__Group_2__2 )
            // InternalMyDsl.g:1260:2: rule__Negative__Group_2__1__Impl rule__Negative__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__Negative__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negative__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group_2__1"


    // $ANTLR start "rule__Negative__Group_2__1__Impl"
    // InternalMyDsl.g:1267:1: rule__Negative__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Negative__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1271:1: ( ( '{' ) )
            // InternalMyDsl.g:1272:1: ( '{' )
            {
            // InternalMyDsl.g:1272:1: ( '{' )
            // InternalMyDsl.g:1273:2: '{'
            {
             before(grammarAccess.getNegativeAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNegativeAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group_2__1__Impl"


    // $ANTLR start "rule__Negative__Group_2__2"
    // InternalMyDsl.g:1282:1: rule__Negative__Group_2__2 : rule__Negative__Group_2__2__Impl rule__Negative__Group_2__3 ;
    public final void rule__Negative__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1286:1: ( rule__Negative__Group_2__2__Impl rule__Negative__Group_2__3 )
            // InternalMyDsl.g:1287:2: rule__Negative__Group_2__2__Impl rule__Negative__Group_2__3
            {
            pushFollow(FOLLOW_11);
            rule__Negative__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negative__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group_2__2"


    // $ANTLR start "rule__Negative__Group_2__2__Impl"
    // InternalMyDsl.g:1294:1: rule__Negative__Group_2__2__Impl : ( ( rule__Negative__VariableAssignment_2_2 ) ) ;
    public final void rule__Negative__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1298:1: ( ( ( rule__Negative__VariableAssignment_2_2 ) ) )
            // InternalMyDsl.g:1299:1: ( ( rule__Negative__VariableAssignment_2_2 ) )
            {
            // InternalMyDsl.g:1299:1: ( ( rule__Negative__VariableAssignment_2_2 ) )
            // InternalMyDsl.g:1300:2: ( rule__Negative__VariableAssignment_2_2 )
            {
             before(grammarAccess.getNegativeAccess().getVariableAssignment_2_2()); 
            // InternalMyDsl.g:1301:2: ( rule__Negative__VariableAssignment_2_2 )
            // InternalMyDsl.g:1301:3: rule__Negative__VariableAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Negative__VariableAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getNegativeAccess().getVariableAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group_2__2__Impl"


    // $ANTLR start "rule__Negative__Group_2__3"
    // InternalMyDsl.g:1309:1: rule__Negative__Group_2__3 : rule__Negative__Group_2__3__Impl rule__Negative__Group_2__4 ;
    public final void rule__Negative__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1313:1: ( rule__Negative__Group_2__3__Impl rule__Negative__Group_2__4 )
            // InternalMyDsl.g:1314:2: rule__Negative__Group_2__3__Impl rule__Negative__Group_2__4
            {
            pushFollow(FOLLOW_11);
            rule__Negative__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negative__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group_2__3"


    // $ANTLR start "rule__Negative__Group_2__3__Impl"
    // InternalMyDsl.g:1321:1: rule__Negative__Group_2__3__Impl : ( ( rule__Negative__Group_2_3__0 )* ) ;
    public final void rule__Negative__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1325:1: ( ( ( rule__Negative__Group_2_3__0 )* ) )
            // InternalMyDsl.g:1326:1: ( ( rule__Negative__Group_2_3__0 )* )
            {
            // InternalMyDsl.g:1326:1: ( ( rule__Negative__Group_2_3__0 )* )
            // InternalMyDsl.g:1327:2: ( rule__Negative__Group_2_3__0 )*
            {
             before(grammarAccess.getNegativeAccess().getGroup_2_3()); 
            // InternalMyDsl.g:1328:2: ( rule__Negative__Group_2_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==40) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1328:3: rule__Negative__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Negative__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getNegativeAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group_2__3__Impl"


    // $ANTLR start "rule__Negative__Group_2__4"
    // InternalMyDsl.g:1336:1: rule__Negative__Group_2__4 : rule__Negative__Group_2__4__Impl ;
    public final void rule__Negative__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1340:1: ( rule__Negative__Group_2__4__Impl )
            // InternalMyDsl.g:1341:2: rule__Negative__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Negative__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group_2__4"


    // $ANTLR start "rule__Negative__Group_2__4__Impl"
    // InternalMyDsl.g:1347:1: rule__Negative__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Negative__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1351:1: ( ( '}' ) )
            // InternalMyDsl.g:1352:1: ( '}' )
            {
            // InternalMyDsl.g:1352:1: ( '}' )
            // InternalMyDsl.g:1353:2: '}'
            {
             before(grammarAccess.getNegativeAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNegativeAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group_2__4__Impl"


    // $ANTLR start "rule__Negative__Group_2_3__0"
    // InternalMyDsl.g:1363:1: rule__Negative__Group_2_3__0 : rule__Negative__Group_2_3__0__Impl rule__Negative__Group_2_3__1 ;
    public final void rule__Negative__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( rule__Negative__Group_2_3__0__Impl rule__Negative__Group_2_3__1 )
            // InternalMyDsl.g:1368:2: rule__Negative__Group_2_3__0__Impl rule__Negative__Group_2_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Negative__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Negative__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group_2_3__0"


    // $ANTLR start "rule__Negative__Group_2_3__0__Impl"
    // InternalMyDsl.g:1375:1: rule__Negative__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Negative__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1379:1: ( ( ',' ) )
            // InternalMyDsl.g:1380:1: ( ',' )
            {
            // InternalMyDsl.g:1380:1: ( ',' )
            // InternalMyDsl.g:1381:2: ','
            {
             before(grammarAccess.getNegativeAccess().getCommaKeyword_2_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getNegativeAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group_2_3__0__Impl"


    // $ANTLR start "rule__Negative__Group_2_3__1"
    // InternalMyDsl.g:1390:1: rule__Negative__Group_2_3__1 : rule__Negative__Group_2_3__1__Impl ;
    public final void rule__Negative__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1394:1: ( rule__Negative__Group_2_3__1__Impl )
            // InternalMyDsl.g:1395:2: rule__Negative__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Negative__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group_2_3__1"


    // $ANTLR start "rule__Negative__Group_2_3__1__Impl"
    // InternalMyDsl.g:1401:1: rule__Negative__Group_2_3__1__Impl : ( ( rule__Negative__VariableAssignment_2_3_1 ) ) ;
    public final void rule__Negative__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1405:1: ( ( ( rule__Negative__VariableAssignment_2_3_1 ) ) )
            // InternalMyDsl.g:1406:1: ( ( rule__Negative__VariableAssignment_2_3_1 ) )
            {
            // InternalMyDsl.g:1406:1: ( ( rule__Negative__VariableAssignment_2_3_1 ) )
            // InternalMyDsl.g:1407:2: ( rule__Negative__VariableAssignment_2_3_1 )
            {
             before(grammarAccess.getNegativeAccess().getVariableAssignment_2_3_1()); 
            // InternalMyDsl.g:1408:2: ( rule__Negative__VariableAssignment_2_3_1 )
            // InternalMyDsl.g:1408:3: rule__Negative__VariableAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Negative__VariableAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNegativeAccess().getVariableAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__Group_2_3__1__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group__0"
    // InternalMyDsl.g:1417:1: rule__BinaryArithmetic__Group__0 : rule__BinaryArithmetic__Group__0__Impl rule__BinaryArithmetic__Group__1 ;
    public final void rule__BinaryArithmetic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1421:1: ( rule__BinaryArithmetic__Group__0__Impl rule__BinaryArithmetic__Group__1 )
            // InternalMyDsl.g:1422:2: rule__BinaryArithmetic__Group__0__Impl rule__BinaryArithmetic__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryArithmetic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__0"


    // $ANTLR start "rule__BinaryArithmetic__Group__0__Impl"
    // InternalMyDsl.g:1429:1: rule__BinaryArithmetic__Group__0__Impl : ( 'BinaryArithmetic' ) ;
    public final void rule__BinaryArithmetic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1433:1: ( ( 'BinaryArithmetic' ) )
            // InternalMyDsl.g:1434:1: ( 'BinaryArithmetic' )
            {
            // InternalMyDsl.g:1434:1: ( 'BinaryArithmetic' )
            // InternalMyDsl.g:1435:2: 'BinaryArithmetic'
            {
             before(grammarAccess.getBinaryArithmeticAccess().getBinaryArithmeticKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBinaryArithmeticAccess().getBinaryArithmeticKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__0__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group__1"
    // InternalMyDsl.g:1444:1: rule__BinaryArithmetic__Group__1 : rule__BinaryArithmetic__Group__1__Impl rule__BinaryArithmetic__Group__2 ;
    public final void rule__BinaryArithmetic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1448:1: ( rule__BinaryArithmetic__Group__1__Impl rule__BinaryArithmetic__Group__2 )
            // InternalMyDsl.g:1449:2: rule__BinaryArithmetic__Group__1__Impl rule__BinaryArithmetic__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__BinaryArithmetic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__1"


    // $ANTLR start "rule__BinaryArithmetic__Group__1__Impl"
    // InternalMyDsl.g:1456:1: rule__BinaryArithmetic__Group__1__Impl : ( '{' ) ;
    public final void rule__BinaryArithmetic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1460:1: ( ( '{' ) )
            // InternalMyDsl.g:1461:1: ( '{' )
            {
            // InternalMyDsl.g:1461:1: ( '{' )
            // InternalMyDsl.g:1462:2: '{'
            {
             before(grammarAccess.getBinaryArithmeticAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBinaryArithmeticAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__1__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group__2"
    // InternalMyDsl.g:1471:1: rule__BinaryArithmetic__Group__2 : rule__BinaryArithmetic__Group__2__Impl rule__BinaryArithmetic__Group__3 ;
    public final void rule__BinaryArithmetic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1475:1: ( rule__BinaryArithmetic__Group__2__Impl rule__BinaryArithmetic__Group__3 )
            // InternalMyDsl.g:1476:2: rule__BinaryArithmetic__Group__2__Impl rule__BinaryArithmetic__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__BinaryArithmetic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__2"


    // $ANTLR start "rule__BinaryArithmetic__Group__2__Impl"
    // InternalMyDsl.g:1483:1: rule__BinaryArithmetic__Group__2__Impl : ( ( rule__BinaryArithmetic__Group_2__0 )? ) ;
    public final void rule__BinaryArithmetic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1487:1: ( ( ( rule__BinaryArithmetic__Group_2__0 )? ) )
            // InternalMyDsl.g:1488:1: ( ( rule__BinaryArithmetic__Group_2__0 )? )
            {
            // InternalMyDsl.g:1488:1: ( ( rule__BinaryArithmetic__Group_2__0 )? )
            // InternalMyDsl.g:1489:2: ( rule__BinaryArithmetic__Group_2__0 )?
            {
             before(grammarAccess.getBinaryArithmeticAccess().getGroup_2()); 
            // InternalMyDsl.g:1490:2: ( rule__BinaryArithmetic__Group_2__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==42) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1490:3: rule__BinaryArithmetic__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryArithmetic__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBinaryArithmeticAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__2__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group__3"
    // InternalMyDsl.g:1498:1: rule__BinaryArithmetic__Group__3 : rule__BinaryArithmetic__Group__3__Impl rule__BinaryArithmetic__Group__4 ;
    public final void rule__BinaryArithmetic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( rule__BinaryArithmetic__Group__3__Impl rule__BinaryArithmetic__Group__4 )
            // InternalMyDsl.g:1503:2: rule__BinaryArithmetic__Group__3__Impl rule__BinaryArithmetic__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__BinaryArithmetic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__3"


    // $ANTLR start "rule__BinaryArithmetic__Group__3__Impl"
    // InternalMyDsl.g:1510:1: rule__BinaryArithmetic__Group__3__Impl : ( ( rule__BinaryArithmetic__Group_3__0 )? ) ;
    public final void rule__BinaryArithmetic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1514:1: ( ( ( rule__BinaryArithmetic__Group_3__0 )? ) )
            // InternalMyDsl.g:1515:1: ( ( rule__BinaryArithmetic__Group_3__0 )? )
            {
            // InternalMyDsl.g:1515:1: ( ( rule__BinaryArithmetic__Group_3__0 )? )
            // InternalMyDsl.g:1516:2: ( rule__BinaryArithmetic__Group_3__0 )?
            {
             before(grammarAccess.getBinaryArithmeticAccess().getGroup_3()); 
            // InternalMyDsl.g:1517:2: ( rule__BinaryArithmetic__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1517:3: rule__BinaryArithmetic__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryArithmetic__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBinaryArithmeticAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__3__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group__4"
    // InternalMyDsl.g:1525:1: rule__BinaryArithmetic__Group__4 : rule__BinaryArithmetic__Group__4__Impl rule__BinaryArithmetic__Group__5 ;
    public final void rule__BinaryArithmetic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1529:1: ( rule__BinaryArithmetic__Group__4__Impl rule__BinaryArithmetic__Group__5 )
            // InternalMyDsl.g:1530:2: rule__BinaryArithmetic__Group__4__Impl rule__BinaryArithmetic__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__BinaryArithmetic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__4"


    // $ANTLR start "rule__BinaryArithmetic__Group__4__Impl"
    // InternalMyDsl.g:1537:1: rule__BinaryArithmetic__Group__4__Impl : ( 'expression' ) ;
    public final void rule__BinaryArithmetic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1541:1: ( ( 'expression' ) )
            // InternalMyDsl.g:1542:1: ( 'expression' )
            {
            // InternalMyDsl.g:1542:1: ( 'expression' )
            // InternalMyDsl.g:1543:2: 'expression'
            {
             before(grammarAccess.getBinaryArithmeticAccess().getExpressionKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBinaryArithmeticAccess().getExpressionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__4__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group__5"
    // InternalMyDsl.g:1552:1: rule__BinaryArithmetic__Group__5 : rule__BinaryArithmetic__Group__5__Impl rule__BinaryArithmetic__Group__6 ;
    public final void rule__BinaryArithmetic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1556:1: ( rule__BinaryArithmetic__Group__5__Impl rule__BinaryArithmetic__Group__6 )
            // InternalMyDsl.g:1557:2: rule__BinaryArithmetic__Group__5__Impl rule__BinaryArithmetic__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__BinaryArithmetic__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__5"


    // $ANTLR start "rule__BinaryArithmetic__Group__5__Impl"
    // InternalMyDsl.g:1564:1: rule__BinaryArithmetic__Group__5__Impl : ( '{' ) ;
    public final void rule__BinaryArithmetic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1568:1: ( ( '{' ) )
            // InternalMyDsl.g:1569:1: ( '{' )
            {
            // InternalMyDsl.g:1569:1: ( '{' )
            // InternalMyDsl.g:1570:2: '{'
            {
             before(grammarAccess.getBinaryArithmeticAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBinaryArithmeticAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__5__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group__6"
    // InternalMyDsl.g:1579:1: rule__BinaryArithmetic__Group__6 : rule__BinaryArithmetic__Group__6__Impl rule__BinaryArithmetic__Group__7 ;
    public final void rule__BinaryArithmetic__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1583:1: ( rule__BinaryArithmetic__Group__6__Impl rule__BinaryArithmetic__Group__7 )
            // InternalMyDsl.g:1584:2: rule__BinaryArithmetic__Group__6__Impl rule__BinaryArithmetic__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__BinaryArithmetic__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__6"


    // $ANTLR start "rule__BinaryArithmetic__Group__6__Impl"
    // InternalMyDsl.g:1591:1: rule__BinaryArithmetic__Group__6__Impl : ( ( rule__BinaryArithmetic__ExpressionAssignment_6 ) ) ;
    public final void rule__BinaryArithmetic__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1595:1: ( ( ( rule__BinaryArithmetic__ExpressionAssignment_6 ) ) )
            // InternalMyDsl.g:1596:1: ( ( rule__BinaryArithmetic__ExpressionAssignment_6 ) )
            {
            // InternalMyDsl.g:1596:1: ( ( rule__BinaryArithmetic__ExpressionAssignment_6 ) )
            // InternalMyDsl.g:1597:2: ( rule__BinaryArithmetic__ExpressionAssignment_6 )
            {
             before(grammarAccess.getBinaryArithmeticAccess().getExpressionAssignment_6()); 
            // InternalMyDsl.g:1598:2: ( rule__BinaryArithmetic__ExpressionAssignment_6 )
            // InternalMyDsl.g:1598:3: rule__BinaryArithmetic__ExpressionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__ExpressionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBinaryArithmeticAccess().getExpressionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__6__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group__7"
    // InternalMyDsl.g:1606:1: rule__BinaryArithmetic__Group__7 : rule__BinaryArithmetic__Group__7__Impl rule__BinaryArithmetic__Group__8 ;
    public final void rule__BinaryArithmetic__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1610:1: ( rule__BinaryArithmetic__Group__7__Impl rule__BinaryArithmetic__Group__8 )
            // InternalMyDsl.g:1611:2: rule__BinaryArithmetic__Group__7__Impl rule__BinaryArithmetic__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__BinaryArithmetic__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__7"


    // $ANTLR start "rule__BinaryArithmetic__Group__7__Impl"
    // InternalMyDsl.g:1618:1: rule__BinaryArithmetic__Group__7__Impl : ( ( rule__BinaryArithmetic__Group_7__0 )* ) ;
    public final void rule__BinaryArithmetic__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1622:1: ( ( ( rule__BinaryArithmetic__Group_7__0 )* ) )
            // InternalMyDsl.g:1623:1: ( ( rule__BinaryArithmetic__Group_7__0 )* )
            {
            // InternalMyDsl.g:1623:1: ( ( rule__BinaryArithmetic__Group_7__0 )* )
            // InternalMyDsl.g:1624:2: ( rule__BinaryArithmetic__Group_7__0 )*
            {
             before(grammarAccess.getBinaryArithmeticAccess().getGroup_7()); 
            // InternalMyDsl.g:1625:2: ( rule__BinaryArithmetic__Group_7__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==40) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1625:3: rule__BinaryArithmetic__Group_7__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__BinaryArithmetic__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getBinaryArithmeticAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__7__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group__8"
    // InternalMyDsl.g:1633:1: rule__BinaryArithmetic__Group__8 : rule__BinaryArithmetic__Group__8__Impl rule__BinaryArithmetic__Group__9 ;
    public final void rule__BinaryArithmetic__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1637:1: ( rule__BinaryArithmetic__Group__8__Impl rule__BinaryArithmetic__Group__9 )
            // InternalMyDsl.g:1638:2: rule__BinaryArithmetic__Group__8__Impl rule__BinaryArithmetic__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__BinaryArithmetic__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__8"


    // $ANTLR start "rule__BinaryArithmetic__Group__8__Impl"
    // InternalMyDsl.g:1645:1: rule__BinaryArithmetic__Group__8__Impl : ( '}' ) ;
    public final void rule__BinaryArithmetic__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1649:1: ( ( '}' ) )
            // InternalMyDsl.g:1650:1: ( '}' )
            {
            // InternalMyDsl.g:1650:1: ( '}' )
            // InternalMyDsl.g:1651:2: '}'
            {
             before(grammarAccess.getBinaryArithmeticAccess().getRightCurlyBracketKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBinaryArithmeticAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__8__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group__9"
    // InternalMyDsl.g:1660:1: rule__BinaryArithmetic__Group__9 : rule__BinaryArithmetic__Group__9__Impl ;
    public final void rule__BinaryArithmetic__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( rule__BinaryArithmetic__Group__9__Impl )
            // InternalMyDsl.g:1665:2: rule__BinaryArithmetic__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__9"


    // $ANTLR start "rule__BinaryArithmetic__Group__9__Impl"
    // InternalMyDsl.g:1671:1: rule__BinaryArithmetic__Group__9__Impl : ( '}' ) ;
    public final void rule__BinaryArithmetic__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1675:1: ( ( '}' ) )
            // InternalMyDsl.g:1676:1: ( '}' )
            {
            // InternalMyDsl.g:1676:1: ( '}' )
            // InternalMyDsl.g:1677:2: '}'
            {
             before(grammarAccess.getBinaryArithmeticAccess().getRightCurlyBracketKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBinaryArithmeticAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group__9__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group_2__0"
    // InternalMyDsl.g:1687:1: rule__BinaryArithmetic__Group_2__0 : rule__BinaryArithmetic__Group_2__0__Impl rule__BinaryArithmetic__Group_2__1 ;
    public final void rule__BinaryArithmetic__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1691:1: ( rule__BinaryArithmetic__Group_2__0__Impl rule__BinaryArithmetic__Group_2__1 )
            // InternalMyDsl.g:1692:2: rule__BinaryArithmetic__Group_2__0__Impl rule__BinaryArithmetic__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__BinaryArithmetic__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_2__0"


    // $ANTLR start "rule__BinaryArithmetic__Group_2__0__Impl"
    // InternalMyDsl.g:1699:1: rule__BinaryArithmetic__Group_2__0__Impl : ( 'operation' ) ;
    public final void rule__BinaryArithmetic__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1703:1: ( ( 'operation' ) )
            // InternalMyDsl.g:1704:1: ( 'operation' )
            {
            // InternalMyDsl.g:1704:1: ( 'operation' )
            // InternalMyDsl.g:1705:2: 'operation'
            {
             before(grammarAccess.getBinaryArithmeticAccess().getOperationKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBinaryArithmeticAccess().getOperationKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_2__0__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group_2__1"
    // InternalMyDsl.g:1714:1: rule__BinaryArithmetic__Group_2__1 : rule__BinaryArithmetic__Group_2__1__Impl ;
    public final void rule__BinaryArithmetic__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1718:1: ( rule__BinaryArithmetic__Group_2__1__Impl )
            // InternalMyDsl.g:1719:2: rule__BinaryArithmetic__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_2__1"


    // $ANTLR start "rule__BinaryArithmetic__Group_2__1__Impl"
    // InternalMyDsl.g:1725:1: rule__BinaryArithmetic__Group_2__1__Impl : ( ( rule__BinaryArithmetic__OperationAssignment_2_1 ) ) ;
    public final void rule__BinaryArithmetic__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1729:1: ( ( ( rule__BinaryArithmetic__OperationAssignment_2_1 ) ) )
            // InternalMyDsl.g:1730:1: ( ( rule__BinaryArithmetic__OperationAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1730:1: ( ( rule__BinaryArithmetic__OperationAssignment_2_1 ) )
            // InternalMyDsl.g:1731:2: ( rule__BinaryArithmetic__OperationAssignment_2_1 )
            {
             before(grammarAccess.getBinaryArithmeticAccess().getOperationAssignment_2_1()); 
            // InternalMyDsl.g:1732:2: ( rule__BinaryArithmetic__OperationAssignment_2_1 )
            // InternalMyDsl.g:1732:3: rule__BinaryArithmetic__OperationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__OperationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryArithmeticAccess().getOperationAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_2__1__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group_3__0"
    // InternalMyDsl.g:1741:1: rule__BinaryArithmetic__Group_3__0 : rule__BinaryArithmetic__Group_3__0__Impl rule__BinaryArithmetic__Group_3__1 ;
    public final void rule__BinaryArithmetic__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1745:1: ( rule__BinaryArithmetic__Group_3__0__Impl rule__BinaryArithmetic__Group_3__1 )
            // InternalMyDsl.g:1746:2: rule__BinaryArithmetic__Group_3__0__Impl rule__BinaryArithmetic__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryArithmetic__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_3__0"


    // $ANTLR start "rule__BinaryArithmetic__Group_3__0__Impl"
    // InternalMyDsl.g:1753:1: rule__BinaryArithmetic__Group_3__0__Impl : ( 'variable' ) ;
    public final void rule__BinaryArithmetic__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1757:1: ( ( 'variable' ) )
            // InternalMyDsl.g:1758:1: ( 'variable' )
            {
            // InternalMyDsl.g:1758:1: ( 'variable' )
            // InternalMyDsl.g:1759:2: 'variable'
            {
             before(grammarAccess.getBinaryArithmeticAccess().getVariableKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBinaryArithmeticAccess().getVariableKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_3__0__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group_3__1"
    // InternalMyDsl.g:1768:1: rule__BinaryArithmetic__Group_3__1 : rule__BinaryArithmetic__Group_3__1__Impl rule__BinaryArithmetic__Group_3__2 ;
    public final void rule__BinaryArithmetic__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1772:1: ( rule__BinaryArithmetic__Group_3__1__Impl rule__BinaryArithmetic__Group_3__2 )
            // InternalMyDsl.g:1773:2: rule__BinaryArithmetic__Group_3__1__Impl rule__BinaryArithmetic__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__BinaryArithmetic__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_3__1"


    // $ANTLR start "rule__BinaryArithmetic__Group_3__1__Impl"
    // InternalMyDsl.g:1780:1: rule__BinaryArithmetic__Group_3__1__Impl : ( '{' ) ;
    public final void rule__BinaryArithmetic__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1784:1: ( ( '{' ) )
            // InternalMyDsl.g:1785:1: ( '{' )
            {
            // InternalMyDsl.g:1785:1: ( '{' )
            // InternalMyDsl.g:1786:2: '{'
            {
             before(grammarAccess.getBinaryArithmeticAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBinaryArithmeticAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_3__1__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group_3__2"
    // InternalMyDsl.g:1795:1: rule__BinaryArithmetic__Group_3__2 : rule__BinaryArithmetic__Group_3__2__Impl rule__BinaryArithmetic__Group_3__3 ;
    public final void rule__BinaryArithmetic__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1799:1: ( rule__BinaryArithmetic__Group_3__2__Impl rule__BinaryArithmetic__Group_3__3 )
            // InternalMyDsl.g:1800:2: rule__BinaryArithmetic__Group_3__2__Impl rule__BinaryArithmetic__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__BinaryArithmetic__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_3__2"


    // $ANTLR start "rule__BinaryArithmetic__Group_3__2__Impl"
    // InternalMyDsl.g:1807:1: rule__BinaryArithmetic__Group_3__2__Impl : ( ( rule__BinaryArithmetic__VariableAssignment_3_2 ) ) ;
    public final void rule__BinaryArithmetic__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1811:1: ( ( ( rule__BinaryArithmetic__VariableAssignment_3_2 ) ) )
            // InternalMyDsl.g:1812:1: ( ( rule__BinaryArithmetic__VariableAssignment_3_2 ) )
            {
            // InternalMyDsl.g:1812:1: ( ( rule__BinaryArithmetic__VariableAssignment_3_2 ) )
            // InternalMyDsl.g:1813:2: ( rule__BinaryArithmetic__VariableAssignment_3_2 )
            {
             before(grammarAccess.getBinaryArithmeticAccess().getVariableAssignment_3_2()); 
            // InternalMyDsl.g:1814:2: ( rule__BinaryArithmetic__VariableAssignment_3_2 )
            // InternalMyDsl.g:1814:3: rule__BinaryArithmetic__VariableAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__VariableAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryArithmeticAccess().getVariableAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_3__2__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group_3__3"
    // InternalMyDsl.g:1822:1: rule__BinaryArithmetic__Group_3__3 : rule__BinaryArithmetic__Group_3__3__Impl rule__BinaryArithmetic__Group_3__4 ;
    public final void rule__BinaryArithmetic__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1826:1: ( rule__BinaryArithmetic__Group_3__3__Impl rule__BinaryArithmetic__Group_3__4 )
            // InternalMyDsl.g:1827:2: rule__BinaryArithmetic__Group_3__3__Impl rule__BinaryArithmetic__Group_3__4
            {
            pushFollow(FOLLOW_11);
            rule__BinaryArithmetic__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_3__3"


    // $ANTLR start "rule__BinaryArithmetic__Group_3__3__Impl"
    // InternalMyDsl.g:1834:1: rule__BinaryArithmetic__Group_3__3__Impl : ( ( rule__BinaryArithmetic__Group_3_3__0 )* ) ;
    public final void rule__BinaryArithmetic__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1838:1: ( ( ( rule__BinaryArithmetic__Group_3_3__0 )* ) )
            // InternalMyDsl.g:1839:1: ( ( rule__BinaryArithmetic__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:1839:1: ( ( rule__BinaryArithmetic__Group_3_3__0 )* )
            // InternalMyDsl.g:1840:2: ( rule__BinaryArithmetic__Group_3_3__0 )*
            {
             before(grammarAccess.getBinaryArithmeticAccess().getGroup_3_3()); 
            // InternalMyDsl.g:1841:2: ( rule__BinaryArithmetic__Group_3_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==40) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1841:3: rule__BinaryArithmetic__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__BinaryArithmetic__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getBinaryArithmeticAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_3__3__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group_3__4"
    // InternalMyDsl.g:1849:1: rule__BinaryArithmetic__Group_3__4 : rule__BinaryArithmetic__Group_3__4__Impl ;
    public final void rule__BinaryArithmetic__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1853:1: ( rule__BinaryArithmetic__Group_3__4__Impl )
            // InternalMyDsl.g:1854:2: rule__BinaryArithmetic__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_3__4"


    // $ANTLR start "rule__BinaryArithmetic__Group_3__4__Impl"
    // InternalMyDsl.g:1860:1: rule__BinaryArithmetic__Group_3__4__Impl : ( '}' ) ;
    public final void rule__BinaryArithmetic__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1864:1: ( ( '}' ) )
            // InternalMyDsl.g:1865:1: ( '}' )
            {
            // InternalMyDsl.g:1865:1: ( '}' )
            // InternalMyDsl.g:1866:2: '}'
            {
             before(grammarAccess.getBinaryArithmeticAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBinaryArithmeticAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_3__4__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group_3_3__0"
    // InternalMyDsl.g:1876:1: rule__BinaryArithmetic__Group_3_3__0 : rule__BinaryArithmetic__Group_3_3__0__Impl rule__BinaryArithmetic__Group_3_3__1 ;
    public final void rule__BinaryArithmetic__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1880:1: ( rule__BinaryArithmetic__Group_3_3__0__Impl rule__BinaryArithmetic__Group_3_3__1 )
            // InternalMyDsl.g:1881:2: rule__BinaryArithmetic__Group_3_3__0__Impl rule__BinaryArithmetic__Group_3_3__1
            {
            pushFollow(FOLLOW_3);
            rule__BinaryArithmetic__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_3_3__0"


    // $ANTLR start "rule__BinaryArithmetic__Group_3_3__0__Impl"
    // InternalMyDsl.g:1888:1: rule__BinaryArithmetic__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__BinaryArithmetic__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1892:1: ( ( ',' ) )
            // InternalMyDsl.g:1893:1: ( ',' )
            {
            // InternalMyDsl.g:1893:1: ( ',' )
            // InternalMyDsl.g:1894:2: ','
            {
             before(grammarAccess.getBinaryArithmeticAccess().getCommaKeyword_3_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBinaryArithmeticAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_3_3__0__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group_3_3__1"
    // InternalMyDsl.g:1903:1: rule__BinaryArithmetic__Group_3_3__1 : rule__BinaryArithmetic__Group_3_3__1__Impl ;
    public final void rule__BinaryArithmetic__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( rule__BinaryArithmetic__Group_3_3__1__Impl )
            // InternalMyDsl.g:1908:2: rule__BinaryArithmetic__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_3_3__1"


    // $ANTLR start "rule__BinaryArithmetic__Group_3_3__1__Impl"
    // InternalMyDsl.g:1914:1: rule__BinaryArithmetic__Group_3_3__1__Impl : ( ( rule__BinaryArithmetic__VariableAssignment_3_3_1 ) ) ;
    public final void rule__BinaryArithmetic__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1918:1: ( ( ( rule__BinaryArithmetic__VariableAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:1919:1: ( ( rule__BinaryArithmetic__VariableAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:1919:1: ( ( rule__BinaryArithmetic__VariableAssignment_3_3_1 ) )
            // InternalMyDsl.g:1920:2: ( rule__BinaryArithmetic__VariableAssignment_3_3_1 )
            {
             before(grammarAccess.getBinaryArithmeticAccess().getVariableAssignment_3_3_1()); 
            // InternalMyDsl.g:1921:2: ( rule__BinaryArithmetic__VariableAssignment_3_3_1 )
            // InternalMyDsl.g:1921:3: rule__BinaryArithmetic__VariableAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__VariableAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryArithmeticAccess().getVariableAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_3_3__1__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group_7__0"
    // InternalMyDsl.g:1930:1: rule__BinaryArithmetic__Group_7__0 : rule__BinaryArithmetic__Group_7__0__Impl rule__BinaryArithmetic__Group_7__1 ;
    public final void rule__BinaryArithmetic__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1934:1: ( rule__BinaryArithmetic__Group_7__0__Impl rule__BinaryArithmetic__Group_7__1 )
            // InternalMyDsl.g:1935:2: rule__BinaryArithmetic__Group_7__0__Impl rule__BinaryArithmetic__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__BinaryArithmetic__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_7__0"


    // $ANTLR start "rule__BinaryArithmetic__Group_7__0__Impl"
    // InternalMyDsl.g:1942:1: rule__BinaryArithmetic__Group_7__0__Impl : ( ',' ) ;
    public final void rule__BinaryArithmetic__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1946:1: ( ( ',' ) )
            // InternalMyDsl.g:1947:1: ( ',' )
            {
            // InternalMyDsl.g:1947:1: ( ',' )
            // InternalMyDsl.g:1948:2: ','
            {
             before(grammarAccess.getBinaryArithmeticAccess().getCommaKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBinaryArithmeticAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_7__0__Impl"


    // $ANTLR start "rule__BinaryArithmetic__Group_7__1"
    // InternalMyDsl.g:1957:1: rule__BinaryArithmetic__Group_7__1 : rule__BinaryArithmetic__Group_7__1__Impl ;
    public final void rule__BinaryArithmetic__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1961:1: ( rule__BinaryArithmetic__Group_7__1__Impl )
            // InternalMyDsl.g:1962:2: rule__BinaryArithmetic__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_7__1"


    // $ANTLR start "rule__BinaryArithmetic__Group_7__1__Impl"
    // InternalMyDsl.g:1968:1: rule__BinaryArithmetic__Group_7__1__Impl : ( ( rule__BinaryArithmetic__ExpressionAssignment_7_1 ) ) ;
    public final void rule__BinaryArithmetic__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1972:1: ( ( ( rule__BinaryArithmetic__ExpressionAssignment_7_1 ) ) )
            // InternalMyDsl.g:1973:1: ( ( rule__BinaryArithmetic__ExpressionAssignment_7_1 ) )
            {
            // InternalMyDsl.g:1973:1: ( ( rule__BinaryArithmetic__ExpressionAssignment_7_1 ) )
            // InternalMyDsl.g:1974:2: ( rule__BinaryArithmetic__ExpressionAssignment_7_1 )
            {
             before(grammarAccess.getBinaryArithmeticAccess().getExpressionAssignment_7_1()); 
            // InternalMyDsl.g:1975:2: ( rule__BinaryArithmetic__ExpressionAssignment_7_1 )
            // InternalMyDsl.g:1975:3: rule__BinaryArithmetic__ExpressionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryArithmetic__ExpressionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryArithmeticAccess().getExpressionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__Group_7__1__Impl"


    // $ANTLR start "rule__Type_Impl__Group__0"
    // InternalMyDsl.g:1984:1: rule__Type_Impl__Group__0 : rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 ;
    public final void rule__Type_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1 )
            // InternalMyDsl.g:1989:2: rule__Type_Impl__Group__0__Impl rule__Type_Impl__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Type_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0"


    // $ANTLR start "rule__Type_Impl__Group__0__Impl"
    // InternalMyDsl.g:1996:1: rule__Type_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Type_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2000:1: ( ( () ) )
            // InternalMyDsl.g:2001:1: ( () )
            {
            // InternalMyDsl.g:2001:1: ( () )
            // InternalMyDsl.g:2002:2: ()
            {
             before(grammarAccess.getType_ImplAccess().getTypeAction_0()); 
            // InternalMyDsl.g:2003:2: ()
            // InternalMyDsl.g:2003:3: 
            {
            }

             after(grammarAccess.getType_ImplAccess().getTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__0__Impl"


    // $ANTLR start "rule__Type_Impl__Group__1"
    // InternalMyDsl.g:2011:1: rule__Type_Impl__Group__1 : rule__Type_Impl__Group__1__Impl ;
    public final void rule__Type_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2015:1: ( rule__Type_Impl__Group__1__Impl )
            // InternalMyDsl.g:2016:2: rule__Type_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Type_Impl__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__1"


    // $ANTLR start "rule__Type_Impl__Group__1__Impl"
    // InternalMyDsl.g:2022:1: rule__Type_Impl__Group__1__Impl : ( 'Type' ) ;
    public final void rule__Type_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2026:1: ( ( 'Type' ) )
            // InternalMyDsl.g:2027:1: ( 'Type' )
            {
            // InternalMyDsl.g:2027:1: ( 'Type' )
            // InternalMyDsl.g:2028:2: 'Type'
            {
             before(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getType_ImplAccess().getTypeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type_Impl__Group__1__Impl"


    // $ANTLR start "rule__Bool__Group__0"
    // InternalMyDsl.g:2038:1: rule__Bool__Group__0 : rule__Bool__Group__0__Impl rule__Bool__Group__1 ;
    public final void rule__Bool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2042:1: ( rule__Bool__Group__0__Impl rule__Bool__Group__1 )
            // InternalMyDsl.g:2043:2: rule__Bool__Group__0__Impl rule__Bool__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Bool__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Bool__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__0"


    // $ANTLR start "rule__Bool__Group__0__Impl"
    // InternalMyDsl.g:2050:1: rule__Bool__Group__0__Impl : ( () ) ;
    public final void rule__Bool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2054:1: ( ( () ) )
            // InternalMyDsl.g:2055:1: ( () )
            {
            // InternalMyDsl.g:2055:1: ( () )
            // InternalMyDsl.g:2056:2: ()
            {
             before(grammarAccess.getBoolAccess().getBoolAction_0()); 
            // InternalMyDsl.g:2057:2: ()
            // InternalMyDsl.g:2057:3: 
            {
            }

             after(grammarAccess.getBoolAccess().getBoolAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__0__Impl"


    // $ANTLR start "rule__Bool__Group__1"
    // InternalMyDsl.g:2065:1: rule__Bool__Group__1 : rule__Bool__Group__1__Impl ;
    public final void rule__Bool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2069:1: ( rule__Bool__Group__1__Impl )
            // InternalMyDsl.g:2070:2: rule__Bool__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Bool__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__1"


    // $ANTLR start "rule__Bool__Group__1__Impl"
    // InternalMyDsl.g:2076:1: rule__Bool__Group__1__Impl : ( 'Bool' ) ;
    public final void rule__Bool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2080:1: ( ( 'Bool' ) )
            // InternalMyDsl.g:2081:1: ( 'Bool' )
            {
            // InternalMyDsl.g:2081:1: ( 'Bool' )
            // InternalMyDsl.g:2082:2: 'Bool'
            {
             before(grammarAccess.getBoolAccess().getBoolKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getBoolAccess().getBoolKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool__Group__1__Impl"


    // $ANTLR start "rule__Real__Group__0"
    // InternalMyDsl.g:2092:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2096:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // InternalMyDsl.g:2097:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Real__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__0"


    // $ANTLR start "rule__Real__Group__0__Impl"
    // InternalMyDsl.g:2104:1: rule__Real__Group__0__Impl : ( () ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2108:1: ( ( () ) )
            // InternalMyDsl.g:2109:1: ( () )
            {
            // InternalMyDsl.g:2109:1: ( () )
            // InternalMyDsl.g:2110:2: ()
            {
             before(grammarAccess.getRealAccess().getRealAction_0()); 
            // InternalMyDsl.g:2111:2: ()
            // InternalMyDsl.g:2111:3: 
            {
            }

             after(grammarAccess.getRealAccess().getRealAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__0__Impl"


    // $ANTLR start "rule__Real__Group__1"
    // InternalMyDsl.g:2119:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2123:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // InternalMyDsl.g:2124:2: rule__Real__Group__1__Impl rule__Real__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Real__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__1"


    // $ANTLR start "rule__Real__Group__1__Impl"
    // InternalMyDsl.g:2131:1: rule__Real__Group__1__Impl : ( 'Real' ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2135:1: ( ( 'Real' ) )
            // InternalMyDsl.g:2136:1: ( 'Real' )
            {
            // InternalMyDsl.g:2136:1: ( 'Real' )
            // InternalMyDsl.g:2137:2: 'Real'
            {
             before(grammarAccess.getRealAccess().getRealKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getRealKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__1__Impl"


    // $ANTLR start "rule__Real__Group__2"
    // InternalMyDsl.g:2146:1: rule__Real__Group__2 : rule__Real__Group__2__Impl rule__Real__Group__3 ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2150:1: ( rule__Real__Group__2__Impl rule__Real__Group__3 )
            // InternalMyDsl.g:2151:2: rule__Real__Group__2__Impl rule__Real__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Real__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__2"


    // $ANTLR start "rule__Real__Group__2__Impl"
    // InternalMyDsl.g:2158:1: rule__Real__Group__2__Impl : ( '{' ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2162:1: ( ( '{' ) )
            // InternalMyDsl.g:2163:1: ( '{' )
            {
            // InternalMyDsl.g:2163:1: ( '{' )
            // InternalMyDsl.g:2164:2: '{'
            {
             before(grammarAccess.getRealAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__2__Impl"


    // $ANTLR start "rule__Real__Group__3"
    // InternalMyDsl.g:2173:1: rule__Real__Group__3 : rule__Real__Group__3__Impl rule__Real__Group__4 ;
    public final void rule__Real__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2177:1: ( rule__Real__Group__3__Impl rule__Real__Group__4 )
            // InternalMyDsl.g:2178:2: rule__Real__Group__3__Impl rule__Real__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Real__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__3"


    // $ANTLR start "rule__Real__Group__3__Impl"
    // InternalMyDsl.g:2185:1: rule__Real__Group__3__Impl : ( ( rule__Real__Group_3__0 )? ) ;
    public final void rule__Real__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2189:1: ( ( ( rule__Real__Group_3__0 )? ) )
            // InternalMyDsl.g:2190:1: ( ( rule__Real__Group_3__0 )? )
            {
            // InternalMyDsl.g:2190:1: ( ( rule__Real__Group_3__0 )? )
            // InternalMyDsl.g:2191:2: ( rule__Real__Group_3__0 )?
            {
             before(grammarAccess.getRealAccess().getGroup_3()); 
            // InternalMyDsl.g:2192:2: ( rule__Real__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==46) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:2192:3: rule__Real__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Real__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRealAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__3__Impl"


    // $ANTLR start "rule__Real__Group__4"
    // InternalMyDsl.g:2200:1: rule__Real__Group__4 : rule__Real__Group__4__Impl ;
    public final void rule__Real__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2204:1: ( rule__Real__Group__4__Impl )
            // InternalMyDsl.g:2205:2: rule__Real__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__4"


    // $ANTLR start "rule__Real__Group__4__Impl"
    // InternalMyDsl.g:2211:1: rule__Real__Group__4__Impl : ( '}' ) ;
    public final void rule__Real__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2215:1: ( ( '}' ) )
            // InternalMyDsl.g:2216:1: ( '}' )
            {
            // InternalMyDsl.g:2216:1: ( '}' )
            // InternalMyDsl.g:2217:2: '}'
            {
             before(grammarAccess.getRealAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__4__Impl"


    // $ANTLR start "rule__Real__Group_3__0"
    // InternalMyDsl.g:2227:1: rule__Real__Group_3__0 : rule__Real__Group_3__0__Impl rule__Real__Group_3__1 ;
    public final void rule__Real__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2231:1: ( rule__Real__Group_3__0__Impl rule__Real__Group_3__1 )
            // InternalMyDsl.g:2232:2: rule__Real__Group_3__0__Impl rule__Real__Group_3__1
            {
            pushFollow(FOLLOW_19);
            rule__Real__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Real__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_3__0"


    // $ANTLR start "rule__Real__Group_3__0__Impl"
    // InternalMyDsl.g:2239:1: rule__Real__Group_3__0__Impl : ( 'unit' ) ;
    public final void rule__Real__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2243:1: ( ( 'unit' ) )
            // InternalMyDsl.g:2244:1: ( 'unit' )
            {
            // InternalMyDsl.g:2244:1: ( 'unit' )
            // InternalMyDsl.g:2245:2: 'unit'
            {
             before(grammarAccess.getRealAccess().getUnitKeyword_3_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getRealAccess().getUnitKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_3__0__Impl"


    // $ANTLR start "rule__Real__Group_3__1"
    // InternalMyDsl.g:2254:1: rule__Real__Group_3__1 : rule__Real__Group_3__1__Impl ;
    public final void rule__Real__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2258:1: ( rule__Real__Group_3__1__Impl )
            // InternalMyDsl.g:2259:2: rule__Real__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Real__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_3__1"


    // $ANTLR start "rule__Real__Group_3__1__Impl"
    // InternalMyDsl.g:2265:1: rule__Real__Group_3__1__Impl : ( ( rule__Real__UnitAssignment_3_1 ) ) ;
    public final void rule__Real__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2269:1: ( ( ( rule__Real__UnitAssignment_3_1 ) ) )
            // InternalMyDsl.g:2270:1: ( ( rule__Real__UnitAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2270:1: ( ( rule__Real__UnitAssignment_3_1 ) )
            // InternalMyDsl.g:2271:2: ( rule__Real__UnitAssignment_3_1 )
            {
             before(grammarAccess.getRealAccess().getUnitAssignment_3_1()); 
            // InternalMyDsl.g:2272:2: ( rule__Real__UnitAssignment_3_1 )
            // InternalMyDsl.g:2272:3: rule__Real__UnitAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Real__UnitAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getUnitAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group_3__1__Impl"


    // $ANTLR start "rule__CallExpr__Group__0"
    // InternalMyDsl.g:2281:1: rule__CallExpr__Group__0 : rule__CallExpr__Group__0__Impl rule__CallExpr__Group__1 ;
    public final void rule__CallExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2285:1: ( rule__CallExpr__Group__0__Impl rule__CallExpr__Group__1 )
            // InternalMyDsl.g:2286:2: rule__CallExpr__Group__0__Impl rule__CallExpr__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__CallExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__0"


    // $ANTLR start "rule__CallExpr__Group__0__Impl"
    // InternalMyDsl.g:2293:1: rule__CallExpr__Group__0__Impl : ( () ) ;
    public final void rule__CallExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2297:1: ( ( () ) )
            // InternalMyDsl.g:2298:1: ( () )
            {
            // InternalMyDsl.g:2298:1: ( () )
            // InternalMyDsl.g:2299:2: ()
            {
             before(grammarAccess.getCallExprAccess().getCallExprAction_0()); 
            // InternalMyDsl.g:2300:2: ()
            // InternalMyDsl.g:2300:3: 
            {
            }

             after(grammarAccess.getCallExprAccess().getCallExprAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__0__Impl"


    // $ANTLR start "rule__CallExpr__Group__1"
    // InternalMyDsl.g:2308:1: rule__CallExpr__Group__1 : rule__CallExpr__Group__1__Impl rule__CallExpr__Group__2 ;
    public final void rule__CallExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2312:1: ( rule__CallExpr__Group__1__Impl rule__CallExpr__Group__2 )
            // InternalMyDsl.g:2313:2: rule__CallExpr__Group__1__Impl rule__CallExpr__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CallExpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__1"


    // $ANTLR start "rule__CallExpr__Group__1__Impl"
    // InternalMyDsl.g:2320:1: rule__CallExpr__Group__1__Impl : ( 'CallExpr' ) ;
    public final void rule__CallExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2324:1: ( ( 'CallExpr' ) )
            // InternalMyDsl.g:2325:1: ( 'CallExpr' )
            {
            // InternalMyDsl.g:2325:1: ( 'CallExpr' )
            // InternalMyDsl.g:2326:2: 'CallExpr'
            {
             before(grammarAccess.getCallExprAccess().getCallExprKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getCallExprAccess().getCallExprKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__1__Impl"


    // $ANTLR start "rule__CallExpr__Group__2"
    // InternalMyDsl.g:2335:1: rule__CallExpr__Group__2 : rule__CallExpr__Group__2__Impl rule__CallExpr__Group__3 ;
    public final void rule__CallExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2339:1: ( rule__CallExpr__Group__2__Impl rule__CallExpr__Group__3 )
            // InternalMyDsl.g:2340:2: rule__CallExpr__Group__2__Impl rule__CallExpr__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__CallExpr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__2"


    // $ANTLR start "rule__CallExpr__Group__2__Impl"
    // InternalMyDsl.g:2347:1: rule__CallExpr__Group__2__Impl : ( '{' ) ;
    public final void rule__CallExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2351:1: ( ( '{' ) )
            // InternalMyDsl.g:2352:1: ( '{' )
            {
            // InternalMyDsl.g:2352:1: ( '{' )
            // InternalMyDsl.g:2353:2: '{'
            {
             before(grammarAccess.getCallExprAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCallExprAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__2__Impl"


    // $ANTLR start "rule__CallExpr__Group__3"
    // InternalMyDsl.g:2362:1: rule__CallExpr__Group__3 : rule__CallExpr__Group__3__Impl rule__CallExpr__Group__4 ;
    public final void rule__CallExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2366:1: ( rule__CallExpr__Group__3__Impl rule__CallExpr__Group__4 )
            // InternalMyDsl.g:2367:2: rule__CallExpr__Group__3__Impl rule__CallExpr__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__CallExpr__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__3"


    // $ANTLR start "rule__CallExpr__Group__3__Impl"
    // InternalMyDsl.g:2374:1: rule__CallExpr__Group__3__Impl : ( ( rule__CallExpr__Group_3__0 )? ) ;
    public final void rule__CallExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2378:1: ( ( ( rule__CallExpr__Group_3__0 )? ) )
            // InternalMyDsl.g:2379:1: ( ( rule__CallExpr__Group_3__0 )? )
            {
            // InternalMyDsl.g:2379:1: ( ( rule__CallExpr__Group_3__0 )? )
            // InternalMyDsl.g:2380:2: ( rule__CallExpr__Group_3__0 )?
            {
             before(grammarAccess.getCallExprAccess().getGroup_3()); 
            // InternalMyDsl.g:2381:2: ( rule__CallExpr__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==48) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2381:3: rule__CallExpr__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CallExpr__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCallExprAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__3__Impl"


    // $ANTLR start "rule__CallExpr__Group__4"
    // InternalMyDsl.g:2389:1: rule__CallExpr__Group__4 : rule__CallExpr__Group__4__Impl rule__CallExpr__Group__5 ;
    public final void rule__CallExpr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2393:1: ( rule__CallExpr__Group__4__Impl rule__CallExpr__Group__5 )
            // InternalMyDsl.g:2394:2: rule__CallExpr__Group__4__Impl rule__CallExpr__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__CallExpr__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__4"


    // $ANTLR start "rule__CallExpr__Group__4__Impl"
    // InternalMyDsl.g:2401:1: rule__CallExpr__Group__4__Impl : ( ( rule__CallExpr__Group_4__0 )? ) ;
    public final void rule__CallExpr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2405:1: ( ( ( rule__CallExpr__Group_4__0 )? ) )
            // InternalMyDsl.g:2406:1: ( ( rule__CallExpr__Group_4__0 )? )
            {
            // InternalMyDsl.g:2406:1: ( ( rule__CallExpr__Group_4__0 )? )
            // InternalMyDsl.g:2407:2: ( rule__CallExpr__Group_4__0 )?
            {
             before(grammarAccess.getCallExprAccess().getGroup_4()); 
            // InternalMyDsl.g:2408:2: ( rule__CallExpr__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2408:3: rule__CallExpr__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CallExpr__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCallExprAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__4__Impl"


    // $ANTLR start "rule__CallExpr__Group__5"
    // InternalMyDsl.g:2416:1: rule__CallExpr__Group__5 : rule__CallExpr__Group__5__Impl rule__CallExpr__Group__6 ;
    public final void rule__CallExpr__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2420:1: ( rule__CallExpr__Group__5__Impl rule__CallExpr__Group__6 )
            // InternalMyDsl.g:2421:2: rule__CallExpr__Group__5__Impl rule__CallExpr__Group__6
            {
            pushFollow(FOLLOW_21);
            rule__CallExpr__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__5"


    // $ANTLR start "rule__CallExpr__Group__5__Impl"
    // InternalMyDsl.g:2428:1: rule__CallExpr__Group__5__Impl : ( ( rule__CallExpr__Group_5__0 )? ) ;
    public final void rule__CallExpr__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2432:1: ( ( ( rule__CallExpr__Group_5__0 )? ) )
            // InternalMyDsl.g:2433:1: ( ( rule__CallExpr__Group_5__0 )? )
            {
            // InternalMyDsl.g:2433:1: ( ( rule__CallExpr__Group_5__0 )? )
            // InternalMyDsl.g:2434:2: ( rule__CallExpr__Group_5__0 )?
            {
             before(grammarAccess.getCallExprAccess().getGroup_5()); 
            // InternalMyDsl.g:2435:2: ( rule__CallExpr__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==49) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2435:3: rule__CallExpr__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CallExpr__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCallExprAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__5__Impl"


    // $ANTLR start "rule__CallExpr__Group__6"
    // InternalMyDsl.g:2443:1: rule__CallExpr__Group__6 : rule__CallExpr__Group__6__Impl ;
    public final void rule__CallExpr__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2447:1: ( rule__CallExpr__Group__6__Impl )
            // InternalMyDsl.g:2448:2: rule__CallExpr__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallExpr__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__6"


    // $ANTLR start "rule__CallExpr__Group__6__Impl"
    // InternalMyDsl.g:2454:1: rule__CallExpr__Group__6__Impl : ( '}' ) ;
    public final void rule__CallExpr__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2458:1: ( ( '}' ) )
            // InternalMyDsl.g:2459:1: ( '}' )
            {
            // InternalMyDsl.g:2459:1: ( '}' )
            // InternalMyDsl.g:2460:2: '}'
            {
             before(grammarAccess.getCallExprAccess().getRightCurlyBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCallExprAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group__6__Impl"


    // $ANTLR start "rule__CallExpr__Group_3__0"
    // InternalMyDsl.g:2470:1: rule__CallExpr__Group_3__0 : rule__CallExpr__Group_3__0__Impl rule__CallExpr__Group_3__1 ;
    public final void rule__CallExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2474:1: ( rule__CallExpr__Group_3__0__Impl rule__CallExpr__Group_3__1 )
            // InternalMyDsl.g:2475:2: rule__CallExpr__Group_3__0__Impl rule__CallExpr__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__CallExpr__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_3__0"


    // $ANTLR start "rule__CallExpr__Group_3__0__Impl"
    // InternalMyDsl.g:2482:1: rule__CallExpr__Group_3__0__Impl : ( 'fonction' ) ;
    public final void rule__CallExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2486:1: ( ( 'fonction' ) )
            // InternalMyDsl.g:2487:1: ( 'fonction' )
            {
            // InternalMyDsl.g:2487:1: ( 'fonction' )
            // InternalMyDsl.g:2488:2: 'fonction'
            {
             before(grammarAccess.getCallExprAccess().getFonctionKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCallExprAccess().getFonctionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_3__0__Impl"


    // $ANTLR start "rule__CallExpr__Group_3__1"
    // InternalMyDsl.g:2497:1: rule__CallExpr__Group_3__1 : rule__CallExpr__Group_3__1__Impl ;
    public final void rule__CallExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2501:1: ( rule__CallExpr__Group_3__1__Impl )
            // InternalMyDsl.g:2502:2: rule__CallExpr__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_3__1"


    // $ANTLR start "rule__CallExpr__Group_3__1__Impl"
    // InternalMyDsl.g:2508:1: rule__CallExpr__Group_3__1__Impl : ( ( rule__CallExpr__FonctionAssignment_3_1 ) ) ;
    public final void rule__CallExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2512:1: ( ( ( rule__CallExpr__FonctionAssignment_3_1 ) ) )
            // InternalMyDsl.g:2513:1: ( ( rule__CallExpr__FonctionAssignment_3_1 ) )
            {
            // InternalMyDsl.g:2513:1: ( ( rule__CallExpr__FonctionAssignment_3_1 ) )
            // InternalMyDsl.g:2514:2: ( rule__CallExpr__FonctionAssignment_3_1 )
            {
             before(grammarAccess.getCallExprAccess().getFonctionAssignment_3_1()); 
            // InternalMyDsl.g:2515:2: ( rule__CallExpr__FonctionAssignment_3_1 )
            // InternalMyDsl.g:2515:3: rule__CallExpr__FonctionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CallExpr__FonctionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCallExprAccess().getFonctionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_3__1__Impl"


    // $ANTLR start "rule__CallExpr__Group_4__0"
    // InternalMyDsl.g:2524:1: rule__CallExpr__Group_4__0 : rule__CallExpr__Group_4__0__Impl rule__CallExpr__Group_4__1 ;
    public final void rule__CallExpr__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2528:1: ( rule__CallExpr__Group_4__0__Impl rule__CallExpr__Group_4__1 )
            // InternalMyDsl.g:2529:2: rule__CallExpr__Group_4__0__Impl rule__CallExpr__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__CallExpr__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_4__0"


    // $ANTLR start "rule__CallExpr__Group_4__0__Impl"
    // InternalMyDsl.g:2536:1: rule__CallExpr__Group_4__0__Impl : ( 'variable' ) ;
    public final void rule__CallExpr__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2540:1: ( ( 'variable' ) )
            // InternalMyDsl.g:2541:1: ( 'variable' )
            {
            // InternalMyDsl.g:2541:1: ( 'variable' )
            // InternalMyDsl.g:2542:2: 'variable'
            {
             before(grammarAccess.getCallExprAccess().getVariableKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getCallExprAccess().getVariableKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_4__0__Impl"


    // $ANTLR start "rule__CallExpr__Group_4__1"
    // InternalMyDsl.g:2551:1: rule__CallExpr__Group_4__1 : rule__CallExpr__Group_4__1__Impl rule__CallExpr__Group_4__2 ;
    public final void rule__CallExpr__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2555:1: ( rule__CallExpr__Group_4__1__Impl rule__CallExpr__Group_4__2 )
            // InternalMyDsl.g:2556:2: rule__CallExpr__Group_4__1__Impl rule__CallExpr__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__CallExpr__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_4__1"


    // $ANTLR start "rule__CallExpr__Group_4__1__Impl"
    // InternalMyDsl.g:2563:1: rule__CallExpr__Group_4__1__Impl : ( '{' ) ;
    public final void rule__CallExpr__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2567:1: ( ( '{' ) )
            // InternalMyDsl.g:2568:1: ( '{' )
            {
            // InternalMyDsl.g:2568:1: ( '{' )
            // InternalMyDsl.g:2569:2: '{'
            {
             before(grammarAccess.getCallExprAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCallExprAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_4__1__Impl"


    // $ANTLR start "rule__CallExpr__Group_4__2"
    // InternalMyDsl.g:2578:1: rule__CallExpr__Group_4__2 : rule__CallExpr__Group_4__2__Impl rule__CallExpr__Group_4__3 ;
    public final void rule__CallExpr__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2582:1: ( rule__CallExpr__Group_4__2__Impl rule__CallExpr__Group_4__3 )
            // InternalMyDsl.g:2583:2: rule__CallExpr__Group_4__2__Impl rule__CallExpr__Group_4__3
            {
            pushFollow(FOLLOW_11);
            rule__CallExpr__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_4__2"


    // $ANTLR start "rule__CallExpr__Group_4__2__Impl"
    // InternalMyDsl.g:2590:1: rule__CallExpr__Group_4__2__Impl : ( ( rule__CallExpr__VariableAssignment_4_2 ) ) ;
    public final void rule__CallExpr__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2594:1: ( ( ( rule__CallExpr__VariableAssignment_4_2 ) ) )
            // InternalMyDsl.g:2595:1: ( ( rule__CallExpr__VariableAssignment_4_2 ) )
            {
            // InternalMyDsl.g:2595:1: ( ( rule__CallExpr__VariableAssignment_4_2 ) )
            // InternalMyDsl.g:2596:2: ( rule__CallExpr__VariableAssignment_4_2 )
            {
             before(grammarAccess.getCallExprAccess().getVariableAssignment_4_2()); 
            // InternalMyDsl.g:2597:2: ( rule__CallExpr__VariableAssignment_4_2 )
            // InternalMyDsl.g:2597:3: rule__CallExpr__VariableAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__CallExpr__VariableAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getCallExprAccess().getVariableAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_4__2__Impl"


    // $ANTLR start "rule__CallExpr__Group_4__3"
    // InternalMyDsl.g:2605:1: rule__CallExpr__Group_4__3 : rule__CallExpr__Group_4__3__Impl rule__CallExpr__Group_4__4 ;
    public final void rule__CallExpr__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2609:1: ( rule__CallExpr__Group_4__3__Impl rule__CallExpr__Group_4__4 )
            // InternalMyDsl.g:2610:2: rule__CallExpr__Group_4__3__Impl rule__CallExpr__Group_4__4
            {
            pushFollow(FOLLOW_11);
            rule__CallExpr__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_4__3"


    // $ANTLR start "rule__CallExpr__Group_4__3__Impl"
    // InternalMyDsl.g:2617:1: rule__CallExpr__Group_4__3__Impl : ( ( rule__CallExpr__Group_4_3__0 )* ) ;
    public final void rule__CallExpr__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2621:1: ( ( ( rule__CallExpr__Group_4_3__0 )* ) )
            // InternalMyDsl.g:2622:1: ( ( rule__CallExpr__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:2622:1: ( ( rule__CallExpr__Group_4_3__0 )* )
            // InternalMyDsl.g:2623:2: ( rule__CallExpr__Group_4_3__0 )*
            {
             before(grammarAccess.getCallExprAccess().getGroup_4_3()); 
            // InternalMyDsl.g:2624:2: ( rule__CallExpr__Group_4_3__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==40) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:2624:3: rule__CallExpr__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__CallExpr__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getCallExprAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_4__3__Impl"


    // $ANTLR start "rule__CallExpr__Group_4__4"
    // InternalMyDsl.g:2632:1: rule__CallExpr__Group_4__4 : rule__CallExpr__Group_4__4__Impl ;
    public final void rule__CallExpr__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2636:1: ( rule__CallExpr__Group_4__4__Impl )
            // InternalMyDsl.g:2637:2: rule__CallExpr__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_4__4"


    // $ANTLR start "rule__CallExpr__Group_4__4__Impl"
    // InternalMyDsl.g:2643:1: rule__CallExpr__Group_4__4__Impl : ( '}' ) ;
    public final void rule__CallExpr__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2647:1: ( ( '}' ) )
            // InternalMyDsl.g:2648:1: ( '}' )
            {
            // InternalMyDsl.g:2648:1: ( '}' )
            // InternalMyDsl.g:2649:2: '}'
            {
             before(grammarAccess.getCallExprAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCallExprAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_4__4__Impl"


    // $ANTLR start "rule__CallExpr__Group_4_3__0"
    // InternalMyDsl.g:2659:1: rule__CallExpr__Group_4_3__0 : rule__CallExpr__Group_4_3__0__Impl rule__CallExpr__Group_4_3__1 ;
    public final void rule__CallExpr__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2663:1: ( rule__CallExpr__Group_4_3__0__Impl rule__CallExpr__Group_4_3__1 )
            // InternalMyDsl.g:2664:2: rule__CallExpr__Group_4_3__0__Impl rule__CallExpr__Group_4_3__1
            {
            pushFollow(FOLLOW_3);
            rule__CallExpr__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_4_3__0"


    // $ANTLR start "rule__CallExpr__Group_4_3__0__Impl"
    // InternalMyDsl.g:2671:1: rule__CallExpr__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__CallExpr__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2675:1: ( ( ',' ) )
            // InternalMyDsl.g:2676:1: ( ',' )
            {
            // InternalMyDsl.g:2676:1: ( ',' )
            // InternalMyDsl.g:2677:2: ','
            {
             before(grammarAccess.getCallExprAccess().getCommaKeyword_4_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCallExprAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_4_3__0__Impl"


    // $ANTLR start "rule__CallExpr__Group_4_3__1"
    // InternalMyDsl.g:2686:1: rule__CallExpr__Group_4_3__1 : rule__CallExpr__Group_4_3__1__Impl ;
    public final void rule__CallExpr__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2690:1: ( rule__CallExpr__Group_4_3__1__Impl )
            // InternalMyDsl.g:2691:2: rule__CallExpr__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_4_3__1"


    // $ANTLR start "rule__CallExpr__Group_4_3__1__Impl"
    // InternalMyDsl.g:2697:1: rule__CallExpr__Group_4_3__1__Impl : ( ( rule__CallExpr__VariableAssignment_4_3_1 ) ) ;
    public final void rule__CallExpr__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2701:1: ( ( ( rule__CallExpr__VariableAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:2702:1: ( ( rule__CallExpr__VariableAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:2702:1: ( ( rule__CallExpr__VariableAssignment_4_3_1 ) )
            // InternalMyDsl.g:2703:2: ( rule__CallExpr__VariableAssignment_4_3_1 )
            {
             before(grammarAccess.getCallExprAccess().getVariableAssignment_4_3_1()); 
            // InternalMyDsl.g:2704:2: ( rule__CallExpr__VariableAssignment_4_3_1 )
            // InternalMyDsl.g:2704:3: rule__CallExpr__VariableAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CallExpr__VariableAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCallExprAccess().getVariableAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_4_3__1__Impl"


    // $ANTLR start "rule__CallExpr__Group_5__0"
    // InternalMyDsl.g:2713:1: rule__CallExpr__Group_5__0 : rule__CallExpr__Group_5__0__Impl rule__CallExpr__Group_5__1 ;
    public final void rule__CallExpr__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2717:1: ( rule__CallExpr__Group_5__0__Impl rule__CallExpr__Group_5__1 )
            // InternalMyDsl.g:2718:2: rule__CallExpr__Group_5__0__Impl rule__CallExpr__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__CallExpr__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_5__0"


    // $ANTLR start "rule__CallExpr__Group_5__0__Impl"
    // InternalMyDsl.g:2725:1: rule__CallExpr__Group_5__0__Impl : ( 'parameters' ) ;
    public final void rule__CallExpr__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2729:1: ( ( 'parameters' ) )
            // InternalMyDsl.g:2730:1: ( 'parameters' )
            {
            // InternalMyDsl.g:2730:1: ( 'parameters' )
            // InternalMyDsl.g:2731:2: 'parameters'
            {
             before(grammarAccess.getCallExprAccess().getParametersKeyword_5_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCallExprAccess().getParametersKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_5__0__Impl"


    // $ANTLR start "rule__CallExpr__Group_5__1"
    // InternalMyDsl.g:2740:1: rule__CallExpr__Group_5__1 : rule__CallExpr__Group_5__1__Impl rule__CallExpr__Group_5__2 ;
    public final void rule__CallExpr__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2744:1: ( rule__CallExpr__Group_5__1__Impl rule__CallExpr__Group_5__2 )
            // InternalMyDsl.g:2745:2: rule__CallExpr__Group_5__1__Impl rule__CallExpr__Group_5__2
            {
            pushFollow(FOLLOW_9);
            rule__CallExpr__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_5__1"


    // $ANTLR start "rule__CallExpr__Group_5__1__Impl"
    // InternalMyDsl.g:2752:1: rule__CallExpr__Group_5__1__Impl : ( '{' ) ;
    public final void rule__CallExpr__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2756:1: ( ( '{' ) )
            // InternalMyDsl.g:2757:1: ( '{' )
            {
            // InternalMyDsl.g:2757:1: ( '{' )
            // InternalMyDsl.g:2758:2: '{'
            {
             before(grammarAccess.getCallExprAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCallExprAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_5__1__Impl"


    // $ANTLR start "rule__CallExpr__Group_5__2"
    // InternalMyDsl.g:2767:1: rule__CallExpr__Group_5__2 : rule__CallExpr__Group_5__2__Impl rule__CallExpr__Group_5__3 ;
    public final void rule__CallExpr__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2771:1: ( rule__CallExpr__Group_5__2__Impl rule__CallExpr__Group_5__3 )
            // InternalMyDsl.g:2772:2: rule__CallExpr__Group_5__2__Impl rule__CallExpr__Group_5__3
            {
            pushFollow(FOLLOW_11);
            rule__CallExpr__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_5__2"


    // $ANTLR start "rule__CallExpr__Group_5__2__Impl"
    // InternalMyDsl.g:2779:1: rule__CallExpr__Group_5__2__Impl : ( ( rule__CallExpr__ParametersAssignment_5_2 ) ) ;
    public final void rule__CallExpr__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2783:1: ( ( ( rule__CallExpr__ParametersAssignment_5_2 ) ) )
            // InternalMyDsl.g:2784:1: ( ( rule__CallExpr__ParametersAssignment_5_2 ) )
            {
            // InternalMyDsl.g:2784:1: ( ( rule__CallExpr__ParametersAssignment_5_2 ) )
            // InternalMyDsl.g:2785:2: ( rule__CallExpr__ParametersAssignment_5_2 )
            {
             before(grammarAccess.getCallExprAccess().getParametersAssignment_5_2()); 
            // InternalMyDsl.g:2786:2: ( rule__CallExpr__ParametersAssignment_5_2 )
            // InternalMyDsl.g:2786:3: rule__CallExpr__ParametersAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__CallExpr__ParametersAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getCallExprAccess().getParametersAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_5__2__Impl"


    // $ANTLR start "rule__CallExpr__Group_5__3"
    // InternalMyDsl.g:2794:1: rule__CallExpr__Group_5__3 : rule__CallExpr__Group_5__3__Impl rule__CallExpr__Group_5__4 ;
    public final void rule__CallExpr__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2798:1: ( rule__CallExpr__Group_5__3__Impl rule__CallExpr__Group_5__4 )
            // InternalMyDsl.g:2799:2: rule__CallExpr__Group_5__3__Impl rule__CallExpr__Group_5__4
            {
            pushFollow(FOLLOW_11);
            rule__CallExpr__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_5__3"


    // $ANTLR start "rule__CallExpr__Group_5__3__Impl"
    // InternalMyDsl.g:2806:1: rule__CallExpr__Group_5__3__Impl : ( ( rule__CallExpr__Group_5_3__0 )* ) ;
    public final void rule__CallExpr__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2810:1: ( ( ( rule__CallExpr__Group_5_3__0 )* ) )
            // InternalMyDsl.g:2811:1: ( ( rule__CallExpr__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:2811:1: ( ( rule__CallExpr__Group_5_3__0 )* )
            // InternalMyDsl.g:2812:2: ( rule__CallExpr__Group_5_3__0 )*
            {
             before(grammarAccess.getCallExprAccess().getGroup_5_3()); 
            // InternalMyDsl.g:2813:2: ( rule__CallExpr__Group_5_3__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:2813:3: rule__CallExpr__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__CallExpr__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getCallExprAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_5__3__Impl"


    // $ANTLR start "rule__CallExpr__Group_5__4"
    // InternalMyDsl.g:2821:1: rule__CallExpr__Group_5__4 : rule__CallExpr__Group_5__4__Impl ;
    public final void rule__CallExpr__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2825:1: ( rule__CallExpr__Group_5__4__Impl )
            // InternalMyDsl.g:2826:2: rule__CallExpr__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_5__4"


    // $ANTLR start "rule__CallExpr__Group_5__4__Impl"
    // InternalMyDsl.g:2832:1: rule__CallExpr__Group_5__4__Impl : ( '}' ) ;
    public final void rule__CallExpr__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2836:1: ( ( '}' ) )
            // InternalMyDsl.g:2837:1: ( '}' )
            {
            // InternalMyDsl.g:2837:1: ( '}' )
            // InternalMyDsl.g:2838:2: '}'
            {
             before(grammarAccess.getCallExprAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCallExprAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_5__4__Impl"


    // $ANTLR start "rule__CallExpr__Group_5_3__0"
    // InternalMyDsl.g:2848:1: rule__CallExpr__Group_5_3__0 : rule__CallExpr__Group_5_3__0__Impl rule__CallExpr__Group_5_3__1 ;
    public final void rule__CallExpr__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2852:1: ( rule__CallExpr__Group_5_3__0__Impl rule__CallExpr__Group_5_3__1 )
            // InternalMyDsl.g:2853:2: rule__CallExpr__Group_5_3__0__Impl rule__CallExpr__Group_5_3__1
            {
            pushFollow(FOLLOW_9);
            rule__CallExpr__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_5_3__0"


    // $ANTLR start "rule__CallExpr__Group_5_3__0__Impl"
    // InternalMyDsl.g:2860:1: rule__CallExpr__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__CallExpr__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2864:1: ( ( ',' ) )
            // InternalMyDsl.g:2865:1: ( ',' )
            {
            // InternalMyDsl.g:2865:1: ( ',' )
            // InternalMyDsl.g:2866:2: ','
            {
             before(grammarAccess.getCallExprAccess().getCommaKeyword_5_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getCallExprAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_5_3__0__Impl"


    // $ANTLR start "rule__CallExpr__Group_5_3__1"
    // InternalMyDsl.g:2875:1: rule__CallExpr__Group_5_3__1 : rule__CallExpr__Group_5_3__1__Impl ;
    public final void rule__CallExpr__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2879:1: ( rule__CallExpr__Group_5_3__1__Impl )
            // InternalMyDsl.g:2880:2: rule__CallExpr__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CallExpr__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_5_3__1"


    // $ANTLR start "rule__CallExpr__Group_5_3__1__Impl"
    // InternalMyDsl.g:2886:1: rule__CallExpr__Group_5_3__1__Impl : ( ( rule__CallExpr__ParametersAssignment_5_3_1 ) ) ;
    public final void rule__CallExpr__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2890:1: ( ( ( rule__CallExpr__ParametersAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:2891:1: ( ( rule__CallExpr__ParametersAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:2891:1: ( ( rule__CallExpr__ParametersAssignment_5_3_1 ) )
            // InternalMyDsl.g:2892:2: ( rule__CallExpr__ParametersAssignment_5_3_1 )
            {
             before(grammarAccess.getCallExprAccess().getParametersAssignment_5_3_1()); 
            // InternalMyDsl.g:2893:2: ( rule__CallExpr__ParametersAssignment_5_3_1 )
            // InternalMyDsl.g:2893:3: rule__CallExpr__ParametersAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__CallExpr__ParametersAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCallExprAccess().getParametersAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__Group_5_3__1__Impl"


    // $ANTLR start "rule__VarExpr__Group__0"
    // InternalMyDsl.g:2902:1: rule__VarExpr__Group__0 : rule__VarExpr__Group__0__Impl rule__VarExpr__Group__1 ;
    public final void rule__VarExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2906:1: ( rule__VarExpr__Group__0__Impl rule__VarExpr__Group__1 )
            // InternalMyDsl.g:2907:2: rule__VarExpr__Group__0__Impl rule__VarExpr__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__VarExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group__0"


    // $ANTLR start "rule__VarExpr__Group__0__Impl"
    // InternalMyDsl.g:2914:1: rule__VarExpr__Group__0__Impl : ( () ) ;
    public final void rule__VarExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2918:1: ( ( () ) )
            // InternalMyDsl.g:2919:1: ( () )
            {
            // InternalMyDsl.g:2919:1: ( () )
            // InternalMyDsl.g:2920:2: ()
            {
             before(grammarAccess.getVarExprAccess().getVarExprAction_0()); 
            // InternalMyDsl.g:2921:2: ()
            // InternalMyDsl.g:2921:3: 
            {
            }

             after(grammarAccess.getVarExprAccess().getVarExprAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group__0__Impl"


    // $ANTLR start "rule__VarExpr__Group__1"
    // InternalMyDsl.g:2929:1: rule__VarExpr__Group__1 : rule__VarExpr__Group__1__Impl rule__VarExpr__Group__2 ;
    public final void rule__VarExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2933:1: ( rule__VarExpr__Group__1__Impl rule__VarExpr__Group__2 )
            // InternalMyDsl.g:2934:2: rule__VarExpr__Group__1__Impl rule__VarExpr__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VarExpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarExpr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group__1"


    // $ANTLR start "rule__VarExpr__Group__1__Impl"
    // InternalMyDsl.g:2941:1: rule__VarExpr__Group__1__Impl : ( 'VarExpr' ) ;
    public final void rule__VarExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2945:1: ( ( 'VarExpr' ) )
            // InternalMyDsl.g:2946:1: ( 'VarExpr' )
            {
            // InternalMyDsl.g:2946:1: ( 'VarExpr' )
            // InternalMyDsl.g:2947:2: 'VarExpr'
            {
             before(grammarAccess.getVarExprAccess().getVarExprKeyword_1()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getVarExprAccess().getVarExprKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group__1__Impl"


    // $ANTLR start "rule__VarExpr__Group__2"
    // InternalMyDsl.g:2956:1: rule__VarExpr__Group__2 : rule__VarExpr__Group__2__Impl rule__VarExpr__Group__3 ;
    public final void rule__VarExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2960:1: ( rule__VarExpr__Group__2__Impl rule__VarExpr__Group__3 )
            // InternalMyDsl.g:2961:2: rule__VarExpr__Group__2__Impl rule__VarExpr__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__VarExpr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarExpr__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group__2"


    // $ANTLR start "rule__VarExpr__Group__2__Impl"
    // InternalMyDsl.g:2968:1: rule__VarExpr__Group__2__Impl : ( '{' ) ;
    public final void rule__VarExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2972:1: ( ( '{' ) )
            // InternalMyDsl.g:2973:1: ( '{' )
            {
            // InternalMyDsl.g:2973:1: ( '{' )
            // InternalMyDsl.g:2974:2: '{'
            {
             before(grammarAccess.getVarExprAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVarExprAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group__2__Impl"


    // $ANTLR start "rule__VarExpr__Group__3"
    // InternalMyDsl.g:2983:1: rule__VarExpr__Group__3 : rule__VarExpr__Group__3__Impl rule__VarExpr__Group__4 ;
    public final void rule__VarExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2987:1: ( rule__VarExpr__Group__3__Impl rule__VarExpr__Group__4 )
            // InternalMyDsl.g:2988:2: rule__VarExpr__Group__3__Impl rule__VarExpr__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__VarExpr__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarExpr__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group__3"


    // $ANTLR start "rule__VarExpr__Group__3__Impl"
    // InternalMyDsl.g:2995:1: rule__VarExpr__Group__3__Impl : ( ( rule__VarExpr__Group_3__0 )? ) ;
    public final void rule__VarExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2999:1: ( ( ( rule__VarExpr__Group_3__0 )? ) )
            // InternalMyDsl.g:3000:1: ( ( rule__VarExpr__Group_3__0 )? )
            {
            // InternalMyDsl.g:3000:1: ( ( rule__VarExpr__Group_3__0 )? )
            // InternalMyDsl.g:3001:2: ( rule__VarExpr__Group_3__0 )?
            {
             before(grammarAccess.getVarExprAccess().getGroup_3()); 
            // InternalMyDsl.g:3002:2: ( rule__VarExpr__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==51) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:3002:3: rule__VarExpr__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarExpr__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVarExprAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group__3__Impl"


    // $ANTLR start "rule__VarExpr__Group__4"
    // InternalMyDsl.g:3010:1: rule__VarExpr__Group__4 : rule__VarExpr__Group__4__Impl rule__VarExpr__Group__5 ;
    public final void rule__VarExpr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3014:1: ( rule__VarExpr__Group__4__Impl rule__VarExpr__Group__5 )
            // InternalMyDsl.g:3015:2: rule__VarExpr__Group__4__Impl rule__VarExpr__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__VarExpr__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarExpr__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group__4"


    // $ANTLR start "rule__VarExpr__Group__4__Impl"
    // InternalMyDsl.g:3022:1: rule__VarExpr__Group__4__Impl : ( ( rule__VarExpr__Group_4__0 )? ) ;
    public final void rule__VarExpr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3026:1: ( ( ( rule__VarExpr__Group_4__0 )? ) )
            // InternalMyDsl.g:3027:1: ( ( rule__VarExpr__Group_4__0 )? )
            {
            // InternalMyDsl.g:3027:1: ( ( rule__VarExpr__Group_4__0 )? )
            // InternalMyDsl.g:3028:2: ( rule__VarExpr__Group_4__0 )?
            {
             before(grammarAccess.getVarExprAccess().getGroup_4()); 
            // InternalMyDsl.g:3029:2: ( rule__VarExpr__Group_4__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==39) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:3029:3: rule__VarExpr__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VarExpr__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getVarExprAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group__4__Impl"


    // $ANTLR start "rule__VarExpr__Group__5"
    // InternalMyDsl.g:3037:1: rule__VarExpr__Group__5 : rule__VarExpr__Group__5__Impl ;
    public final void rule__VarExpr__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3041:1: ( rule__VarExpr__Group__5__Impl )
            // InternalMyDsl.g:3042:2: rule__VarExpr__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarExpr__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group__5"


    // $ANTLR start "rule__VarExpr__Group__5__Impl"
    // InternalMyDsl.g:3048:1: rule__VarExpr__Group__5__Impl : ( '}' ) ;
    public final void rule__VarExpr__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3052:1: ( ( '}' ) )
            // InternalMyDsl.g:3053:1: ( '}' )
            {
            // InternalMyDsl.g:3053:1: ( '}' )
            // InternalMyDsl.g:3054:2: '}'
            {
             before(grammarAccess.getVarExprAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVarExprAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group__5__Impl"


    // $ANTLR start "rule__VarExpr__Group_3__0"
    // InternalMyDsl.g:3064:1: rule__VarExpr__Group_3__0 : rule__VarExpr__Group_3__0__Impl rule__VarExpr__Group_3__1 ;
    public final void rule__VarExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3068:1: ( rule__VarExpr__Group_3__0__Impl rule__VarExpr__Group_3__1 )
            // InternalMyDsl.g:3069:2: rule__VarExpr__Group_3__0__Impl rule__VarExpr__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__VarExpr__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarExpr__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_3__0"


    // $ANTLR start "rule__VarExpr__Group_3__0__Impl"
    // InternalMyDsl.g:3076:1: rule__VarExpr__Group_3__0__Impl : ( 'variableRef' ) ;
    public final void rule__VarExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3080:1: ( ( 'variableRef' ) )
            // InternalMyDsl.g:3081:1: ( 'variableRef' )
            {
            // InternalMyDsl.g:3081:1: ( 'variableRef' )
            // InternalMyDsl.g:3082:2: 'variableRef'
            {
             before(grammarAccess.getVarExprAccess().getVariableRefKeyword_3_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getVarExprAccess().getVariableRefKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_3__0__Impl"


    // $ANTLR start "rule__VarExpr__Group_3__1"
    // InternalMyDsl.g:3091:1: rule__VarExpr__Group_3__1 : rule__VarExpr__Group_3__1__Impl ;
    public final void rule__VarExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3095:1: ( rule__VarExpr__Group_3__1__Impl )
            // InternalMyDsl.g:3096:2: rule__VarExpr__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarExpr__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_3__1"


    // $ANTLR start "rule__VarExpr__Group_3__1__Impl"
    // InternalMyDsl.g:3102:1: rule__VarExpr__Group_3__1__Impl : ( ( rule__VarExpr__VariableRefAssignment_3_1 ) ) ;
    public final void rule__VarExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3106:1: ( ( ( rule__VarExpr__VariableRefAssignment_3_1 ) ) )
            // InternalMyDsl.g:3107:1: ( ( rule__VarExpr__VariableRefAssignment_3_1 ) )
            {
            // InternalMyDsl.g:3107:1: ( ( rule__VarExpr__VariableRefAssignment_3_1 ) )
            // InternalMyDsl.g:3108:2: ( rule__VarExpr__VariableRefAssignment_3_1 )
            {
             before(grammarAccess.getVarExprAccess().getVariableRefAssignment_3_1()); 
            // InternalMyDsl.g:3109:2: ( rule__VarExpr__VariableRefAssignment_3_1 )
            // InternalMyDsl.g:3109:3: rule__VarExpr__VariableRefAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__VarExpr__VariableRefAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVarExprAccess().getVariableRefAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_3__1__Impl"


    // $ANTLR start "rule__VarExpr__Group_4__0"
    // InternalMyDsl.g:3118:1: rule__VarExpr__Group_4__0 : rule__VarExpr__Group_4__0__Impl rule__VarExpr__Group_4__1 ;
    public final void rule__VarExpr__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3122:1: ( rule__VarExpr__Group_4__0__Impl rule__VarExpr__Group_4__1 )
            // InternalMyDsl.g:3123:2: rule__VarExpr__Group_4__0__Impl rule__VarExpr__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__VarExpr__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarExpr__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_4__0"


    // $ANTLR start "rule__VarExpr__Group_4__0__Impl"
    // InternalMyDsl.g:3130:1: rule__VarExpr__Group_4__0__Impl : ( 'variable' ) ;
    public final void rule__VarExpr__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3134:1: ( ( 'variable' ) )
            // InternalMyDsl.g:3135:1: ( 'variable' )
            {
            // InternalMyDsl.g:3135:1: ( 'variable' )
            // InternalMyDsl.g:3136:2: 'variable'
            {
             before(grammarAccess.getVarExprAccess().getVariableKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getVarExprAccess().getVariableKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_4__0__Impl"


    // $ANTLR start "rule__VarExpr__Group_4__1"
    // InternalMyDsl.g:3145:1: rule__VarExpr__Group_4__1 : rule__VarExpr__Group_4__1__Impl rule__VarExpr__Group_4__2 ;
    public final void rule__VarExpr__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3149:1: ( rule__VarExpr__Group_4__1__Impl rule__VarExpr__Group_4__2 )
            // InternalMyDsl.g:3150:2: rule__VarExpr__Group_4__1__Impl rule__VarExpr__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__VarExpr__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarExpr__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_4__1"


    // $ANTLR start "rule__VarExpr__Group_4__1__Impl"
    // InternalMyDsl.g:3157:1: rule__VarExpr__Group_4__1__Impl : ( '{' ) ;
    public final void rule__VarExpr__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3161:1: ( ( '{' ) )
            // InternalMyDsl.g:3162:1: ( '{' )
            {
            // InternalMyDsl.g:3162:1: ( '{' )
            // InternalMyDsl.g:3163:2: '{'
            {
             before(grammarAccess.getVarExprAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVarExprAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_4__1__Impl"


    // $ANTLR start "rule__VarExpr__Group_4__2"
    // InternalMyDsl.g:3172:1: rule__VarExpr__Group_4__2 : rule__VarExpr__Group_4__2__Impl rule__VarExpr__Group_4__3 ;
    public final void rule__VarExpr__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3176:1: ( rule__VarExpr__Group_4__2__Impl rule__VarExpr__Group_4__3 )
            // InternalMyDsl.g:3177:2: rule__VarExpr__Group_4__2__Impl rule__VarExpr__Group_4__3
            {
            pushFollow(FOLLOW_11);
            rule__VarExpr__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarExpr__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_4__2"


    // $ANTLR start "rule__VarExpr__Group_4__2__Impl"
    // InternalMyDsl.g:3184:1: rule__VarExpr__Group_4__2__Impl : ( ( rule__VarExpr__VariableAssignment_4_2 ) ) ;
    public final void rule__VarExpr__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3188:1: ( ( ( rule__VarExpr__VariableAssignment_4_2 ) ) )
            // InternalMyDsl.g:3189:1: ( ( rule__VarExpr__VariableAssignment_4_2 ) )
            {
            // InternalMyDsl.g:3189:1: ( ( rule__VarExpr__VariableAssignment_4_2 ) )
            // InternalMyDsl.g:3190:2: ( rule__VarExpr__VariableAssignment_4_2 )
            {
             before(grammarAccess.getVarExprAccess().getVariableAssignment_4_2()); 
            // InternalMyDsl.g:3191:2: ( rule__VarExpr__VariableAssignment_4_2 )
            // InternalMyDsl.g:3191:3: rule__VarExpr__VariableAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__VarExpr__VariableAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getVarExprAccess().getVariableAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_4__2__Impl"


    // $ANTLR start "rule__VarExpr__Group_4__3"
    // InternalMyDsl.g:3199:1: rule__VarExpr__Group_4__3 : rule__VarExpr__Group_4__3__Impl rule__VarExpr__Group_4__4 ;
    public final void rule__VarExpr__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3203:1: ( rule__VarExpr__Group_4__3__Impl rule__VarExpr__Group_4__4 )
            // InternalMyDsl.g:3204:2: rule__VarExpr__Group_4__3__Impl rule__VarExpr__Group_4__4
            {
            pushFollow(FOLLOW_11);
            rule__VarExpr__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarExpr__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_4__3"


    // $ANTLR start "rule__VarExpr__Group_4__3__Impl"
    // InternalMyDsl.g:3211:1: rule__VarExpr__Group_4__3__Impl : ( ( rule__VarExpr__Group_4_3__0 )* ) ;
    public final void rule__VarExpr__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3215:1: ( ( ( rule__VarExpr__Group_4_3__0 )* ) )
            // InternalMyDsl.g:3216:1: ( ( rule__VarExpr__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:3216:1: ( ( rule__VarExpr__Group_4_3__0 )* )
            // InternalMyDsl.g:3217:2: ( rule__VarExpr__Group_4_3__0 )*
            {
             before(grammarAccess.getVarExprAccess().getGroup_4_3()); 
            // InternalMyDsl.g:3218:2: ( rule__VarExpr__Group_4_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:3218:3: rule__VarExpr__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__VarExpr__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getVarExprAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_4__3__Impl"


    // $ANTLR start "rule__VarExpr__Group_4__4"
    // InternalMyDsl.g:3226:1: rule__VarExpr__Group_4__4 : rule__VarExpr__Group_4__4__Impl ;
    public final void rule__VarExpr__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3230:1: ( rule__VarExpr__Group_4__4__Impl )
            // InternalMyDsl.g:3231:2: rule__VarExpr__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarExpr__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_4__4"


    // $ANTLR start "rule__VarExpr__Group_4__4__Impl"
    // InternalMyDsl.g:3237:1: rule__VarExpr__Group_4__4__Impl : ( '}' ) ;
    public final void rule__VarExpr__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3241:1: ( ( '}' ) )
            // InternalMyDsl.g:3242:1: ( '}' )
            {
            // InternalMyDsl.g:3242:1: ( '}' )
            // InternalMyDsl.g:3243:2: '}'
            {
             before(grammarAccess.getVarExprAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVarExprAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_4__4__Impl"


    // $ANTLR start "rule__VarExpr__Group_4_3__0"
    // InternalMyDsl.g:3253:1: rule__VarExpr__Group_4_3__0 : rule__VarExpr__Group_4_3__0__Impl rule__VarExpr__Group_4_3__1 ;
    public final void rule__VarExpr__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3257:1: ( rule__VarExpr__Group_4_3__0__Impl rule__VarExpr__Group_4_3__1 )
            // InternalMyDsl.g:3258:2: rule__VarExpr__Group_4_3__0__Impl rule__VarExpr__Group_4_3__1
            {
            pushFollow(FOLLOW_3);
            rule__VarExpr__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarExpr__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_4_3__0"


    // $ANTLR start "rule__VarExpr__Group_4_3__0__Impl"
    // InternalMyDsl.g:3265:1: rule__VarExpr__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__VarExpr__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3269:1: ( ( ',' ) )
            // InternalMyDsl.g:3270:1: ( ',' )
            {
            // InternalMyDsl.g:3270:1: ( ',' )
            // InternalMyDsl.g:3271:2: ','
            {
             before(grammarAccess.getVarExprAccess().getCommaKeyword_4_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getVarExprAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_4_3__0__Impl"


    // $ANTLR start "rule__VarExpr__Group_4_3__1"
    // InternalMyDsl.g:3280:1: rule__VarExpr__Group_4_3__1 : rule__VarExpr__Group_4_3__1__Impl ;
    public final void rule__VarExpr__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3284:1: ( rule__VarExpr__Group_4_3__1__Impl )
            // InternalMyDsl.g:3285:2: rule__VarExpr__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarExpr__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_4_3__1"


    // $ANTLR start "rule__VarExpr__Group_4_3__1__Impl"
    // InternalMyDsl.g:3291:1: rule__VarExpr__Group_4_3__1__Impl : ( ( rule__VarExpr__VariableAssignment_4_3_1 ) ) ;
    public final void rule__VarExpr__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3295:1: ( ( ( rule__VarExpr__VariableAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:3296:1: ( ( rule__VarExpr__VariableAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:3296:1: ( ( rule__VarExpr__VariableAssignment_4_3_1 ) )
            // InternalMyDsl.g:3297:2: ( rule__VarExpr__VariableAssignment_4_3_1 )
            {
             before(grammarAccess.getVarExprAccess().getVariableAssignment_4_3_1()); 
            // InternalMyDsl.g:3298:2: ( rule__VarExpr__VariableAssignment_4_3_1 )
            // InternalMyDsl.g:3298:3: rule__VarExpr__VariableAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__VarExpr__VariableAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getVarExprAccess().getVariableAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__Group_4_3__1__Impl"


    // $ANTLR start "rule__Not__Group__0"
    // InternalMyDsl.g:3307:1: rule__Not__Group__0 : rule__Not__Group__0__Impl rule__Not__Group__1 ;
    public final void rule__Not__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3311:1: ( rule__Not__Group__0__Impl rule__Not__Group__1 )
            // InternalMyDsl.g:3312:2: rule__Not__Group__0__Impl rule__Not__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Not__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__0"


    // $ANTLR start "rule__Not__Group__0__Impl"
    // InternalMyDsl.g:3319:1: rule__Not__Group__0__Impl : ( 'Not' ) ;
    public final void rule__Not__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3323:1: ( ( 'Not' ) )
            // InternalMyDsl.g:3324:1: ( 'Not' )
            {
            // InternalMyDsl.g:3324:1: ( 'Not' )
            // InternalMyDsl.g:3325:2: 'Not'
            {
             before(grammarAccess.getNotAccess().getNotKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getNotAccess().getNotKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__0__Impl"


    // $ANTLR start "rule__Not__Group__1"
    // InternalMyDsl.g:3334:1: rule__Not__Group__1 : rule__Not__Group__1__Impl rule__Not__Group__2 ;
    public final void rule__Not__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3338:1: ( rule__Not__Group__1__Impl rule__Not__Group__2 )
            // InternalMyDsl.g:3339:2: rule__Not__Group__1__Impl rule__Not__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Not__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__1"


    // $ANTLR start "rule__Not__Group__1__Impl"
    // InternalMyDsl.g:3346:1: rule__Not__Group__1__Impl : ( '{' ) ;
    public final void rule__Not__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3350:1: ( ( '{' ) )
            // InternalMyDsl.g:3351:1: ( '{' )
            {
            // InternalMyDsl.g:3351:1: ( '{' )
            // InternalMyDsl.g:3352:2: '{'
            {
             before(grammarAccess.getNotAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNotAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__1__Impl"


    // $ANTLR start "rule__Not__Group__2"
    // InternalMyDsl.g:3361:1: rule__Not__Group__2 : rule__Not__Group__2__Impl rule__Not__Group__3 ;
    public final void rule__Not__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3365:1: ( rule__Not__Group__2__Impl rule__Not__Group__3 )
            // InternalMyDsl.g:3366:2: rule__Not__Group__2__Impl rule__Not__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Not__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__2"


    // $ANTLR start "rule__Not__Group__2__Impl"
    // InternalMyDsl.g:3373:1: rule__Not__Group__2__Impl : ( ( rule__Not__Group_2__0 )? ) ;
    public final void rule__Not__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3377:1: ( ( ( rule__Not__Group_2__0 )? ) )
            // InternalMyDsl.g:3378:1: ( ( rule__Not__Group_2__0 )? )
            {
            // InternalMyDsl.g:3378:1: ( ( rule__Not__Group_2__0 )? )
            // InternalMyDsl.g:3379:2: ( rule__Not__Group_2__0 )?
            {
             before(grammarAccess.getNotAccess().getGroup_2()); 
            // InternalMyDsl.g:3380:2: ( rule__Not__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:3380:3: rule__Not__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Not__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNotAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__2__Impl"


    // $ANTLR start "rule__Not__Group__3"
    // InternalMyDsl.g:3388:1: rule__Not__Group__3 : rule__Not__Group__3__Impl rule__Not__Group__4 ;
    public final void rule__Not__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3392:1: ( rule__Not__Group__3__Impl rule__Not__Group__4 )
            // InternalMyDsl.g:3393:2: rule__Not__Group__3__Impl rule__Not__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Not__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__3"


    // $ANTLR start "rule__Not__Group__3__Impl"
    // InternalMyDsl.g:3400:1: rule__Not__Group__3__Impl : ( 'expression' ) ;
    public final void rule__Not__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3404:1: ( ( 'expression' ) )
            // InternalMyDsl.g:3405:1: ( 'expression' )
            {
            // InternalMyDsl.g:3405:1: ( 'expression' )
            // InternalMyDsl.g:3406:2: 'expression'
            {
             before(grammarAccess.getNotAccess().getExpressionKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getNotAccess().getExpressionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__3__Impl"


    // $ANTLR start "rule__Not__Group__4"
    // InternalMyDsl.g:3415:1: rule__Not__Group__4 : rule__Not__Group__4__Impl rule__Not__Group__5 ;
    public final void rule__Not__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3419:1: ( rule__Not__Group__4__Impl rule__Not__Group__5 )
            // InternalMyDsl.g:3420:2: rule__Not__Group__4__Impl rule__Not__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Not__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__4"


    // $ANTLR start "rule__Not__Group__4__Impl"
    // InternalMyDsl.g:3427:1: rule__Not__Group__4__Impl : ( ( rule__Not__ExpressionAssignment_4 ) ) ;
    public final void rule__Not__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3431:1: ( ( ( rule__Not__ExpressionAssignment_4 ) ) )
            // InternalMyDsl.g:3432:1: ( ( rule__Not__ExpressionAssignment_4 ) )
            {
            // InternalMyDsl.g:3432:1: ( ( rule__Not__ExpressionAssignment_4 ) )
            // InternalMyDsl.g:3433:2: ( rule__Not__ExpressionAssignment_4 )
            {
             before(grammarAccess.getNotAccess().getExpressionAssignment_4()); 
            // InternalMyDsl.g:3434:2: ( rule__Not__ExpressionAssignment_4 )
            // InternalMyDsl.g:3434:3: rule__Not__ExpressionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Not__ExpressionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getExpressionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__4__Impl"


    // $ANTLR start "rule__Not__Group__5"
    // InternalMyDsl.g:3442:1: rule__Not__Group__5 : rule__Not__Group__5__Impl ;
    public final void rule__Not__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3446:1: ( rule__Not__Group__5__Impl )
            // InternalMyDsl.g:3447:2: rule__Not__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__5"


    // $ANTLR start "rule__Not__Group__5__Impl"
    // InternalMyDsl.g:3453:1: rule__Not__Group__5__Impl : ( '}' ) ;
    public final void rule__Not__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3457:1: ( ( '}' ) )
            // InternalMyDsl.g:3458:1: ( '}' )
            {
            // InternalMyDsl.g:3458:1: ( '}' )
            // InternalMyDsl.g:3459:2: '}'
            {
             before(grammarAccess.getNotAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNotAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group__5__Impl"


    // $ANTLR start "rule__Not__Group_2__0"
    // InternalMyDsl.g:3469:1: rule__Not__Group_2__0 : rule__Not__Group_2__0__Impl rule__Not__Group_2__1 ;
    public final void rule__Not__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3473:1: ( rule__Not__Group_2__0__Impl rule__Not__Group_2__1 )
            // InternalMyDsl.g:3474:2: rule__Not__Group_2__0__Impl rule__Not__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Not__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_2__0"


    // $ANTLR start "rule__Not__Group_2__0__Impl"
    // InternalMyDsl.g:3481:1: rule__Not__Group_2__0__Impl : ( 'variable' ) ;
    public final void rule__Not__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3485:1: ( ( 'variable' ) )
            // InternalMyDsl.g:3486:1: ( 'variable' )
            {
            // InternalMyDsl.g:3486:1: ( 'variable' )
            // InternalMyDsl.g:3487:2: 'variable'
            {
             before(grammarAccess.getNotAccess().getVariableKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getNotAccess().getVariableKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_2__0__Impl"


    // $ANTLR start "rule__Not__Group_2__1"
    // InternalMyDsl.g:3496:1: rule__Not__Group_2__1 : rule__Not__Group_2__1__Impl rule__Not__Group_2__2 ;
    public final void rule__Not__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3500:1: ( rule__Not__Group_2__1__Impl rule__Not__Group_2__2 )
            // InternalMyDsl.g:3501:2: rule__Not__Group_2__1__Impl rule__Not__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__Not__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_2__1"


    // $ANTLR start "rule__Not__Group_2__1__Impl"
    // InternalMyDsl.g:3508:1: rule__Not__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Not__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3512:1: ( ( '{' ) )
            // InternalMyDsl.g:3513:1: ( '{' )
            {
            // InternalMyDsl.g:3513:1: ( '{' )
            // InternalMyDsl.g:3514:2: '{'
            {
             before(grammarAccess.getNotAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getNotAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_2__1__Impl"


    // $ANTLR start "rule__Not__Group_2__2"
    // InternalMyDsl.g:3523:1: rule__Not__Group_2__2 : rule__Not__Group_2__2__Impl rule__Not__Group_2__3 ;
    public final void rule__Not__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3527:1: ( rule__Not__Group_2__2__Impl rule__Not__Group_2__3 )
            // InternalMyDsl.g:3528:2: rule__Not__Group_2__2__Impl rule__Not__Group_2__3
            {
            pushFollow(FOLLOW_11);
            rule__Not__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_2__2"


    // $ANTLR start "rule__Not__Group_2__2__Impl"
    // InternalMyDsl.g:3535:1: rule__Not__Group_2__2__Impl : ( ( rule__Not__VariableAssignment_2_2 ) ) ;
    public final void rule__Not__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3539:1: ( ( ( rule__Not__VariableAssignment_2_2 ) ) )
            // InternalMyDsl.g:3540:1: ( ( rule__Not__VariableAssignment_2_2 ) )
            {
            // InternalMyDsl.g:3540:1: ( ( rule__Not__VariableAssignment_2_2 ) )
            // InternalMyDsl.g:3541:2: ( rule__Not__VariableAssignment_2_2 )
            {
             before(grammarAccess.getNotAccess().getVariableAssignment_2_2()); 
            // InternalMyDsl.g:3542:2: ( rule__Not__VariableAssignment_2_2 )
            // InternalMyDsl.g:3542:3: rule__Not__VariableAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Not__VariableAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getVariableAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_2__2__Impl"


    // $ANTLR start "rule__Not__Group_2__3"
    // InternalMyDsl.g:3550:1: rule__Not__Group_2__3 : rule__Not__Group_2__3__Impl rule__Not__Group_2__4 ;
    public final void rule__Not__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3554:1: ( rule__Not__Group_2__3__Impl rule__Not__Group_2__4 )
            // InternalMyDsl.g:3555:2: rule__Not__Group_2__3__Impl rule__Not__Group_2__4
            {
            pushFollow(FOLLOW_11);
            rule__Not__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_2__3"


    // $ANTLR start "rule__Not__Group_2__3__Impl"
    // InternalMyDsl.g:3562:1: rule__Not__Group_2__3__Impl : ( ( rule__Not__Group_2_3__0 )* ) ;
    public final void rule__Not__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3566:1: ( ( ( rule__Not__Group_2_3__0 )* ) )
            // InternalMyDsl.g:3567:1: ( ( rule__Not__Group_2_3__0 )* )
            {
            // InternalMyDsl.g:3567:1: ( ( rule__Not__Group_2_3__0 )* )
            // InternalMyDsl.g:3568:2: ( rule__Not__Group_2_3__0 )*
            {
             before(grammarAccess.getNotAccess().getGroup_2_3()); 
            // InternalMyDsl.g:3569:2: ( rule__Not__Group_2_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==40) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:3569:3: rule__Not__Group_2_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Not__Group_2_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getNotAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_2__3__Impl"


    // $ANTLR start "rule__Not__Group_2__4"
    // InternalMyDsl.g:3577:1: rule__Not__Group_2__4 : rule__Not__Group_2__4__Impl ;
    public final void rule__Not__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3581:1: ( rule__Not__Group_2__4__Impl )
            // InternalMyDsl.g:3582:2: rule__Not__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_2__4"


    // $ANTLR start "rule__Not__Group_2__4__Impl"
    // InternalMyDsl.g:3588:1: rule__Not__Group_2__4__Impl : ( '}' ) ;
    public final void rule__Not__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3592:1: ( ( '}' ) )
            // InternalMyDsl.g:3593:1: ( '}' )
            {
            // InternalMyDsl.g:3593:1: ( '}' )
            // InternalMyDsl.g:3594:2: '}'
            {
             before(grammarAccess.getNotAccess().getRightCurlyBracketKeyword_2_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getNotAccess().getRightCurlyBracketKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_2__4__Impl"


    // $ANTLR start "rule__Not__Group_2_3__0"
    // InternalMyDsl.g:3604:1: rule__Not__Group_2_3__0 : rule__Not__Group_2_3__0__Impl rule__Not__Group_2_3__1 ;
    public final void rule__Not__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3608:1: ( rule__Not__Group_2_3__0__Impl rule__Not__Group_2_3__1 )
            // InternalMyDsl.g:3609:2: rule__Not__Group_2_3__0__Impl rule__Not__Group_2_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Not__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Not__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_2_3__0"


    // $ANTLR start "rule__Not__Group_2_3__0__Impl"
    // InternalMyDsl.g:3616:1: rule__Not__Group_2_3__0__Impl : ( ',' ) ;
    public final void rule__Not__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3620:1: ( ( ',' ) )
            // InternalMyDsl.g:3621:1: ( ',' )
            {
            // InternalMyDsl.g:3621:1: ( ',' )
            // InternalMyDsl.g:3622:2: ','
            {
             before(grammarAccess.getNotAccess().getCommaKeyword_2_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getNotAccess().getCommaKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_2_3__0__Impl"


    // $ANTLR start "rule__Not__Group_2_3__1"
    // InternalMyDsl.g:3631:1: rule__Not__Group_2_3__1 : rule__Not__Group_2_3__1__Impl ;
    public final void rule__Not__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3635:1: ( rule__Not__Group_2_3__1__Impl )
            // InternalMyDsl.g:3636:2: rule__Not__Group_2_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Not__Group_2_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_2_3__1"


    // $ANTLR start "rule__Not__Group_2_3__1__Impl"
    // InternalMyDsl.g:3642:1: rule__Not__Group_2_3__1__Impl : ( ( rule__Not__VariableAssignment_2_3_1 ) ) ;
    public final void rule__Not__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3646:1: ( ( ( rule__Not__VariableAssignment_2_3_1 ) ) )
            // InternalMyDsl.g:3647:1: ( ( rule__Not__VariableAssignment_2_3_1 ) )
            {
            // InternalMyDsl.g:3647:1: ( ( rule__Not__VariableAssignment_2_3_1 ) )
            // InternalMyDsl.g:3648:2: ( rule__Not__VariableAssignment_2_3_1 )
            {
             before(grammarAccess.getNotAccess().getVariableAssignment_2_3_1()); 
            // InternalMyDsl.g:3649:2: ( rule__Not__VariableAssignment_2_3_1 )
            // InternalMyDsl.g:3649:3: rule__Not__VariableAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Not__VariableAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getNotAccess().getVariableAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__Group_2_3__1__Impl"


    // $ANTLR start "rule__BinaryBool__Group__0"
    // InternalMyDsl.g:3658:1: rule__BinaryBool__Group__0 : rule__BinaryBool__Group__0__Impl rule__BinaryBool__Group__1 ;
    public final void rule__BinaryBool__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3662:1: ( rule__BinaryBool__Group__0__Impl rule__BinaryBool__Group__1 )
            // InternalMyDsl.g:3663:2: rule__BinaryBool__Group__0__Impl rule__BinaryBool__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryBool__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__0"


    // $ANTLR start "rule__BinaryBool__Group__0__Impl"
    // InternalMyDsl.g:3670:1: rule__BinaryBool__Group__0__Impl : ( 'BinaryBool' ) ;
    public final void rule__BinaryBool__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3674:1: ( ( 'BinaryBool' ) )
            // InternalMyDsl.g:3675:1: ( 'BinaryBool' )
            {
            // InternalMyDsl.g:3675:1: ( 'BinaryBool' )
            // InternalMyDsl.g:3676:2: 'BinaryBool'
            {
             before(grammarAccess.getBinaryBoolAccess().getBinaryBoolKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getBinaryBoolAccess().getBinaryBoolKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__0__Impl"


    // $ANTLR start "rule__BinaryBool__Group__1"
    // InternalMyDsl.g:3685:1: rule__BinaryBool__Group__1 : rule__BinaryBool__Group__1__Impl rule__BinaryBool__Group__2 ;
    public final void rule__BinaryBool__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3689:1: ( rule__BinaryBool__Group__1__Impl rule__BinaryBool__Group__2 )
            // InternalMyDsl.g:3690:2: rule__BinaryBool__Group__1__Impl rule__BinaryBool__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__BinaryBool__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__1"


    // $ANTLR start "rule__BinaryBool__Group__1__Impl"
    // InternalMyDsl.g:3697:1: rule__BinaryBool__Group__1__Impl : ( '{' ) ;
    public final void rule__BinaryBool__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3701:1: ( ( '{' ) )
            // InternalMyDsl.g:3702:1: ( '{' )
            {
            // InternalMyDsl.g:3702:1: ( '{' )
            // InternalMyDsl.g:3703:2: '{'
            {
             before(grammarAccess.getBinaryBoolAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBinaryBoolAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__1__Impl"


    // $ANTLR start "rule__BinaryBool__Group__2"
    // InternalMyDsl.g:3712:1: rule__BinaryBool__Group__2 : rule__BinaryBool__Group__2__Impl rule__BinaryBool__Group__3 ;
    public final void rule__BinaryBool__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3716:1: ( rule__BinaryBool__Group__2__Impl rule__BinaryBool__Group__3 )
            // InternalMyDsl.g:3717:2: rule__BinaryBool__Group__2__Impl rule__BinaryBool__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__BinaryBool__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__2"


    // $ANTLR start "rule__BinaryBool__Group__2__Impl"
    // InternalMyDsl.g:3724:1: rule__BinaryBool__Group__2__Impl : ( ( rule__BinaryBool__Group_2__0 )? ) ;
    public final void rule__BinaryBool__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3728:1: ( ( ( rule__BinaryBool__Group_2__0 )? ) )
            // InternalMyDsl.g:3729:1: ( ( rule__BinaryBool__Group_2__0 )? )
            {
            // InternalMyDsl.g:3729:1: ( ( rule__BinaryBool__Group_2__0 )? )
            // InternalMyDsl.g:3730:2: ( rule__BinaryBool__Group_2__0 )?
            {
             before(grammarAccess.getBinaryBoolAccess().getGroup_2()); 
            // InternalMyDsl.g:3731:2: ( rule__BinaryBool__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:3731:3: rule__BinaryBool__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryBool__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBinaryBoolAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__2__Impl"


    // $ANTLR start "rule__BinaryBool__Group__3"
    // InternalMyDsl.g:3739:1: rule__BinaryBool__Group__3 : rule__BinaryBool__Group__3__Impl rule__BinaryBool__Group__4 ;
    public final void rule__BinaryBool__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3743:1: ( rule__BinaryBool__Group__3__Impl rule__BinaryBool__Group__4 )
            // InternalMyDsl.g:3744:2: rule__BinaryBool__Group__3__Impl rule__BinaryBool__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__BinaryBool__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__3"


    // $ANTLR start "rule__BinaryBool__Group__3__Impl"
    // InternalMyDsl.g:3751:1: rule__BinaryBool__Group__3__Impl : ( ( rule__BinaryBool__Group_3__0 )? ) ;
    public final void rule__BinaryBool__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3755:1: ( ( ( rule__BinaryBool__Group_3__0 )? ) )
            // InternalMyDsl.g:3756:1: ( ( rule__BinaryBool__Group_3__0 )? )
            {
            // InternalMyDsl.g:3756:1: ( ( rule__BinaryBool__Group_3__0 )? )
            // InternalMyDsl.g:3757:2: ( rule__BinaryBool__Group_3__0 )?
            {
             before(grammarAccess.getBinaryBoolAccess().getGroup_3()); 
            // InternalMyDsl.g:3758:2: ( rule__BinaryBool__Group_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3758:3: rule__BinaryBool__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BinaryBool__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getBinaryBoolAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__3__Impl"


    // $ANTLR start "rule__BinaryBool__Group__4"
    // InternalMyDsl.g:3766:1: rule__BinaryBool__Group__4 : rule__BinaryBool__Group__4__Impl rule__BinaryBool__Group__5 ;
    public final void rule__BinaryBool__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3770:1: ( rule__BinaryBool__Group__4__Impl rule__BinaryBool__Group__5 )
            // InternalMyDsl.g:3771:2: rule__BinaryBool__Group__4__Impl rule__BinaryBool__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__BinaryBool__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__4"


    // $ANTLR start "rule__BinaryBool__Group__4__Impl"
    // InternalMyDsl.g:3778:1: rule__BinaryBool__Group__4__Impl : ( 'expression' ) ;
    public final void rule__BinaryBool__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3782:1: ( ( 'expression' ) )
            // InternalMyDsl.g:3783:1: ( 'expression' )
            {
            // InternalMyDsl.g:3783:1: ( 'expression' )
            // InternalMyDsl.g:3784:2: 'expression'
            {
             before(grammarAccess.getBinaryBoolAccess().getExpressionKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBinaryBoolAccess().getExpressionKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__4__Impl"


    // $ANTLR start "rule__BinaryBool__Group__5"
    // InternalMyDsl.g:3793:1: rule__BinaryBool__Group__5 : rule__BinaryBool__Group__5__Impl rule__BinaryBool__Group__6 ;
    public final void rule__BinaryBool__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3797:1: ( rule__BinaryBool__Group__5__Impl rule__BinaryBool__Group__6 )
            // InternalMyDsl.g:3798:2: rule__BinaryBool__Group__5__Impl rule__BinaryBool__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__BinaryBool__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__5"


    // $ANTLR start "rule__BinaryBool__Group__5__Impl"
    // InternalMyDsl.g:3805:1: rule__BinaryBool__Group__5__Impl : ( '{' ) ;
    public final void rule__BinaryBool__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3809:1: ( ( '{' ) )
            // InternalMyDsl.g:3810:1: ( '{' )
            {
            // InternalMyDsl.g:3810:1: ( '{' )
            // InternalMyDsl.g:3811:2: '{'
            {
             before(grammarAccess.getBinaryBoolAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBinaryBoolAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__5__Impl"


    // $ANTLR start "rule__BinaryBool__Group__6"
    // InternalMyDsl.g:3820:1: rule__BinaryBool__Group__6 : rule__BinaryBool__Group__6__Impl rule__BinaryBool__Group__7 ;
    public final void rule__BinaryBool__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3824:1: ( rule__BinaryBool__Group__6__Impl rule__BinaryBool__Group__7 )
            // InternalMyDsl.g:3825:2: rule__BinaryBool__Group__6__Impl rule__BinaryBool__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__BinaryBool__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__6"


    // $ANTLR start "rule__BinaryBool__Group__6__Impl"
    // InternalMyDsl.g:3832:1: rule__BinaryBool__Group__6__Impl : ( ( rule__BinaryBool__ExpressionAssignment_6 ) ) ;
    public final void rule__BinaryBool__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3836:1: ( ( ( rule__BinaryBool__ExpressionAssignment_6 ) ) )
            // InternalMyDsl.g:3837:1: ( ( rule__BinaryBool__ExpressionAssignment_6 ) )
            {
            // InternalMyDsl.g:3837:1: ( ( rule__BinaryBool__ExpressionAssignment_6 ) )
            // InternalMyDsl.g:3838:2: ( rule__BinaryBool__ExpressionAssignment_6 )
            {
             before(grammarAccess.getBinaryBoolAccess().getExpressionAssignment_6()); 
            // InternalMyDsl.g:3839:2: ( rule__BinaryBool__ExpressionAssignment_6 )
            // InternalMyDsl.g:3839:3: rule__BinaryBool__ExpressionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBool__ExpressionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBinaryBoolAccess().getExpressionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__6__Impl"


    // $ANTLR start "rule__BinaryBool__Group__7"
    // InternalMyDsl.g:3847:1: rule__BinaryBool__Group__7 : rule__BinaryBool__Group__7__Impl rule__BinaryBool__Group__8 ;
    public final void rule__BinaryBool__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3851:1: ( rule__BinaryBool__Group__7__Impl rule__BinaryBool__Group__8 )
            // InternalMyDsl.g:3852:2: rule__BinaryBool__Group__7__Impl rule__BinaryBool__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__BinaryBool__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__7"


    // $ANTLR start "rule__BinaryBool__Group__7__Impl"
    // InternalMyDsl.g:3859:1: rule__BinaryBool__Group__7__Impl : ( ( rule__BinaryBool__Group_7__0 )* ) ;
    public final void rule__BinaryBool__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3863:1: ( ( ( rule__BinaryBool__Group_7__0 )* ) )
            // InternalMyDsl.g:3864:1: ( ( rule__BinaryBool__Group_7__0 )* )
            {
            // InternalMyDsl.g:3864:1: ( ( rule__BinaryBool__Group_7__0 )* )
            // InternalMyDsl.g:3865:2: ( rule__BinaryBool__Group_7__0 )*
            {
             before(grammarAccess.getBinaryBoolAccess().getGroup_7()); 
            // InternalMyDsl.g:3866:2: ( rule__BinaryBool__Group_7__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==40) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMyDsl.g:3866:3: rule__BinaryBool__Group_7__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__BinaryBool__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getBinaryBoolAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__7__Impl"


    // $ANTLR start "rule__BinaryBool__Group__8"
    // InternalMyDsl.g:3874:1: rule__BinaryBool__Group__8 : rule__BinaryBool__Group__8__Impl rule__BinaryBool__Group__9 ;
    public final void rule__BinaryBool__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3878:1: ( rule__BinaryBool__Group__8__Impl rule__BinaryBool__Group__9 )
            // InternalMyDsl.g:3879:2: rule__BinaryBool__Group__8__Impl rule__BinaryBool__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__BinaryBool__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__8"


    // $ANTLR start "rule__BinaryBool__Group__8__Impl"
    // InternalMyDsl.g:3886:1: rule__BinaryBool__Group__8__Impl : ( '}' ) ;
    public final void rule__BinaryBool__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3890:1: ( ( '}' ) )
            // InternalMyDsl.g:3891:1: ( '}' )
            {
            // InternalMyDsl.g:3891:1: ( '}' )
            // InternalMyDsl.g:3892:2: '}'
            {
             before(grammarAccess.getBinaryBoolAccess().getRightCurlyBracketKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBinaryBoolAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__8__Impl"


    // $ANTLR start "rule__BinaryBool__Group__9"
    // InternalMyDsl.g:3901:1: rule__BinaryBool__Group__9 : rule__BinaryBool__Group__9__Impl ;
    public final void rule__BinaryBool__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3905:1: ( rule__BinaryBool__Group__9__Impl )
            // InternalMyDsl.g:3906:2: rule__BinaryBool__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__9"


    // $ANTLR start "rule__BinaryBool__Group__9__Impl"
    // InternalMyDsl.g:3912:1: rule__BinaryBool__Group__9__Impl : ( '}' ) ;
    public final void rule__BinaryBool__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3916:1: ( ( '}' ) )
            // InternalMyDsl.g:3917:1: ( '}' )
            {
            // InternalMyDsl.g:3917:1: ( '}' )
            // InternalMyDsl.g:3918:2: '}'
            {
             before(grammarAccess.getBinaryBoolAccess().getRightCurlyBracketKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBinaryBoolAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group__9__Impl"


    // $ANTLR start "rule__BinaryBool__Group_2__0"
    // InternalMyDsl.g:3928:1: rule__BinaryBool__Group_2__0 : rule__BinaryBool__Group_2__0__Impl rule__BinaryBool__Group_2__1 ;
    public final void rule__BinaryBool__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3932:1: ( rule__BinaryBool__Group_2__0__Impl rule__BinaryBool__Group_2__1 )
            // InternalMyDsl.g:3933:2: rule__BinaryBool__Group_2__0__Impl rule__BinaryBool__Group_2__1
            {
            pushFollow(FOLLOW_24);
            rule__BinaryBool__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_2__0"


    // $ANTLR start "rule__BinaryBool__Group_2__0__Impl"
    // InternalMyDsl.g:3940:1: rule__BinaryBool__Group_2__0__Impl : ( 'operation' ) ;
    public final void rule__BinaryBool__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3944:1: ( ( 'operation' ) )
            // InternalMyDsl.g:3945:1: ( 'operation' )
            {
            // InternalMyDsl.g:3945:1: ( 'operation' )
            // InternalMyDsl.g:3946:2: 'operation'
            {
             before(grammarAccess.getBinaryBoolAccess().getOperationKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBinaryBoolAccess().getOperationKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_2__0__Impl"


    // $ANTLR start "rule__BinaryBool__Group_2__1"
    // InternalMyDsl.g:3955:1: rule__BinaryBool__Group_2__1 : rule__BinaryBool__Group_2__1__Impl ;
    public final void rule__BinaryBool__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3959:1: ( rule__BinaryBool__Group_2__1__Impl )
            // InternalMyDsl.g:3960:2: rule__BinaryBool__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_2__1"


    // $ANTLR start "rule__BinaryBool__Group_2__1__Impl"
    // InternalMyDsl.g:3966:1: rule__BinaryBool__Group_2__1__Impl : ( ( rule__BinaryBool__OperationAssignment_2_1 ) ) ;
    public final void rule__BinaryBool__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3970:1: ( ( ( rule__BinaryBool__OperationAssignment_2_1 ) ) )
            // InternalMyDsl.g:3971:1: ( ( rule__BinaryBool__OperationAssignment_2_1 ) )
            {
            // InternalMyDsl.g:3971:1: ( ( rule__BinaryBool__OperationAssignment_2_1 ) )
            // InternalMyDsl.g:3972:2: ( rule__BinaryBool__OperationAssignment_2_1 )
            {
             before(grammarAccess.getBinaryBoolAccess().getOperationAssignment_2_1()); 
            // InternalMyDsl.g:3973:2: ( rule__BinaryBool__OperationAssignment_2_1 )
            // InternalMyDsl.g:3973:3: rule__BinaryBool__OperationAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBool__OperationAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryBoolAccess().getOperationAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_2__1__Impl"


    // $ANTLR start "rule__BinaryBool__Group_3__0"
    // InternalMyDsl.g:3982:1: rule__BinaryBool__Group_3__0 : rule__BinaryBool__Group_3__0__Impl rule__BinaryBool__Group_3__1 ;
    public final void rule__BinaryBool__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3986:1: ( rule__BinaryBool__Group_3__0__Impl rule__BinaryBool__Group_3__1 )
            // InternalMyDsl.g:3987:2: rule__BinaryBool__Group_3__0__Impl rule__BinaryBool__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__BinaryBool__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_3__0"


    // $ANTLR start "rule__BinaryBool__Group_3__0__Impl"
    // InternalMyDsl.g:3994:1: rule__BinaryBool__Group_3__0__Impl : ( 'variable' ) ;
    public final void rule__BinaryBool__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3998:1: ( ( 'variable' ) )
            // InternalMyDsl.g:3999:1: ( 'variable' )
            {
            // InternalMyDsl.g:3999:1: ( 'variable' )
            // InternalMyDsl.g:4000:2: 'variable'
            {
             before(grammarAccess.getBinaryBoolAccess().getVariableKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getBinaryBoolAccess().getVariableKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_3__0__Impl"


    // $ANTLR start "rule__BinaryBool__Group_3__1"
    // InternalMyDsl.g:4009:1: rule__BinaryBool__Group_3__1 : rule__BinaryBool__Group_3__1__Impl rule__BinaryBool__Group_3__2 ;
    public final void rule__BinaryBool__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4013:1: ( rule__BinaryBool__Group_3__1__Impl rule__BinaryBool__Group_3__2 )
            // InternalMyDsl.g:4014:2: rule__BinaryBool__Group_3__1__Impl rule__BinaryBool__Group_3__2
            {
            pushFollow(FOLLOW_3);
            rule__BinaryBool__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_3__1"


    // $ANTLR start "rule__BinaryBool__Group_3__1__Impl"
    // InternalMyDsl.g:4021:1: rule__BinaryBool__Group_3__1__Impl : ( '{' ) ;
    public final void rule__BinaryBool__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4025:1: ( ( '{' ) )
            // InternalMyDsl.g:4026:1: ( '{' )
            {
            // InternalMyDsl.g:4026:1: ( '{' )
            // InternalMyDsl.g:4027:2: '{'
            {
             before(grammarAccess.getBinaryBoolAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBinaryBoolAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_3__1__Impl"


    // $ANTLR start "rule__BinaryBool__Group_3__2"
    // InternalMyDsl.g:4036:1: rule__BinaryBool__Group_3__2 : rule__BinaryBool__Group_3__2__Impl rule__BinaryBool__Group_3__3 ;
    public final void rule__BinaryBool__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4040:1: ( rule__BinaryBool__Group_3__2__Impl rule__BinaryBool__Group_3__3 )
            // InternalMyDsl.g:4041:2: rule__BinaryBool__Group_3__2__Impl rule__BinaryBool__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__BinaryBool__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_3__2"


    // $ANTLR start "rule__BinaryBool__Group_3__2__Impl"
    // InternalMyDsl.g:4048:1: rule__BinaryBool__Group_3__2__Impl : ( ( rule__BinaryBool__VariableAssignment_3_2 ) ) ;
    public final void rule__BinaryBool__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4052:1: ( ( ( rule__BinaryBool__VariableAssignment_3_2 ) ) )
            // InternalMyDsl.g:4053:1: ( ( rule__BinaryBool__VariableAssignment_3_2 ) )
            {
            // InternalMyDsl.g:4053:1: ( ( rule__BinaryBool__VariableAssignment_3_2 ) )
            // InternalMyDsl.g:4054:2: ( rule__BinaryBool__VariableAssignment_3_2 )
            {
             before(grammarAccess.getBinaryBoolAccess().getVariableAssignment_3_2()); 
            // InternalMyDsl.g:4055:2: ( rule__BinaryBool__VariableAssignment_3_2 )
            // InternalMyDsl.g:4055:3: rule__BinaryBool__VariableAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBool__VariableAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getBinaryBoolAccess().getVariableAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_3__2__Impl"


    // $ANTLR start "rule__BinaryBool__Group_3__3"
    // InternalMyDsl.g:4063:1: rule__BinaryBool__Group_3__3 : rule__BinaryBool__Group_3__3__Impl rule__BinaryBool__Group_3__4 ;
    public final void rule__BinaryBool__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4067:1: ( rule__BinaryBool__Group_3__3__Impl rule__BinaryBool__Group_3__4 )
            // InternalMyDsl.g:4068:2: rule__BinaryBool__Group_3__3__Impl rule__BinaryBool__Group_3__4
            {
            pushFollow(FOLLOW_11);
            rule__BinaryBool__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group_3__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_3__3"


    // $ANTLR start "rule__BinaryBool__Group_3__3__Impl"
    // InternalMyDsl.g:4075:1: rule__BinaryBool__Group_3__3__Impl : ( ( rule__BinaryBool__Group_3_3__0 )* ) ;
    public final void rule__BinaryBool__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4079:1: ( ( ( rule__BinaryBool__Group_3_3__0 )* ) )
            // InternalMyDsl.g:4080:1: ( ( rule__BinaryBool__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:4080:1: ( ( rule__BinaryBool__Group_3_3__0 )* )
            // InternalMyDsl.g:4081:2: ( rule__BinaryBool__Group_3_3__0 )*
            {
             before(grammarAccess.getBinaryBoolAccess().getGroup_3_3()); 
            // InternalMyDsl.g:4082:2: ( rule__BinaryBool__Group_3_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==40) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMyDsl.g:4082:3: rule__BinaryBool__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__BinaryBool__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getBinaryBoolAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_3__3__Impl"


    // $ANTLR start "rule__BinaryBool__Group_3__4"
    // InternalMyDsl.g:4090:1: rule__BinaryBool__Group_3__4 : rule__BinaryBool__Group_3__4__Impl ;
    public final void rule__BinaryBool__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4094:1: ( rule__BinaryBool__Group_3__4__Impl )
            // InternalMyDsl.g:4095:2: rule__BinaryBool__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group_3__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_3__4"


    // $ANTLR start "rule__BinaryBool__Group_3__4__Impl"
    // InternalMyDsl.g:4101:1: rule__BinaryBool__Group_3__4__Impl : ( '}' ) ;
    public final void rule__BinaryBool__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4105:1: ( ( '}' ) )
            // InternalMyDsl.g:4106:1: ( '}' )
            {
            // InternalMyDsl.g:4106:1: ( '}' )
            // InternalMyDsl.g:4107:2: '}'
            {
             before(grammarAccess.getBinaryBoolAccess().getRightCurlyBracketKeyword_3_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBinaryBoolAccess().getRightCurlyBracketKeyword_3_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_3__4__Impl"


    // $ANTLR start "rule__BinaryBool__Group_3_3__0"
    // InternalMyDsl.g:4117:1: rule__BinaryBool__Group_3_3__0 : rule__BinaryBool__Group_3_3__0__Impl rule__BinaryBool__Group_3_3__1 ;
    public final void rule__BinaryBool__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4121:1: ( rule__BinaryBool__Group_3_3__0__Impl rule__BinaryBool__Group_3_3__1 )
            // InternalMyDsl.g:4122:2: rule__BinaryBool__Group_3_3__0__Impl rule__BinaryBool__Group_3_3__1
            {
            pushFollow(FOLLOW_3);
            rule__BinaryBool__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_3_3__0"


    // $ANTLR start "rule__BinaryBool__Group_3_3__0__Impl"
    // InternalMyDsl.g:4129:1: rule__BinaryBool__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__BinaryBool__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4133:1: ( ( ',' ) )
            // InternalMyDsl.g:4134:1: ( ',' )
            {
            // InternalMyDsl.g:4134:1: ( ',' )
            // InternalMyDsl.g:4135:2: ','
            {
             before(grammarAccess.getBinaryBoolAccess().getCommaKeyword_3_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBinaryBoolAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_3_3__0__Impl"


    // $ANTLR start "rule__BinaryBool__Group_3_3__1"
    // InternalMyDsl.g:4144:1: rule__BinaryBool__Group_3_3__1 : rule__BinaryBool__Group_3_3__1__Impl ;
    public final void rule__BinaryBool__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4148:1: ( rule__BinaryBool__Group_3_3__1__Impl )
            // InternalMyDsl.g:4149:2: rule__BinaryBool__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_3_3__1"


    // $ANTLR start "rule__BinaryBool__Group_3_3__1__Impl"
    // InternalMyDsl.g:4155:1: rule__BinaryBool__Group_3_3__1__Impl : ( ( rule__BinaryBool__VariableAssignment_3_3_1 ) ) ;
    public final void rule__BinaryBool__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4159:1: ( ( ( rule__BinaryBool__VariableAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:4160:1: ( ( rule__BinaryBool__VariableAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:4160:1: ( ( rule__BinaryBool__VariableAssignment_3_3_1 ) )
            // InternalMyDsl.g:4161:2: ( rule__BinaryBool__VariableAssignment_3_3_1 )
            {
             before(grammarAccess.getBinaryBoolAccess().getVariableAssignment_3_3_1()); 
            // InternalMyDsl.g:4162:2: ( rule__BinaryBool__VariableAssignment_3_3_1 )
            // InternalMyDsl.g:4162:3: rule__BinaryBool__VariableAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBool__VariableAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryBoolAccess().getVariableAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_3_3__1__Impl"


    // $ANTLR start "rule__BinaryBool__Group_7__0"
    // InternalMyDsl.g:4171:1: rule__BinaryBool__Group_7__0 : rule__BinaryBool__Group_7__0__Impl rule__BinaryBool__Group_7__1 ;
    public final void rule__BinaryBool__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4175:1: ( rule__BinaryBool__Group_7__0__Impl rule__BinaryBool__Group_7__1 )
            // InternalMyDsl.g:4176:2: rule__BinaryBool__Group_7__0__Impl rule__BinaryBool__Group_7__1
            {
            pushFollow(FOLLOW_9);
            rule__BinaryBool__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_7__0"


    // $ANTLR start "rule__BinaryBool__Group_7__0__Impl"
    // InternalMyDsl.g:4183:1: rule__BinaryBool__Group_7__0__Impl : ( ',' ) ;
    public final void rule__BinaryBool__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4187:1: ( ( ',' ) )
            // InternalMyDsl.g:4188:1: ( ',' )
            {
            // InternalMyDsl.g:4188:1: ( ',' )
            // InternalMyDsl.g:4189:2: ','
            {
             before(grammarAccess.getBinaryBoolAccess().getCommaKeyword_7_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getBinaryBoolAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_7__0__Impl"


    // $ANTLR start "rule__BinaryBool__Group_7__1"
    // InternalMyDsl.g:4198:1: rule__BinaryBool__Group_7__1 : rule__BinaryBool__Group_7__1__Impl ;
    public final void rule__BinaryBool__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4202:1: ( rule__BinaryBool__Group_7__1__Impl )
            // InternalMyDsl.g:4203:2: rule__BinaryBool__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBool__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_7__1"


    // $ANTLR start "rule__BinaryBool__Group_7__1__Impl"
    // InternalMyDsl.g:4209:1: rule__BinaryBool__Group_7__1__Impl : ( ( rule__BinaryBool__ExpressionAssignment_7_1 ) ) ;
    public final void rule__BinaryBool__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4213:1: ( ( ( rule__BinaryBool__ExpressionAssignment_7_1 ) ) )
            // InternalMyDsl.g:4214:1: ( ( rule__BinaryBool__ExpressionAssignment_7_1 ) )
            {
            // InternalMyDsl.g:4214:1: ( ( rule__BinaryBool__ExpressionAssignment_7_1 ) )
            // InternalMyDsl.g:4215:2: ( rule__BinaryBool__ExpressionAssignment_7_1 )
            {
             before(grammarAccess.getBinaryBoolAccess().getExpressionAssignment_7_1()); 
            // InternalMyDsl.g:4216:2: ( rule__BinaryBool__ExpressionAssignment_7_1 )
            // InternalMyDsl.g:4216:3: rule__BinaryBool__ExpressionAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__BinaryBool__ExpressionAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getBinaryBoolAccess().getExpressionAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__Group_7__1__Impl"


    // $ANTLR start "rule__SensorExpr__Group__0"
    // InternalMyDsl.g:4225:1: rule__SensorExpr__Group__0 : rule__SensorExpr__Group__0__Impl rule__SensorExpr__Group__1 ;
    public final void rule__SensorExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4229:1: ( rule__SensorExpr__Group__0__Impl rule__SensorExpr__Group__1 )
            // InternalMyDsl.g:4230:2: rule__SensorExpr__Group__0__Impl rule__SensorExpr__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__SensorExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group__0"


    // $ANTLR start "rule__SensorExpr__Group__0__Impl"
    // InternalMyDsl.g:4237:1: rule__SensorExpr__Group__0__Impl : ( () ) ;
    public final void rule__SensorExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4241:1: ( ( () ) )
            // InternalMyDsl.g:4242:1: ( () )
            {
            // InternalMyDsl.g:4242:1: ( () )
            // InternalMyDsl.g:4243:2: ()
            {
             before(grammarAccess.getSensorExprAccess().getSensorExprAction_0()); 
            // InternalMyDsl.g:4244:2: ()
            // InternalMyDsl.g:4244:3: 
            {
            }

             after(grammarAccess.getSensorExprAccess().getSensorExprAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group__0__Impl"


    // $ANTLR start "rule__SensorExpr__Group__1"
    // InternalMyDsl.g:4252:1: rule__SensorExpr__Group__1 : rule__SensorExpr__Group__1__Impl rule__SensorExpr__Group__2 ;
    public final void rule__SensorExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4256:1: ( rule__SensorExpr__Group__1__Impl rule__SensorExpr__Group__2 )
            // InternalMyDsl.g:4257:2: rule__SensorExpr__Group__1__Impl rule__SensorExpr__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SensorExpr__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorExpr__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group__1"


    // $ANTLR start "rule__SensorExpr__Group__1__Impl"
    // InternalMyDsl.g:4264:1: rule__SensorExpr__Group__1__Impl : ( 'SensorExpr' ) ;
    public final void rule__SensorExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4268:1: ( ( 'SensorExpr' ) )
            // InternalMyDsl.g:4269:1: ( 'SensorExpr' )
            {
            // InternalMyDsl.g:4269:1: ( 'SensorExpr' )
            // InternalMyDsl.g:4270:2: 'SensorExpr'
            {
             before(grammarAccess.getSensorExprAccess().getSensorExprKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getSensorExprAccess().getSensorExprKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group__1__Impl"


    // $ANTLR start "rule__SensorExpr__Group__2"
    // InternalMyDsl.g:4279:1: rule__SensorExpr__Group__2 : rule__SensorExpr__Group__2__Impl rule__SensorExpr__Group__3 ;
    public final void rule__SensorExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4283:1: ( rule__SensorExpr__Group__2__Impl rule__SensorExpr__Group__3 )
            // InternalMyDsl.g:4284:2: rule__SensorExpr__Group__2__Impl rule__SensorExpr__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__SensorExpr__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorExpr__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group__2"


    // $ANTLR start "rule__SensorExpr__Group__2__Impl"
    // InternalMyDsl.g:4291:1: rule__SensorExpr__Group__2__Impl : ( '{' ) ;
    public final void rule__SensorExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4295:1: ( ( '{' ) )
            // InternalMyDsl.g:4296:1: ( '{' )
            {
            // InternalMyDsl.g:4296:1: ( '{' )
            // InternalMyDsl.g:4297:2: '{'
            {
             before(grammarAccess.getSensorExprAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSensorExprAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group__2__Impl"


    // $ANTLR start "rule__SensorExpr__Group__3"
    // InternalMyDsl.g:4306:1: rule__SensorExpr__Group__3 : rule__SensorExpr__Group__3__Impl rule__SensorExpr__Group__4 ;
    public final void rule__SensorExpr__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4310:1: ( rule__SensorExpr__Group__3__Impl rule__SensorExpr__Group__4 )
            // InternalMyDsl.g:4311:2: rule__SensorExpr__Group__3__Impl rule__SensorExpr__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__SensorExpr__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorExpr__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group__3"


    // $ANTLR start "rule__SensorExpr__Group__3__Impl"
    // InternalMyDsl.g:4318:1: rule__SensorExpr__Group__3__Impl : ( ( rule__SensorExpr__Group_3__0 )? ) ;
    public final void rule__SensorExpr__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4322:1: ( ( ( rule__SensorExpr__Group_3__0 )? ) )
            // InternalMyDsl.g:4323:1: ( ( rule__SensorExpr__Group_3__0 )? )
            {
            // InternalMyDsl.g:4323:1: ( ( rule__SensorExpr__Group_3__0 )? )
            // InternalMyDsl.g:4324:2: ( rule__SensorExpr__Group_3__0 )?
            {
             before(grammarAccess.getSensorExprAccess().getGroup_3()); 
            // InternalMyDsl.g:4325:2: ( rule__SensorExpr__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==55) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:4325:3: rule__SensorExpr__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SensorExpr__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorExprAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group__3__Impl"


    // $ANTLR start "rule__SensorExpr__Group__4"
    // InternalMyDsl.g:4333:1: rule__SensorExpr__Group__4 : rule__SensorExpr__Group__4__Impl rule__SensorExpr__Group__5 ;
    public final void rule__SensorExpr__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4337:1: ( rule__SensorExpr__Group__4__Impl rule__SensorExpr__Group__5 )
            // InternalMyDsl.g:4338:2: rule__SensorExpr__Group__4__Impl rule__SensorExpr__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__SensorExpr__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorExpr__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group__4"


    // $ANTLR start "rule__SensorExpr__Group__4__Impl"
    // InternalMyDsl.g:4345:1: rule__SensorExpr__Group__4__Impl : ( ( rule__SensorExpr__Group_4__0 )? ) ;
    public final void rule__SensorExpr__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4349:1: ( ( ( rule__SensorExpr__Group_4__0 )? ) )
            // InternalMyDsl.g:4350:1: ( ( rule__SensorExpr__Group_4__0 )? )
            {
            // InternalMyDsl.g:4350:1: ( ( rule__SensorExpr__Group_4__0 )? )
            // InternalMyDsl.g:4351:2: ( rule__SensorExpr__Group_4__0 )?
            {
             before(grammarAccess.getSensorExprAccess().getGroup_4()); 
            // InternalMyDsl.g:4352:2: ( rule__SensorExpr__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==39) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:4352:3: rule__SensorExpr__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SensorExpr__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorExprAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group__4__Impl"


    // $ANTLR start "rule__SensorExpr__Group__5"
    // InternalMyDsl.g:4360:1: rule__SensorExpr__Group__5 : rule__SensorExpr__Group__5__Impl ;
    public final void rule__SensorExpr__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4364:1: ( rule__SensorExpr__Group__5__Impl )
            // InternalMyDsl.g:4365:2: rule__SensorExpr__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorExpr__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group__5"


    // $ANTLR start "rule__SensorExpr__Group__5__Impl"
    // InternalMyDsl.g:4371:1: rule__SensorExpr__Group__5__Impl : ( '}' ) ;
    public final void rule__SensorExpr__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4375:1: ( ( '}' ) )
            // InternalMyDsl.g:4376:1: ( '}' )
            {
            // InternalMyDsl.g:4376:1: ( '}' )
            // InternalMyDsl.g:4377:2: '}'
            {
             before(grammarAccess.getSensorExprAccess().getRightCurlyBracketKeyword_5()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSensorExprAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group__5__Impl"


    // $ANTLR start "rule__SensorExpr__Group_3__0"
    // InternalMyDsl.g:4387:1: rule__SensorExpr__Group_3__0 : rule__SensorExpr__Group_3__0__Impl rule__SensorExpr__Group_3__1 ;
    public final void rule__SensorExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4391:1: ( rule__SensorExpr__Group_3__0__Impl rule__SensorExpr__Group_3__1 )
            // InternalMyDsl.g:4392:2: rule__SensorExpr__Group_3__0__Impl rule__SensorExpr__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__SensorExpr__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorExpr__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_3__0"


    // $ANTLR start "rule__SensorExpr__Group_3__0__Impl"
    // InternalMyDsl.g:4399:1: rule__SensorExpr__Group_3__0__Impl : ( 'sensor' ) ;
    public final void rule__SensorExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4403:1: ( ( 'sensor' ) )
            // InternalMyDsl.g:4404:1: ( 'sensor' )
            {
            // InternalMyDsl.g:4404:1: ( 'sensor' )
            // InternalMyDsl.g:4405:2: 'sensor'
            {
             before(grammarAccess.getSensorExprAccess().getSensorKeyword_3_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getSensorExprAccess().getSensorKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_3__0__Impl"


    // $ANTLR start "rule__SensorExpr__Group_3__1"
    // InternalMyDsl.g:4414:1: rule__SensorExpr__Group_3__1 : rule__SensorExpr__Group_3__1__Impl ;
    public final void rule__SensorExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4418:1: ( rule__SensorExpr__Group_3__1__Impl )
            // InternalMyDsl.g:4419:2: rule__SensorExpr__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorExpr__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_3__1"


    // $ANTLR start "rule__SensorExpr__Group_3__1__Impl"
    // InternalMyDsl.g:4425:1: rule__SensorExpr__Group_3__1__Impl : ( ( rule__SensorExpr__SensorAssignment_3_1 ) ) ;
    public final void rule__SensorExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4429:1: ( ( ( rule__SensorExpr__SensorAssignment_3_1 ) ) )
            // InternalMyDsl.g:4430:1: ( ( rule__SensorExpr__SensorAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4430:1: ( ( rule__SensorExpr__SensorAssignment_3_1 ) )
            // InternalMyDsl.g:4431:2: ( rule__SensorExpr__SensorAssignment_3_1 )
            {
             before(grammarAccess.getSensorExprAccess().getSensorAssignment_3_1()); 
            // InternalMyDsl.g:4432:2: ( rule__SensorExpr__SensorAssignment_3_1 )
            // InternalMyDsl.g:4432:3: rule__SensorExpr__SensorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorExpr__SensorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorExprAccess().getSensorAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_3__1__Impl"


    // $ANTLR start "rule__SensorExpr__Group_4__0"
    // InternalMyDsl.g:4441:1: rule__SensorExpr__Group_4__0 : rule__SensorExpr__Group_4__0__Impl rule__SensorExpr__Group_4__1 ;
    public final void rule__SensorExpr__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4445:1: ( rule__SensorExpr__Group_4__0__Impl rule__SensorExpr__Group_4__1 )
            // InternalMyDsl.g:4446:2: rule__SensorExpr__Group_4__0__Impl rule__SensorExpr__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__SensorExpr__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorExpr__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_4__0"


    // $ANTLR start "rule__SensorExpr__Group_4__0__Impl"
    // InternalMyDsl.g:4453:1: rule__SensorExpr__Group_4__0__Impl : ( 'variable' ) ;
    public final void rule__SensorExpr__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4457:1: ( ( 'variable' ) )
            // InternalMyDsl.g:4458:1: ( 'variable' )
            {
            // InternalMyDsl.g:4458:1: ( 'variable' )
            // InternalMyDsl.g:4459:2: 'variable'
            {
             before(grammarAccess.getSensorExprAccess().getVariableKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSensorExprAccess().getVariableKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_4__0__Impl"


    // $ANTLR start "rule__SensorExpr__Group_4__1"
    // InternalMyDsl.g:4468:1: rule__SensorExpr__Group_4__1 : rule__SensorExpr__Group_4__1__Impl rule__SensorExpr__Group_4__2 ;
    public final void rule__SensorExpr__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4472:1: ( rule__SensorExpr__Group_4__1__Impl rule__SensorExpr__Group_4__2 )
            // InternalMyDsl.g:4473:2: rule__SensorExpr__Group_4__1__Impl rule__SensorExpr__Group_4__2
            {
            pushFollow(FOLLOW_3);
            rule__SensorExpr__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorExpr__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_4__1"


    // $ANTLR start "rule__SensorExpr__Group_4__1__Impl"
    // InternalMyDsl.g:4480:1: rule__SensorExpr__Group_4__1__Impl : ( '{' ) ;
    public final void rule__SensorExpr__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4484:1: ( ( '{' ) )
            // InternalMyDsl.g:4485:1: ( '{' )
            {
            // InternalMyDsl.g:4485:1: ( '{' )
            // InternalMyDsl.g:4486:2: '{'
            {
             before(grammarAccess.getSensorExprAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSensorExprAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_4__1__Impl"


    // $ANTLR start "rule__SensorExpr__Group_4__2"
    // InternalMyDsl.g:4495:1: rule__SensorExpr__Group_4__2 : rule__SensorExpr__Group_4__2__Impl rule__SensorExpr__Group_4__3 ;
    public final void rule__SensorExpr__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4499:1: ( rule__SensorExpr__Group_4__2__Impl rule__SensorExpr__Group_4__3 )
            // InternalMyDsl.g:4500:2: rule__SensorExpr__Group_4__2__Impl rule__SensorExpr__Group_4__3
            {
            pushFollow(FOLLOW_11);
            rule__SensorExpr__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorExpr__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_4__2"


    // $ANTLR start "rule__SensorExpr__Group_4__2__Impl"
    // InternalMyDsl.g:4507:1: rule__SensorExpr__Group_4__2__Impl : ( ( rule__SensorExpr__VariableAssignment_4_2 ) ) ;
    public final void rule__SensorExpr__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4511:1: ( ( ( rule__SensorExpr__VariableAssignment_4_2 ) ) )
            // InternalMyDsl.g:4512:1: ( ( rule__SensorExpr__VariableAssignment_4_2 ) )
            {
            // InternalMyDsl.g:4512:1: ( ( rule__SensorExpr__VariableAssignment_4_2 ) )
            // InternalMyDsl.g:4513:2: ( rule__SensorExpr__VariableAssignment_4_2 )
            {
             before(grammarAccess.getSensorExprAccess().getVariableAssignment_4_2()); 
            // InternalMyDsl.g:4514:2: ( rule__SensorExpr__VariableAssignment_4_2 )
            // InternalMyDsl.g:4514:3: rule__SensorExpr__VariableAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__SensorExpr__VariableAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getSensorExprAccess().getVariableAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_4__2__Impl"


    // $ANTLR start "rule__SensorExpr__Group_4__3"
    // InternalMyDsl.g:4522:1: rule__SensorExpr__Group_4__3 : rule__SensorExpr__Group_4__3__Impl rule__SensorExpr__Group_4__4 ;
    public final void rule__SensorExpr__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4526:1: ( rule__SensorExpr__Group_4__3__Impl rule__SensorExpr__Group_4__4 )
            // InternalMyDsl.g:4527:2: rule__SensorExpr__Group_4__3__Impl rule__SensorExpr__Group_4__4
            {
            pushFollow(FOLLOW_11);
            rule__SensorExpr__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorExpr__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_4__3"


    // $ANTLR start "rule__SensorExpr__Group_4__3__Impl"
    // InternalMyDsl.g:4534:1: rule__SensorExpr__Group_4__3__Impl : ( ( rule__SensorExpr__Group_4_3__0 )* ) ;
    public final void rule__SensorExpr__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4538:1: ( ( ( rule__SensorExpr__Group_4_3__0 )* ) )
            // InternalMyDsl.g:4539:1: ( ( rule__SensorExpr__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:4539:1: ( ( rule__SensorExpr__Group_4_3__0 )* )
            // InternalMyDsl.g:4540:2: ( rule__SensorExpr__Group_4_3__0 )*
            {
             before(grammarAccess.getSensorExprAccess().getGroup_4_3()); 
            // InternalMyDsl.g:4541:2: ( rule__SensorExpr__Group_4_3__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==40) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:4541:3: rule__SensorExpr__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__SensorExpr__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getSensorExprAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_4__3__Impl"


    // $ANTLR start "rule__SensorExpr__Group_4__4"
    // InternalMyDsl.g:4549:1: rule__SensorExpr__Group_4__4 : rule__SensorExpr__Group_4__4__Impl ;
    public final void rule__SensorExpr__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4553:1: ( rule__SensorExpr__Group_4__4__Impl )
            // InternalMyDsl.g:4554:2: rule__SensorExpr__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorExpr__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_4__4"


    // $ANTLR start "rule__SensorExpr__Group_4__4__Impl"
    // InternalMyDsl.g:4560:1: rule__SensorExpr__Group_4__4__Impl : ( '}' ) ;
    public final void rule__SensorExpr__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4564:1: ( ( '}' ) )
            // InternalMyDsl.g:4565:1: ( '}' )
            {
            // InternalMyDsl.g:4565:1: ( '}' )
            // InternalMyDsl.g:4566:2: '}'
            {
             before(grammarAccess.getSensorExprAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSensorExprAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_4__4__Impl"


    // $ANTLR start "rule__SensorExpr__Group_4_3__0"
    // InternalMyDsl.g:4576:1: rule__SensorExpr__Group_4_3__0 : rule__SensorExpr__Group_4_3__0__Impl rule__SensorExpr__Group_4_3__1 ;
    public final void rule__SensorExpr__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4580:1: ( rule__SensorExpr__Group_4_3__0__Impl rule__SensorExpr__Group_4_3__1 )
            // InternalMyDsl.g:4581:2: rule__SensorExpr__Group_4_3__0__Impl rule__SensorExpr__Group_4_3__1
            {
            pushFollow(FOLLOW_3);
            rule__SensorExpr__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorExpr__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_4_3__0"


    // $ANTLR start "rule__SensorExpr__Group_4_3__0__Impl"
    // InternalMyDsl.g:4588:1: rule__SensorExpr__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__SensorExpr__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4592:1: ( ( ',' ) )
            // InternalMyDsl.g:4593:1: ( ',' )
            {
            // InternalMyDsl.g:4593:1: ( ',' )
            // InternalMyDsl.g:4594:2: ','
            {
             before(grammarAccess.getSensorExprAccess().getCommaKeyword_4_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSensorExprAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_4_3__0__Impl"


    // $ANTLR start "rule__SensorExpr__Group_4_3__1"
    // InternalMyDsl.g:4603:1: rule__SensorExpr__Group_4_3__1 : rule__SensorExpr__Group_4_3__1__Impl ;
    public final void rule__SensorExpr__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4607:1: ( rule__SensorExpr__Group_4_3__1__Impl )
            // InternalMyDsl.g:4608:2: rule__SensorExpr__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorExpr__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_4_3__1"


    // $ANTLR start "rule__SensorExpr__Group_4_3__1__Impl"
    // InternalMyDsl.g:4614:1: rule__SensorExpr__Group_4_3__1__Impl : ( ( rule__SensorExpr__VariableAssignment_4_3_1 ) ) ;
    public final void rule__SensorExpr__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4618:1: ( ( ( rule__SensorExpr__VariableAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:4619:1: ( ( rule__SensorExpr__VariableAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:4619:1: ( ( rule__SensorExpr__VariableAssignment_4_3_1 ) )
            // InternalMyDsl.g:4620:2: ( rule__SensorExpr__VariableAssignment_4_3_1 )
            {
             before(grammarAccess.getSensorExprAccess().getVariableAssignment_4_3_1()); 
            // InternalMyDsl.g:4621:2: ( rule__SensorExpr__VariableAssignment_4_3_1 )
            // InternalMyDsl.g:4621:3: rule__SensorExpr__VariableAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorExpr__VariableAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorExprAccess().getVariableAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__Group_4_3__1__Impl"


    // $ANTLR start "rule__Sensor_Impl__Group__0"
    // InternalMyDsl.g:4630:1: rule__Sensor_Impl__Group__0 : rule__Sensor_Impl__Group__0__Impl rule__Sensor_Impl__Group__1 ;
    public final void rule__Sensor_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4634:1: ( rule__Sensor_Impl__Group__0__Impl rule__Sensor_Impl__Group__1 )
            // InternalMyDsl.g:4635:2: rule__Sensor_Impl__Group__0__Impl rule__Sensor_Impl__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Sensor_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor_Impl__Group__0"


    // $ANTLR start "rule__Sensor_Impl__Group__0__Impl"
    // InternalMyDsl.g:4642:1: rule__Sensor_Impl__Group__0__Impl : ( () ) ;
    public final void rule__Sensor_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4646:1: ( ( () ) )
            // InternalMyDsl.g:4647:1: ( () )
            {
            // InternalMyDsl.g:4647:1: ( () )
            // InternalMyDsl.g:4648:2: ()
            {
             before(grammarAccess.getSensor_ImplAccess().getSensorAction_0()); 
            // InternalMyDsl.g:4649:2: ()
            // InternalMyDsl.g:4649:3: 
            {
            }

             after(grammarAccess.getSensor_ImplAccess().getSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor_Impl__Group__0__Impl"


    // $ANTLR start "rule__Sensor_Impl__Group__1"
    // InternalMyDsl.g:4657:1: rule__Sensor_Impl__Group__1 : rule__Sensor_Impl__Group__1__Impl rule__Sensor_Impl__Group__2 ;
    public final void rule__Sensor_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4661:1: ( rule__Sensor_Impl__Group__1__Impl rule__Sensor_Impl__Group__2 )
            // InternalMyDsl.g:4662:2: rule__Sensor_Impl__Group__1__Impl rule__Sensor_Impl__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Sensor_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor_Impl__Group__1"


    // $ANTLR start "rule__Sensor_Impl__Group__1__Impl"
    // InternalMyDsl.g:4669:1: rule__Sensor_Impl__Group__1__Impl : ( 'Sensor' ) ;
    public final void rule__Sensor_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4673:1: ( ( 'Sensor' ) )
            // InternalMyDsl.g:4674:1: ( 'Sensor' )
            {
            // InternalMyDsl.g:4674:1: ( 'Sensor' )
            // InternalMyDsl.g:4675:2: 'Sensor'
            {
             before(grammarAccess.getSensor_ImplAccess().getSensorKeyword_1()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getSensor_ImplAccess().getSensorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor_Impl__Group__1__Impl"


    // $ANTLR start "rule__Sensor_Impl__Group__2"
    // InternalMyDsl.g:4684:1: rule__Sensor_Impl__Group__2 : rule__Sensor_Impl__Group__2__Impl rule__Sensor_Impl__Group__3 ;
    public final void rule__Sensor_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4688:1: ( rule__Sensor_Impl__Group__2__Impl rule__Sensor_Impl__Group__3 )
            // InternalMyDsl.g:4689:2: rule__Sensor_Impl__Group__2__Impl rule__Sensor_Impl__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__Sensor_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor_Impl__Group__2"


    // $ANTLR start "rule__Sensor_Impl__Group__2__Impl"
    // InternalMyDsl.g:4696:1: rule__Sensor_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__Sensor_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4700:1: ( ( '{' ) )
            // InternalMyDsl.g:4701:1: ( '{' )
            {
            // InternalMyDsl.g:4701:1: ( '{' )
            // InternalMyDsl.g:4702:2: '{'
            {
             before(grammarAccess.getSensor_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSensor_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor_Impl__Group__2__Impl"


    // $ANTLR start "rule__Sensor_Impl__Group__3"
    // InternalMyDsl.g:4711:1: rule__Sensor_Impl__Group__3 : rule__Sensor_Impl__Group__3__Impl rule__Sensor_Impl__Group__4 ;
    public final void rule__Sensor_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4715:1: ( rule__Sensor_Impl__Group__3__Impl rule__Sensor_Impl__Group__4 )
            // InternalMyDsl.g:4716:2: rule__Sensor_Impl__Group__3__Impl rule__Sensor_Impl__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__Sensor_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor_Impl__Group__3"


    // $ANTLR start "rule__Sensor_Impl__Group__3__Impl"
    // InternalMyDsl.g:4723:1: rule__Sensor_Impl__Group__3__Impl : ( ( rule__Sensor_Impl__Group_3__0 )? ) ;
    public final void rule__Sensor_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4727:1: ( ( ( rule__Sensor_Impl__Group_3__0 )? ) )
            // InternalMyDsl.g:4728:1: ( ( rule__Sensor_Impl__Group_3__0 )? )
            {
            // InternalMyDsl.g:4728:1: ( ( rule__Sensor_Impl__Group_3__0 )? )
            // InternalMyDsl.g:4729:2: ( rule__Sensor_Impl__Group_3__0 )?
            {
             before(grammarAccess.getSensor_ImplAccess().getGroup_3()); 
            // InternalMyDsl.g:4730:2: ( rule__Sensor_Impl__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==35) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:4730:3: rule__Sensor_Impl__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sensor_Impl__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensor_ImplAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor_Impl__Group__3__Impl"


    // $ANTLR start "rule__Sensor_Impl__Group__4"
    // InternalMyDsl.g:4738:1: rule__Sensor_Impl__Group__4 : rule__Sensor_Impl__Group__4__Impl ;
    public final void rule__Sensor_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4742:1: ( rule__Sensor_Impl__Group__4__Impl )
            // InternalMyDsl.g:4743:2: rule__Sensor_Impl__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor_Impl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor_Impl__Group__4"


    // $ANTLR start "rule__Sensor_Impl__Group__4__Impl"
    // InternalMyDsl.g:4749:1: rule__Sensor_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__Sensor_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4753:1: ( ( '}' ) )
            // InternalMyDsl.g:4754:1: ( '}' )
            {
            // InternalMyDsl.g:4754:1: ( '}' )
            // InternalMyDsl.g:4755:2: '}'
            {
             before(grammarAccess.getSensor_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSensor_ImplAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor_Impl__Group__4__Impl"


    // $ANTLR start "rule__Sensor_Impl__Group_3__0"
    // InternalMyDsl.g:4765:1: rule__Sensor_Impl__Group_3__0 : rule__Sensor_Impl__Group_3__0__Impl rule__Sensor_Impl__Group_3__1 ;
    public final void rule__Sensor_Impl__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4769:1: ( rule__Sensor_Impl__Group_3__0__Impl rule__Sensor_Impl__Group_3__1 )
            // InternalMyDsl.g:4770:2: rule__Sensor_Impl__Group_3__0__Impl rule__Sensor_Impl__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__Sensor_Impl__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sensor_Impl__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor_Impl__Group_3__0"


    // $ANTLR start "rule__Sensor_Impl__Group_3__0__Impl"
    // InternalMyDsl.g:4777:1: rule__Sensor_Impl__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__Sensor_Impl__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4781:1: ( ( 'name' ) )
            // InternalMyDsl.g:4782:1: ( 'name' )
            {
            // InternalMyDsl.g:4782:1: ( 'name' )
            // InternalMyDsl.g:4783:2: 'name'
            {
             before(grammarAccess.getSensor_ImplAccess().getNameKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSensor_ImplAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor_Impl__Group_3__0__Impl"


    // $ANTLR start "rule__Sensor_Impl__Group_3__1"
    // InternalMyDsl.g:4792:1: rule__Sensor_Impl__Group_3__1 : rule__Sensor_Impl__Group_3__1__Impl ;
    public final void rule__Sensor_Impl__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4796:1: ( rule__Sensor_Impl__Group_3__1__Impl )
            // InternalMyDsl.g:4797:2: rule__Sensor_Impl__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sensor_Impl__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor_Impl__Group_3__1"


    // $ANTLR start "rule__Sensor_Impl__Group_3__1__Impl"
    // InternalMyDsl.g:4803:1: rule__Sensor_Impl__Group_3__1__Impl : ( ( rule__Sensor_Impl__NameAssignment_3_1 ) ) ;
    public final void rule__Sensor_Impl__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4807:1: ( ( ( rule__Sensor_Impl__NameAssignment_3_1 ) ) )
            // InternalMyDsl.g:4808:1: ( ( rule__Sensor_Impl__NameAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4808:1: ( ( rule__Sensor_Impl__NameAssignment_3_1 ) )
            // InternalMyDsl.g:4809:2: ( rule__Sensor_Impl__NameAssignment_3_1 )
            {
             before(grammarAccess.getSensor_ImplAccess().getNameAssignment_3_1()); 
            // InternalMyDsl.g:4810:2: ( rule__Sensor_Impl__NameAssignment_3_1 )
            // InternalMyDsl.g:4810:3: rule__Sensor_Impl__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Sensor_Impl__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSensor_ImplAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor_Impl__Group_3__1__Impl"


    // $ANTLR start "rule__SensorDistance__Group__0"
    // InternalMyDsl.g:4819:1: rule__SensorDistance__Group__0 : rule__SensorDistance__Group__0__Impl rule__SensorDistance__Group__1 ;
    public final void rule__SensorDistance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4823:1: ( rule__SensorDistance__Group__0__Impl rule__SensorDistance__Group__1 )
            // InternalMyDsl.g:4824:2: rule__SensorDistance__Group__0__Impl rule__SensorDistance__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__SensorDistance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorDistance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDistance__Group__0"


    // $ANTLR start "rule__SensorDistance__Group__0__Impl"
    // InternalMyDsl.g:4831:1: rule__SensorDistance__Group__0__Impl : ( () ) ;
    public final void rule__SensorDistance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4835:1: ( ( () ) )
            // InternalMyDsl.g:4836:1: ( () )
            {
            // InternalMyDsl.g:4836:1: ( () )
            // InternalMyDsl.g:4837:2: ()
            {
             before(grammarAccess.getSensorDistanceAccess().getSensorDistanceAction_0()); 
            // InternalMyDsl.g:4838:2: ()
            // InternalMyDsl.g:4838:3: 
            {
            }

             after(grammarAccess.getSensorDistanceAccess().getSensorDistanceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDistance__Group__0__Impl"


    // $ANTLR start "rule__SensorDistance__Group__1"
    // InternalMyDsl.g:4846:1: rule__SensorDistance__Group__1 : rule__SensorDistance__Group__1__Impl rule__SensorDistance__Group__2 ;
    public final void rule__SensorDistance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4850:1: ( rule__SensorDistance__Group__1__Impl rule__SensorDistance__Group__2 )
            // InternalMyDsl.g:4851:2: rule__SensorDistance__Group__1__Impl rule__SensorDistance__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SensorDistance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorDistance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDistance__Group__1"


    // $ANTLR start "rule__SensorDistance__Group__1__Impl"
    // InternalMyDsl.g:4858:1: rule__SensorDistance__Group__1__Impl : ( 'SensorDistance' ) ;
    public final void rule__SensorDistance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4862:1: ( ( 'SensorDistance' ) )
            // InternalMyDsl.g:4863:1: ( 'SensorDistance' )
            {
            // InternalMyDsl.g:4863:1: ( 'SensorDistance' )
            // InternalMyDsl.g:4864:2: 'SensorDistance'
            {
             before(grammarAccess.getSensorDistanceAccess().getSensorDistanceKeyword_1()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getSensorDistanceAccess().getSensorDistanceKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDistance__Group__1__Impl"


    // $ANTLR start "rule__SensorDistance__Group__2"
    // InternalMyDsl.g:4873:1: rule__SensorDistance__Group__2 : rule__SensorDistance__Group__2__Impl rule__SensorDistance__Group__3 ;
    public final void rule__SensorDistance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4877:1: ( rule__SensorDistance__Group__2__Impl rule__SensorDistance__Group__3 )
            // InternalMyDsl.g:4878:2: rule__SensorDistance__Group__2__Impl rule__SensorDistance__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__SensorDistance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorDistance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDistance__Group__2"


    // $ANTLR start "rule__SensorDistance__Group__2__Impl"
    // InternalMyDsl.g:4885:1: rule__SensorDistance__Group__2__Impl : ( '{' ) ;
    public final void rule__SensorDistance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4889:1: ( ( '{' ) )
            // InternalMyDsl.g:4890:1: ( '{' )
            {
            // InternalMyDsl.g:4890:1: ( '{' )
            // InternalMyDsl.g:4891:2: '{'
            {
             before(grammarAccess.getSensorDistanceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSensorDistanceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDistance__Group__2__Impl"


    // $ANTLR start "rule__SensorDistance__Group__3"
    // InternalMyDsl.g:4900:1: rule__SensorDistance__Group__3 : rule__SensorDistance__Group__3__Impl rule__SensorDistance__Group__4 ;
    public final void rule__SensorDistance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4904:1: ( rule__SensorDistance__Group__3__Impl rule__SensorDistance__Group__4 )
            // InternalMyDsl.g:4905:2: rule__SensorDistance__Group__3__Impl rule__SensorDistance__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__SensorDistance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorDistance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDistance__Group__3"


    // $ANTLR start "rule__SensorDistance__Group__3__Impl"
    // InternalMyDsl.g:4912:1: rule__SensorDistance__Group__3__Impl : ( ( rule__SensorDistance__Group_3__0 )? ) ;
    public final void rule__SensorDistance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4916:1: ( ( ( rule__SensorDistance__Group_3__0 )? ) )
            // InternalMyDsl.g:4917:1: ( ( rule__SensorDistance__Group_3__0 )? )
            {
            // InternalMyDsl.g:4917:1: ( ( rule__SensorDistance__Group_3__0 )? )
            // InternalMyDsl.g:4918:2: ( rule__SensorDistance__Group_3__0 )?
            {
             before(grammarAccess.getSensorDistanceAccess().getGroup_3()); 
            // InternalMyDsl.g:4919:2: ( rule__SensorDistance__Group_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:4919:3: rule__SensorDistance__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SensorDistance__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorDistanceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDistance__Group__3__Impl"


    // $ANTLR start "rule__SensorDistance__Group__4"
    // InternalMyDsl.g:4927:1: rule__SensorDistance__Group__4 : rule__SensorDistance__Group__4__Impl ;
    public final void rule__SensorDistance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4931:1: ( rule__SensorDistance__Group__4__Impl )
            // InternalMyDsl.g:4932:2: rule__SensorDistance__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorDistance__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDistance__Group__4"


    // $ANTLR start "rule__SensorDistance__Group__4__Impl"
    // InternalMyDsl.g:4938:1: rule__SensorDistance__Group__4__Impl : ( '}' ) ;
    public final void rule__SensorDistance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4942:1: ( ( '}' ) )
            // InternalMyDsl.g:4943:1: ( '}' )
            {
            // InternalMyDsl.g:4943:1: ( '}' )
            // InternalMyDsl.g:4944:2: '}'
            {
             before(grammarAccess.getSensorDistanceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSensorDistanceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDistance__Group__4__Impl"


    // $ANTLR start "rule__SensorDistance__Group_3__0"
    // InternalMyDsl.g:4954:1: rule__SensorDistance__Group_3__0 : rule__SensorDistance__Group_3__0__Impl rule__SensorDistance__Group_3__1 ;
    public final void rule__SensorDistance__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4958:1: ( rule__SensorDistance__Group_3__0__Impl rule__SensorDistance__Group_3__1 )
            // InternalMyDsl.g:4959:2: rule__SensorDistance__Group_3__0__Impl rule__SensorDistance__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__SensorDistance__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorDistance__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDistance__Group_3__0"


    // $ANTLR start "rule__SensorDistance__Group_3__0__Impl"
    // InternalMyDsl.g:4966:1: rule__SensorDistance__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__SensorDistance__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4970:1: ( ( 'name' ) )
            // InternalMyDsl.g:4971:1: ( 'name' )
            {
            // InternalMyDsl.g:4971:1: ( 'name' )
            // InternalMyDsl.g:4972:2: 'name'
            {
             before(grammarAccess.getSensorDistanceAccess().getNameKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSensorDistanceAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDistance__Group_3__0__Impl"


    // $ANTLR start "rule__SensorDistance__Group_3__1"
    // InternalMyDsl.g:4981:1: rule__SensorDistance__Group_3__1 : rule__SensorDistance__Group_3__1__Impl ;
    public final void rule__SensorDistance__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4985:1: ( rule__SensorDistance__Group_3__1__Impl )
            // InternalMyDsl.g:4986:2: rule__SensorDistance__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorDistance__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDistance__Group_3__1"


    // $ANTLR start "rule__SensorDistance__Group_3__1__Impl"
    // InternalMyDsl.g:4992:1: rule__SensorDistance__Group_3__1__Impl : ( ( rule__SensorDistance__NameAssignment_3_1 ) ) ;
    public final void rule__SensorDistance__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4996:1: ( ( ( rule__SensorDistance__NameAssignment_3_1 ) ) )
            // InternalMyDsl.g:4997:1: ( ( rule__SensorDistance__NameAssignment_3_1 ) )
            {
            // InternalMyDsl.g:4997:1: ( ( rule__SensorDistance__NameAssignment_3_1 ) )
            // InternalMyDsl.g:4998:2: ( rule__SensorDistance__NameAssignment_3_1 )
            {
             before(grammarAccess.getSensorDistanceAccess().getNameAssignment_3_1()); 
            // InternalMyDsl.g:4999:2: ( rule__SensorDistance__NameAssignment_3_1 )
            // InternalMyDsl.g:4999:3: rule__SensorDistance__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorDistance__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorDistanceAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDistance__Group_3__1__Impl"


    // $ANTLR start "rule__SensorTime__Group__0"
    // InternalMyDsl.g:5008:1: rule__SensorTime__Group__0 : rule__SensorTime__Group__0__Impl rule__SensorTime__Group__1 ;
    public final void rule__SensorTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5012:1: ( rule__SensorTime__Group__0__Impl rule__SensorTime__Group__1 )
            // InternalMyDsl.g:5013:2: rule__SensorTime__Group__0__Impl rule__SensorTime__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__SensorTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorTime__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTime__Group__0"


    // $ANTLR start "rule__SensorTime__Group__0__Impl"
    // InternalMyDsl.g:5020:1: rule__SensorTime__Group__0__Impl : ( () ) ;
    public final void rule__SensorTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5024:1: ( ( () ) )
            // InternalMyDsl.g:5025:1: ( () )
            {
            // InternalMyDsl.g:5025:1: ( () )
            // InternalMyDsl.g:5026:2: ()
            {
             before(grammarAccess.getSensorTimeAccess().getSensorTimeAction_0()); 
            // InternalMyDsl.g:5027:2: ()
            // InternalMyDsl.g:5027:3: 
            {
            }

             after(grammarAccess.getSensorTimeAccess().getSensorTimeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTime__Group__0__Impl"


    // $ANTLR start "rule__SensorTime__Group__1"
    // InternalMyDsl.g:5035:1: rule__SensorTime__Group__1 : rule__SensorTime__Group__1__Impl rule__SensorTime__Group__2 ;
    public final void rule__SensorTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5039:1: ( rule__SensorTime__Group__1__Impl rule__SensorTime__Group__2 )
            // InternalMyDsl.g:5040:2: rule__SensorTime__Group__1__Impl rule__SensorTime__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SensorTime__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorTime__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTime__Group__1"


    // $ANTLR start "rule__SensorTime__Group__1__Impl"
    // InternalMyDsl.g:5047:1: rule__SensorTime__Group__1__Impl : ( 'SensorTime' ) ;
    public final void rule__SensorTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5051:1: ( ( 'SensorTime' ) )
            // InternalMyDsl.g:5052:1: ( 'SensorTime' )
            {
            // InternalMyDsl.g:5052:1: ( 'SensorTime' )
            // InternalMyDsl.g:5053:2: 'SensorTime'
            {
             before(grammarAccess.getSensorTimeAccess().getSensorTimeKeyword_1()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getSensorTimeAccess().getSensorTimeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTime__Group__1__Impl"


    // $ANTLR start "rule__SensorTime__Group__2"
    // InternalMyDsl.g:5062:1: rule__SensorTime__Group__2 : rule__SensorTime__Group__2__Impl rule__SensorTime__Group__3 ;
    public final void rule__SensorTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5066:1: ( rule__SensorTime__Group__2__Impl rule__SensorTime__Group__3 )
            // InternalMyDsl.g:5067:2: rule__SensorTime__Group__2__Impl rule__SensorTime__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__SensorTime__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorTime__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTime__Group__2"


    // $ANTLR start "rule__SensorTime__Group__2__Impl"
    // InternalMyDsl.g:5074:1: rule__SensorTime__Group__2__Impl : ( '{' ) ;
    public final void rule__SensorTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5078:1: ( ( '{' ) )
            // InternalMyDsl.g:5079:1: ( '{' )
            {
            // InternalMyDsl.g:5079:1: ( '{' )
            // InternalMyDsl.g:5080:2: '{'
            {
             before(grammarAccess.getSensorTimeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSensorTimeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTime__Group__2__Impl"


    // $ANTLR start "rule__SensorTime__Group__3"
    // InternalMyDsl.g:5089:1: rule__SensorTime__Group__3 : rule__SensorTime__Group__3__Impl rule__SensorTime__Group__4 ;
    public final void rule__SensorTime__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5093:1: ( rule__SensorTime__Group__3__Impl rule__SensorTime__Group__4 )
            // InternalMyDsl.g:5094:2: rule__SensorTime__Group__3__Impl rule__SensorTime__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__SensorTime__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorTime__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTime__Group__3"


    // $ANTLR start "rule__SensorTime__Group__3__Impl"
    // InternalMyDsl.g:5101:1: rule__SensorTime__Group__3__Impl : ( ( rule__SensorTime__Group_3__0 )? ) ;
    public final void rule__SensorTime__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5105:1: ( ( ( rule__SensorTime__Group_3__0 )? ) )
            // InternalMyDsl.g:5106:1: ( ( rule__SensorTime__Group_3__0 )? )
            {
            // InternalMyDsl.g:5106:1: ( ( rule__SensorTime__Group_3__0 )? )
            // InternalMyDsl.g:5107:2: ( rule__SensorTime__Group_3__0 )?
            {
             before(grammarAccess.getSensorTimeAccess().getGroup_3()); 
            // InternalMyDsl.g:5108:2: ( rule__SensorTime__Group_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==35) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:5108:3: rule__SensorTime__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SensorTime__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSensorTimeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTime__Group__3__Impl"


    // $ANTLR start "rule__SensorTime__Group__4"
    // InternalMyDsl.g:5116:1: rule__SensorTime__Group__4 : rule__SensorTime__Group__4__Impl ;
    public final void rule__SensorTime__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5120:1: ( rule__SensorTime__Group__4__Impl )
            // InternalMyDsl.g:5121:2: rule__SensorTime__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorTime__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTime__Group__4"


    // $ANTLR start "rule__SensorTime__Group__4__Impl"
    // InternalMyDsl.g:5127:1: rule__SensorTime__Group__4__Impl : ( '}' ) ;
    public final void rule__SensorTime__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5131:1: ( ( '}' ) )
            // InternalMyDsl.g:5132:1: ( '}' )
            {
            // InternalMyDsl.g:5132:1: ( '}' )
            // InternalMyDsl.g:5133:2: '}'
            {
             before(grammarAccess.getSensorTimeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSensorTimeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTime__Group__4__Impl"


    // $ANTLR start "rule__SensorTime__Group_3__0"
    // InternalMyDsl.g:5143:1: rule__SensorTime__Group_3__0 : rule__SensorTime__Group_3__0__Impl rule__SensorTime__Group_3__1 ;
    public final void rule__SensorTime__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5147:1: ( rule__SensorTime__Group_3__0__Impl rule__SensorTime__Group_3__1 )
            // InternalMyDsl.g:5148:2: rule__SensorTime__Group_3__0__Impl rule__SensorTime__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__SensorTime__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SensorTime__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTime__Group_3__0"


    // $ANTLR start "rule__SensorTime__Group_3__0__Impl"
    // InternalMyDsl.g:5155:1: rule__SensorTime__Group_3__0__Impl : ( 'name' ) ;
    public final void rule__SensorTime__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5159:1: ( ( 'name' ) )
            // InternalMyDsl.g:5160:1: ( 'name' )
            {
            // InternalMyDsl.g:5160:1: ( 'name' )
            // InternalMyDsl.g:5161:2: 'name'
            {
             before(grammarAccess.getSensorTimeAccess().getNameKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSensorTimeAccess().getNameKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTime__Group_3__0__Impl"


    // $ANTLR start "rule__SensorTime__Group_3__1"
    // InternalMyDsl.g:5170:1: rule__SensorTime__Group_3__1 : rule__SensorTime__Group_3__1__Impl ;
    public final void rule__SensorTime__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5174:1: ( rule__SensorTime__Group_3__1__Impl )
            // InternalMyDsl.g:5175:2: rule__SensorTime__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SensorTime__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTime__Group_3__1"


    // $ANTLR start "rule__SensorTime__Group_3__1__Impl"
    // InternalMyDsl.g:5181:1: rule__SensorTime__Group_3__1__Impl : ( ( rule__SensorTime__NameAssignment_3_1 ) ) ;
    public final void rule__SensorTime__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5185:1: ( ( ( rule__SensorTime__NameAssignment_3_1 ) ) )
            // InternalMyDsl.g:5186:1: ( ( rule__SensorTime__NameAssignment_3_1 ) )
            {
            // InternalMyDsl.g:5186:1: ( ( rule__SensorTime__NameAssignment_3_1 ) )
            // InternalMyDsl.g:5187:2: ( rule__SensorTime__NameAssignment_3_1 )
            {
             before(grammarAccess.getSensorTimeAccess().getNameAssignment_3_1()); 
            // InternalMyDsl.g:5188:2: ( rule__SensorTime__NameAssignment_3_1 )
            // InternalMyDsl.g:5188:3: rule__SensorTime__NameAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SensorTime__NameAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSensorTimeAccess().getNameAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTime__Group_3__1__Impl"


    // $ANTLR start "rule__Variable__NameAssignment_3_1"
    // InternalMyDsl.g:5197:1: rule__Variable__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__Variable__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5201:1: ( ( ruleString0 ) )
            // InternalMyDsl.g:5202:2: ( ruleString0 )
            {
            // InternalMyDsl.g:5202:2: ( ruleString0 )
            // InternalMyDsl.g:5203:3: ruleString0
            {
             before(grammarAccess.getVariableAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getNameString0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__NameAssignment_3_1"


    // $ANTLR start "rule__Variable__TypeAssignment_4_1"
    // InternalMyDsl.g:5212:1: rule__Variable__TypeAssignment_4_1 : ( ( ruleEString ) ) ;
    public final void rule__Variable__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5216:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5217:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5217:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5218:3: ( ruleEString )
            {
             before(grammarAccess.getVariableAccess().getTypeTypeCrossReference_4_1_0()); 
            // InternalMyDsl.g:5219:3: ( ruleEString )
            // InternalMyDsl.g:5220:4: ruleEString
            {
             before(grammarAccess.getVariableAccess().getTypeTypeEStringParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getTypeTypeEStringParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getVariableAccess().getTypeTypeCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__TypeAssignment_4_1"


    // $ANTLR start "rule__Negative__VariableAssignment_2_2"
    // InternalMyDsl.g:5231:1: rule__Negative__VariableAssignment_2_2 : ( ruleVariable ) ;
    public final void rule__Negative__VariableAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5235:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:5236:2: ( ruleVariable )
            {
            // InternalMyDsl.g:5236:2: ( ruleVariable )
            // InternalMyDsl.g:5237:3: ruleVariable
            {
             before(grammarAccess.getNegativeAccess().getVariableVariableParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getNegativeAccess().getVariableVariableParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__VariableAssignment_2_2"


    // $ANTLR start "rule__Negative__VariableAssignment_2_3_1"
    // InternalMyDsl.g:5246:1: rule__Negative__VariableAssignment_2_3_1 : ( ruleVariable ) ;
    public final void rule__Negative__VariableAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5250:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:5251:2: ( ruleVariable )
            {
            // InternalMyDsl.g:5251:2: ( ruleVariable )
            // InternalMyDsl.g:5252:3: ruleVariable
            {
             before(grammarAccess.getNegativeAccess().getVariableVariableParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getNegativeAccess().getVariableVariableParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__VariableAssignment_2_3_1"


    // $ANTLR start "rule__Negative__ExpressionAssignment_4"
    // InternalMyDsl.g:5261:1: rule__Negative__ExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__Negative__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5265:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5266:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5266:2: ( ruleExpression )
            // InternalMyDsl.g:5267:3: ruleExpression
            {
             before(grammarAccess.getNegativeAccess().getExpressionExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getNegativeAccess().getExpressionExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negative__ExpressionAssignment_4"


    // $ANTLR start "rule__BinaryArithmetic__OperationAssignment_2_1"
    // InternalMyDsl.g:5276:1: rule__BinaryArithmetic__OperationAssignment_2_1 : ( ruleArithmeticOperation ) ;
    public final void rule__BinaryArithmetic__OperationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5280:1: ( ( ruleArithmeticOperation ) )
            // InternalMyDsl.g:5281:2: ( ruleArithmeticOperation )
            {
            // InternalMyDsl.g:5281:2: ( ruleArithmeticOperation )
            // InternalMyDsl.g:5282:3: ruleArithmeticOperation
            {
             before(grammarAccess.getBinaryArithmeticAccess().getOperationArithmeticOperationEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArithmeticOperation();

            state._fsp--;

             after(grammarAccess.getBinaryArithmeticAccess().getOperationArithmeticOperationEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__OperationAssignment_2_1"


    // $ANTLR start "rule__BinaryArithmetic__VariableAssignment_3_2"
    // InternalMyDsl.g:5291:1: rule__BinaryArithmetic__VariableAssignment_3_2 : ( ruleVariable ) ;
    public final void rule__BinaryArithmetic__VariableAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5295:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:5296:2: ( ruleVariable )
            {
            // InternalMyDsl.g:5296:2: ( ruleVariable )
            // InternalMyDsl.g:5297:3: ruleVariable
            {
             before(grammarAccess.getBinaryArithmeticAccess().getVariableVariableParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getBinaryArithmeticAccess().getVariableVariableParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__VariableAssignment_3_2"


    // $ANTLR start "rule__BinaryArithmetic__VariableAssignment_3_3_1"
    // InternalMyDsl.g:5306:1: rule__BinaryArithmetic__VariableAssignment_3_3_1 : ( ruleVariable ) ;
    public final void rule__BinaryArithmetic__VariableAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5310:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:5311:2: ( ruleVariable )
            {
            // InternalMyDsl.g:5311:2: ( ruleVariable )
            // InternalMyDsl.g:5312:3: ruleVariable
            {
             before(grammarAccess.getBinaryArithmeticAccess().getVariableVariableParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getBinaryArithmeticAccess().getVariableVariableParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__VariableAssignment_3_3_1"


    // $ANTLR start "rule__BinaryArithmetic__ExpressionAssignment_6"
    // InternalMyDsl.g:5321:1: rule__BinaryArithmetic__ExpressionAssignment_6 : ( ruleExpression ) ;
    public final void rule__BinaryArithmetic__ExpressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5325:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5326:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5326:2: ( ruleExpression )
            // InternalMyDsl.g:5327:3: ruleExpression
            {
             before(grammarAccess.getBinaryArithmeticAccess().getExpressionExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinaryArithmeticAccess().getExpressionExpressionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__ExpressionAssignment_6"


    // $ANTLR start "rule__BinaryArithmetic__ExpressionAssignment_7_1"
    // InternalMyDsl.g:5336:1: rule__BinaryArithmetic__ExpressionAssignment_7_1 : ( ruleExpression ) ;
    public final void rule__BinaryArithmetic__ExpressionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5340:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5341:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5341:2: ( ruleExpression )
            // InternalMyDsl.g:5342:3: ruleExpression
            {
             before(grammarAccess.getBinaryArithmeticAccess().getExpressionExpressionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinaryArithmeticAccess().getExpressionExpressionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryArithmetic__ExpressionAssignment_7_1"


    // $ANTLR start "rule__Real__UnitAssignment_3_1"
    // InternalMyDsl.g:5351:1: rule__Real__UnitAssignment_3_1 : ( ruleUnit ) ;
    public final void rule__Real__UnitAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5355:1: ( ( ruleUnit ) )
            // InternalMyDsl.g:5356:2: ( ruleUnit )
            {
            // InternalMyDsl.g:5356:2: ( ruleUnit )
            // InternalMyDsl.g:5357:3: ruleUnit
            {
             before(grammarAccess.getRealAccess().getUnitUnitEnumRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnit();

            state._fsp--;

             after(grammarAccess.getRealAccess().getUnitUnitEnumRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__UnitAssignment_3_1"


    // $ANTLR start "rule__CallExpr__FonctionAssignment_3_1"
    // InternalMyDsl.g:5366:1: rule__CallExpr__FonctionAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__CallExpr__FonctionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5370:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5371:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5371:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5372:3: ( ruleEString )
            {
             before(grammarAccess.getCallExprAccess().getFonctionFonctionCrossReference_3_1_0()); 
            // InternalMyDsl.g:5373:3: ( ruleEString )
            // InternalMyDsl.g:5374:4: ruleEString
            {
             before(grammarAccess.getCallExprAccess().getFonctionFonctionEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCallExprAccess().getFonctionFonctionEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getCallExprAccess().getFonctionFonctionCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__FonctionAssignment_3_1"


    // $ANTLR start "rule__CallExpr__VariableAssignment_4_2"
    // InternalMyDsl.g:5385:1: rule__CallExpr__VariableAssignment_4_2 : ( ruleVariable ) ;
    public final void rule__CallExpr__VariableAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5389:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:5390:2: ( ruleVariable )
            {
            // InternalMyDsl.g:5390:2: ( ruleVariable )
            // InternalMyDsl.g:5391:3: ruleVariable
            {
             before(grammarAccess.getCallExprAccess().getVariableVariableParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getCallExprAccess().getVariableVariableParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__VariableAssignment_4_2"


    // $ANTLR start "rule__CallExpr__VariableAssignment_4_3_1"
    // InternalMyDsl.g:5400:1: rule__CallExpr__VariableAssignment_4_3_1 : ( ruleVariable ) ;
    public final void rule__CallExpr__VariableAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5404:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:5405:2: ( ruleVariable )
            {
            // InternalMyDsl.g:5405:2: ( ruleVariable )
            // InternalMyDsl.g:5406:3: ruleVariable
            {
             before(grammarAccess.getCallExprAccess().getVariableVariableParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getCallExprAccess().getVariableVariableParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__VariableAssignment_4_3_1"


    // $ANTLR start "rule__CallExpr__ParametersAssignment_5_2"
    // InternalMyDsl.g:5415:1: rule__CallExpr__ParametersAssignment_5_2 : ( ruleExpression ) ;
    public final void rule__CallExpr__ParametersAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5419:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5420:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5420:2: ( ruleExpression )
            // InternalMyDsl.g:5421:3: ruleExpression
            {
             before(grammarAccess.getCallExprAccess().getParametersExpressionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getCallExprAccess().getParametersExpressionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__ParametersAssignment_5_2"


    // $ANTLR start "rule__CallExpr__ParametersAssignment_5_3_1"
    // InternalMyDsl.g:5430:1: rule__CallExpr__ParametersAssignment_5_3_1 : ( ruleExpression ) ;
    public final void rule__CallExpr__ParametersAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5434:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5435:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5435:2: ( ruleExpression )
            // InternalMyDsl.g:5436:3: ruleExpression
            {
             before(grammarAccess.getCallExprAccess().getParametersExpressionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getCallExprAccess().getParametersExpressionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CallExpr__ParametersAssignment_5_3_1"


    // $ANTLR start "rule__VarExpr__VariableRefAssignment_3_1"
    // InternalMyDsl.g:5445:1: rule__VarExpr__VariableRefAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__VarExpr__VariableRefAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5449:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5450:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5450:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5451:3: ( ruleEString )
            {
             before(grammarAccess.getVarExprAccess().getVariableRefVariableCrossReference_3_1_0()); 
            // InternalMyDsl.g:5452:3: ( ruleEString )
            // InternalMyDsl.g:5453:4: ruleEString
            {
             before(grammarAccess.getVarExprAccess().getVariableRefVariableEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getVarExprAccess().getVariableRefVariableEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getVarExprAccess().getVariableRefVariableCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__VariableRefAssignment_3_1"


    // $ANTLR start "rule__VarExpr__VariableAssignment_4_2"
    // InternalMyDsl.g:5464:1: rule__VarExpr__VariableAssignment_4_2 : ( ruleVariable ) ;
    public final void rule__VarExpr__VariableAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5468:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:5469:2: ( ruleVariable )
            {
            // InternalMyDsl.g:5469:2: ( ruleVariable )
            // InternalMyDsl.g:5470:3: ruleVariable
            {
             before(grammarAccess.getVarExprAccess().getVariableVariableParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVarExprAccess().getVariableVariableParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__VariableAssignment_4_2"


    // $ANTLR start "rule__VarExpr__VariableAssignment_4_3_1"
    // InternalMyDsl.g:5479:1: rule__VarExpr__VariableAssignment_4_3_1 : ( ruleVariable ) ;
    public final void rule__VarExpr__VariableAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5483:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:5484:2: ( ruleVariable )
            {
            // InternalMyDsl.g:5484:2: ( ruleVariable )
            // InternalMyDsl.g:5485:3: ruleVariable
            {
             before(grammarAccess.getVarExprAccess().getVariableVariableParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVarExprAccess().getVariableVariableParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VarExpr__VariableAssignment_4_3_1"


    // $ANTLR start "rule__Not__VariableAssignment_2_2"
    // InternalMyDsl.g:5494:1: rule__Not__VariableAssignment_2_2 : ( ruleVariable ) ;
    public final void rule__Not__VariableAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5498:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:5499:2: ( ruleVariable )
            {
            // InternalMyDsl.g:5499:2: ( ruleVariable )
            // InternalMyDsl.g:5500:3: ruleVariable
            {
             before(grammarAccess.getNotAccess().getVariableVariableParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getNotAccess().getVariableVariableParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__VariableAssignment_2_2"


    // $ANTLR start "rule__Not__VariableAssignment_2_3_1"
    // InternalMyDsl.g:5509:1: rule__Not__VariableAssignment_2_3_1 : ( ruleVariable ) ;
    public final void rule__Not__VariableAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5513:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:5514:2: ( ruleVariable )
            {
            // InternalMyDsl.g:5514:2: ( ruleVariable )
            // InternalMyDsl.g:5515:3: ruleVariable
            {
             before(grammarAccess.getNotAccess().getVariableVariableParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getNotAccess().getVariableVariableParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__VariableAssignment_2_3_1"


    // $ANTLR start "rule__Not__ExpressionAssignment_4"
    // InternalMyDsl.g:5524:1: rule__Not__ExpressionAssignment_4 : ( ruleExpression ) ;
    public final void rule__Not__ExpressionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5528:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5529:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5529:2: ( ruleExpression )
            // InternalMyDsl.g:5530:3: ruleExpression
            {
             before(grammarAccess.getNotAccess().getExpressionExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getNotAccess().getExpressionExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Not__ExpressionAssignment_4"


    // $ANTLR start "rule__BinaryBool__OperationAssignment_2_1"
    // InternalMyDsl.g:5539:1: rule__BinaryBool__OperationAssignment_2_1 : ( ruleBoolOperation ) ;
    public final void rule__BinaryBool__OperationAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5543:1: ( ( ruleBoolOperation ) )
            // InternalMyDsl.g:5544:2: ( ruleBoolOperation )
            {
            // InternalMyDsl.g:5544:2: ( ruleBoolOperation )
            // InternalMyDsl.g:5545:3: ruleBoolOperation
            {
             before(grammarAccess.getBinaryBoolAccess().getOperationBoolOperationEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolOperation();

            state._fsp--;

             after(grammarAccess.getBinaryBoolAccess().getOperationBoolOperationEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__OperationAssignment_2_1"


    // $ANTLR start "rule__BinaryBool__VariableAssignment_3_2"
    // InternalMyDsl.g:5554:1: rule__BinaryBool__VariableAssignment_3_2 : ( ruleVariable ) ;
    public final void rule__BinaryBool__VariableAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5558:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:5559:2: ( ruleVariable )
            {
            // InternalMyDsl.g:5559:2: ( ruleVariable )
            // InternalMyDsl.g:5560:3: ruleVariable
            {
             before(grammarAccess.getBinaryBoolAccess().getVariableVariableParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getBinaryBoolAccess().getVariableVariableParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__VariableAssignment_3_2"


    // $ANTLR start "rule__BinaryBool__VariableAssignment_3_3_1"
    // InternalMyDsl.g:5569:1: rule__BinaryBool__VariableAssignment_3_3_1 : ( ruleVariable ) ;
    public final void rule__BinaryBool__VariableAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5573:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:5574:2: ( ruleVariable )
            {
            // InternalMyDsl.g:5574:2: ( ruleVariable )
            // InternalMyDsl.g:5575:3: ruleVariable
            {
             before(grammarAccess.getBinaryBoolAccess().getVariableVariableParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getBinaryBoolAccess().getVariableVariableParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__VariableAssignment_3_3_1"


    // $ANTLR start "rule__BinaryBool__ExpressionAssignment_6"
    // InternalMyDsl.g:5584:1: rule__BinaryBool__ExpressionAssignment_6 : ( ruleExpression ) ;
    public final void rule__BinaryBool__ExpressionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5588:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5589:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5589:2: ( ruleExpression )
            // InternalMyDsl.g:5590:3: ruleExpression
            {
             before(grammarAccess.getBinaryBoolAccess().getExpressionExpressionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinaryBoolAccess().getExpressionExpressionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__ExpressionAssignment_6"


    // $ANTLR start "rule__BinaryBool__ExpressionAssignment_7_1"
    // InternalMyDsl.g:5599:1: rule__BinaryBool__ExpressionAssignment_7_1 : ( ruleExpression ) ;
    public final void rule__BinaryBool__ExpressionAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5603:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:5604:2: ( ruleExpression )
            {
            // InternalMyDsl.g:5604:2: ( ruleExpression )
            // InternalMyDsl.g:5605:3: ruleExpression
            {
             before(grammarAccess.getBinaryBoolAccess().getExpressionExpressionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBinaryBoolAccess().getExpressionExpressionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BinaryBool__ExpressionAssignment_7_1"


    // $ANTLR start "rule__SensorExpr__SensorAssignment_3_1"
    // InternalMyDsl.g:5614:1: rule__SensorExpr__SensorAssignment_3_1 : ( ( ruleEString ) ) ;
    public final void rule__SensorExpr__SensorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5618:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:5619:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:5619:2: ( ( ruleEString ) )
            // InternalMyDsl.g:5620:3: ( ruleEString )
            {
             before(grammarAccess.getSensorExprAccess().getSensorSensorCrossReference_3_1_0()); 
            // InternalMyDsl.g:5621:3: ( ruleEString )
            // InternalMyDsl.g:5622:4: ruleEString
            {
             before(grammarAccess.getSensorExprAccess().getSensorSensorEStringParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSensorExprAccess().getSensorSensorEStringParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getSensorExprAccess().getSensorSensorCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__SensorAssignment_3_1"


    // $ANTLR start "rule__SensorExpr__VariableAssignment_4_2"
    // InternalMyDsl.g:5633:1: rule__SensorExpr__VariableAssignment_4_2 : ( ruleVariable ) ;
    public final void rule__SensorExpr__VariableAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5637:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:5638:2: ( ruleVariable )
            {
            // InternalMyDsl.g:5638:2: ( ruleVariable )
            // InternalMyDsl.g:5639:3: ruleVariable
            {
             before(grammarAccess.getSensorExprAccess().getVariableVariableParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getSensorExprAccess().getVariableVariableParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__VariableAssignment_4_2"


    // $ANTLR start "rule__SensorExpr__VariableAssignment_4_3_1"
    // InternalMyDsl.g:5648:1: rule__SensorExpr__VariableAssignment_4_3_1 : ( ruleVariable ) ;
    public final void rule__SensorExpr__VariableAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5652:1: ( ( ruleVariable ) )
            // InternalMyDsl.g:5653:2: ( ruleVariable )
            {
            // InternalMyDsl.g:5653:2: ( ruleVariable )
            // InternalMyDsl.g:5654:3: ruleVariable
            {
             before(grammarAccess.getSensorExprAccess().getVariableVariableParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getSensorExprAccess().getVariableVariableParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorExpr__VariableAssignment_4_3_1"


    // $ANTLR start "rule__Sensor_Impl__NameAssignment_3_1"
    // InternalMyDsl.g:5663:1: rule__Sensor_Impl__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__Sensor_Impl__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5667:1: ( ( ruleString0 ) )
            // InternalMyDsl.g:5668:2: ( ruleString0 )
            {
            // InternalMyDsl.g:5668:2: ( ruleString0 )
            // InternalMyDsl.g:5669:3: ruleString0
            {
             before(grammarAccess.getSensor_ImplAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getSensor_ImplAccess().getNameString0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor_Impl__NameAssignment_3_1"


    // $ANTLR start "rule__SensorDistance__NameAssignment_3_1"
    // InternalMyDsl.g:5678:1: rule__SensorDistance__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__SensorDistance__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5682:1: ( ( ruleString0 ) )
            // InternalMyDsl.g:5683:2: ( ruleString0 )
            {
            // InternalMyDsl.g:5683:2: ( ruleString0 )
            // InternalMyDsl.g:5684:3: ruleString0
            {
             before(grammarAccess.getSensorDistanceAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getSensorDistanceAccess().getNameString0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorDistance__NameAssignment_3_1"


    // $ANTLR start "rule__SensorTime__NameAssignment_3_1"
    // InternalMyDsl.g:5693:1: rule__SensorTime__NameAssignment_3_1 : ( ruleString0 ) ;
    public final void rule__SensorTime__NameAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5697:1: ( ( ruleString0 ) )
            // InternalMyDsl.g:5698:2: ( ruleString0 )
            {
            // InternalMyDsl.g:5698:2: ( ruleString0 )
            // InternalMyDsl.g:5699:3: ruleString0
            {
             before(grammarAccess.getSensorTimeAccess().getNameString0ParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleString0();

            state._fsp--;

             after(grammarAccess.getSensorTimeAccess().getNameString0ParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SensorTime__NameAssignment_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0074822000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000010400000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000004C000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000F0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000FF000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0003008400000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0008008400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000FF00000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0080008400000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400000000000000L});

}