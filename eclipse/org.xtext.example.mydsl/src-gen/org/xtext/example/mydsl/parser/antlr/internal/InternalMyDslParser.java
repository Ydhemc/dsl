package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Variable'", "'{'", "'name'", "'type'", "'}'", "'Negative'", "'variable'", "','", "'expression'", "'BinaryArithmetic'", "'operation'", "'Type'", "'String'", "'Bool'", "'Real'", "'unit'", "'CallExpr'", "'fonction'", "'parameters'", "'VarExpr'", "'variableRef'", "'Not'", "'BinaryBool'", "'SensorExpr'", "'sensor'", "'Sensor'", "'SensorDistance'", "'SensorTime'", "'MM'", "'KM'", "'CM'", "'M'", "'DM'", "'HM'", "'DAM'", "'RAD'", "'INF'", "'SUP'", "'INF_EQ'", "'EQ'", "'SUP_EQ'", "'NEQ'", "'OR'", "'AND'", "'ADD'", "'SUB'", "'DIV'", "'MULT'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Type";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleType"
    // InternalMyDsl.g:65:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // InternalMyDsl.g:65:45: (iv_ruleType= ruleType EOF )
            // InternalMyDsl.g:66:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:72:1: ruleType returns [EObject current=null] : (this_Type_Impl_0= ruleType_Impl | this_Bool_1= ruleBool | this_Real_2= ruleReal ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        EObject this_Type_Impl_0 = null;

        EObject this_Bool_1 = null;

        EObject this_Real_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( (this_Type_Impl_0= ruleType_Impl | this_Bool_1= ruleBool | this_Real_2= ruleReal ) )
            // InternalMyDsl.g:79:2: (this_Type_Impl_0= ruleType_Impl | this_Bool_1= ruleBool | this_Real_2= ruleReal )
            {
            // InternalMyDsl.g:79:2: (this_Type_Impl_0= ruleType_Impl | this_Bool_1= ruleBool | this_Real_2= ruleReal )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 24:
                {
                alt1=2;
                }
                break;
            case 25:
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
                    // InternalMyDsl.g:80:3: this_Type_Impl_0= ruleType_Impl
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getType_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_Impl_0=ruleType_Impl();

                    state._fsp--;


                    			current = this_Type_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:89:3: this_Bool_1= ruleBool
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getBoolParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Bool_1=ruleBool();

                    state._fsp--;


                    			current = this_Bool_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:98:3: this_Real_2= ruleReal
                    {

                    			newCompositeNode(grammarAccess.getTypeAccess().getRealParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Real_2=ruleReal();

                    state._fsp--;


                    			current = this_Real_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:110:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:110:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:111:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:117:1: ruleExpression returns [EObject current=null] : (this_CallExpr_0= ruleCallExpr | this_VarExpr_1= ruleVarExpr | this_Negative_2= ruleNegative | this_BinaryArithmetic_3= ruleBinaryArithmetic | this_Not_4= ruleNot | this_BinaryBool_5= ruleBinaryBool | this_SensorExpr_6= ruleSensorExpr ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_CallExpr_0 = null;

        EObject this_VarExpr_1 = null;

        EObject this_Negative_2 = null;

        EObject this_BinaryArithmetic_3 = null;

        EObject this_Not_4 = null;

        EObject this_BinaryBool_5 = null;

        EObject this_SensorExpr_6 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:123:2: ( (this_CallExpr_0= ruleCallExpr | this_VarExpr_1= ruleVarExpr | this_Negative_2= ruleNegative | this_BinaryArithmetic_3= ruleBinaryArithmetic | this_Not_4= ruleNot | this_BinaryBool_5= ruleBinaryBool | this_SensorExpr_6= ruleSensorExpr ) )
            // InternalMyDsl.g:124:2: (this_CallExpr_0= ruleCallExpr | this_VarExpr_1= ruleVarExpr | this_Negative_2= ruleNegative | this_BinaryArithmetic_3= ruleBinaryArithmetic | this_Not_4= ruleNot | this_BinaryBool_5= ruleBinaryBool | this_SensorExpr_6= ruleSensorExpr )
            {
            // InternalMyDsl.g:124:2: (this_CallExpr_0= ruleCallExpr | this_VarExpr_1= ruleVarExpr | this_Negative_2= ruleNegative | this_BinaryArithmetic_3= ruleBinaryArithmetic | this_Not_4= ruleNot | this_BinaryBool_5= ruleBinaryBool | this_SensorExpr_6= ruleSensorExpr )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt2=1;
                }
                break;
            case 30:
                {
                alt2=2;
                }
                break;
            case 16:
                {
                alt2=3;
                }
                break;
            case 20:
                {
                alt2=4;
                }
                break;
            case 32:
                {
                alt2=5;
                }
                break;
            case 33:
                {
                alt2=6;
                }
                break;
            case 34:
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
                    // InternalMyDsl.g:125:3: this_CallExpr_0= ruleCallExpr
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getCallExprParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CallExpr_0=ruleCallExpr();

                    state._fsp--;


                    			current = this_CallExpr_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:134:3: this_VarExpr_1= ruleVarExpr
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getVarExprParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarExpr_1=ruleVarExpr();

                    state._fsp--;


                    			current = this_VarExpr_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:143:3: this_Negative_2= ruleNegative
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNegativeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Negative_2=ruleNegative();

                    state._fsp--;


                    			current = this_Negative_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:152:3: this_BinaryArithmetic_3= ruleBinaryArithmetic
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBinaryArithmeticParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryArithmetic_3=ruleBinaryArithmetic();

                    state._fsp--;


                    			current = this_BinaryArithmetic_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:161:3: this_Not_4= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getNotParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_4=ruleNot();

                    state._fsp--;


                    			current = this_Not_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:170:3: this_BinaryBool_5= ruleBinaryBool
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getBinaryBoolParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryBool_5=ruleBinaryBool();

                    state._fsp--;


                    			current = this_BinaryBool_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:179:3: this_SensorExpr_6= ruleSensorExpr
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getSensorExprParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_SensorExpr_6=ruleSensorExpr();

                    state._fsp--;


                    			current = this_SensorExpr_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:191:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMyDsl.g:191:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMyDsl.g:192:2: iv_ruleVariable= ruleVariable EOF
            {
             newCompositeNode(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariable=ruleVariable();

            state._fsp--;

             current =iv_ruleVariable; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMyDsl.g:198:1: ruleVariable returns [EObject current=null] : ( () otherlv_1= 'Variable' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? (otherlv_5= 'type' ( ( ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:204:2: ( ( () otherlv_1= 'Variable' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? (otherlv_5= 'type' ( ( ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:205:2: ( () otherlv_1= 'Variable' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? (otherlv_5= 'type' ( ( ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:205:2: ( () otherlv_1= 'Variable' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? (otherlv_5= 'type' ( ( ruleEString ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:206:3: () otherlv_1= 'Variable' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? (otherlv_5= 'type' ( ( ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:206:3: ()
            // InternalMyDsl.g:207:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getVariableKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:221:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:222:4: otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getNameKeyword_3_0());
                    			
                    // InternalMyDsl.g:226:4: ( (lv_name_4_0= ruleString0 ) )
                    // InternalMyDsl.g:227:5: (lv_name_4_0= ruleString0 )
                    {
                    // InternalMyDsl.g:227:5: (lv_name_4_0= ruleString0 )
                    // InternalMyDsl.g:228:6: lv_name_4_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getVariableAccess().getNameString0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_name_4_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.xtext.example.mydsl.MyDsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:246:3: (otherlv_5= 'type' ( ( ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:247:4: otherlv_5= 'type' ( ( ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getVariableAccess().getTypeKeyword_4_0());
                    			
                    // InternalMyDsl.g:251:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:252:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:252:5: ( ruleEString )
                    // InternalMyDsl.g:253:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleNegative"
    // InternalMyDsl.g:276:1: entryRuleNegative returns [EObject current=null] : iv_ruleNegative= ruleNegative EOF ;
    public final EObject entryRuleNegative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegative = null;


        try {
            // InternalMyDsl.g:276:49: (iv_ruleNegative= ruleNegative EOF )
            // InternalMyDsl.g:277:2: iv_ruleNegative= ruleNegative EOF
            {
             newCompositeNode(grammarAccess.getNegativeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegative=ruleNegative();

            state._fsp--;

             current =iv_ruleNegative; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegative"


    // $ANTLR start "ruleNegative"
    // InternalMyDsl.g:283:1: ruleNegative returns [EObject current=null] : (otherlv_0= 'Negative' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}' ) ;
    public final EObject ruleNegative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_variable_4_0 = null;

        EObject lv_variable_6_0 = null;

        EObject lv_expression_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:289:2: ( (otherlv_0= 'Negative' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:290:2: (otherlv_0= 'Negative' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:290:2: (otherlv_0= 'Negative' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}' )
            // InternalMyDsl.g:291:3: otherlv_0= 'Negative' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNegativeAccess().getNegativeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getNegativeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:299:3: (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:300:4: otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getNegativeAccess().getVariableKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getNegativeAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalMyDsl.g:308:4: ( (lv_variable_4_0= ruleVariable ) )
                    // InternalMyDsl.g:309:5: (lv_variable_4_0= ruleVariable )
                    {
                    // InternalMyDsl.g:309:5: (lv_variable_4_0= ruleVariable )
                    // InternalMyDsl.g:310:6: lv_variable_4_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getNegativeAccess().getVariableVariableParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_variable_4_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNegativeRule());
                    						}
                    						add(
                    							current,
                    							"variable",
                    							lv_variable_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:327:4: (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==18) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:328:5: otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getNegativeAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalMyDsl.g:332:5: ( (lv_variable_6_0= ruleVariable ) )
                    	    // InternalMyDsl.g:333:6: (lv_variable_6_0= ruleVariable )
                    	    {
                    	    // InternalMyDsl.g:333:6: (lv_variable_6_0= ruleVariable )
                    	    // InternalMyDsl.g:334:7: lv_variable_6_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getNegativeAccess().getVariableVariableParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_variable_6_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNegativeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variable",
                    	    								lv_variable_6_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getNegativeAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getNegativeAccess().getExpressionKeyword_3());
            		
            // InternalMyDsl.g:361:3: ( (lv_expression_9_0= ruleExpression ) )
            // InternalMyDsl.g:362:4: (lv_expression_9_0= ruleExpression )
            {
            // InternalMyDsl.g:362:4: (lv_expression_9_0= ruleExpression )
            // InternalMyDsl.g:363:5: lv_expression_9_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNegativeAccess().getExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_expression_9_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNegativeRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_9_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getNegativeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegative"


    // $ANTLR start "entryRuleBinaryArithmetic"
    // InternalMyDsl.g:388:1: entryRuleBinaryArithmetic returns [EObject current=null] : iv_ruleBinaryArithmetic= ruleBinaryArithmetic EOF ;
    public final EObject entryRuleBinaryArithmetic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryArithmetic = null;


        try {
            // InternalMyDsl.g:388:57: (iv_ruleBinaryArithmetic= ruleBinaryArithmetic EOF )
            // InternalMyDsl.g:389:2: iv_ruleBinaryArithmetic= ruleBinaryArithmetic EOF
            {
             newCompositeNode(grammarAccess.getBinaryArithmeticRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryArithmetic=ruleBinaryArithmetic();

            state._fsp--;

             current =iv_ruleBinaryArithmetic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryArithmetic"


    // $ANTLR start "ruleBinaryArithmetic"
    // InternalMyDsl.g:395:1: ruleBinaryArithmetic returns [EObject current=null] : (otherlv_0= 'BinaryArithmetic' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleArithmeticOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
    public final EObject ruleBinaryArithmetic() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_operation_3_0 = null;

        EObject lv_variable_6_0 = null;

        EObject lv_variable_8_0 = null;

        EObject lv_expression_12_0 = null;

        EObject lv_expression_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:401:2: ( (otherlv_0= 'BinaryArithmetic' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleArithmeticOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalMyDsl.g:402:2: (otherlv_0= 'BinaryArithmetic' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleArithmeticOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalMyDsl.g:402:2: (otherlv_0= 'BinaryArithmetic' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleArithmeticOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalMyDsl.g:403:3: otherlv_0= 'BinaryArithmetic' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleArithmeticOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryArithmeticAccess().getBinaryArithmeticKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getBinaryArithmeticAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:411:3: (otherlv_2= 'operation' ( (lv_operation_3_0= ruleArithmeticOperation ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:412:4: otherlv_2= 'operation' ( (lv_operation_3_0= ruleArithmeticOperation ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_2, grammarAccess.getBinaryArithmeticAccess().getOperationKeyword_2_0());
                    			
                    // InternalMyDsl.g:416:4: ( (lv_operation_3_0= ruleArithmeticOperation ) )
                    // InternalMyDsl.g:417:5: (lv_operation_3_0= ruleArithmeticOperation )
                    {
                    // InternalMyDsl.g:417:5: (lv_operation_3_0= ruleArithmeticOperation )
                    // InternalMyDsl.g:418:6: lv_operation_3_0= ruleArithmeticOperation
                    {

                    						newCompositeNode(grammarAccess.getBinaryArithmeticAccess().getOperationArithmeticOperationEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_operation_3_0=ruleArithmeticOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryArithmeticRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_3_0,
                    							"org.xtext.example.mydsl.MyDsl.ArithmeticOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:436:3: (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:437:4: otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBinaryArithmeticAccess().getVariableKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getBinaryArithmeticAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:445:4: ( (lv_variable_6_0= ruleVariable ) )
                    // InternalMyDsl.g:446:5: (lv_variable_6_0= ruleVariable )
                    {
                    // InternalMyDsl.g:446:5: (lv_variable_6_0= ruleVariable )
                    // InternalMyDsl.g:447:6: lv_variable_6_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getBinaryArithmeticAccess().getVariableVariableParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_variable_6_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryArithmeticRule());
                    						}
                    						add(
                    							current,
                    							"variable",
                    							lv_variable_6_0,
                    							"org.xtext.example.mydsl.MyDsl.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:464:4: (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==18) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMyDsl.g:465:5: otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getBinaryArithmeticAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:469:5: ( (lv_variable_8_0= ruleVariable ) )
                    	    // InternalMyDsl.g:470:6: (lv_variable_8_0= ruleVariable )
                    	    {
                    	    // InternalMyDsl.g:470:6: (lv_variable_8_0= ruleVariable )
                    	    // InternalMyDsl.g:471:7: lv_variable_8_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getBinaryArithmeticAccess().getVariableVariableParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_variable_8_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBinaryArithmeticRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variable",
                    	    								lv_variable_8_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getBinaryArithmeticAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getBinaryArithmeticAccess().getExpressionKeyword_4());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getBinaryArithmeticAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:502:3: ( (lv_expression_12_0= ruleExpression ) )
            // InternalMyDsl.g:503:4: (lv_expression_12_0= ruleExpression )
            {
            // InternalMyDsl.g:503:4: (lv_expression_12_0= ruleExpression )
            // InternalMyDsl.g:504:5: lv_expression_12_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBinaryArithmeticAccess().getExpressionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_expression_12_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryArithmeticRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_12_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:521:3: (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:522:4: otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) )
            	    {
            	    otherlv_13=(Token)match(input,18,FOLLOW_13); 

            	    				newLeafNode(otherlv_13, grammarAccess.getBinaryArithmeticAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:526:4: ( (lv_expression_14_0= ruleExpression ) )
            	    // InternalMyDsl.g:527:5: (lv_expression_14_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:527:5: (lv_expression_14_0= ruleExpression )
            	    // InternalMyDsl.g:528:6: lv_expression_14_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getBinaryArithmeticAccess().getExpressionExpressionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_expression_14_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBinaryArithmeticRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expression",
            	    							lv_expression_14_0,
            	    							"org.xtext.example.mydsl.MyDsl.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_15=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getBinaryArithmeticAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getBinaryArithmeticAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryArithmetic"


    // $ANTLR start "entryRuleType_Impl"
    // InternalMyDsl.g:558:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalMyDsl.g:558:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalMyDsl.g:559:2: iv_ruleType_Impl= ruleType_Impl EOF
            {
             newCompositeNode(grammarAccess.getType_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleType_Impl=ruleType_Impl();

            state._fsp--;

             current =iv_ruleType_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType_Impl"


    // $ANTLR start "ruleType_Impl"
    // InternalMyDsl.g:565:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:571:2: ( ( () otherlv_1= 'Type' ) )
            // InternalMyDsl.g:572:2: ( () otherlv_1= 'Type' )
            {
            // InternalMyDsl.g:572:2: ( () otherlv_1= 'Type' )
            // InternalMyDsl.g:573:3: () otherlv_1= 'Type'
            {
            // InternalMyDsl.g:573:3: ()
            // InternalMyDsl.g:574:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getType_ImplAccess().getTypeKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType_Impl"


    // $ANTLR start "entryRuleString0"
    // InternalMyDsl.g:588:1: entryRuleString0 returns [String current=null] : iv_ruleString0= ruleString0 EOF ;
    public final String entryRuleString0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleString0 = null;


        try {
            // InternalMyDsl.g:588:47: (iv_ruleString0= ruleString0 EOF )
            // InternalMyDsl.g:589:2: iv_ruleString0= ruleString0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleString0=ruleString0();

            state._fsp--;

             current =iv_ruleString0.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleString0"


    // $ANTLR start "ruleString0"
    // InternalMyDsl.g:595:1: ruleString0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'String' ;
    public final AntlrDatatypeRuleToken ruleString0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:601:2: (kw= 'String' )
            // InternalMyDsl.g:602:2: kw= 'String'
            {
            kw=(Token)match(input,23,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getString0Access().getStringKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleString0"


    // $ANTLR start "entryRuleBool"
    // InternalMyDsl.g:610:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // InternalMyDsl.g:610:45: (iv_ruleBool= ruleBool EOF )
            // InternalMyDsl.g:611:2: iv_ruleBool= ruleBool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBool=ruleBool();

            state._fsp--;

             current =iv_ruleBool; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBool"


    // $ANTLR start "ruleBool"
    // InternalMyDsl.g:617:1: ruleBool returns [EObject current=null] : ( () otherlv_1= 'Bool' ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:623:2: ( ( () otherlv_1= 'Bool' ) )
            // InternalMyDsl.g:624:2: ( () otherlv_1= 'Bool' )
            {
            // InternalMyDsl.g:624:2: ( () otherlv_1= 'Bool' )
            // InternalMyDsl.g:625:3: () otherlv_1= 'Bool'
            {
            // InternalMyDsl.g:625:3: ()
            // InternalMyDsl.g:626:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolAccess().getBoolAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolAccess().getBoolKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBool"


    // $ANTLR start "entryRuleReal"
    // InternalMyDsl.g:640:1: entryRuleReal returns [EObject current=null] : iv_ruleReal= ruleReal EOF ;
    public final EObject entryRuleReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReal = null;


        try {
            // InternalMyDsl.g:640:45: (iv_ruleReal= ruleReal EOF )
            // InternalMyDsl.g:641:2: iv_ruleReal= ruleReal EOF
            {
             newCompositeNode(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReal=ruleReal();

            state._fsp--;

             current =iv_ruleReal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // InternalMyDsl.g:647:1: ruleReal returns [EObject current=null] : ( () otherlv_1= 'Real' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleUnit ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleReal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_unit_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:653:2: ( ( () otherlv_1= 'Real' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleUnit ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:654:2: ( () otherlv_1= 'Real' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleUnit ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:654:2: ( () otherlv_1= 'Real' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleUnit ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:655:3: () otherlv_1= 'Real' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleUnit ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:655:3: ()
            // InternalMyDsl.g:656:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealAccess().getRealAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRealAccess().getRealKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_2, grammarAccess.getRealAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:670:3: (otherlv_3= 'unit' ( (lv_unit_4_0= ruleUnit ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:671:4: otherlv_3= 'unit' ( (lv_unit_4_0= ruleUnit ) )
                    {
                    otherlv_3=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getRealAccess().getUnitKeyword_3_0());
                    			
                    // InternalMyDsl.g:675:4: ( (lv_unit_4_0= ruleUnit ) )
                    // InternalMyDsl.g:676:5: (lv_unit_4_0= ruleUnit )
                    {
                    // InternalMyDsl.g:676:5: (lv_unit_4_0= ruleUnit )
                    // InternalMyDsl.g:677:6: lv_unit_4_0= ruleUnit
                    {

                    						newCompositeNode(grammarAccess.getRealAccess().getUnitUnitEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_unit_4_0=ruleUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRealRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Unit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRealAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleCallExpr"
    // InternalMyDsl.g:703:1: entryRuleCallExpr returns [EObject current=null] : iv_ruleCallExpr= ruleCallExpr EOF ;
    public final EObject entryRuleCallExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallExpr = null;


        try {
            // InternalMyDsl.g:703:49: (iv_ruleCallExpr= ruleCallExpr EOF )
            // InternalMyDsl.g:704:2: iv_ruleCallExpr= ruleCallExpr EOF
            {
             newCompositeNode(grammarAccess.getCallExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCallExpr=ruleCallExpr();

            state._fsp--;

             current =iv_ruleCallExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCallExpr"


    // $ANTLR start "ruleCallExpr"
    // InternalMyDsl.g:710:1: ruleCallExpr returns [EObject current=null] : ( () otherlv_1= 'CallExpr' otherlv_2= '{' (otherlv_3= 'fonction' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleExpression ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleCallExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_variable_7_0 = null;

        EObject lv_variable_9_0 = null;

        EObject lv_parameters_13_0 = null;

        EObject lv_parameters_15_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:716:2: ( ( () otherlv_1= 'CallExpr' otherlv_2= '{' (otherlv_3= 'fonction' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleExpression ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalMyDsl.g:717:2: ( () otherlv_1= 'CallExpr' otherlv_2= '{' (otherlv_3= 'fonction' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleExpression ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalMyDsl.g:717:2: ( () otherlv_1= 'CallExpr' otherlv_2= '{' (otherlv_3= 'fonction' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleExpression ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalMyDsl.g:718:3: () otherlv_1= 'CallExpr' otherlv_2= '{' (otherlv_3= 'fonction' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleExpression ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // InternalMyDsl.g:718:3: ()
            // InternalMyDsl.g:719:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCallExprAccess().getCallExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCallExprAccess().getCallExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getCallExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:733:3: (otherlv_3= 'fonction' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:734:4: otherlv_3= 'fonction' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getCallExprAccess().getFonctionKeyword_3_0());
                    			
                    // InternalMyDsl.g:738:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:739:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:739:5: ( ruleEString )
                    // InternalMyDsl.g:740:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCallExprRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCallExprAccess().getFonctionFonctionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:755:3: (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:756:4: otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCallExprAccess().getVariableKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getCallExprAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:764:4: ( (lv_variable_7_0= ruleVariable ) )
                    // InternalMyDsl.g:765:5: (lv_variable_7_0= ruleVariable )
                    {
                    // InternalMyDsl.g:765:5: (lv_variable_7_0= ruleVariable )
                    // InternalMyDsl.g:766:6: lv_variable_7_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getCallExprAccess().getVariableVariableParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_variable_7_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCallExprRule());
                    						}
                    						add(
                    							current,
                    							"variable",
                    							lv_variable_7_0,
                    							"org.xtext.example.mydsl.MyDsl.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:783:4: (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==18) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyDsl.g:784:5: otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getCallExprAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:788:5: ( (lv_variable_9_0= ruleVariable ) )
                    	    // InternalMyDsl.g:789:6: (lv_variable_9_0= ruleVariable )
                    	    {
                    	    // InternalMyDsl.g:789:6: (lv_variable_9_0= ruleVariable )
                    	    // InternalMyDsl.g:790:7: lv_variable_9_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getCallExprAccess().getVariableVariableParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_variable_9_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCallExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variable",
                    	    								lv_variable_9_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_20); 

                    				newLeafNode(otherlv_10, grammarAccess.getCallExprAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:813:3: (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleExpression ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) ) )* otherlv_16= '}' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:814:4: otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleExpression ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getCallExprAccess().getParametersKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_12, grammarAccess.getCallExprAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:822:4: ( (lv_parameters_13_0= ruleExpression ) )
                    // InternalMyDsl.g:823:5: (lv_parameters_13_0= ruleExpression )
                    {
                    // InternalMyDsl.g:823:5: (lv_parameters_13_0= ruleExpression )
                    // InternalMyDsl.g:824:6: lv_parameters_13_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCallExprAccess().getParametersExpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parameters_13_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCallExprRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_13_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:841:4: (otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==18) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMyDsl.g:842:5: otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) )
                    	    {
                    	    otherlv_14=(Token)match(input,18,FOLLOW_13); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getCallExprAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:846:5: ( (lv_parameters_15_0= ruleExpression ) )
                    	    // InternalMyDsl.g:847:6: (lv_parameters_15_0= ruleExpression )
                    	    {
                    	    // InternalMyDsl.g:847:6: (lv_parameters_15_0= ruleExpression )
                    	    // InternalMyDsl.g:848:7: lv_parameters_15_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getCallExprAccess().getParametersExpressionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_parameters_15_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCallExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_15_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_16, grammarAccess.getCallExprAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getCallExprAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallExpr"


    // $ANTLR start "entryRuleVarExpr"
    // InternalMyDsl.g:879:1: entryRuleVarExpr returns [EObject current=null] : iv_ruleVarExpr= ruleVarExpr EOF ;
    public final EObject entryRuleVarExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarExpr = null;


        try {
            // InternalMyDsl.g:879:48: (iv_ruleVarExpr= ruleVarExpr EOF )
            // InternalMyDsl.g:880:2: iv_ruleVarExpr= ruleVarExpr EOF
            {
             newCompositeNode(grammarAccess.getVarExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarExpr=ruleVarExpr();

            state._fsp--;

             current =iv_ruleVarExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarExpr"


    // $ANTLR start "ruleVarExpr"
    // InternalMyDsl.g:886:1: ruleVarExpr returns [EObject current=null] : ( () otherlv_1= 'VarExpr' otherlv_2= '{' (otherlv_3= 'variableRef' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleVarExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_variable_7_0 = null;

        EObject lv_variable_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:892:2: ( ( () otherlv_1= 'VarExpr' otherlv_2= '{' (otherlv_3= 'variableRef' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:893:2: ( () otherlv_1= 'VarExpr' otherlv_2= '{' (otherlv_3= 'variableRef' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:893:2: ( () otherlv_1= 'VarExpr' otherlv_2= '{' (otherlv_3= 'variableRef' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:894:3: () otherlv_1= 'VarExpr' otherlv_2= '{' (otherlv_3= 'variableRef' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMyDsl.g:894:3: ()
            // InternalMyDsl.g:895:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVarExprAccess().getVarExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVarExprAccess().getVarExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getVarExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:909:3: (otherlv_3= 'variableRef' ( ( ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:910:4: otherlv_3= 'variableRef' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getVarExprAccess().getVariableRefKeyword_3_0());
                    			
                    // InternalMyDsl.g:914:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:915:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:915:5: ( ruleEString )
                    // InternalMyDsl.g:916:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarExprRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVarExprAccess().getVariableRefVariableCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:931:3: (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:932:4: otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getVarExprAccess().getVariableKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getVarExprAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:940:4: ( (lv_variable_7_0= ruleVariable ) )
                    // InternalMyDsl.g:941:5: (lv_variable_7_0= ruleVariable )
                    {
                    // InternalMyDsl.g:941:5: (lv_variable_7_0= ruleVariable )
                    // InternalMyDsl.g:942:6: lv_variable_7_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getVarExprAccess().getVariableVariableParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_variable_7_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVarExprRule());
                    						}
                    						add(
                    							current,
                    							"variable",
                    							lv_variable_7_0,
                    							"org.xtext.example.mydsl.MyDsl.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:959:4: (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==18) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyDsl.g:960:5: otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getVarExprAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:964:5: ( (lv_variable_9_0= ruleVariable ) )
                    	    // InternalMyDsl.g:965:6: (lv_variable_9_0= ruleVariable )
                    	    {
                    	    // InternalMyDsl.g:965:6: (lv_variable_9_0= ruleVariable )
                    	    // InternalMyDsl.g:966:7: lv_variable_9_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getVarExprAccess().getVariableVariableParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_variable_9_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getVarExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variable",
                    	    								lv_variable_9_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getVarExprAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getVarExprAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarExpr"


    // $ANTLR start "entryRuleNot"
    // InternalMyDsl.g:997:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalMyDsl.g:997:44: (iv_ruleNot= ruleNot EOF )
            // InternalMyDsl.g:998:2: iv_ruleNot= ruleNot EOF
            {
             newCompositeNode(grammarAccess.getNotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNot=ruleNot();

            state._fsp--;

             current =iv_ruleNot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNot"


    // $ANTLR start "ruleNot"
    // InternalMyDsl.g:1004:1: ruleNot returns [EObject current=null] : (otherlv_0= 'Not' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}' ) ;
    public final EObject ruleNot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_variable_4_0 = null;

        EObject lv_variable_6_0 = null;

        EObject lv_expression_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1010:2: ( (otherlv_0= 'Not' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:1011:2: (otherlv_0= 'Not' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:1011:2: (otherlv_0= 'Not' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}' )
            // InternalMyDsl.g:1012:3: otherlv_0= 'Not' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getNotAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1020:3: (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==17) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1021:4: otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getNotAccess().getVariableKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getNotAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalMyDsl.g:1029:4: ( (lv_variable_4_0= ruleVariable ) )
                    // InternalMyDsl.g:1030:5: (lv_variable_4_0= ruleVariable )
                    {
                    // InternalMyDsl.g:1030:5: (lv_variable_4_0= ruleVariable )
                    // InternalMyDsl.g:1031:6: lv_variable_4_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getNotAccess().getVariableVariableParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_variable_4_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNotRule());
                    						}
                    						add(
                    							current,
                    							"variable",
                    							lv_variable_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1048:4: (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==18) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMyDsl.g:1049:5: otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) )
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getNotAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalMyDsl.g:1053:5: ( (lv_variable_6_0= ruleVariable ) )
                    	    // InternalMyDsl.g:1054:6: (lv_variable_6_0= ruleVariable )
                    	    {
                    	    // InternalMyDsl.g:1054:6: (lv_variable_6_0= ruleVariable )
                    	    // InternalMyDsl.g:1055:7: lv_variable_6_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getNotAccess().getVariableVariableParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_variable_6_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getNotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variable",
                    	    								lv_variable_6_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getNotAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_8, grammarAccess.getNotAccess().getExpressionKeyword_3());
            		
            // InternalMyDsl.g:1082:3: ( (lv_expression_9_0= ruleExpression ) )
            // InternalMyDsl.g:1083:4: (lv_expression_9_0= ruleExpression )
            {
            // InternalMyDsl.g:1083:4: (lv_expression_9_0= ruleExpression )
            // InternalMyDsl.g:1084:5: lv_expression_9_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNotAccess().getExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_expression_9_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNotRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_9_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getNotAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNot"


    // $ANTLR start "entryRuleBinaryBool"
    // InternalMyDsl.g:1109:1: entryRuleBinaryBool returns [EObject current=null] : iv_ruleBinaryBool= ruleBinaryBool EOF ;
    public final EObject entryRuleBinaryBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryBool = null;


        try {
            // InternalMyDsl.g:1109:51: (iv_ruleBinaryBool= ruleBinaryBool EOF )
            // InternalMyDsl.g:1110:2: iv_ruleBinaryBool= ruleBinaryBool EOF
            {
             newCompositeNode(grammarAccess.getBinaryBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBinaryBool=ruleBinaryBool();

            state._fsp--;

             current =iv_ruleBinaryBool; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinaryBool"


    // $ANTLR start "ruleBinaryBool"
    // InternalMyDsl.g:1116:1: ruleBinaryBool returns [EObject current=null] : (otherlv_0= 'BinaryBool' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBoolOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
    public final EObject ruleBinaryBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_operation_3_0 = null;

        EObject lv_variable_6_0 = null;

        EObject lv_variable_8_0 = null;

        EObject lv_expression_12_0 = null;

        EObject lv_expression_14_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1122:2: ( (otherlv_0= 'BinaryBool' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBoolOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalMyDsl.g:1123:2: (otherlv_0= 'BinaryBool' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBoolOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalMyDsl.g:1123:2: (otherlv_0= 'BinaryBool' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBoolOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalMyDsl.g:1124:3: otherlv_0= 'BinaryBool' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBoolOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryBoolAccess().getBinaryBoolKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getBinaryBoolAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:1132:3: (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBoolOperation ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1133:4: otherlv_2= 'operation' ( (lv_operation_3_0= ruleBoolOperation ) )
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getBinaryBoolAccess().getOperationKeyword_2_0());
                    			
                    // InternalMyDsl.g:1137:4: ( (lv_operation_3_0= ruleBoolOperation ) )
                    // InternalMyDsl.g:1138:5: (lv_operation_3_0= ruleBoolOperation )
                    {
                    // InternalMyDsl.g:1138:5: (lv_operation_3_0= ruleBoolOperation )
                    // InternalMyDsl.g:1139:6: lv_operation_3_0= ruleBoolOperation
                    {

                    						newCompositeNode(grammarAccess.getBinaryBoolAccess().getOperationBoolOperationEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_operation_3_0=ruleBoolOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryBoolRule());
                    						}
                    						set(
                    							current,
                    							"operation",
                    							lv_operation_3_0,
                    							"org.xtext.example.mydsl.MyDsl.BoolOperation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1157:3: (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1158:4: otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBinaryBoolAccess().getVariableKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getBinaryBoolAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:1166:4: ( (lv_variable_6_0= ruleVariable ) )
                    // InternalMyDsl.g:1167:5: (lv_variable_6_0= ruleVariable )
                    {
                    // InternalMyDsl.g:1167:5: (lv_variable_6_0= ruleVariable )
                    // InternalMyDsl.g:1168:6: lv_variable_6_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getBinaryBoolAccess().getVariableVariableParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_variable_6_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBinaryBoolRule());
                    						}
                    						add(
                    							current,
                    							"variable",
                    							lv_variable_6_0,
                    							"org.xtext.example.mydsl.MyDsl.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1185:4: (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==18) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMyDsl.g:1186:5: otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) )
                    	    {
                    	    otherlv_7=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getBinaryBoolAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:1190:5: ( (lv_variable_8_0= ruleVariable ) )
                    	    // InternalMyDsl.g:1191:6: (lv_variable_8_0= ruleVariable )
                    	    {
                    	    // InternalMyDsl.g:1191:6: (lv_variable_8_0= ruleVariable )
                    	    // InternalMyDsl.g:1192:7: lv_variable_8_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getBinaryBoolAccess().getVariableVariableParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_variable_8_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBinaryBoolRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variable",
                    	    								lv_variable_8_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getBinaryBoolAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getBinaryBoolAccess().getExpressionKeyword_4());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getBinaryBoolAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:1223:3: ( (lv_expression_12_0= ruleExpression ) )
            // InternalMyDsl.g:1224:4: (lv_expression_12_0= ruleExpression )
            {
            // InternalMyDsl.g:1224:4: (lv_expression_12_0= ruleExpression )
            // InternalMyDsl.g:1225:5: lv_expression_12_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBinaryBoolAccess().getExpressionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_expression_12_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBinaryBoolRule());
            					}
            					add(
            						current,
            						"expression",
            						lv_expression_12_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1242:3: (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==18) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:1243:4: otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) )
            	    {
            	    otherlv_13=(Token)match(input,18,FOLLOW_13); 

            	    				newLeafNode(otherlv_13, grammarAccess.getBinaryBoolAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:1247:4: ( (lv_expression_14_0= ruleExpression ) )
            	    // InternalMyDsl.g:1248:5: (lv_expression_14_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:1248:5: (lv_expression_14_0= ruleExpression )
            	    // InternalMyDsl.g:1249:6: lv_expression_14_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getBinaryBoolAccess().getExpressionExpressionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_expression_14_0=ruleExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getBinaryBoolRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expression",
            	    							lv_expression_14_0,
            	    							"org.xtext.example.mydsl.MyDsl.Expression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_15=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getBinaryBoolAccess().getRightCurlyBracketKeyword_8());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getBinaryBoolAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBinaryBool"


    // $ANTLR start "entryRuleSensorExpr"
    // InternalMyDsl.g:1279:1: entryRuleSensorExpr returns [EObject current=null] : iv_ruleSensorExpr= ruleSensorExpr EOF ;
    public final EObject entryRuleSensorExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorExpr = null;


        try {
            // InternalMyDsl.g:1279:51: (iv_ruleSensorExpr= ruleSensorExpr EOF )
            // InternalMyDsl.g:1280:2: iv_ruleSensorExpr= ruleSensorExpr EOF
            {
             newCompositeNode(grammarAccess.getSensorExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorExpr=ruleSensorExpr();

            state._fsp--;

             current =iv_ruleSensorExpr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorExpr"


    // $ANTLR start "ruleSensorExpr"
    // InternalMyDsl.g:1286:1: ruleSensorExpr returns [EObject current=null] : ( () otherlv_1= 'SensorExpr' otherlv_2= '{' (otherlv_3= 'sensor' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleSensorExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_variable_7_0 = null;

        EObject lv_variable_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1292:2: ( ( () otherlv_1= 'SensorExpr' otherlv_2= '{' (otherlv_3= 'sensor' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:1293:2: ( () otherlv_1= 'SensorExpr' otherlv_2= '{' (otherlv_3= 'sensor' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:1293:2: ( () otherlv_1= 'SensorExpr' otherlv_2= '{' (otherlv_3= 'sensor' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:1294:3: () otherlv_1= 'SensorExpr' otherlv_2= '{' (otherlv_3= 'sensor' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMyDsl.g:1294:3: ()
            // InternalMyDsl.g:1295:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorExprAccess().getSensorExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorExprAccess().getSensorExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1309:3: (otherlv_3= 'sensor' ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1310:4: otherlv_3= 'sensor' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorExprAccess().getSensorKeyword_3_0());
                    			
                    // InternalMyDsl.g:1314:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1315:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1315:5: ( ruleEString )
                    // InternalMyDsl.g:1316:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorExprRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSensorExprAccess().getSensorSensorCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1331:3: (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1332:4: otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensorExprAccess().getVariableKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getSensorExprAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:1340:4: ( (lv_variable_7_0= ruleVariable ) )
                    // InternalMyDsl.g:1341:5: (lv_variable_7_0= ruleVariable )
                    {
                    // InternalMyDsl.g:1341:5: (lv_variable_7_0= ruleVariable )
                    // InternalMyDsl.g:1342:6: lv_variable_7_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getSensorExprAccess().getVariableVariableParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_variable_7_0=ruleVariable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorExprRule());
                    						}
                    						add(
                    							current,
                    							"variable",
                    							lv_variable_7_0,
                    							"org.xtext.example.mydsl.MyDsl.Variable");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1359:4: (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==18) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalMyDsl.g:1360:5: otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) )
                    	    {
                    	    otherlv_8=(Token)match(input,18,FOLLOW_10); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSensorExprAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:1364:5: ( (lv_variable_9_0= ruleVariable ) )
                    	    // InternalMyDsl.g:1365:6: (lv_variable_9_0= ruleVariable )
                    	    {
                    	    // InternalMyDsl.g:1365:6: (lv_variable_9_0= ruleVariable )
                    	    // InternalMyDsl.g:1366:7: lv_variable_9_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getSensorExprAccess().getVariableVariableParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_variable_9_0=ruleVariable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSensorExprRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"variable",
                    	    								lv_variable_9_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Variable");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getSensorExprAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSensorExprAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorExpr"


    // $ANTLR start "entryRuleSensor_Impl"
    // InternalMyDsl.g:1397:1: entryRuleSensor_Impl returns [EObject current=null] : iv_ruleSensor_Impl= ruleSensor_Impl EOF ;
    public final EObject entryRuleSensor_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor_Impl = null;


        try {
            // InternalMyDsl.g:1397:52: (iv_ruleSensor_Impl= ruleSensor_Impl EOF )
            // InternalMyDsl.g:1398:2: iv_ruleSensor_Impl= ruleSensor_Impl EOF
            {
             newCompositeNode(grammarAccess.getSensor_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor_Impl=ruleSensor_Impl();

            state._fsp--;

             current =iv_ruleSensor_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor_Impl"


    // $ANTLR start "ruleSensor_Impl"
    // InternalMyDsl.g:1404:1: ruleSensor_Impl returns [EObject current=null] : ( () otherlv_1= 'Sensor' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSensor_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1410:2: ( ( () otherlv_1= 'Sensor' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:1411:2: ( () otherlv_1= 'Sensor' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:1411:2: ( () otherlv_1= 'Sensor' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:1412:3: () otherlv_1= 'Sensor' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:1412:3: ()
            // InternalMyDsl.g:1413:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensor_ImplAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSensor_ImplAccess().getSensorKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getSensor_ImplAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1427:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==13) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:1428:4: otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensor_ImplAccess().getNameKeyword_3_0());
                    			
                    // InternalMyDsl.g:1432:4: ( (lv_name_4_0= ruleString0 ) )
                    // InternalMyDsl.g:1433:5: (lv_name_4_0= ruleString0 )
                    {
                    // InternalMyDsl.g:1433:5: (lv_name_4_0= ruleString0 )
                    // InternalMyDsl.g:1434:6: lv_name_4_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getSensor_ImplAccess().getNameString0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_name_4_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensor_ImplRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.xtext.example.mydsl.MyDsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSensor_ImplAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor_Impl"


    // $ANTLR start "entryRuleSensorDistance"
    // InternalMyDsl.g:1460:1: entryRuleSensorDistance returns [EObject current=null] : iv_ruleSensorDistance= ruleSensorDistance EOF ;
    public final EObject entryRuleSensorDistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorDistance = null;


        try {
            // InternalMyDsl.g:1460:55: (iv_ruleSensorDistance= ruleSensorDistance EOF )
            // InternalMyDsl.g:1461:2: iv_ruleSensorDistance= ruleSensorDistance EOF
            {
             newCompositeNode(grammarAccess.getSensorDistanceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorDistance=ruleSensorDistance();

            state._fsp--;

             current =iv_ruleSensorDistance; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorDistance"


    // $ANTLR start "ruleSensorDistance"
    // InternalMyDsl.g:1467:1: ruleSensorDistance returns [EObject current=null] : ( () otherlv_1= 'SensorDistance' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSensorDistance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1473:2: ( ( () otherlv_1= 'SensorDistance' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:1474:2: ( () otherlv_1= 'SensorDistance' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:1474:2: ( () otherlv_1= 'SensorDistance' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:1475:3: () otherlv_1= 'SensorDistance' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:1475:3: ()
            // InternalMyDsl.g:1476:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorDistanceAccess().getSensorDistanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorDistanceAccess().getSensorDistanceKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorDistanceAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1490:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==13) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1491:4: otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorDistanceAccess().getNameKeyword_3_0());
                    			
                    // InternalMyDsl.g:1495:4: ( (lv_name_4_0= ruleString0 ) )
                    // InternalMyDsl.g:1496:5: (lv_name_4_0= ruleString0 )
                    {
                    // InternalMyDsl.g:1496:5: (lv_name_4_0= ruleString0 )
                    // InternalMyDsl.g:1497:6: lv_name_4_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getSensorDistanceAccess().getNameString0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_name_4_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorDistanceRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.xtext.example.mydsl.MyDsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSensorDistanceAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorDistance"


    // $ANTLR start "entryRuleSensorTime"
    // InternalMyDsl.g:1523:1: entryRuleSensorTime returns [EObject current=null] : iv_ruleSensorTime= ruleSensorTime EOF ;
    public final EObject entryRuleSensorTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorTime = null;


        try {
            // InternalMyDsl.g:1523:51: (iv_ruleSensorTime= ruleSensorTime EOF )
            // InternalMyDsl.g:1524:2: iv_ruleSensorTime= ruleSensorTime EOF
            {
             newCompositeNode(grammarAccess.getSensorTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensorTime=ruleSensorTime();

            state._fsp--;

             current =iv_ruleSensorTime; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensorTime"


    // $ANTLR start "ruleSensorTime"
    // InternalMyDsl.g:1530:1: ruleSensorTime returns [EObject current=null] : ( () otherlv_1= 'SensorTime' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSensorTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1536:2: ( ( () otherlv_1= 'SensorTime' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:1537:2: ( () otherlv_1= 'SensorTime' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:1537:2: ( () otherlv_1= 'SensorTime' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:1538:3: () otherlv_1= 'SensorTime' otherlv_2= '{' (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:1538:3: ()
            // InternalMyDsl.g:1539:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorTimeAccess().getSensorTimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorTimeAccess().getSensorTimeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorTimeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1553:3: (otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==13) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1554:4: otherlv_3= 'name' ( (lv_name_4_0= ruleString0 ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorTimeAccess().getNameKeyword_3_0());
                    			
                    // InternalMyDsl.g:1558:4: ( (lv_name_4_0= ruleString0 ) )
                    // InternalMyDsl.g:1559:5: (lv_name_4_0= ruleString0 )
                    {
                    // InternalMyDsl.g:1559:5: (lv_name_4_0= ruleString0 )
                    // InternalMyDsl.g:1560:6: lv_name_4_0= ruleString0
                    {

                    						newCompositeNode(grammarAccess.getSensorTimeAccess().getNameString0ParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_name_4_0=ruleString0();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSensorTimeRule());
                    						}
                    						set(
                    							current,
                    							"name",
                    							lv_name_4_0,
                    							"org.xtext.example.mydsl.MyDsl.String0");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSensorTimeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensorTime"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:1586:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:1586:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:1587:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:1593:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1599:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:1600:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:1600:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_STRING) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ID) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1601:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1609:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "ruleUnit"
    // InternalMyDsl.g:1620:1: ruleUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'MM' ) | (enumLiteral_1= 'KM' ) | (enumLiteral_2= 'CM' ) | (enumLiteral_3= 'M' ) | (enumLiteral_4= 'DM' ) | (enumLiteral_5= 'HM' ) | (enumLiteral_6= 'DAM' ) | (enumLiteral_7= 'RAD' ) ) ;
    public final Enumerator ruleUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1626:2: ( ( (enumLiteral_0= 'MM' ) | (enumLiteral_1= 'KM' ) | (enumLiteral_2= 'CM' ) | (enumLiteral_3= 'M' ) | (enumLiteral_4= 'DM' ) | (enumLiteral_5= 'HM' ) | (enumLiteral_6= 'DAM' ) | (enumLiteral_7= 'RAD' ) ) )
            // InternalMyDsl.g:1627:2: ( (enumLiteral_0= 'MM' ) | (enumLiteral_1= 'KM' ) | (enumLiteral_2= 'CM' ) | (enumLiteral_3= 'M' ) | (enumLiteral_4= 'DM' ) | (enumLiteral_5= 'HM' ) | (enumLiteral_6= 'DAM' ) | (enumLiteral_7= 'RAD' ) )
            {
            // InternalMyDsl.g:1627:2: ( (enumLiteral_0= 'MM' ) | (enumLiteral_1= 'KM' ) | (enumLiteral_2= 'CM' ) | (enumLiteral_3= 'M' ) | (enumLiteral_4= 'DM' ) | (enumLiteral_5= 'HM' ) | (enumLiteral_6= 'DAM' ) | (enumLiteral_7= 'RAD' ) )
            int alt33=8;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt33=1;
                }
                break;
            case 40:
                {
                alt33=2;
                }
                break;
            case 41:
                {
                alt33=3;
                }
                break;
            case 42:
                {
                alt33=4;
                }
                break;
            case 43:
                {
                alt33=5;
                }
                break;
            case 44:
                {
                alt33=6;
                }
                break;
            case 45:
                {
                alt33=7;
                }
                break;
            case 46:
                {
                alt33=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1628:3: (enumLiteral_0= 'MM' )
                    {
                    // InternalMyDsl.g:1628:3: (enumLiteral_0= 'MM' )
                    // InternalMyDsl.g:1629:4: enumLiteral_0= 'MM'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getMMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnitAccess().getMMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1636:3: (enumLiteral_1= 'KM' )
                    {
                    // InternalMyDsl.g:1636:3: (enumLiteral_1= 'KM' )
                    // InternalMyDsl.g:1637:4: enumLiteral_1= 'KM'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getKMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnitAccess().getKMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1644:3: (enumLiteral_2= 'CM' )
                    {
                    // InternalMyDsl.g:1644:3: (enumLiteral_2= 'CM' )
                    // InternalMyDsl.g:1645:4: enumLiteral_2= 'CM'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getCMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnitAccess().getCMEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1652:3: (enumLiteral_3= 'M' )
                    {
                    // InternalMyDsl.g:1652:3: (enumLiteral_3= 'M' )
                    // InternalMyDsl.g:1653:4: enumLiteral_3= 'M'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUnitAccess().getMEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1660:3: (enumLiteral_4= 'DM' )
                    {
                    // InternalMyDsl.g:1660:3: (enumLiteral_4= 'DM' )
                    // InternalMyDsl.g:1661:4: enumLiteral_4= 'DM'
                    {
                    enumLiteral_4=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getDMEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getUnitAccess().getDMEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1668:3: (enumLiteral_5= 'HM' )
                    {
                    // InternalMyDsl.g:1668:3: (enumLiteral_5= 'HM' )
                    // InternalMyDsl.g:1669:4: enumLiteral_5= 'HM'
                    {
                    enumLiteral_5=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getHMEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getUnitAccess().getHMEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1676:3: (enumLiteral_6= 'DAM' )
                    {
                    // InternalMyDsl.g:1676:3: (enumLiteral_6= 'DAM' )
                    // InternalMyDsl.g:1677:4: enumLiteral_6= 'DAM'
                    {
                    enumLiteral_6=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getDAMEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getUnitAccess().getDAMEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1684:3: (enumLiteral_7= 'RAD' )
                    {
                    // InternalMyDsl.g:1684:3: (enumLiteral_7= 'RAD' )
                    // InternalMyDsl.g:1685:4: enumLiteral_7= 'RAD'
                    {
                    enumLiteral_7=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getRADEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getUnitAccess().getRADEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnit"


    // $ANTLR start "ruleBoolOperation"
    // InternalMyDsl.g:1695:1: ruleBoolOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'INF' ) | (enumLiteral_1= 'SUP' ) | (enumLiteral_2= 'INF_EQ' ) | (enumLiteral_3= 'EQ' ) | (enumLiteral_4= 'SUP_EQ' ) | (enumLiteral_5= 'NEQ' ) | (enumLiteral_6= 'OR' ) | (enumLiteral_7= 'AND' ) ) ;
    public final Enumerator ruleBoolOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1701:2: ( ( (enumLiteral_0= 'INF' ) | (enumLiteral_1= 'SUP' ) | (enumLiteral_2= 'INF_EQ' ) | (enumLiteral_3= 'EQ' ) | (enumLiteral_4= 'SUP_EQ' ) | (enumLiteral_5= 'NEQ' ) | (enumLiteral_6= 'OR' ) | (enumLiteral_7= 'AND' ) ) )
            // InternalMyDsl.g:1702:2: ( (enumLiteral_0= 'INF' ) | (enumLiteral_1= 'SUP' ) | (enumLiteral_2= 'INF_EQ' ) | (enumLiteral_3= 'EQ' ) | (enumLiteral_4= 'SUP_EQ' ) | (enumLiteral_5= 'NEQ' ) | (enumLiteral_6= 'OR' ) | (enumLiteral_7= 'AND' ) )
            {
            // InternalMyDsl.g:1702:2: ( (enumLiteral_0= 'INF' ) | (enumLiteral_1= 'SUP' ) | (enumLiteral_2= 'INF_EQ' ) | (enumLiteral_3= 'EQ' ) | (enumLiteral_4= 'SUP_EQ' ) | (enumLiteral_5= 'NEQ' ) | (enumLiteral_6= 'OR' ) | (enumLiteral_7= 'AND' ) )
            int alt34=8;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt34=1;
                }
                break;
            case 48:
                {
                alt34=2;
                }
                break;
            case 49:
                {
                alt34=3;
                }
                break;
            case 50:
                {
                alt34=4;
                }
                break;
            case 51:
                {
                alt34=5;
                }
                break;
            case 52:
                {
                alt34=6;
                }
                break;
            case 53:
                {
                alt34=7;
                }
                break;
            case 54:
                {
                alt34=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1703:3: (enumLiteral_0= 'INF' )
                    {
                    // InternalMyDsl.g:1703:3: (enumLiteral_0= 'INF' )
                    // InternalMyDsl.g:1704:4: enumLiteral_0= 'INF'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperationAccess().getINFEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolOperationAccess().getINFEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1711:3: (enumLiteral_1= 'SUP' )
                    {
                    // InternalMyDsl.g:1711:3: (enumLiteral_1= 'SUP' )
                    // InternalMyDsl.g:1712:4: enumLiteral_1= 'SUP'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperationAccess().getSUPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBoolOperationAccess().getSUPEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1719:3: (enumLiteral_2= 'INF_EQ' )
                    {
                    // InternalMyDsl.g:1719:3: (enumLiteral_2= 'INF_EQ' )
                    // InternalMyDsl.g:1720:4: enumLiteral_2= 'INF_EQ'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperationAccess().getINF_EQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBoolOperationAccess().getINF_EQEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1727:3: (enumLiteral_3= 'EQ' )
                    {
                    // InternalMyDsl.g:1727:3: (enumLiteral_3= 'EQ' )
                    // InternalMyDsl.g:1728:4: enumLiteral_3= 'EQ'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperationAccess().getEQEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBoolOperationAccess().getEQEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1735:3: (enumLiteral_4= 'SUP_EQ' )
                    {
                    // InternalMyDsl.g:1735:3: (enumLiteral_4= 'SUP_EQ' )
                    // InternalMyDsl.g:1736:4: enumLiteral_4= 'SUP_EQ'
                    {
                    enumLiteral_4=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperationAccess().getSUP_EQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBoolOperationAccess().getSUP_EQEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1743:3: (enumLiteral_5= 'NEQ' )
                    {
                    // InternalMyDsl.g:1743:3: (enumLiteral_5= 'NEQ' )
                    // InternalMyDsl.g:1744:4: enumLiteral_5= 'NEQ'
                    {
                    enumLiteral_5=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperationAccess().getNEQEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBoolOperationAccess().getNEQEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1751:3: (enumLiteral_6= 'OR' )
                    {
                    // InternalMyDsl.g:1751:3: (enumLiteral_6= 'OR' )
                    // InternalMyDsl.g:1752:4: enumLiteral_6= 'OR'
                    {
                    enumLiteral_6=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperationAccess().getOREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBoolOperationAccess().getOREnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1759:3: (enumLiteral_7= 'AND' )
                    {
                    // InternalMyDsl.g:1759:3: (enumLiteral_7= 'AND' )
                    // InternalMyDsl.g:1760:4: enumLiteral_7= 'AND'
                    {
                    enumLiteral_7=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperationAccess().getANDEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_7, grammarAccess.getBoolOperationAccess().getANDEnumLiteralDeclaration_7());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolOperation"


    // $ANTLR start "ruleArithmeticOperation"
    // InternalMyDsl.g:1770:1: ruleArithmeticOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'ADD' ) | (enumLiteral_1= 'SUB' ) | (enumLiteral_2= 'DIV' ) | (enumLiteral_3= 'MULT' ) ) ;
    public final Enumerator ruleArithmeticOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1776:2: ( ( (enumLiteral_0= 'ADD' ) | (enumLiteral_1= 'SUB' ) | (enumLiteral_2= 'DIV' ) | (enumLiteral_3= 'MULT' ) ) )
            // InternalMyDsl.g:1777:2: ( (enumLiteral_0= 'ADD' ) | (enumLiteral_1= 'SUB' ) | (enumLiteral_2= 'DIV' ) | (enumLiteral_3= 'MULT' ) )
            {
            // InternalMyDsl.g:1777:2: ( (enumLiteral_0= 'ADD' ) | (enumLiteral_1= 'SUB' ) | (enumLiteral_2= 'DIV' ) | (enumLiteral_3= 'MULT' ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt35=1;
                }
                break;
            case 56:
                {
                alt35=2;
                }
                break;
            case 57:
                {
                alt35=3;
                }
                break;
            case 58:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1778:3: (enumLiteral_0= 'ADD' )
                    {
                    // InternalMyDsl.g:1778:3: (enumLiteral_0= 'ADD' )
                    // InternalMyDsl.g:1779:4: enumLiteral_0= 'ADD'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperationAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getArithmeticOperationAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1786:3: (enumLiteral_1= 'SUB' )
                    {
                    // InternalMyDsl.g:1786:3: (enumLiteral_1= 'SUB' )
                    // InternalMyDsl.g:1787:4: enumLiteral_1= 'SUB'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperationAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getArithmeticOperationAccess().getSUBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1794:3: (enumLiteral_2= 'DIV' )
                    {
                    // InternalMyDsl.g:1794:3: (enumLiteral_2= 'DIV' )
                    // InternalMyDsl.g:1795:4: enumLiteral_2= 'DIV'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperationAccess().getDIVEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getArithmeticOperationAccess().getDIVEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1802:3: (enumLiteral_3= 'MULT' )
                    {
                    // InternalMyDsl.g:1802:3: (enumLiteral_3= 'MULT' )
                    // InternalMyDsl.g:1803:4: enumLiteral_3= 'MULT'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperationAccess().getMULTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getArithmeticOperationAccess().getMULTEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArithmeticOperation"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000748110000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000002A0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0780000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00007F8000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000030028000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020028000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000080028000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x007F800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800028000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000000A000L});

}