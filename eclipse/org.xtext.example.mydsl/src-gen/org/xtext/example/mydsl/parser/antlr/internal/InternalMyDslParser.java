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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RobotProgram'", "'{'", "'declaration'", "','", "'}'", "'instruction'", "'expression'", "'Fonction'", "'parameter'", "'('", "')'", "'typeReturn'", "'Variable'", "'type'", "'Sensor'", "'SensorDistance'", "'SensorTime'", "'Type'", "'Bool'", "'Real'", "'unit'", "'Loop'", "'booleanexpr'", "'Condition'", "'if'", "'else'", "'Call'", "'parameters'", "'fonction'", "'Assignment'", "'variable'", "'return'", "'Block'", "'Forward'", "'Rotate'", "'Left'", "'Backward'", "'Right'", "'Speed'", "'Not'", "'BinaryBool'", "'operation'", "'CallExpr'", "'VarExpr'", "'variableRef'", "'Negative'", "'BinaryArithmetic'", "'SensorExpr'", "'sensor'", "'MM'", "'KM'", "'CM'", "'M'", "'DM'", "'HM'", "'DAM'", "'RAD'", "'INF'", "'SUP'", "'INF_EQ'", "'EQ'", "'SUP_EQ'", "'NEQ'", "'OR'", "'AND'", "'ADD'", "'SUB'", "'DIV'", "'MULT'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
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
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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
        	return "RobotProgram";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobotProgram"
    // InternalMyDsl.g:65:1: entryRuleRobotProgram returns [EObject current=null] : iv_ruleRobotProgram= ruleRobotProgram EOF ;
    public final EObject entryRuleRobotProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotProgram = null;


        try {
            // InternalMyDsl.g:65:53: (iv_ruleRobotProgram= ruleRobotProgram EOF )
            // InternalMyDsl.g:66:2: iv_ruleRobotProgram= ruleRobotProgram EOF
            {
             newCompositeNode(grammarAccess.getRobotProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobotProgram=ruleRobotProgram();

            state._fsp--;

             current =iv_ruleRobotProgram; 
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
    // $ANTLR end "entryRuleRobotProgram"


    // $ANTLR start "ruleRobotProgram"
    // InternalMyDsl.g:72:1: ruleRobotProgram returns [EObject current=null] : ( () otherlv_1= 'RobotProgram' otherlv_2= '{' (otherlv_3= 'declaration' otherlv_4= '{' ( (lv_declaration_5_0= ruleDeclaration ) ) (otherlv_6= ',' ( (lv_declaration_7_0= ruleDeclaration ) ) )* otherlv_8= '}' )? (otherlv_9= 'instruction' otherlv_10= '{' ( (lv_instruction_11_0= ruleInstruction ) ) (otherlv_12= ',' ( (lv_instruction_13_0= ruleInstruction ) ) )* otherlv_14= '}' )? (otherlv_15= 'expression' otherlv_16= '{' ( (lv_expression_17_0= ruleExpression ) ) (otherlv_18= ',' ( (lv_expression_19_0= ruleExpression ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) ;
    public final EObject ruleRobotProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_declaration_5_0 = null;

        EObject lv_declaration_7_0 = null;

        EObject lv_instruction_11_0 = null;

        EObject lv_instruction_13_0 = null;

        EObject lv_expression_17_0 = null;

        EObject lv_expression_19_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'RobotProgram' otherlv_2= '{' (otherlv_3= 'declaration' otherlv_4= '{' ( (lv_declaration_5_0= ruleDeclaration ) ) (otherlv_6= ',' ( (lv_declaration_7_0= ruleDeclaration ) ) )* otherlv_8= '}' )? (otherlv_9= 'instruction' otherlv_10= '{' ( (lv_instruction_11_0= ruleInstruction ) ) (otherlv_12= ',' ( (lv_instruction_13_0= ruleInstruction ) ) )* otherlv_14= '}' )? (otherlv_15= 'expression' otherlv_16= '{' ( (lv_expression_17_0= ruleExpression ) ) (otherlv_18= ',' ( (lv_expression_19_0= ruleExpression ) ) )* otherlv_20= '}' )? otherlv_21= '}' ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'RobotProgram' otherlv_2= '{' (otherlv_3= 'declaration' otherlv_4= '{' ( (lv_declaration_5_0= ruleDeclaration ) ) (otherlv_6= ',' ( (lv_declaration_7_0= ruleDeclaration ) ) )* otherlv_8= '}' )? (otherlv_9= 'instruction' otherlv_10= '{' ( (lv_instruction_11_0= ruleInstruction ) ) (otherlv_12= ',' ( (lv_instruction_13_0= ruleInstruction ) ) )* otherlv_14= '}' )? (otherlv_15= 'expression' otherlv_16= '{' ( (lv_expression_17_0= ruleExpression ) ) (otherlv_18= ',' ( (lv_expression_19_0= ruleExpression ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'RobotProgram' otherlv_2= '{' (otherlv_3= 'declaration' otherlv_4= '{' ( (lv_declaration_5_0= ruleDeclaration ) ) (otherlv_6= ',' ( (lv_declaration_7_0= ruleDeclaration ) ) )* otherlv_8= '}' )? (otherlv_9= 'instruction' otherlv_10= '{' ( (lv_instruction_11_0= ruleInstruction ) ) (otherlv_12= ',' ( (lv_instruction_13_0= ruleInstruction ) ) )* otherlv_14= '}' )? (otherlv_15= 'expression' otherlv_16= '{' ( (lv_expression_17_0= ruleExpression ) ) (otherlv_18= ',' ( (lv_expression_19_0= ruleExpression ) ) )* otherlv_20= '}' )? otherlv_21= '}' )
            // InternalMyDsl.g:80:3: () otherlv_1= 'RobotProgram' otherlv_2= '{' (otherlv_3= 'declaration' otherlv_4= '{' ( (lv_declaration_5_0= ruleDeclaration ) ) (otherlv_6= ',' ( (lv_declaration_7_0= ruleDeclaration ) ) )* otherlv_8= '}' )? (otherlv_9= 'instruction' otherlv_10= '{' ( (lv_instruction_11_0= ruleInstruction ) ) (otherlv_12= ',' ( (lv_instruction_13_0= ruleInstruction ) ) )* otherlv_14= '}' )? (otherlv_15= 'expression' otherlv_16= '{' ( (lv_expression_17_0= ruleExpression ) ) (otherlv_18= ',' ( (lv_expression_19_0= ruleExpression ) ) )* otherlv_20= '}' )? otherlv_21= '}'
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotProgramAccess().getRobotProgramAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotProgramAccess().getRobotProgramKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRobotProgramAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:95:3: (otherlv_3= 'declaration' otherlv_4= '{' ( (lv_declaration_5_0= ruleDeclaration ) ) (otherlv_6= ',' ( (lv_declaration_7_0= ruleDeclaration ) ) )* otherlv_8= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:96:4: otherlv_3= 'declaration' otherlv_4= '{' ( (lv_declaration_5_0= ruleDeclaration ) ) (otherlv_6= ',' ( (lv_declaration_7_0= ruleDeclaration ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getRobotProgramAccess().getDeclarationKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRobotProgramAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:104:4: ( (lv_declaration_5_0= ruleDeclaration ) )
                    // InternalMyDsl.g:105:5: (lv_declaration_5_0= ruleDeclaration )
                    {
                    // InternalMyDsl.g:105:5: (lv_declaration_5_0= ruleDeclaration )
                    // InternalMyDsl.g:106:6: lv_declaration_5_0= ruleDeclaration
                    {

                    						newCompositeNode(grammarAccess.getRobotProgramAccess().getDeclarationDeclarationParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_declaration_5_0=ruleDeclaration();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotProgramRule());
                    						}
                    						add(
                    							current,
                    							"declaration",
                    							lv_declaration_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Declaration");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:123:4: (otherlv_6= ',' ( (lv_declaration_7_0= ruleDeclaration ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:124:5: otherlv_6= ',' ( (lv_declaration_7_0= ruleDeclaration ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_5); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getRobotProgramAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:128:5: ( (lv_declaration_7_0= ruleDeclaration ) )
                    	    // InternalMyDsl.g:129:6: (lv_declaration_7_0= ruleDeclaration )
                    	    {
                    	    // InternalMyDsl.g:129:6: (lv_declaration_7_0= ruleDeclaration )
                    	    // InternalMyDsl.g:130:7: lv_declaration_7_0= ruleDeclaration
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotProgramAccess().getDeclarationDeclarationParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_declaration_7_0=ruleDeclaration();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"declaration",
                    	    								lv_declaration_7_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Declaration");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    				newLeafNode(otherlv_8, grammarAccess.getRobotProgramAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:153:3: (otherlv_9= 'instruction' otherlv_10= '{' ( (lv_instruction_11_0= ruleInstruction ) ) (otherlv_12= ',' ( (lv_instruction_13_0= ruleInstruction ) ) )* otherlv_14= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:154:4: otherlv_9= 'instruction' otherlv_10= '{' ( (lv_instruction_11_0= ruleInstruction ) ) (otherlv_12= ',' ( (lv_instruction_13_0= ruleInstruction ) ) )* otherlv_14= '}'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getRobotProgramAccess().getInstructionKeyword_4_0());
                    			
                    otherlv_10=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_10, grammarAccess.getRobotProgramAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:162:4: ( (lv_instruction_11_0= ruleInstruction ) )
                    // InternalMyDsl.g:163:5: (lv_instruction_11_0= ruleInstruction )
                    {
                    // InternalMyDsl.g:163:5: (lv_instruction_11_0= ruleInstruction )
                    // InternalMyDsl.g:164:6: lv_instruction_11_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getRobotProgramAccess().getInstructionInstructionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_instruction_11_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotProgramRule());
                    						}
                    						add(
                    							current,
                    							"instruction",
                    							lv_instruction_11_0,
                    							"org.xtext.example.mydsl.MyDsl.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:181:4: (otherlv_12= ',' ( (lv_instruction_13_0= ruleInstruction ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:182:5: otherlv_12= ',' ( (lv_instruction_13_0= ruleInstruction ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getRobotProgramAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:186:5: ( (lv_instruction_13_0= ruleInstruction ) )
                    	    // InternalMyDsl.g:187:6: (lv_instruction_13_0= ruleInstruction )
                    	    {
                    	    // InternalMyDsl.g:187:6: (lv_instruction_13_0= ruleInstruction )
                    	    // InternalMyDsl.g:188:7: lv_instruction_13_0= ruleInstruction
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotProgramAccess().getInstructionInstructionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_instruction_13_0=ruleInstruction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"instruction",
                    	    								lv_instruction_13_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Instruction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getRobotProgramAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:211:3: (otherlv_15= 'expression' otherlv_16= '{' ( (lv_expression_17_0= ruleExpression ) ) (otherlv_18= ',' ( (lv_expression_19_0= ruleExpression ) ) )* otherlv_20= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:212:4: otherlv_15= 'expression' otherlv_16= '{' ( (lv_expression_17_0= ruleExpression ) ) (otherlv_18= ',' ( (lv_expression_19_0= ruleExpression ) ) )* otherlv_20= '}'
                    {
                    otherlv_15=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getRobotProgramAccess().getExpressionKeyword_5_0());
                    			
                    otherlv_16=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_16, grammarAccess.getRobotProgramAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:220:4: ( (lv_expression_17_0= ruleExpression ) )
                    // InternalMyDsl.g:221:5: (lv_expression_17_0= ruleExpression )
                    {
                    // InternalMyDsl.g:221:5: (lv_expression_17_0= ruleExpression )
                    // InternalMyDsl.g:222:6: lv_expression_17_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRobotProgramAccess().getExpressionExpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_expression_17_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotProgramRule());
                    						}
                    						add(
                    							current,
                    							"expression",
                    							lv_expression_17_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:239:4: (otherlv_18= ',' ( (lv_expression_19_0= ruleExpression ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMyDsl.g:240:5: otherlv_18= ',' ( (lv_expression_19_0= ruleExpression ) )
                    	    {
                    	    otherlv_18=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_18, grammarAccess.getRobotProgramAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:244:5: ( (lv_expression_19_0= ruleExpression ) )
                    	    // InternalMyDsl.g:245:6: (lv_expression_19_0= ruleExpression )
                    	    {
                    	    // InternalMyDsl.g:245:6: (lv_expression_19_0= ruleExpression )
                    	    // InternalMyDsl.g:246:7: lv_expression_19_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotProgramAccess().getExpressionExpressionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_expression_19_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotProgramRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"expression",
                    	    								lv_expression_19_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_20, grammarAccess.getRobotProgramAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_21=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getRobotProgramAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRobotProgram"


    // $ANTLR start "entryRuleDeclaration"
    // InternalMyDsl.g:277:1: entryRuleDeclaration returns [EObject current=null] : iv_ruleDeclaration= ruleDeclaration EOF ;
    public final EObject entryRuleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaration = null;


        try {
            // InternalMyDsl.g:277:52: (iv_ruleDeclaration= ruleDeclaration EOF )
            // InternalMyDsl.g:278:2: iv_ruleDeclaration= ruleDeclaration EOF
            {
             newCompositeNode(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaration=ruleDeclaration();

            state._fsp--;

             current =iv_ruleDeclaration; 
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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalMyDsl.g:284:1: ruleDeclaration returns [EObject current=null] : (this_Fonction_0= ruleFonction | this_Variable_1= ruleVariable | this_Sensor_Impl_2= ruleSensor_Impl | this_SensorDistance_3= ruleSensorDistance | this_SensorTime_4= ruleSensorTime ) ;
    public final EObject ruleDeclaration() throws RecognitionException {
        EObject current = null;

        EObject this_Fonction_0 = null;

        EObject this_Variable_1 = null;

        EObject this_Sensor_Impl_2 = null;

        EObject this_SensorDistance_3 = null;

        EObject this_SensorTime_4 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:290:2: ( (this_Fonction_0= ruleFonction | this_Variable_1= ruleVariable | this_Sensor_Impl_2= ruleSensor_Impl | this_SensorDistance_3= ruleSensorDistance | this_SensorTime_4= ruleSensorTime ) )
            // InternalMyDsl.g:291:2: (this_Fonction_0= ruleFonction | this_Variable_1= ruleVariable | this_Sensor_Impl_2= ruleSensor_Impl | this_SensorDistance_3= ruleSensorDistance | this_SensorTime_4= ruleSensorTime )
            {
            // InternalMyDsl.g:291:2: (this_Fonction_0= ruleFonction | this_Variable_1= ruleVariable | this_Sensor_Impl_2= ruleSensor_Impl | this_SensorDistance_3= ruleSensorDistance | this_SensorTime_4= ruleSensorTime )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 23:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            case 26:
                {
                alt7=4;
                }
                break;
            case 27:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:292:3: this_Fonction_0= ruleFonction
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getFonctionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Fonction_0=ruleFonction();

                    state._fsp--;


                    			current = this_Fonction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:301:3: this_Variable_1= ruleVariable
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getVariableParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Variable_1=ruleVariable();

                    state._fsp--;


                    			current = this_Variable_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:310:3: this_Sensor_Impl_2= ruleSensor_Impl
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getSensor_ImplParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Sensor_Impl_2=ruleSensor_Impl();

                    state._fsp--;


                    			current = this_Sensor_Impl_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:319:3: this_SensorDistance_3= ruleSensorDistance
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getSensorDistanceParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SensorDistance_3=ruleSensorDistance();

                    state._fsp--;


                    			current = this_SensorDistance_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:328:3: this_SensorTime_4= ruleSensorTime
                    {

                    			newCompositeNode(grammarAccess.getDeclarationAccess().getSensorTimeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SensorTime_4=ruleSensorTime();

                    state._fsp--;


                    			current = this_SensorTime_4;
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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleInstruction"
    // InternalMyDsl.g:340:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalMyDsl.g:340:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalMyDsl.g:341:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalMyDsl.g:347:1: ruleInstruction returns [EObject current=null] : (this_Loop_0= ruleLoop | this_Condition_1= ruleCondition | this_Call_2= ruleCall | this_Assignment_3= ruleAssignment | this_return_4= rulereturn | this_Block_5= ruleBlock | this_Forward_6= ruleForward | this_Rotate_7= ruleRotate | this_Left_8= ruleLeft | this_Backward_9= ruleBackward | this_Right_10= ruleRight | this_Speed_11= ruleSpeed ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Loop_0 = null;

        EObject this_Condition_1 = null;

        EObject this_Call_2 = null;

        EObject this_Assignment_3 = null;

        EObject this_return_4 = null;

        EObject this_Block_5 = null;

        EObject this_Forward_6 = null;

        EObject this_Rotate_7 = null;

        EObject this_Left_8 = null;

        EObject this_Backward_9 = null;

        EObject this_Right_10 = null;

        EObject this_Speed_11 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:353:2: ( (this_Loop_0= ruleLoop | this_Condition_1= ruleCondition | this_Call_2= ruleCall | this_Assignment_3= ruleAssignment | this_return_4= rulereturn | this_Block_5= ruleBlock | this_Forward_6= ruleForward | this_Rotate_7= ruleRotate | this_Left_8= ruleLeft | this_Backward_9= ruleBackward | this_Right_10= ruleRight | this_Speed_11= ruleSpeed ) )
            // InternalMyDsl.g:354:2: (this_Loop_0= ruleLoop | this_Condition_1= ruleCondition | this_Call_2= ruleCall | this_Assignment_3= ruleAssignment | this_return_4= rulereturn | this_Block_5= ruleBlock | this_Forward_6= ruleForward | this_Rotate_7= ruleRotate | this_Left_8= ruleLeft | this_Backward_9= ruleBackward | this_Right_10= ruleRight | this_Speed_11= ruleSpeed )
            {
            // InternalMyDsl.g:354:2: (this_Loop_0= ruleLoop | this_Condition_1= ruleCondition | this_Call_2= ruleCall | this_Assignment_3= ruleAssignment | this_return_4= rulereturn | this_Block_5= ruleBlock | this_Forward_6= ruleForward | this_Rotate_7= ruleRotate | this_Left_8= ruleLeft | this_Backward_9= ruleBackward | this_Right_10= ruleRight | this_Speed_11= ruleSpeed )
            int alt8=12;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 37:
                {
                alt8=3;
                }
                break;
            case 40:
                {
                alt8=4;
                }
                break;
            case 42:
                {
                alt8=5;
                }
                break;
            case 43:
                {
                alt8=6;
                }
                break;
            case 44:
                {
                alt8=7;
                }
                break;
            case 45:
                {
                alt8=8;
                }
                break;
            case 46:
                {
                alt8=9;
                }
                break;
            case 47:
                {
                alt8=10;
                }
                break;
            case 48:
                {
                alt8=11;
                }
                break;
            case 49:
                {
                alt8=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:355:3: this_Loop_0= ruleLoop
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getLoopParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Loop_0=ruleLoop();

                    state._fsp--;


                    			current = this_Loop_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:364:3: this_Condition_1= ruleCondition
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getConditionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Condition_1=ruleCondition();

                    state._fsp--;


                    			current = this_Condition_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:373:3: this_Call_2= ruleCall
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getCallParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Call_2=ruleCall();

                    state._fsp--;


                    			current = this_Call_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:382:3: this_Assignment_3= ruleAssignment
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getAssignmentParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Assignment_3=ruleAssignment();

                    state._fsp--;


                    			current = this_Assignment_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:391:3: this_return_4= rulereturn
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getReturnParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_return_4=rulereturn();

                    state._fsp--;


                    			current = this_return_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:400:3: this_Block_5= ruleBlock
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getBlockParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Block_5=ruleBlock();

                    state._fsp--;


                    			current = this_Block_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:409:3: this_Forward_6= ruleForward
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getForwardParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Forward_6=ruleForward();

                    state._fsp--;


                    			current = this_Forward_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:418:3: this_Rotate_7= ruleRotate
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getRotateParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Rotate_7=ruleRotate();

                    state._fsp--;


                    			current = this_Rotate_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:427:3: this_Left_8= ruleLeft
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getLeftParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_Left_8=ruleLeft();

                    state._fsp--;


                    			current = this_Left_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:436:3: this_Backward_9= ruleBackward
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getBackwardParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_Backward_9=ruleBackward();

                    state._fsp--;


                    			current = this_Backward_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:445:3: this_Right_10= ruleRight
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getRightParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_Right_10=ruleRight();

                    state._fsp--;


                    			current = this_Right_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:454:3: this_Speed_11= ruleSpeed
                    {

                    			newCompositeNode(grammarAccess.getInstructionAccess().getSpeedParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Speed_11=ruleSpeed();

                    state._fsp--;


                    			current = this_Speed_11;
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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:466:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:466:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:467:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:473:1: ruleExpression returns [EObject current=null] : (this_CallExpr_0= ruleCallExpr | this_VarExpr_1= ruleVarExpr | this_Negative_2= ruleNegative | this_BinaryArithmetic_3= ruleBinaryArithmetic | this_Not_4= ruleNot | this_BinaryBool_5= ruleBinaryBool | this_SensorExpr_6= ruleSensorExpr ) ;
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
            // InternalMyDsl.g:479:2: ( (this_CallExpr_0= ruleCallExpr | this_VarExpr_1= ruleVarExpr | this_Negative_2= ruleNegative | this_BinaryArithmetic_3= ruleBinaryArithmetic | this_Not_4= ruleNot | this_BinaryBool_5= ruleBinaryBool | this_SensorExpr_6= ruleSensorExpr ) )
            // InternalMyDsl.g:480:2: (this_CallExpr_0= ruleCallExpr | this_VarExpr_1= ruleVarExpr | this_Negative_2= ruleNegative | this_BinaryArithmetic_3= ruleBinaryArithmetic | this_Not_4= ruleNot | this_BinaryBool_5= ruleBinaryBool | this_SensorExpr_6= ruleSensorExpr )
            {
            // InternalMyDsl.g:480:2: (this_CallExpr_0= ruleCallExpr | this_VarExpr_1= ruleVarExpr | this_Negative_2= ruleNegative | this_BinaryArithmetic_3= ruleBinaryArithmetic | this_Not_4= ruleNot | this_BinaryBool_5= ruleBinaryBool | this_SensorExpr_6= ruleSensorExpr )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt9=1;
                }
                break;
            case 54:
                {
                alt9=2;
                }
                break;
            case 56:
                {
                alt9=3;
                }
                break;
            case 57:
                {
                alt9=4;
                }
                break;
            case 50:
                {
                alt9=5;
                }
                break;
            case 51:
                {
                alt9=6;
                }
                break;
            case 58:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:481:3: this_CallExpr_0= ruleCallExpr
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
                    // InternalMyDsl.g:490:3: this_VarExpr_1= ruleVarExpr
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
                    // InternalMyDsl.g:499:3: this_Negative_2= ruleNegative
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
                    // InternalMyDsl.g:508:3: this_BinaryArithmetic_3= ruleBinaryArithmetic
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
                    // InternalMyDsl.g:517:3: this_Not_4= ruleNot
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
                    // InternalMyDsl.g:526:3: this_BinaryBool_5= ruleBinaryBool
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
                    // InternalMyDsl.g:535:3: this_SensorExpr_6= ruleSensorExpr
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


    // $ANTLR start "entryRuleBooleanExpr"
    // InternalMyDsl.g:547:1: entryRuleBooleanExpr returns [EObject current=null] : iv_ruleBooleanExpr= ruleBooleanExpr EOF ;
    public final EObject entryRuleBooleanExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpr = null;


        try {
            // InternalMyDsl.g:547:52: (iv_ruleBooleanExpr= ruleBooleanExpr EOF )
            // InternalMyDsl.g:548:2: iv_ruleBooleanExpr= ruleBooleanExpr EOF
            {
             newCompositeNode(grammarAccess.getBooleanExprRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanExpr=ruleBooleanExpr();

            state._fsp--;

             current =iv_ruleBooleanExpr; 
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
    // $ANTLR end "entryRuleBooleanExpr"


    // $ANTLR start "ruleBooleanExpr"
    // InternalMyDsl.g:554:1: ruleBooleanExpr returns [EObject current=null] : (this_Not_0= ruleNot | this_BinaryBool_1= ruleBinaryBool ) ;
    public final EObject ruleBooleanExpr() throws RecognitionException {
        EObject current = null;

        EObject this_Not_0 = null;

        EObject this_BinaryBool_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:560:2: ( (this_Not_0= ruleNot | this_BinaryBool_1= ruleBinaryBool ) )
            // InternalMyDsl.g:561:2: (this_Not_0= ruleNot | this_BinaryBool_1= ruleBinaryBool )
            {
            // InternalMyDsl.g:561:2: (this_Not_0= ruleNot | this_BinaryBool_1= ruleBinaryBool )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==50) ) {
                alt10=1;
            }
            else if ( (LA10_0==51) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:562:3: this_Not_0= ruleNot
                    {

                    			newCompositeNode(grammarAccess.getBooleanExprAccess().getNotParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Not_0=ruleNot();

                    state._fsp--;


                    			current = this_Not_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:571:3: this_BinaryBool_1= ruleBinaryBool
                    {

                    			newCompositeNode(grammarAccess.getBooleanExprAccess().getBinaryBoolParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_BinaryBool_1=ruleBinaryBool();

                    state._fsp--;


                    			current = this_BinaryBool_1;
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
    // $ANTLR end "ruleBooleanExpr"


    // $ANTLR start "entryRuleFonction"
    // InternalMyDsl.g:583:1: entryRuleFonction returns [EObject current=null] : iv_ruleFonction= ruleFonction EOF ;
    public final EObject entryRuleFonction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFonction = null;


        try {
            // InternalMyDsl.g:583:49: (iv_ruleFonction= ruleFonction EOF )
            // InternalMyDsl.g:584:2: iv_ruleFonction= ruleFonction EOF
            {
             newCompositeNode(grammarAccess.getFonctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFonction=ruleFonction();

            state._fsp--;

             current =iv_ruleFonction; 
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
    // $ANTLR end "entryRuleFonction"


    // $ANTLR start "ruleFonction"
    // InternalMyDsl.g:590:1: ruleFonction returns [EObject current=null] : ( () otherlv_1= 'Fonction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameter' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'typeReturn' ( ( ruleEString ) ) )? otherlv_12= '}' ) ;
    public final EObject ruleFonction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:596:2: ( ( () otherlv_1= 'Fonction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameter' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'typeReturn' ( ( ruleEString ) ) )? otherlv_12= '}' ) )
            // InternalMyDsl.g:597:2: ( () otherlv_1= 'Fonction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameter' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'typeReturn' ( ( ruleEString ) ) )? otherlv_12= '}' )
            {
            // InternalMyDsl.g:597:2: ( () otherlv_1= 'Fonction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameter' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'typeReturn' ( ( ruleEString ) ) )? otherlv_12= '}' )
            // InternalMyDsl.g:598:3: () otherlv_1= 'Fonction' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'parameter' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )? (otherlv_10= 'typeReturn' ( ( ruleEString ) ) )? otherlv_12= '}'
            {
            // InternalMyDsl.g:598:3: ()
            // InternalMyDsl.g:599:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFonctionAccess().getFonctionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getFonctionAccess().getFonctionKeyword_1());
            		
            // InternalMyDsl.g:609:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:610:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:610:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:611:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFonctionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFonctionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getFonctionAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:632:3: (otherlv_4= 'parameter' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:633:4: otherlv_4= 'parameter' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getFonctionAccess().getParameterKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getFonctionAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalMyDsl.g:641:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:642:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:642:5: ( ruleEString )
                    // InternalMyDsl.g:643:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFonctionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFonctionAccess().getParameterParameterCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:657:4: (otherlv_7= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:658:5: otherlv_7= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getFonctionAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:662:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:663:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:663:6: ( ruleEString )
                    	    // InternalMyDsl.g:664:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getFonctionRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getFonctionAccess().getParameterParameterCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getFonctionAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:684:3: (otherlv_10= 'typeReturn' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:685:4: otherlv_10= 'typeReturn' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getFonctionAccess().getTypeReturnKeyword_5_0());
                    			
                    // InternalMyDsl.g:689:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:690:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:690:5: ( ruleEString )
                    // InternalMyDsl.g:691:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFonctionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getFonctionAccess().getTypeReturnTypeCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getFonctionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleFonction"


    // $ANTLR start "entryRuleVariable"
    // InternalMyDsl.g:714:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // InternalMyDsl.g:714:49: (iv_ruleVariable= ruleVariable EOF )
            // InternalMyDsl.g:715:2: iv_ruleVariable= ruleVariable EOF
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
    // InternalMyDsl.g:721:1: ruleVariable returns [EObject current=null] : ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:727:2: ( ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:728:2: ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:728:2: ( () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:729:3: () otherlv_1= 'Variable' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( ( ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:729:3: ()
            // InternalMyDsl.g:730:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVariableAccess().getVariableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getVariableKeyword_1());
            		
            // InternalMyDsl.g:740:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:741:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:741:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:742:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getVariableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getVariableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:763:3: (otherlv_4= 'type' ( ( ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:764:4: otherlv_4= 'type' ( ( ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableAccess().getTypeKeyword_4_0());
                    			
                    // InternalMyDsl.g:768:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:769:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:769:5: ( ruleEString )
                    // InternalMyDsl.g:770:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVariableAccess().getTypeTypeCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getVariableAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleSensor_Impl"
    // InternalMyDsl.g:793:1: entryRuleSensor_Impl returns [EObject current=null] : iv_ruleSensor_Impl= ruleSensor_Impl EOF ;
    public final EObject entryRuleSensor_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor_Impl = null;


        try {
            // InternalMyDsl.g:793:52: (iv_ruleSensor_Impl= ruleSensor_Impl EOF )
            // InternalMyDsl.g:794:2: iv_ruleSensor_Impl= ruleSensor_Impl EOF
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
    // InternalMyDsl.g:800:1: ruleSensor_Impl returns [EObject current=null] : ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleSensor_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:806:2: ( ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:807:2: ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:807:2: ( () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:808:3: () otherlv_1= 'Sensor' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:808:3: ()
            // InternalMyDsl.g:809:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensor_ImplAccess().getSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getSensor_ImplAccess().getSensorKeyword_1());
            		
            // InternalMyDsl.g:819:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:820:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:820:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:821:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensor_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensor_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // InternalMyDsl.g:842:1: entryRuleSensorDistance returns [EObject current=null] : iv_ruleSensorDistance= ruleSensorDistance EOF ;
    public final EObject entryRuleSensorDistance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorDistance = null;


        try {
            // InternalMyDsl.g:842:55: (iv_ruleSensorDistance= ruleSensorDistance EOF )
            // InternalMyDsl.g:843:2: iv_ruleSensorDistance= ruleSensorDistance EOF
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
    // InternalMyDsl.g:849:1: ruleSensorDistance returns [EObject current=null] : ( () otherlv_1= 'SensorDistance' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleSensorDistance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:855:2: ( ( () otherlv_1= 'SensorDistance' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:856:2: ( () otherlv_1= 'SensorDistance' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:856:2: ( () otherlv_1= 'SensorDistance' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:857:3: () otherlv_1= 'SensorDistance' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:857:3: ()
            // InternalMyDsl.g:858:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorDistanceAccess().getSensorDistanceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorDistanceAccess().getSensorDistanceKeyword_1());
            		
            // InternalMyDsl.g:868:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:869:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:869:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:870:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorDistanceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorDistanceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // InternalMyDsl.g:891:1: entryRuleSensorTime returns [EObject current=null] : iv_ruleSensorTime= ruleSensorTime EOF ;
    public final EObject entryRuleSensorTime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorTime = null;


        try {
            // InternalMyDsl.g:891:51: (iv_ruleSensorTime= ruleSensorTime EOF )
            // InternalMyDsl.g:892:2: iv_ruleSensorTime= ruleSensorTime EOF
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
    // InternalMyDsl.g:898:1: ruleSensorTime returns [EObject current=null] : ( () otherlv_1= 'SensorTime' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleSensorTime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:904:2: ( ( () otherlv_1= 'SensorTime' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:905:2: ( () otherlv_1= 'SensorTime' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:905:2: ( () otherlv_1= 'SensorTime' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:906:3: () otherlv_1= 'SensorTime' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:906:3: ()
            // InternalMyDsl.g:907:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorTimeAccess().getSensorTimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorTimeAccess().getSensorTimeKeyword_1());
            		
            // InternalMyDsl.g:917:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:918:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:918:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:919:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSensorTimeAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSensorTimeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // InternalMyDsl.g:940:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:940:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:941:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:947:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:953:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:954:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:954:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:955:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:963:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleType_Impl"
    // InternalMyDsl.g:974:1: entryRuleType_Impl returns [EObject current=null] : iv_ruleType_Impl= ruleType_Impl EOF ;
    public final EObject entryRuleType_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType_Impl = null;


        try {
            // InternalMyDsl.g:974:50: (iv_ruleType_Impl= ruleType_Impl EOF )
            // InternalMyDsl.g:975:2: iv_ruleType_Impl= ruleType_Impl EOF
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
    // InternalMyDsl.g:981:1: ruleType_Impl returns [EObject current=null] : ( () otherlv_1= 'Type' ) ;
    public final EObject ruleType_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:987:2: ( ( () otherlv_1= 'Type' ) )
            // InternalMyDsl.g:988:2: ( () otherlv_1= 'Type' )
            {
            // InternalMyDsl.g:988:2: ( () otherlv_1= 'Type' )
            // InternalMyDsl.g:989:3: () otherlv_1= 'Type'
            {
            // InternalMyDsl.g:989:3: ()
            // InternalMyDsl.g:990:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getType_ImplAccess().getTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); 

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


    // $ANTLR start "entryRuleBool"
    // InternalMyDsl.g:1004:1: entryRuleBool returns [EObject current=null] : iv_ruleBool= ruleBool EOF ;
    public final EObject entryRuleBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBool = null;


        try {
            // InternalMyDsl.g:1004:45: (iv_ruleBool= ruleBool EOF )
            // InternalMyDsl.g:1005:2: iv_ruleBool= ruleBool EOF
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
    // InternalMyDsl.g:1011:1: ruleBool returns [EObject current=null] : ( () otherlv_1= 'Bool' ) ;
    public final EObject ruleBool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1017:2: ( ( () otherlv_1= 'Bool' ) )
            // InternalMyDsl.g:1018:2: ( () otherlv_1= 'Bool' )
            {
            // InternalMyDsl.g:1018:2: ( () otherlv_1= 'Bool' )
            // InternalMyDsl.g:1019:3: () otherlv_1= 'Bool'
            {
            // InternalMyDsl.g:1019:3: ()
            // InternalMyDsl.g:1020:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolAccess().getBoolAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_2); 

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
    // InternalMyDsl.g:1034:1: entryRuleReal returns [EObject current=null] : iv_ruleReal= ruleReal EOF ;
    public final EObject entryRuleReal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReal = null;


        try {
            // InternalMyDsl.g:1034:45: (iv_ruleReal= ruleReal EOF )
            // InternalMyDsl.g:1035:2: iv_ruleReal= ruleReal EOF
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
    // InternalMyDsl.g:1041:1: ruleReal returns [EObject current=null] : ( () otherlv_1= 'Real' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleUnit ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleReal() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_unit_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1047:2: ( ( () otherlv_1= 'Real' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleUnit ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:1048:2: ( () otherlv_1= 'Real' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleUnit ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:1048:2: ( () otherlv_1= 'Real' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleUnit ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:1049:3: () otherlv_1= 'Real' otherlv_2= '{' (otherlv_3= 'unit' ( (lv_unit_4_0= ruleUnit ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:1049:3: ()
            // InternalMyDsl.g:1050:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRealAccess().getRealAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRealAccess().getRealKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getRealAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1064:3: (otherlv_3= 'unit' ( (lv_unit_4_0= ruleUnit ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1065:4: otherlv_3= 'unit' ( (lv_unit_4_0= ruleUnit ) )
                    {
                    otherlv_3=(Token)match(input,31,FOLLOW_19); 

                    				newLeafNode(otherlv_3, grammarAccess.getRealAccess().getUnitKeyword_3_0());
                    			
                    // InternalMyDsl.g:1069:4: ( (lv_unit_4_0= ruleUnit ) )
                    // InternalMyDsl.g:1070:5: (lv_unit_4_0= ruleUnit )
                    {
                    // InternalMyDsl.g:1070:5: (lv_unit_4_0= ruleUnit )
                    // InternalMyDsl.g:1071:6: lv_unit_4_0= ruleUnit
                    {

                    						newCompositeNode(grammarAccess.getRealAccess().getUnitUnitEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
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


    // $ANTLR start "entryRuleLoop"
    // InternalMyDsl.g:1097:1: entryRuleLoop returns [EObject current=null] : iv_ruleLoop= ruleLoop EOF ;
    public final EObject entryRuleLoop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoop = null;


        try {
            // InternalMyDsl.g:1097:45: (iv_ruleLoop= ruleLoop EOF )
            // InternalMyDsl.g:1098:2: iv_ruleLoop= ruleLoop EOF
            {
             newCompositeNode(grammarAccess.getLoopRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoop=ruleLoop();

            state._fsp--;

             current =iv_ruleLoop; 
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
    // $ANTLR end "entryRuleLoop"


    // $ANTLR start "ruleLoop"
    // InternalMyDsl.g:1104:1: ruleLoop returns [EObject current=null] : ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'booleanexpr' ( (lv_booleanexpr_4_0= ruleBooleanExpr ) ) )? (otherlv_5= 'instruction' otherlv_6= '{' ( (lv_instruction_7_0= ruleInstruction ) ) (otherlv_8= ',' ( (lv_instruction_9_0= ruleInstruction ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleLoop() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_booleanexpr_4_0 = null;

        EObject lv_instruction_7_0 = null;

        EObject lv_instruction_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1110:2: ( ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'booleanexpr' ( (lv_booleanexpr_4_0= ruleBooleanExpr ) ) )? (otherlv_5= 'instruction' otherlv_6= '{' ( (lv_instruction_7_0= ruleInstruction ) ) (otherlv_8= ',' ( (lv_instruction_9_0= ruleInstruction ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:1111:2: ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'booleanexpr' ( (lv_booleanexpr_4_0= ruleBooleanExpr ) ) )? (otherlv_5= 'instruction' otherlv_6= '{' ( (lv_instruction_7_0= ruleInstruction ) ) (otherlv_8= ',' ( (lv_instruction_9_0= ruleInstruction ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:1111:2: ( () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'booleanexpr' ( (lv_booleanexpr_4_0= ruleBooleanExpr ) ) )? (otherlv_5= 'instruction' otherlv_6= '{' ( (lv_instruction_7_0= ruleInstruction ) ) (otherlv_8= ',' ( (lv_instruction_9_0= ruleInstruction ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:1112:3: () otherlv_1= 'Loop' otherlv_2= '{' (otherlv_3= 'booleanexpr' ( (lv_booleanexpr_4_0= ruleBooleanExpr ) ) )? (otherlv_5= 'instruction' otherlv_6= '{' ( (lv_instruction_7_0= ruleInstruction ) ) (otherlv_8= ',' ( (lv_instruction_9_0= ruleInstruction ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMyDsl.g:1112:3: ()
            // InternalMyDsl.g:1113:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoopAccess().getLoopAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLoopAccess().getLoopKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1127:3: (otherlv_3= 'booleanexpr' ( (lv_booleanexpr_4_0= ruleBooleanExpr ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1128:4: otherlv_3= 'booleanexpr' ( (lv_booleanexpr_4_0= ruleBooleanExpr ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getLoopAccess().getBooleanexprKeyword_3_0());
                    			
                    // InternalMyDsl.g:1132:4: ( (lv_booleanexpr_4_0= ruleBooleanExpr ) )
                    // InternalMyDsl.g:1133:5: (lv_booleanexpr_4_0= ruleBooleanExpr )
                    {
                    // InternalMyDsl.g:1133:5: (lv_booleanexpr_4_0= ruleBooleanExpr )
                    // InternalMyDsl.g:1134:6: lv_booleanexpr_4_0= ruleBooleanExpr
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getBooleanexprBooleanExprParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_booleanexpr_4_0=ruleBooleanExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						set(
                    							current,
                    							"booleanexpr",
                    							lv_booleanexpr_4_0,
                    							"org.xtext.example.mydsl.MyDsl.BooleanExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1152:3: (otherlv_5= 'instruction' otherlv_6= '{' ( (lv_instruction_7_0= ruleInstruction ) ) (otherlv_8= ',' ( (lv_instruction_9_0= ruleInstruction ) ) )* otherlv_10= '}' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==16) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:1153:4: otherlv_5= 'instruction' otherlv_6= '{' ( (lv_instruction_7_0= ruleInstruction ) ) (otherlv_8= ',' ( (lv_instruction_9_0= ruleInstruction ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getLoopAccess().getInstructionKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getLoopAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:1161:4: ( (lv_instruction_7_0= ruleInstruction ) )
                    // InternalMyDsl.g:1162:5: (lv_instruction_7_0= ruleInstruction )
                    {
                    // InternalMyDsl.g:1162:5: (lv_instruction_7_0= ruleInstruction )
                    // InternalMyDsl.g:1163:6: lv_instruction_7_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getLoopAccess().getInstructionInstructionParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_instruction_7_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoopRule());
                    						}
                    						add(
                    							current,
                    							"instruction",
                    							lv_instruction_7_0,
                    							"org.xtext.example.mydsl.MyDsl.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1180:4: (otherlv_8= ',' ( (lv_instruction_9_0= ruleInstruction ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMyDsl.g:1181:5: otherlv_8= ',' ( (lv_instruction_9_0= ruleInstruction ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getLoopAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:1185:5: ( (lv_instruction_9_0= ruleInstruction ) )
                    	    // InternalMyDsl.g:1186:6: (lv_instruction_9_0= ruleInstruction )
                    	    {
                    	    // InternalMyDsl.g:1186:6: (lv_instruction_9_0= ruleInstruction )
                    	    // InternalMyDsl.g:1187:7: lv_instruction_9_0= ruleInstruction
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoopAccess().getInstructionInstructionParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_instruction_9_0=ruleInstruction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoopRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"instruction",
                    	    								lv_instruction_9_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Instruction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_10, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLoopAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLoop"


    // $ANTLR start "entryRuleCondition"
    // InternalMyDsl.g:1218:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMyDsl.g:1218:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMyDsl.g:1219:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMyDsl.g:1225:1: ruleCondition returns [EObject current=null] : ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'booleanexpr' ( (lv_booleanexpr_4_0= ruleBooleanExpr ) ) )? (otherlv_5= 'if' ( (lv_if_6_0= ruleInstruction ) ) )? (otherlv_7= 'else' ( (lv_else_8_0= ruleInstruction ) ) )? otherlv_9= '}' ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_booleanexpr_4_0 = null;

        EObject lv_if_6_0 = null;

        EObject lv_else_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1231:2: ( ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'booleanexpr' ( (lv_booleanexpr_4_0= ruleBooleanExpr ) ) )? (otherlv_5= 'if' ( (lv_if_6_0= ruleInstruction ) ) )? (otherlv_7= 'else' ( (lv_else_8_0= ruleInstruction ) ) )? otherlv_9= '}' ) )
            // InternalMyDsl.g:1232:2: ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'booleanexpr' ( (lv_booleanexpr_4_0= ruleBooleanExpr ) ) )? (otherlv_5= 'if' ( (lv_if_6_0= ruleInstruction ) ) )? (otherlv_7= 'else' ( (lv_else_8_0= ruleInstruction ) ) )? otherlv_9= '}' )
            {
            // InternalMyDsl.g:1232:2: ( () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'booleanexpr' ( (lv_booleanexpr_4_0= ruleBooleanExpr ) ) )? (otherlv_5= 'if' ( (lv_if_6_0= ruleInstruction ) ) )? (otherlv_7= 'else' ( (lv_else_8_0= ruleInstruction ) ) )? otherlv_9= '}' )
            // InternalMyDsl.g:1233:3: () otherlv_1= 'Condition' otherlv_2= '{' (otherlv_3= 'booleanexpr' ( (lv_booleanexpr_4_0= ruleBooleanExpr ) ) )? (otherlv_5= 'if' ( (lv_if_6_0= ruleInstruction ) ) )? (otherlv_7= 'else' ( (lv_else_8_0= ruleInstruction ) ) )? otherlv_9= '}'
            {
            // InternalMyDsl.g:1233:3: ()
            // InternalMyDsl.g:1234:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getConditionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getConditionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1248:3: (otherlv_3= 'booleanexpr' ( (lv_booleanexpr_4_0= ruleBooleanExpr ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1249:4: otherlv_3= 'booleanexpr' ( (lv_booleanexpr_4_0= ruleBooleanExpr ) )
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_21); 

                    				newLeafNode(otherlv_3, grammarAccess.getConditionAccess().getBooleanexprKeyword_3_0());
                    			
                    // InternalMyDsl.g:1253:4: ( (lv_booleanexpr_4_0= ruleBooleanExpr ) )
                    // InternalMyDsl.g:1254:5: (lv_booleanexpr_4_0= ruleBooleanExpr )
                    {
                    // InternalMyDsl.g:1254:5: (lv_booleanexpr_4_0= ruleBooleanExpr )
                    // InternalMyDsl.g:1255:6: lv_booleanexpr_4_0= ruleBooleanExpr
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getBooleanexprBooleanExprParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_booleanexpr_4_0=ruleBooleanExpr();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"booleanexpr",
                    							lv_booleanexpr_4_0,
                    							"org.xtext.example.mydsl.MyDsl.BooleanExpr");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1273:3: (otherlv_5= 'if' ( (lv_if_6_0= ruleInstruction ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1274:4: otherlv_5= 'if' ( (lv_if_6_0= ruleInstruction ) )
                    {
                    otherlv_5=(Token)match(input,35,FOLLOW_8); 

                    				newLeafNode(otherlv_5, grammarAccess.getConditionAccess().getIfKeyword_4_0());
                    			
                    // InternalMyDsl.g:1278:4: ( (lv_if_6_0= ruleInstruction ) )
                    // InternalMyDsl.g:1279:5: (lv_if_6_0= ruleInstruction )
                    {
                    // InternalMyDsl.g:1279:5: (lv_if_6_0= ruleInstruction )
                    // InternalMyDsl.g:1280:6: lv_if_6_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getIfInstructionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_if_6_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"if",
                    							lv_if_6_0,
                    							"org.xtext.example.mydsl.MyDsl.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1298:3: (otherlv_7= 'else' ( (lv_else_8_0= ruleInstruction ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMyDsl.g:1299:4: otherlv_7= 'else' ( (lv_else_8_0= ruleInstruction ) )
                    {
                    otherlv_7=(Token)match(input,36,FOLLOW_8); 

                    				newLeafNode(otherlv_7, grammarAccess.getConditionAccess().getElseKeyword_5_0());
                    			
                    // InternalMyDsl.g:1303:4: ( (lv_else_8_0= ruleInstruction ) )
                    // InternalMyDsl.g:1304:5: (lv_else_8_0= ruleInstruction )
                    {
                    // InternalMyDsl.g:1304:5: (lv_else_8_0= ruleInstruction )
                    // InternalMyDsl.g:1305:6: lv_else_8_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getElseInstructionParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_else_8_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"else",
                    							lv_else_8_0,
                    							"org.xtext.example.mydsl.MyDsl.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getConditionAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleCall"
    // InternalMyDsl.g:1331:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // InternalMyDsl.g:1331:45: (iv_ruleCall= ruleCall EOF )
            // InternalMyDsl.g:1332:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // InternalMyDsl.g:1338:1: ruleCall returns [EObject current=null] : ( () otherlv_1= 'Call' otherlv_2= '{' (otherlv_3= 'parameters' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'fonction' ( ( ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1344:2: ( ( () otherlv_1= 'Call' otherlv_2= '{' (otherlv_3= 'parameters' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'fonction' ( ( ruleEString ) ) )? otherlv_11= '}' ) )
            // InternalMyDsl.g:1345:2: ( () otherlv_1= 'Call' otherlv_2= '{' (otherlv_3= 'parameters' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'fonction' ( ( ruleEString ) ) )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:1345:2: ( () otherlv_1= 'Call' otherlv_2= '{' (otherlv_3= 'parameters' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'fonction' ( ( ruleEString ) ) )? otherlv_11= '}' )
            // InternalMyDsl.g:1346:3: () otherlv_1= 'Call' otherlv_2= '{' (otherlv_3= 'parameters' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )? (otherlv_9= 'fonction' ( ( ruleEString ) ) )? otherlv_11= '}'
            {
            // InternalMyDsl.g:1346:3: ()
            // InternalMyDsl.g:1347:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCallAccess().getCallAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCallAccess().getCallKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_26); 

            			newLeafNode(otherlv_2, grammarAccess.getCallAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1361:3: (otherlv_3= 'parameters' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:1362:4: otherlv_3= 'parameters' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getCallAccess().getParametersKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getCallAccess().getLeftParenthesisKeyword_3_1());
                    			
                    // InternalMyDsl.g:1370:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1371:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1371:5: ( ruleEString )
                    // InternalMyDsl.g:1372:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCallAccess().getParametersExpressionCrossReference_3_2_0());
                    					
                    pushFollow(FOLLOW_15);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1386:4: (otherlv_6= ',' ( ( ruleEString ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==14) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMyDsl.g:1387:5: otherlv_6= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getCallAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:1391:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:1392:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:1392:6: ( ruleEString )
                    	    // InternalMyDsl.g:1393:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getCallRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getCallAccess().getParametersExpressionCrossReference_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,21,FOLLOW_27); 

                    				newLeafNode(otherlv_8, grammarAccess.getCallAccess().getRightParenthesisKeyword_3_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:1413:3: (otherlv_9= 'fonction' ( ( ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMyDsl.g:1414:4: otherlv_9= 'fonction' ( ( ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,39,FOLLOW_12); 

                    				newLeafNode(otherlv_9, grammarAccess.getCallAccess().getFonctionKeyword_4_0());
                    			
                    // InternalMyDsl.g:1418:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1419:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1419:5: ( ruleEString )
                    // InternalMyDsl.g:1420:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCallRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCallAccess().getFonctionFonctionCrossReference_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCallAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleAssignment"
    // InternalMyDsl.g:1443:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalMyDsl.g:1443:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalMyDsl.g:1444:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
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
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalMyDsl.g:1450:1: ruleAssignment returns [EObject current=null] : ( () otherlv_1= 'Assignment' otherlv_2= '{' (otherlv_3= 'variable' ( ( ruleEString ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleExpression ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_expression_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1456:2: ( ( () otherlv_1= 'Assignment' otherlv_2= '{' (otherlv_3= 'variable' ( ( ruleEString ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleExpression ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:1457:2: ( () otherlv_1= 'Assignment' otherlv_2= '{' (otherlv_3= 'variable' ( ( ruleEString ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleExpression ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:1457:2: ( () otherlv_1= 'Assignment' otherlv_2= '{' (otherlv_3= 'variable' ( ( ruleEString ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleExpression ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:1458:3: () otherlv_1= 'Assignment' otherlv_2= '{' (otherlv_3= 'variable' ( ( ruleEString ) ) )? (otherlv_5= 'expression' ( (lv_expression_6_0= ruleExpression ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:1458:3: ()
            // InternalMyDsl.g:1459:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAssignmentAccess().getAssignmentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getAssignmentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1473:3: (otherlv_3= 'variable' ( ( ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:1474:4: otherlv_3= 'variable' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getVariableKeyword_3_0());
                    			
                    // InternalMyDsl.g:1478:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1479:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1479:5: ( ruleEString )
                    // InternalMyDsl.g:1480:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignmentRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getAssignmentAccess().getVariableVariableCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:1495:3: (otherlv_5= 'expression' ( (lv_expression_6_0= ruleExpression ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==17) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:1496:4: otherlv_5= 'expression' ( (lv_expression_6_0= ruleExpression ) )
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getAssignmentAccess().getExpressionKeyword_4_0());
                    			
                    // InternalMyDsl.g:1500:4: ( (lv_expression_6_0= ruleExpression ) )
                    // InternalMyDsl.g:1501:5: (lv_expression_6_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1501:5: (lv_expression_6_0= ruleExpression )
                    // InternalMyDsl.g:1502:6: lv_expression_6_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getAssignmentAccess().getExpressionExpressionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_expression_6_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_6_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAssignmentAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRulereturn"
    // InternalMyDsl.g:1528:1: entryRulereturn returns [EObject current=null] : iv_rulereturn= rulereturn EOF ;
    public final EObject entryRulereturn() throws RecognitionException {
        EObject current = null;

        EObject iv_rulereturn = null;


        try {
            // InternalMyDsl.g:1528:47: (iv_rulereturn= rulereturn EOF )
            // InternalMyDsl.g:1529:2: iv_rulereturn= rulereturn EOF
            {
             newCompositeNode(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_1);
            iv_rulereturn=rulereturn();

            state._fsp--;

             current =iv_rulereturn; 
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
    // $ANTLR end "entryRulereturn"


    // $ANTLR start "rulereturn"
    // InternalMyDsl.g:1535:1: rulereturn returns [EObject current=null] : ( () otherlv_1= 'return' otherlv_2= '{' (otherlv_3= 'expression' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject rulereturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1541:2: ( ( () otherlv_1= 'return' otherlv_2= '{' (otherlv_3= 'expression' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:1542:2: ( () otherlv_1= 'return' otherlv_2= '{' (otherlv_3= 'expression' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:1542:2: ( () otherlv_1= 'return' otherlv_2= '{' (otherlv_3= 'expression' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:1543:3: () otherlv_1= 'return' otherlv_2= '{' (otherlv_3= 'expression' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:1543:3: ()
            // InternalMyDsl.g:1544:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReturnAccess().getReturnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getReturnKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1558:3: (otherlv_3= 'expression' ( ( ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:1559:4: otherlv_3= 'expression' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getReturnAccess().getExpressionKeyword_3_0());
                    			
                    // InternalMyDsl.g:1563:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:1564:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:1564:5: ( ruleEString )
                    // InternalMyDsl.g:1565:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReturnRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReturnAccess().getExpressionExpressionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getReturnAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulereturn"


    // $ANTLR start "entryRuleBlock"
    // InternalMyDsl.g:1588:1: entryRuleBlock returns [EObject current=null] : iv_ruleBlock= ruleBlock EOF ;
    public final EObject entryRuleBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlock = null;


        try {
            // InternalMyDsl.g:1588:46: (iv_ruleBlock= ruleBlock EOF )
            // InternalMyDsl.g:1589:2: iv_ruleBlock= ruleBlock EOF
            {
             newCompositeNode(grammarAccess.getBlockRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlock=ruleBlock();

            state._fsp--;

             current =iv_ruleBlock; 
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
    // $ANTLR end "entryRuleBlock"


    // $ANTLR start "ruleBlock"
    // InternalMyDsl.g:1595:1: ruleBlock returns [EObject current=null] : ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) ;
    public final EObject ruleBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_instruction_5_0 = null;

        EObject lv_instruction_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1601:2: ( ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' ) )
            // InternalMyDsl.g:1602:2: ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            {
            // InternalMyDsl.g:1602:2: ( () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}' )
            // InternalMyDsl.g:1603:3: () otherlv_1= 'Block' otherlv_2= '{' (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )? otherlv_9= '}'
            {
            // InternalMyDsl.g:1603:3: ()
            // InternalMyDsl.g:1604:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlockAccess().getBlockAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBlockAccess().getBlockKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1618:3: (otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==16) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMyDsl.g:1619:4: otherlv_3= 'instruction' otherlv_4= '{' ( (lv_instruction_5_0= ruleInstruction ) ) (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )* otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getInstructionKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_4, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:1627:4: ( (lv_instruction_5_0= ruleInstruction ) )
                    // InternalMyDsl.g:1628:5: (lv_instruction_5_0= ruleInstruction )
                    {
                    // InternalMyDsl.g:1628:5: (lv_instruction_5_0= ruleInstruction )
                    // InternalMyDsl.g:1629:6: lv_instruction_5_0= ruleInstruction
                    {

                    						newCompositeNode(grammarAccess.getBlockAccess().getInstructionInstructionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_instruction_5_0=ruleInstruction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBlockRule());
                    						}
                    						add(
                    							current,
                    							"instruction",
                    							lv_instruction_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Instruction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:1646:4: (otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==14) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMyDsl.g:1647:5: otherlv_6= ',' ( (lv_instruction_7_0= ruleInstruction ) )
                    	    {
                    	    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getBlockAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:1651:5: ( (lv_instruction_7_0= ruleInstruction ) )
                    	    // InternalMyDsl.g:1652:6: (lv_instruction_7_0= ruleInstruction )
                    	    {
                    	    // InternalMyDsl.g:1652:6: (lv_instruction_7_0= ruleInstruction )
                    	    // InternalMyDsl.g:1653:7: lv_instruction_7_0= ruleInstruction
                    	    {

                    	    							newCompositeNode(grammarAccess.getBlockAccess().getInstructionInstructionParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_instruction_7_0=ruleInstruction();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getBlockRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"instruction",
                    	    								lv_instruction_7_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Instruction");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_8=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBlock"


    // $ANTLR start "entryRuleForward"
    // InternalMyDsl.g:1684:1: entryRuleForward returns [EObject current=null] : iv_ruleForward= ruleForward EOF ;
    public final EObject entryRuleForward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForward = null;


        try {
            // InternalMyDsl.g:1684:48: (iv_ruleForward= ruleForward EOF )
            // InternalMyDsl.g:1685:2: iv_ruleForward= ruleForward EOF
            {
             newCompositeNode(grammarAccess.getForwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForward=ruleForward();

            state._fsp--;

             current =iv_ruleForward; 
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
    // $ANTLR end "entryRuleForward"


    // $ANTLR start "ruleForward"
    // InternalMyDsl.g:1691:1: ruleForward returns [EObject current=null] : ( () otherlv_1= 'Forward' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleForward() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1697:2: ( ( () otherlv_1= 'Forward' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:1698:2: ( () otherlv_1= 'Forward' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:1698:2: ( () otherlv_1= 'Forward' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:1699:3: () otherlv_1= 'Forward' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:1699:3: ()
            // InternalMyDsl.g:1700:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getForwardAccess().getForwardAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getForwardAccess().getForwardKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getForwardAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1714:3: (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMyDsl.g:1715:4: otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getForwardAccess().getParametersKeyword_3_0());
                    			
                    // InternalMyDsl.g:1719:4: ( (lv_parameters_4_0= ruleExpression ) )
                    // InternalMyDsl.g:1720:5: (lv_parameters_4_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1720:5: (lv_parameters_4_0= ruleExpression )
                    // InternalMyDsl.g:1721:6: lv_parameters_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getForwardAccess().getParametersExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parameters_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getForwardRule());
                    						}
                    						set(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getForwardAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleForward"


    // $ANTLR start "entryRuleRotate"
    // InternalMyDsl.g:1747:1: entryRuleRotate returns [EObject current=null] : iv_ruleRotate= ruleRotate EOF ;
    public final EObject entryRuleRotate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRotate = null;


        try {
            // InternalMyDsl.g:1747:47: (iv_ruleRotate= ruleRotate EOF )
            // InternalMyDsl.g:1748:2: iv_ruleRotate= ruleRotate EOF
            {
             newCompositeNode(grammarAccess.getRotateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRotate=ruleRotate();

            state._fsp--;

             current =iv_ruleRotate; 
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
    // $ANTLR end "entryRuleRotate"


    // $ANTLR start "ruleRotate"
    // InternalMyDsl.g:1754:1: ruleRotate returns [EObject current=null] : ( () otherlv_1= 'Rotate' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleRotate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1760:2: ( ( () otherlv_1= 'Rotate' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:1761:2: ( () otherlv_1= 'Rotate' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:1761:2: ( () otherlv_1= 'Rotate' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:1762:3: () otherlv_1= 'Rotate' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:1762:3: ()
            // InternalMyDsl.g:1763:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRotateAccess().getRotateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRotateAccess().getRotateKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getRotateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1777:3: (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMyDsl.g:1778:4: otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getRotateAccess().getParametersKeyword_3_0());
                    			
                    // InternalMyDsl.g:1782:4: ( (lv_parameters_4_0= ruleExpression ) )
                    // InternalMyDsl.g:1783:5: (lv_parameters_4_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1783:5: (lv_parameters_4_0= ruleExpression )
                    // InternalMyDsl.g:1784:6: lv_parameters_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRotateAccess().getParametersExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parameters_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRotateRule());
                    						}
                    						set(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRotateAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRotate"


    // $ANTLR start "entryRuleLeft"
    // InternalMyDsl.g:1810:1: entryRuleLeft returns [EObject current=null] : iv_ruleLeft= ruleLeft EOF ;
    public final EObject entryRuleLeft() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeft = null;


        try {
            // InternalMyDsl.g:1810:45: (iv_ruleLeft= ruleLeft EOF )
            // InternalMyDsl.g:1811:2: iv_ruleLeft= ruleLeft EOF
            {
             newCompositeNode(grammarAccess.getLeftRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeft=ruleLeft();

            state._fsp--;

             current =iv_ruleLeft; 
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
    // $ANTLR end "entryRuleLeft"


    // $ANTLR start "ruleLeft"
    // InternalMyDsl.g:1817:1: ruleLeft returns [EObject current=null] : ( () otherlv_1= 'Left' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleLeft() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1823:2: ( ( () otherlv_1= 'Left' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:1824:2: ( () otherlv_1= 'Left' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:1824:2: ( () otherlv_1= 'Left' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:1825:3: () otherlv_1= 'Left' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:1825:3: ()
            // InternalMyDsl.g:1826:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeftAccess().getLeftAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftAccess().getLeftKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getLeftAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1840:3: (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==38) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMyDsl.g:1841:4: otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getLeftAccess().getParametersKeyword_3_0());
                    			
                    // InternalMyDsl.g:1845:4: ( (lv_parameters_4_0= ruleExpression ) )
                    // InternalMyDsl.g:1846:5: (lv_parameters_4_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1846:5: (lv_parameters_4_0= ruleExpression )
                    // InternalMyDsl.g:1847:6: lv_parameters_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getLeftAccess().getParametersExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parameters_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLeftRule());
                    						}
                    						set(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getLeftAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLeft"


    // $ANTLR start "entryRuleBackward"
    // InternalMyDsl.g:1873:1: entryRuleBackward returns [EObject current=null] : iv_ruleBackward= ruleBackward EOF ;
    public final EObject entryRuleBackward() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackward = null;


        try {
            // InternalMyDsl.g:1873:49: (iv_ruleBackward= ruleBackward EOF )
            // InternalMyDsl.g:1874:2: iv_ruleBackward= ruleBackward EOF
            {
             newCompositeNode(grammarAccess.getBackwardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackward=ruleBackward();

            state._fsp--;

             current =iv_ruleBackward; 
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
    // $ANTLR end "entryRuleBackward"


    // $ANTLR start "ruleBackward"
    // InternalMyDsl.g:1880:1: ruleBackward returns [EObject current=null] : ( () otherlv_1= 'Backward' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleBackward() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1886:2: ( ( () otherlv_1= 'Backward' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:1887:2: ( () otherlv_1= 'Backward' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:1887:2: ( () otherlv_1= 'Backward' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:1888:3: () otherlv_1= 'Backward' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:1888:3: ()
            // InternalMyDsl.g:1889:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBackwardAccess().getBackwardAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getBackwardAccess().getBackwardKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getBackwardAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1903:3: (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==38) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMyDsl.g:1904:4: otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getBackwardAccess().getParametersKeyword_3_0());
                    			
                    // InternalMyDsl.g:1908:4: ( (lv_parameters_4_0= ruleExpression ) )
                    // InternalMyDsl.g:1909:5: (lv_parameters_4_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1909:5: (lv_parameters_4_0= ruleExpression )
                    // InternalMyDsl.g:1910:6: lv_parameters_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getBackwardAccess().getParametersExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parameters_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBackwardRule());
                    						}
                    						set(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBackwardAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleBackward"


    // $ANTLR start "entryRuleRight"
    // InternalMyDsl.g:1936:1: entryRuleRight returns [EObject current=null] : iv_ruleRight= ruleRight EOF ;
    public final EObject entryRuleRight() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRight = null;


        try {
            // InternalMyDsl.g:1936:46: (iv_ruleRight= ruleRight EOF )
            // InternalMyDsl.g:1937:2: iv_ruleRight= ruleRight EOF
            {
             newCompositeNode(grammarAccess.getRightRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRight=ruleRight();

            state._fsp--;

             current =iv_ruleRight; 
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
    // $ANTLR end "entryRuleRight"


    // $ANTLR start "ruleRight"
    // InternalMyDsl.g:1943:1: ruleRight returns [EObject current=null] : ( () otherlv_1= 'Right' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleRight() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1949:2: ( ( () otherlv_1= 'Right' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:1950:2: ( () otherlv_1= 'Right' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:1950:2: ( () otherlv_1= 'Right' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:1951:3: () otherlv_1= 'Right' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:1951:3: ()
            // InternalMyDsl.g:1952:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRightAccess().getRightAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRightAccess().getRightKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getRightAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:1966:3: (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMyDsl.g:1967:4: otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getRightAccess().getParametersKeyword_3_0());
                    			
                    // InternalMyDsl.g:1971:4: ( (lv_parameters_4_0= ruleExpression ) )
                    // InternalMyDsl.g:1972:5: (lv_parameters_4_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1972:5: (lv_parameters_4_0= ruleExpression )
                    // InternalMyDsl.g:1973:6: lv_parameters_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getRightAccess().getParametersExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parameters_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRightRule());
                    						}
                    						set(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRightAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleRight"


    // $ANTLR start "entryRuleSpeed"
    // InternalMyDsl.g:1999:1: entryRuleSpeed returns [EObject current=null] : iv_ruleSpeed= ruleSpeed EOF ;
    public final EObject entryRuleSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeed = null;


        try {
            // InternalMyDsl.g:1999:46: (iv_ruleSpeed= ruleSpeed EOF )
            // InternalMyDsl.g:2000:2: iv_ruleSpeed= ruleSpeed EOF
            {
             newCompositeNode(grammarAccess.getSpeedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpeed=ruleSpeed();

            state._fsp--;

             current =iv_ruleSpeed; 
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
    // $ANTLR end "entryRuleSpeed"


    // $ANTLR start "ruleSpeed"
    // InternalMyDsl.g:2006:1: ruleSpeed returns [EObject current=null] : ( () otherlv_1= 'Speed' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleSpeed() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:2012:2: ( ( () otherlv_1= 'Speed' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:2013:2: ( () otherlv_1= 'Speed' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:2013:2: ( () otherlv_1= 'Speed' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:2014:3: () otherlv_1= 'Speed' otherlv_2= '{' (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:2014:3: ()
            // InternalMyDsl.g:2015:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSpeedAccess().getSpeedAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSpeedAccess().getSpeedKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_29); 

            			newLeafNode(otherlv_2, grammarAccess.getSpeedAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2029:3: (otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==38) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMyDsl.g:2030:4: otherlv_3= 'parameters' ( (lv_parameters_4_0= ruleExpression ) )
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_10); 

                    				newLeafNode(otherlv_3, grammarAccess.getSpeedAccess().getParametersKeyword_3_0());
                    			
                    // InternalMyDsl.g:2034:4: ( (lv_parameters_4_0= ruleExpression ) )
                    // InternalMyDsl.g:2035:5: (lv_parameters_4_0= ruleExpression )
                    {
                    // InternalMyDsl.g:2035:5: (lv_parameters_4_0= ruleExpression )
                    // InternalMyDsl.g:2036:6: lv_parameters_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getSpeedAccess().getParametersExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_parameters_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSpeedRule());
                    						}
                    						set(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSpeedAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleSpeed"


    // $ANTLR start "entryRuleNot"
    // InternalMyDsl.g:2062:1: entryRuleNot returns [EObject current=null] : iv_ruleNot= ruleNot EOF ;
    public final EObject entryRuleNot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNot = null;


        try {
            // InternalMyDsl.g:2062:44: (iv_ruleNot= ruleNot EOF )
            // InternalMyDsl.g:2063:2: iv_ruleNot= ruleNot EOF
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
    // InternalMyDsl.g:2069:1: ruleNot returns [EObject current=null] : (otherlv_0= 'Not' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}' ) ;
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
            // InternalMyDsl.g:2075:2: ( (otherlv_0= 'Not' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:2076:2: (otherlv_0= 'Not' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:2076:2: (otherlv_0= 'Not' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}' )
            // InternalMyDsl.g:2077:3: otherlv_0= 'Not' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNotAccess().getNotKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getNotAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:2085:3: (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==41) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMyDsl.g:2086:4: otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getNotAccess().getVariableKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_3, grammarAccess.getNotAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalMyDsl.g:2094:4: ( (lv_variable_4_0= ruleVariable ) )
                    // InternalMyDsl.g:2095:5: (lv_variable_4_0= ruleVariable )
                    {
                    // InternalMyDsl.g:2095:5: (lv_variable_4_0= ruleVariable )
                    // InternalMyDsl.g:2096:6: lv_variable_4_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getNotAccess().getVariableVariableParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalMyDsl.g:2113:4: (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==14) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // InternalMyDsl.g:2114:5: otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getNotAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalMyDsl.g:2118:5: ( (lv_variable_6_0= ruleVariable ) )
                    	    // InternalMyDsl.g:2119:6: (lv_variable_6_0= ruleVariable )
                    	    {
                    	    // InternalMyDsl.g:2119:6: (lv_variable_6_0= ruleVariable )
                    	    // InternalMyDsl.g:2120:7: lv_variable_6_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getNotAccess().getVariableVariableParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop37;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_32); 

                    				newLeafNode(otherlv_7, grammarAccess.getNotAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getNotAccess().getExpressionKeyword_3());
            		
            // InternalMyDsl.g:2147:3: ( (lv_expression_9_0= ruleExpression ) )
            // InternalMyDsl.g:2148:4: (lv_expression_9_0= ruleExpression )
            {
            // InternalMyDsl.g:2148:4: (lv_expression_9_0= ruleExpression )
            // InternalMyDsl.g:2149:5: lv_expression_9_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNotAccess().getExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:2174:1: entryRuleBinaryBool returns [EObject current=null] : iv_ruleBinaryBool= ruleBinaryBool EOF ;
    public final EObject entryRuleBinaryBool() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryBool = null;


        try {
            // InternalMyDsl.g:2174:51: (iv_ruleBinaryBool= ruleBinaryBool EOF )
            // InternalMyDsl.g:2175:2: iv_ruleBinaryBool= ruleBinaryBool EOF
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
    // InternalMyDsl.g:2181:1: ruleBinaryBool returns [EObject current=null] : (otherlv_0= 'BinaryBool' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBoolOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
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
            // InternalMyDsl.g:2187:2: ( (otherlv_0= 'BinaryBool' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBoolOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalMyDsl.g:2188:2: (otherlv_0= 'BinaryBool' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBoolOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalMyDsl.g:2188:2: (otherlv_0= 'BinaryBool' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBoolOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalMyDsl.g:2189:3: otherlv_0= 'BinaryBool' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBoolOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryBoolAccess().getBinaryBoolKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getBinaryBoolAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:2197:3: (otherlv_2= 'operation' ( (lv_operation_3_0= ruleBoolOperation ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==52) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMyDsl.g:2198:4: otherlv_2= 'operation' ( (lv_operation_3_0= ruleBoolOperation ) )
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getBinaryBoolAccess().getOperationKeyword_2_0());
                    			
                    // InternalMyDsl.g:2202:4: ( (lv_operation_3_0= ruleBoolOperation ) )
                    // InternalMyDsl.g:2203:5: (lv_operation_3_0= ruleBoolOperation )
                    {
                    // InternalMyDsl.g:2203:5: (lv_operation_3_0= ruleBoolOperation )
                    // InternalMyDsl.g:2204:6: lv_operation_3_0= ruleBoolOperation
                    {

                    						newCompositeNode(grammarAccess.getBinaryBoolAccess().getOperationBoolOperationEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

            // InternalMyDsl.g:2222:3: (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==41) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMyDsl.g:2223:4: otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBinaryBoolAccess().getVariableKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_5, grammarAccess.getBinaryBoolAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:2231:4: ( (lv_variable_6_0= ruleVariable ) )
                    // InternalMyDsl.g:2232:5: (lv_variable_6_0= ruleVariable )
                    {
                    // InternalMyDsl.g:2232:5: (lv_variable_6_0= ruleVariable )
                    // InternalMyDsl.g:2233:6: lv_variable_6_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getBinaryBoolAccess().getVariableVariableParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalMyDsl.g:2250:4: (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )*
                    loop40:
                    do {
                        int alt40=2;
                        int LA40_0 = input.LA(1);

                        if ( (LA40_0==14) ) {
                            alt40=1;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // InternalMyDsl.g:2251:5: otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getBinaryBoolAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:2255:5: ( (lv_variable_8_0= ruleVariable ) )
                    	    // InternalMyDsl.g:2256:6: (lv_variable_8_0= ruleVariable )
                    	    {
                    	    // InternalMyDsl.g:2256:6: (lv_variable_8_0= ruleVariable )
                    	    // InternalMyDsl.g:2257:7: lv_variable_8_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getBinaryBoolAccess().getVariableVariableParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop40;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_32); 

                    				newLeafNode(otherlv_9, grammarAccess.getBinaryBoolAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getBinaryBoolAccess().getExpressionKeyword_4());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getBinaryBoolAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:2288:3: ( (lv_expression_12_0= ruleExpression ) )
            // InternalMyDsl.g:2289:4: (lv_expression_12_0= ruleExpression )
            {
            // InternalMyDsl.g:2289:4: (lv_expression_12_0= ruleExpression )
            // InternalMyDsl.g:2290:5: lv_expression_12_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBinaryBoolAccess().getExpressionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalMyDsl.g:2307:3: (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==14) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMyDsl.g:2308:4: otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) )
            	    {
            	    otherlv_13=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_13, grammarAccess.getBinaryBoolAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:2312:4: ( (lv_expression_14_0= ruleExpression ) )
            	    // InternalMyDsl.g:2313:5: (lv_expression_14_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:2313:5: (lv_expression_14_0= ruleExpression )
            	    // InternalMyDsl.g:2314:6: lv_expression_14_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getBinaryBoolAccess().getExpressionExpressionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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
            	    break loop42;
                }
            } while (true);

            otherlv_15=(Token)match(input,15,FOLLOW_11); 

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


    // $ANTLR start "entryRuleCallExpr"
    // InternalMyDsl.g:2344:1: entryRuleCallExpr returns [EObject current=null] : iv_ruleCallExpr= ruleCallExpr EOF ;
    public final EObject entryRuleCallExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCallExpr = null;


        try {
            // InternalMyDsl.g:2344:49: (iv_ruleCallExpr= ruleCallExpr EOF )
            // InternalMyDsl.g:2345:2: iv_ruleCallExpr= ruleCallExpr EOF
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
    // InternalMyDsl.g:2351:1: ruleCallExpr returns [EObject current=null] : ( () otherlv_1= 'CallExpr' otherlv_2= '{' (otherlv_3= 'fonction' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleExpression ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
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
            // InternalMyDsl.g:2357:2: ( ( () otherlv_1= 'CallExpr' otherlv_2= '{' (otherlv_3= 'fonction' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleExpression ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalMyDsl.g:2358:2: ( () otherlv_1= 'CallExpr' otherlv_2= '{' (otherlv_3= 'fonction' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleExpression ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalMyDsl.g:2358:2: ( () otherlv_1= 'CallExpr' otherlv_2= '{' (otherlv_3= 'fonction' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleExpression ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalMyDsl.g:2359:3: () otherlv_1= 'CallExpr' otherlv_2= '{' (otherlv_3= 'fonction' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleExpression ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // InternalMyDsl.g:2359:3: ()
            // InternalMyDsl.g:2360:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCallExprAccess().getCallExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCallExprAccess().getCallExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_35); 

            			newLeafNode(otherlv_2, grammarAccess.getCallExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2374:3: (otherlv_3= 'fonction' ( ( ruleEString ) ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==39) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMyDsl.g:2375:4: otherlv_3= 'fonction' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getCallExprAccess().getFonctionKeyword_3_0());
                    			
                    // InternalMyDsl.g:2379:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2380:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2380:5: ( ruleEString )
                    // InternalMyDsl.g:2381:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getCallExprRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getCallExprAccess().getFonctionFonctionCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2396:3: (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==41) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMyDsl.g:2397:4: otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCallExprAccess().getVariableKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getCallExprAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:2405:4: ( (lv_variable_7_0= ruleVariable ) )
                    // InternalMyDsl.g:2406:5: (lv_variable_7_0= ruleVariable )
                    {
                    // InternalMyDsl.g:2406:5: (lv_variable_7_0= ruleVariable )
                    // InternalMyDsl.g:2407:6: lv_variable_7_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getCallExprAccess().getVariableVariableParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalMyDsl.g:2424:4: (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==14) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalMyDsl.g:2425:5: otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getCallExprAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:2429:5: ( (lv_variable_9_0= ruleVariable ) )
                    	    // InternalMyDsl.g:2430:6: (lv_variable_9_0= ruleVariable )
                    	    {
                    	    // InternalMyDsl.g:2430:6: (lv_variable_9_0= ruleVariable )
                    	    // InternalMyDsl.g:2431:7: lv_variable_9_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getCallExprAccess().getVariableVariableParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_29); 

                    				newLeafNode(otherlv_10, grammarAccess.getCallExprAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:2454:3: (otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleExpression ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) ) )* otherlv_16= '}' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==38) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMyDsl.g:2455:4: otherlv_11= 'parameters' otherlv_12= '{' ( (lv_parameters_13_0= ruleExpression ) ) (otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getCallExprAccess().getParametersKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getCallExprAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMyDsl.g:2463:4: ( (lv_parameters_13_0= ruleExpression ) )
                    // InternalMyDsl.g:2464:5: (lv_parameters_13_0= ruleExpression )
                    {
                    // InternalMyDsl.g:2464:5: (lv_parameters_13_0= ruleExpression )
                    // InternalMyDsl.g:2465:6: lv_parameters_13_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getCallExprAccess().getParametersExpressionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalMyDsl.g:2482:4: (otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==14) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalMyDsl.g:2483:5: otherlv_14= ',' ( (lv_parameters_15_0= ruleExpression ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getCallExprAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMyDsl.g:2487:5: ( (lv_parameters_15_0= ruleExpression ) )
                    	    // InternalMyDsl.g:2488:6: (lv_parameters_15_0= ruleExpression )
                    	    {
                    	    // InternalMyDsl.g:2488:6: (lv_parameters_15_0= ruleExpression )
                    	    // InternalMyDsl.g:2489:7: lv_parameters_15_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getCallExprAccess().getParametersExpressionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop46;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,15,FOLLOW_11); 

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
    // InternalMyDsl.g:2520:1: entryRuleVarExpr returns [EObject current=null] : iv_ruleVarExpr= ruleVarExpr EOF ;
    public final EObject entryRuleVarExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarExpr = null;


        try {
            // InternalMyDsl.g:2520:48: (iv_ruleVarExpr= ruleVarExpr EOF )
            // InternalMyDsl.g:2521:2: iv_ruleVarExpr= ruleVarExpr EOF
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
    // InternalMyDsl.g:2527:1: ruleVarExpr returns [EObject current=null] : ( () otherlv_1= 'VarExpr' otherlv_2= '{' (otherlv_3= 'variableRef' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:2533:2: ( ( () otherlv_1= 'VarExpr' otherlv_2= '{' (otherlv_3= 'variableRef' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:2534:2: ( () otherlv_1= 'VarExpr' otherlv_2= '{' (otherlv_3= 'variableRef' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:2534:2: ( () otherlv_1= 'VarExpr' otherlv_2= '{' (otherlv_3= 'variableRef' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:2535:3: () otherlv_1= 'VarExpr' otherlv_2= '{' (otherlv_3= 'variableRef' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMyDsl.g:2535:3: ()
            // InternalMyDsl.g:2536:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVarExprAccess().getVarExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVarExprAccess().getVarExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_2, grammarAccess.getVarExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2550:3: (otherlv_3= 'variableRef' ( ( ruleEString ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==55) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMyDsl.g:2551:4: otherlv_3= 'variableRef' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,55,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getVarExprAccess().getVariableRefKeyword_3_0());
                    			
                    // InternalMyDsl.g:2555:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2556:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2556:5: ( ruleEString )
                    // InternalMyDsl.g:2557:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVarExprRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getVarExprAccess().getVariableRefVariableCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2572:3: (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==41) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMyDsl.g:2573:4: otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getVarExprAccess().getVariableKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getVarExprAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:2581:4: ( (lv_variable_7_0= ruleVariable ) )
                    // InternalMyDsl.g:2582:5: (lv_variable_7_0= ruleVariable )
                    {
                    // InternalMyDsl.g:2582:5: (lv_variable_7_0= ruleVariable )
                    // InternalMyDsl.g:2583:6: lv_variable_7_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getVarExprAccess().getVariableVariableParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalMyDsl.g:2600:4: (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==14) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalMyDsl.g:2601:5: otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getVarExprAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:2605:5: ( (lv_variable_9_0= ruleVariable ) )
                    	    // InternalMyDsl.g:2606:6: (lv_variable_9_0= ruleVariable )
                    	    {
                    	    // InternalMyDsl.g:2606:6: (lv_variable_9_0= ruleVariable )
                    	    // InternalMyDsl.g:2607:7: lv_variable_9_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getVarExprAccess().getVariableVariableParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_11); 

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


    // $ANTLR start "entryRuleNegative"
    // InternalMyDsl.g:2638:1: entryRuleNegative returns [EObject current=null] : iv_ruleNegative= ruleNegative EOF ;
    public final EObject entryRuleNegative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegative = null;


        try {
            // InternalMyDsl.g:2638:49: (iv_ruleNegative= ruleNegative EOF )
            // InternalMyDsl.g:2639:2: iv_ruleNegative= ruleNegative EOF
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
    // InternalMyDsl.g:2645:1: ruleNegative returns [EObject current=null] : (otherlv_0= 'Negative' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}' ) ;
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
            // InternalMyDsl.g:2651:2: ( (otherlv_0= 'Negative' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}' ) )
            // InternalMyDsl.g:2652:2: (otherlv_0= 'Negative' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}' )
            {
            // InternalMyDsl.g:2652:2: (otherlv_0= 'Negative' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}' )
            // InternalMyDsl.g:2653:3: otherlv_0= 'Negative' otherlv_1= '{' (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )? otherlv_8= 'expression' ( (lv_expression_9_0= ruleExpression ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNegativeAccess().getNegativeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getNegativeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:2661:3: (otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==41) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMyDsl.g:2662:4: otherlv_2= 'variable' otherlv_3= '{' ( (lv_variable_4_0= ruleVariable ) ) (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )* otherlv_7= '}'
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getNegativeAccess().getVariableKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_3, grammarAccess.getNegativeAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalMyDsl.g:2670:4: ( (lv_variable_4_0= ruleVariable ) )
                    // InternalMyDsl.g:2671:5: (lv_variable_4_0= ruleVariable )
                    {
                    // InternalMyDsl.g:2671:5: (lv_variable_4_0= ruleVariable )
                    // InternalMyDsl.g:2672:6: lv_variable_4_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getNegativeAccess().getVariableVariableParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalMyDsl.g:2689:4: (otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==14) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // InternalMyDsl.g:2690:5: otherlv_5= ',' ( (lv_variable_6_0= ruleVariable ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getNegativeAccess().getCommaKeyword_2_3_0());
                    	    				
                    	    // InternalMyDsl.g:2694:5: ( (lv_variable_6_0= ruleVariable ) )
                    	    // InternalMyDsl.g:2695:6: (lv_variable_6_0= ruleVariable )
                    	    {
                    	    // InternalMyDsl.g:2695:6: (lv_variable_6_0= ruleVariable )
                    	    // InternalMyDsl.g:2696:7: lv_variable_6_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getNegativeAccess().getVariableVariableParserRuleCall_2_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop51;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_32); 

                    				newLeafNode(otherlv_7, grammarAccess.getNegativeAccess().getRightCurlyBracketKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getNegativeAccess().getExpressionKeyword_3());
            		
            // InternalMyDsl.g:2723:3: ( (lv_expression_9_0= ruleExpression ) )
            // InternalMyDsl.g:2724:4: (lv_expression_9_0= ruleExpression )
            {
            // InternalMyDsl.g:2724:4: (lv_expression_9_0= ruleExpression )
            // InternalMyDsl.g:2725:5: lv_expression_9_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getNegativeAccess().getExpressionExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_11);
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
    // InternalMyDsl.g:2750:1: entryRuleBinaryArithmetic returns [EObject current=null] : iv_ruleBinaryArithmetic= ruleBinaryArithmetic EOF ;
    public final EObject entryRuleBinaryArithmetic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinaryArithmetic = null;


        try {
            // InternalMyDsl.g:2750:57: (iv_ruleBinaryArithmetic= ruleBinaryArithmetic EOF )
            // InternalMyDsl.g:2751:2: iv_ruleBinaryArithmetic= ruleBinaryArithmetic EOF
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
    // InternalMyDsl.g:2757:1: ruleBinaryArithmetic returns [EObject current=null] : (otherlv_0= 'BinaryArithmetic' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleArithmeticOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}' ) ;
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
            // InternalMyDsl.g:2763:2: ( (otherlv_0= 'BinaryArithmetic' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleArithmeticOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}' ) )
            // InternalMyDsl.g:2764:2: (otherlv_0= 'BinaryArithmetic' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleArithmeticOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}' )
            {
            // InternalMyDsl.g:2764:2: (otherlv_0= 'BinaryArithmetic' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleArithmeticOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}' )
            // InternalMyDsl.g:2765:3: otherlv_0= 'BinaryArithmetic' otherlv_1= '{' (otherlv_2= 'operation' ( (lv_operation_3_0= ruleArithmeticOperation ) ) )? (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )? otherlv_10= 'expression' otherlv_11= '{' ( (lv_expression_12_0= ruleExpression ) ) (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )* otherlv_15= '}' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBinaryArithmeticAccess().getBinaryArithmeticKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getBinaryArithmeticAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:2773:3: (otherlv_2= 'operation' ( (lv_operation_3_0= ruleArithmeticOperation ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==52) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMyDsl.g:2774:4: otherlv_2= 'operation' ( (lv_operation_3_0= ruleArithmeticOperation ) )
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_39); 

                    				newLeafNode(otherlv_2, grammarAccess.getBinaryArithmeticAccess().getOperationKeyword_2_0());
                    			
                    // InternalMyDsl.g:2778:4: ( (lv_operation_3_0= ruleArithmeticOperation ) )
                    // InternalMyDsl.g:2779:5: (lv_operation_3_0= ruleArithmeticOperation )
                    {
                    // InternalMyDsl.g:2779:5: (lv_operation_3_0= ruleArithmeticOperation )
                    // InternalMyDsl.g:2780:6: lv_operation_3_0= ruleArithmeticOperation
                    {

                    						newCompositeNode(grammarAccess.getBinaryArithmeticAccess().getOperationArithmeticOperationEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

            // InternalMyDsl.g:2798:3: (otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==41) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMyDsl.g:2799:4: otherlv_4= 'variable' otherlv_5= '{' ( (lv_variable_6_0= ruleVariable ) ) (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getBinaryArithmeticAccess().getVariableKeyword_3_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_5, grammarAccess.getBinaryArithmeticAccess().getLeftCurlyBracketKeyword_3_1());
                    			
                    // InternalMyDsl.g:2807:4: ( (lv_variable_6_0= ruleVariable ) )
                    // InternalMyDsl.g:2808:5: (lv_variable_6_0= ruleVariable )
                    {
                    // InternalMyDsl.g:2808:5: (lv_variable_6_0= ruleVariable )
                    // InternalMyDsl.g:2809:6: lv_variable_6_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getBinaryArithmeticAccess().getVariableVariableParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalMyDsl.g:2826:4: (otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==14) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalMyDsl.g:2827:5: otherlv_7= ',' ( (lv_variable_8_0= ruleVariable ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getBinaryArithmeticAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:2831:5: ( (lv_variable_8_0= ruleVariable ) )
                    	    // InternalMyDsl.g:2832:6: (lv_variable_8_0= ruleVariable )
                    	    {
                    	    // InternalMyDsl.g:2832:6: (lv_variable_8_0= ruleVariable )
                    	    // InternalMyDsl.g:2833:7: lv_variable_8_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getBinaryArithmeticAccess().getVariableVariableParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_32); 

                    				newLeafNode(otherlv_9, grammarAccess.getBinaryArithmeticAccess().getRightCurlyBracketKeyword_3_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getBinaryArithmeticAccess().getExpressionKeyword_4());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getBinaryArithmeticAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMyDsl.g:2864:3: ( (lv_expression_12_0= ruleExpression ) )
            // InternalMyDsl.g:2865:4: (lv_expression_12_0= ruleExpression )
            {
            // InternalMyDsl.g:2865:4: (lv_expression_12_0= ruleExpression )
            // InternalMyDsl.g:2866:5: lv_expression_12_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getBinaryArithmeticAccess().getExpressionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_6);
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

            // InternalMyDsl.g:2883:3: (otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==14) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalMyDsl.g:2884:4: otherlv_13= ',' ( (lv_expression_14_0= ruleExpression ) )
            	    {
            	    otherlv_13=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_13, grammarAccess.getBinaryArithmeticAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:2888:4: ( (lv_expression_14_0= ruleExpression ) )
            	    // InternalMyDsl.g:2889:5: (lv_expression_14_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:2889:5: (lv_expression_14_0= ruleExpression )
            	    // InternalMyDsl.g:2890:6: lv_expression_14_0= ruleExpression
            	    {

            	    						newCompositeNode(grammarAccess.getBinaryArithmeticAccess().getExpressionExpressionParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
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
            	    break loop56;
                }
            } while (true);

            otherlv_15=(Token)match(input,15,FOLLOW_11); 

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


    // $ANTLR start "entryRuleSensorExpr"
    // InternalMyDsl.g:2920:1: entryRuleSensorExpr returns [EObject current=null] : iv_ruleSensorExpr= ruleSensorExpr EOF ;
    public final EObject entryRuleSensorExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensorExpr = null;


        try {
            // InternalMyDsl.g:2920:51: (iv_ruleSensorExpr= ruleSensorExpr EOF )
            // InternalMyDsl.g:2921:2: iv_ruleSensorExpr= ruleSensorExpr EOF
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
    // InternalMyDsl.g:2927:1: ruleSensorExpr returns [EObject current=null] : ( () otherlv_1= 'SensorExpr' otherlv_2= '{' (otherlv_3= 'sensor' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalMyDsl.g:2933:2: ( ( () otherlv_1= 'SensorExpr' otherlv_2= '{' (otherlv_3= 'sensor' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:2934:2: ( () otherlv_1= 'SensorExpr' otherlv_2= '{' (otherlv_3= 'sensor' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:2934:2: ( () otherlv_1= 'SensorExpr' otherlv_2= '{' (otherlv_3= 'sensor' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:2935:3: () otherlv_1= 'SensorExpr' otherlv_2= '{' (otherlv_3= 'sensor' ( ( ruleEString ) ) )? (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMyDsl.g:2935:3: ()
            // InternalMyDsl.g:2936:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSensorExprAccess().getSensorExprAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,58,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSensorExprAccess().getSensorExprKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_40); 

            			newLeafNode(otherlv_2, grammarAccess.getSensorExprAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:2950:3: (otherlv_3= 'sensor' ( ( ruleEString ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==59) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMyDsl.g:2951:4: otherlv_3= 'sensor' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,59,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getSensorExprAccess().getSensorKeyword_3_0());
                    			
                    // InternalMyDsl.g:2955:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:2956:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:2956:5: ( ruleEString )
                    // InternalMyDsl.g:2957:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSensorExprRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSensorExprAccess().getSensorSensorCrossReference_3_1_0());
                    					
                    pushFollow(FOLLOW_38);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:2972:3: (otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==41) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMyDsl.g:2973:4: otherlv_5= 'variable' otherlv_6= '{' ( (lv_variable_7_0= ruleVariable ) ) (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getSensorExprAccess().getVariableKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_31); 

                    				newLeafNode(otherlv_6, grammarAccess.getSensorExprAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:2981:4: ( (lv_variable_7_0= ruleVariable ) )
                    // InternalMyDsl.g:2982:5: (lv_variable_7_0= ruleVariable )
                    {
                    // InternalMyDsl.g:2982:5: (lv_variable_7_0= ruleVariable )
                    // InternalMyDsl.g:2983:6: lv_variable_7_0= ruleVariable
                    {

                    						newCompositeNode(grammarAccess.getSensorExprAccess().getVariableVariableParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_6);
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

                    // InternalMyDsl.g:3000:4: (otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==14) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalMyDsl.g:3001:5: otherlv_8= ',' ( (lv_variable_9_0= ruleVariable ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_31); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSensorExprAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:3005:5: ( (lv_variable_9_0= ruleVariable ) )
                    	    // InternalMyDsl.g:3006:6: (lv_variable_9_0= ruleVariable )
                    	    {
                    	    // InternalMyDsl.g:3006:6: (lv_variable_9_0= ruleVariable )
                    	    // InternalMyDsl.g:3007:7: lv_variable_9_0= ruleVariable
                    	    {

                    	    							newCompositeNode(grammarAccess.getSensorExprAccess().getVariableVariableParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
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
                    	    break loop58;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_11); 

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


    // $ANTLR start "ruleUnit"
    // InternalMyDsl.g:3038:1: ruleUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'MM' ) | (enumLiteral_1= 'KM' ) | (enumLiteral_2= 'CM' ) | (enumLiteral_3= 'M' ) | (enumLiteral_4= 'DM' ) | (enumLiteral_5= 'HM' ) | (enumLiteral_6= 'DAM' ) | (enumLiteral_7= 'RAD' ) ) ;
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
            // InternalMyDsl.g:3044:2: ( ( (enumLiteral_0= 'MM' ) | (enumLiteral_1= 'KM' ) | (enumLiteral_2= 'CM' ) | (enumLiteral_3= 'M' ) | (enumLiteral_4= 'DM' ) | (enumLiteral_5= 'HM' ) | (enumLiteral_6= 'DAM' ) | (enumLiteral_7= 'RAD' ) ) )
            // InternalMyDsl.g:3045:2: ( (enumLiteral_0= 'MM' ) | (enumLiteral_1= 'KM' ) | (enumLiteral_2= 'CM' ) | (enumLiteral_3= 'M' ) | (enumLiteral_4= 'DM' ) | (enumLiteral_5= 'HM' ) | (enumLiteral_6= 'DAM' ) | (enumLiteral_7= 'RAD' ) )
            {
            // InternalMyDsl.g:3045:2: ( (enumLiteral_0= 'MM' ) | (enumLiteral_1= 'KM' ) | (enumLiteral_2= 'CM' ) | (enumLiteral_3= 'M' ) | (enumLiteral_4= 'DM' ) | (enumLiteral_5= 'HM' ) | (enumLiteral_6= 'DAM' ) | (enumLiteral_7= 'RAD' ) )
            int alt60=8;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt60=1;
                }
                break;
            case 61:
                {
                alt60=2;
                }
                break;
            case 62:
                {
                alt60=3;
                }
                break;
            case 63:
                {
                alt60=4;
                }
                break;
            case 64:
                {
                alt60=5;
                }
                break;
            case 65:
                {
                alt60=6;
                }
                break;
            case 66:
                {
                alt60=7;
                }
                break;
            case 67:
                {
                alt60=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalMyDsl.g:3046:3: (enumLiteral_0= 'MM' )
                    {
                    // InternalMyDsl.g:3046:3: (enumLiteral_0= 'MM' )
                    // InternalMyDsl.g:3047:4: enumLiteral_0= 'MM'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getMMEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getUnitAccess().getMMEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3054:3: (enumLiteral_1= 'KM' )
                    {
                    // InternalMyDsl.g:3054:3: (enumLiteral_1= 'KM' )
                    // InternalMyDsl.g:3055:4: enumLiteral_1= 'KM'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getKMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getUnitAccess().getKMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3062:3: (enumLiteral_2= 'CM' )
                    {
                    // InternalMyDsl.g:3062:3: (enumLiteral_2= 'CM' )
                    // InternalMyDsl.g:3063:4: enumLiteral_2= 'CM'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getCMEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getUnitAccess().getCMEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3070:3: (enumLiteral_3= 'M' )
                    {
                    // InternalMyDsl.g:3070:3: (enumLiteral_3= 'M' )
                    // InternalMyDsl.g:3071:4: enumLiteral_3= 'M'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getMEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getUnitAccess().getMEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3078:3: (enumLiteral_4= 'DM' )
                    {
                    // InternalMyDsl.g:3078:3: (enumLiteral_4= 'DM' )
                    // InternalMyDsl.g:3079:4: enumLiteral_4= 'DM'
                    {
                    enumLiteral_4=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getDMEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getUnitAccess().getDMEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:3086:3: (enumLiteral_5= 'HM' )
                    {
                    // InternalMyDsl.g:3086:3: (enumLiteral_5= 'HM' )
                    // InternalMyDsl.g:3087:4: enumLiteral_5= 'HM'
                    {
                    enumLiteral_5=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getHMEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getUnitAccess().getHMEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:3094:3: (enumLiteral_6= 'DAM' )
                    {
                    // InternalMyDsl.g:3094:3: (enumLiteral_6= 'DAM' )
                    // InternalMyDsl.g:3095:4: enumLiteral_6= 'DAM'
                    {
                    enumLiteral_6=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getUnitAccess().getDAMEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getUnitAccess().getDAMEnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:3102:3: (enumLiteral_7= 'RAD' )
                    {
                    // InternalMyDsl.g:3102:3: (enumLiteral_7= 'RAD' )
                    // InternalMyDsl.g:3103:4: enumLiteral_7= 'RAD'
                    {
                    enumLiteral_7=(Token)match(input,67,FOLLOW_2); 

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
    // InternalMyDsl.g:3113:1: ruleBoolOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'INF' ) | (enumLiteral_1= 'SUP' ) | (enumLiteral_2= 'INF_EQ' ) | (enumLiteral_3= 'EQ' ) | (enumLiteral_4= 'SUP_EQ' ) | (enumLiteral_5= 'NEQ' ) | (enumLiteral_6= 'OR' ) | (enumLiteral_7= 'AND' ) ) ;
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
            // InternalMyDsl.g:3119:2: ( ( (enumLiteral_0= 'INF' ) | (enumLiteral_1= 'SUP' ) | (enumLiteral_2= 'INF_EQ' ) | (enumLiteral_3= 'EQ' ) | (enumLiteral_4= 'SUP_EQ' ) | (enumLiteral_5= 'NEQ' ) | (enumLiteral_6= 'OR' ) | (enumLiteral_7= 'AND' ) ) )
            // InternalMyDsl.g:3120:2: ( (enumLiteral_0= 'INF' ) | (enumLiteral_1= 'SUP' ) | (enumLiteral_2= 'INF_EQ' ) | (enumLiteral_3= 'EQ' ) | (enumLiteral_4= 'SUP_EQ' ) | (enumLiteral_5= 'NEQ' ) | (enumLiteral_6= 'OR' ) | (enumLiteral_7= 'AND' ) )
            {
            // InternalMyDsl.g:3120:2: ( (enumLiteral_0= 'INF' ) | (enumLiteral_1= 'SUP' ) | (enumLiteral_2= 'INF_EQ' ) | (enumLiteral_3= 'EQ' ) | (enumLiteral_4= 'SUP_EQ' ) | (enumLiteral_5= 'NEQ' ) | (enumLiteral_6= 'OR' ) | (enumLiteral_7= 'AND' ) )
            int alt61=8;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt61=1;
                }
                break;
            case 69:
                {
                alt61=2;
                }
                break;
            case 70:
                {
                alt61=3;
                }
                break;
            case 71:
                {
                alt61=4;
                }
                break;
            case 72:
                {
                alt61=5;
                }
                break;
            case 73:
                {
                alt61=6;
                }
                break;
            case 74:
                {
                alt61=7;
                }
                break;
            case 75:
                {
                alt61=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalMyDsl.g:3121:3: (enumLiteral_0= 'INF' )
                    {
                    // InternalMyDsl.g:3121:3: (enumLiteral_0= 'INF' )
                    // InternalMyDsl.g:3122:4: enumLiteral_0= 'INF'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperationAccess().getINFEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBoolOperationAccess().getINFEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3129:3: (enumLiteral_1= 'SUP' )
                    {
                    // InternalMyDsl.g:3129:3: (enumLiteral_1= 'SUP' )
                    // InternalMyDsl.g:3130:4: enumLiteral_1= 'SUP'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperationAccess().getSUPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBoolOperationAccess().getSUPEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3137:3: (enumLiteral_2= 'INF_EQ' )
                    {
                    // InternalMyDsl.g:3137:3: (enumLiteral_2= 'INF_EQ' )
                    // InternalMyDsl.g:3138:4: enumLiteral_2= 'INF_EQ'
                    {
                    enumLiteral_2=(Token)match(input,70,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperationAccess().getINF_EQEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getBoolOperationAccess().getINF_EQEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3145:3: (enumLiteral_3= 'EQ' )
                    {
                    // InternalMyDsl.g:3145:3: (enumLiteral_3= 'EQ' )
                    // InternalMyDsl.g:3146:4: enumLiteral_3= 'EQ'
                    {
                    enumLiteral_3=(Token)match(input,71,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperationAccess().getEQEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getBoolOperationAccess().getEQEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:3153:3: (enumLiteral_4= 'SUP_EQ' )
                    {
                    // InternalMyDsl.g:3153:3: (enumLiteral_4= 'SUP_EQ' )
                    // InternalMyDsl.g:3154:4: enumLiteral_4= 'SUP_EQ'
                    {
                    enumLiteral_4=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperationAccess().getSUP_EQEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getBoolOperationAccess().getSUP_EQEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:3161:3: (enumLiteral_5= 'NEQ' )
                    {
                    // InternalMyDsl.g:3161:3: (enumLiteral_5= 'NEQ' )
                    // InternalMyDsl.g:3162:4: enumLiteral_5= 'NEQ'
                    {
                    enumLiteral_5=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperationAccess().getNEQEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getBoolOperationAccess().getNEQEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:3169:3: (enumLiteral_6= 'OR' )
                    {
                    // InternalMyDsl.g:3169:3: (enumLiteral_6= 'OR' )
                    // InternalMyDsl.g:3170:4: enumLiteral_6= 'OR'
                    {
                    enumLiteral_6=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getBoolOperationAccess().getOREnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getBoolOperationAccess().getOREnumLiteralDeclaration_6());
                    			

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:3177:3: (enumLiteral_7= 'AND' )
                    {
                    // InternalMyDsl.g:3177:3: (enumLiteral_7= 'AND' )
                    // InternalMyDsl.g:3178:4: enumLiteral_7= 'AND'
                    {
                    enumLiteral_7=(Token)match(input,75,FOLLOW_2); 

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
    // InternalMyDsl.g:3188:1: ruleArithmeticOperation returns [Enumerator current=null] : ( (enumLiteral_0= 'ADD' ) | (enumLiteral_1= 'SUB' ) | (enumLiteral_2= 'DIV' ) | (enumLiteral_3= 'MULT' ) ) ;
    public final Enumerator ruleArithmeticOperation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMyDsl.g:3194:2: ( ( (enumLiteral_0= 'ADD' ) | (enumLiteral_1= 'SUB' ) | (enumLiteral_2= 'DIV' ) | (enumLiteral_3= 'MULT' ) ) )
            // InternalMyDsl.g:3195:2: ( (enumLiteral_0= 'ADD' ) | (enumLiteral_1= 'SUB' ) | (enumLiteral_2= 'DIV' ) | (enumLiteral_3= 'MULT' ) )
            {
            // InternalMyDsl.g:3195:2: ( (enumLiteral_0= 'ADD' ) | (enumLiteral_1= 'SUB' ) | (enumLiteral_2= 'DIV' ) | (enumLiteral_3= 'MULT' ) )
            int alt62=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt62=1;
                }
                break;
            case 77:
                {
                alt62=2;
                }
                break;
            case 78:
                {
                alt62=3;
                }
                break;
            case 79:
                {
                alt62=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // InternalMyDsl.g:3196:3: (enumLiteral_0= 'ADD' )
                    {
                    // InternalMyDsl.g:3196:3: (enumLiteral_0= 'ADD' )
                    // InternalMyDsl.g:3197:4: enumLiteral_0= 'ADD'
                    {
                    enumLiteral_0=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperationAccess().getADDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getArithmeticOperationAccess().getADDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:3204:3: (enumLiteral_1= 'SUB' )
                    {
                    // InternalMyDsl.g:3204:3: (enumLiteral_1= 'SUB' )
                    // InternalMyDsl.g:3205:4: enumLiteral_1= 'SUB'
                    {
                    enumLiteral_1=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperationAccess().getSUBEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getArithmeticOperationAccess().getSUBEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:3212:3: (enumLiteral_2= 'DIV' )
                    {
                    // InternalMyDsl.g:3212:3: (enumLiteral_2= 'DIV' )
                    // InternalMyDsl.g:3213:4: enumLiteral_2= 'DIV'
                    {
                    enumLiteral_2=(Token)match(input,78,FOLLOW_2); 

                    				current = grammarAccess.getArithmeticOperationAccess().getDIVEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getArithmeticOperationAccess().getDIVEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:3220:3: (enumLiteral_3= 'MULT' )
                    {
                    // InternalMyDsl.g:3220:3: (enumLiteral_3= 'MULT' )
                    // InternalMyDsl.g:3221:4: enumLiteral_3= 'MULT'
                    {
                    enumLiteral_3=(Token)match(input,79,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000E840000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0003FD2500000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x076C000000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000488000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0xF000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000200018000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001A00008000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000001800008000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x000000C000008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000008000008000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000028000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000004000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0010020000020000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000002C000008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000024000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080020000008000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000008000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x000000000000F000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0800020000008000L});

}