package org.xtext.parser.antlr.internal;

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
import org.xtext.services.SpiceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSpiceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Simulation'", "'xmod_id:'", "'('", "','", "')'", "'{'", "'}'", "'Component'", "'DF'", "'View'", "'host'", "'port'", "'period'", "'observe'", "';'", "'observable'", "'='", "'['", "']'", "'Action'", "'on'", "'returns'", "'call'", "'onError'", "'then'", "'methodException'", "'other'", "'unknownNamespace'", "'objectNotFound'", "'methodNotFound'", "'parametersNotMatching'", "'returnTypeNotMatching'", "'-'", "'.'", "'e'", "'E'", "'true'", "'false'", "'continue'", "'skip'", "'exit'", "'localstop'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
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


        public InternalSpiceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSpiceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSpiceParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSpice.g"; }



     	private SpiceGrammarAccess grammarAccess;

        public InternalSpiceParser(TokenStream input, SpiceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Simulation";
       	}

       	@Override
       	protected SpiceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleSimulation"
    // InternalSpice.g:65:1: entryRuleSimulation returns [EObject current=null] : iv_ruleSimulation= ruleSimulation EOF ;
    public final EObject entryRuleSimulation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimulation = null;


        try {
            // InternalSpice.g:65:51: (iv_ruleSimulation= ruleSimulation EOF )
            // InternalSpice.g:66:2: iv_ruleSimulation= ruleSimulation EOF
            {
             newCompositeNode(grammarAccess.getSimulationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimulation=ruleSimulation();

            state._fsp--;

             current =iv_ruleSimulation; 
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
    // $ANTLR end "entryRuleSimulation"


    // $ANTLR start "ruleSimulation"
    // InternalSpice.g:72:1: ruleSimulation returns [EObject current=null] : (otherlv_0= 'Simulation' otherlv_1= 'xmod_id:' ( (lv_xmod_id_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_startTime_4_0= ruleELong ) ) otherlv_5= ',' ( (lv_endTime_6_0= ruleELong ) ) otherlv_7= ',' ( (lv_durationStep_8_0= ruleELong ) ) otherlv_9= ')' otherlv_10= '{' ( ( (lv_components_11_0= ruleComponent ) ) ( (lv_components_12_0= ruleComponent ) )* )? ( ( (lv_views_13_0= ruleView ) ) ( (lv_views_14_0= ruleView ) )* )? otherlv_15= '}' ) ;
    public final EObject ruleSimulation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_xmod_id_2_0 = null;

        AntlrDatatypeRuleToken lv_startTime_4_0 = null;

        AntlrDatatypeRuleToken lv_endTime_6_0 = null;

        AntlrDatatypeRuleToken lv_durationStep_8_0 = null;

        EObject lv_components_11_0 = null;

        EObject lv_components_12_0 = null;

        EObject lv_views_13_0 = null;

        EObject lv_views_14_0 = null;



        	enterRule();

        try {
            // InternalSpice.g:78:2: ( (otherlv_0= 'Simulation' otherlv_1= 'xmod_id:' ( (lv_xmod_id_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_startTime_4_0= ruleELong ) ) otherlv_5= ',' ( (lv_endTime_6_0= ruleELong ) ) otherlv_7= ',' ( (lv_durationStep_8_0= ruleELong ) ) otherlv_9= ')' otherlv_10= '{' ( ( (lv_components_11_0= ruleComponent ) ) ( (lv_components_12_0= ruleComponent ) )* )? ( ( (lv_views_13_0= ruleView ) ) ( (lv_views_14_0= ruleView ) )* )? otherlv_15= '}' ) )
            // InternalSpice.g:79:2: (otherlv_0= 'Simulation' otherlv_1= 'xmod_id:' ( (lv_xmod_id_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_startTime_4_0= ruleELong ) ) otherlv_5= ',' ( (lv_endTime_6_0= ruleELong ) ) otherlv_7= ',' ( (lv_durationStep_8_0= ruleELong ) ) otherlv_9= ')' otherlv_10= '{' ( ( (lv_components_11_0= ruleComponent ) ) ( (lv_components_12_0= ruleComponent ) )* )? ( ( (lv_views_13_0= ruleView ) ) ( (lv_views_14_0= ruleView ) )* )? otherlv_15= '}' )
            {
            // InternalSpice.g:79:2: (otherlv_0= 'Simulation' otherlv_1= 'xmod_id:' ( (lv_xmod_id_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_startTime_4_0= ruleELong ) ) otherlv_5= ',' ( (lv_endTime_6_0= ruleELong ) ) otherlv_7= ',' ( (lv_durationStep_8_0= ruleELong ) ) otherlv_9= ')' otherlv_10= '{' ( ( (lv_components_11_0= ruleComponent ) ) ( (lv_components_12_0= ruleComponent ) )* )? ( ( (lv_views_13_0= ruleView ) ) ( (lv_views_14_0= ruleView ) )* )? otherlv_15= '}' )
            // InternalSpice.g:80:3: otherlv_0= 'Simulation' otherlv_1= 'xmod_id:' ( (lv_xmod_id_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_startTime_4_0= ruleELong ) ) otherlv_5= ',' ( (lv_endTime_6_0= ruleELong ) ) otherlv_7= ',' ( (lv_durationStep_8_0= ruleELong ) ) otherlv_9= ')' otherlv_10= '{' ( ( (lv_components_11_0= ruleComponent ) ) ( (lv_components_12_0= ruleComponent ) )* )? ( ( (lv_views_13_0= ruleView ) ) ( (lv_views_14_0= ruleView ) )* )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSimulationAccess().getSimulationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSimulationAccess().getXmod_idKeyword_1());
            		
            // InternalSpice.g:88:3: ( (lv_xmod_id_2_0= ruleEString ) )
            // InternalSpice.g:89:4: (lv_xmod_id_2_0= ruleEString )
            {
            // InternalSpice.g:89:4: (lv_xmod_id_2_0= ruleEString )
            // InternalSpice.g:90:5: lv_xmod_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSimulationAccess().getXmod_idEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_xmod_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimulationRule());
            					}
            					set(
            						current,
            						"xmod_id",
            						lv_xmod_id_2_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getSimulationAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSpice.g:111:3: ( (lv_startTime_4_0= ruleELong ) )
            // InternalSpice.g:112:4: (lv_startTime_4_0= ruleELong )
            {
            // InternalSpice.g:112:4: (lv_startTime_4_0= ruleELong )
            // InternalSpice.g:113:5: lv_startTime_4_0= ruleELong
            {

            					newCompositeNode(grammarAccess.getSimulationAccess().getStartTimeELongParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_startTime_4_0=ruleELong();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimulationRule());
            					}
            					set(
            						current,
            						"startTime",
            						lv_startTime_4_0,
            						"org.xtext.Spice.ELong");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getSimulationAccess().getCommaKeyword_5());
            		
            // InternalSpice.g:134:3: ( (lv_endTime_6_0= ruleELong ) )
            // InternalSpice.g:135:4: (lv_endTime_6_0= ruleELong )
            {
            // InternalSpice.g:135:4: (lv_endTime_6_0= ruleELong )
            // InternalSpice.g:136:5: lv_endTime_6_0= ruleELong
            {

            					newCompositeNode(grammarAccess.getSimulationAccess().getEndTimeELongParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_endTime_6_0=ruleELong();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimulationRule());
            					}
            					set(
            						current,
            						"endTime",
            						lv_endTime_6_0,
            						"org.xtext.Spice.ELong");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getSimulationAccess().getCommaKeyword_7());
            		
            // InternalSpice.g:157:3: ( (lv_durationStep_8_0= ruleELong ) )
            // InternalSpice.g:158:4: (lv_durationStep_8_0= ruleELong )
            {
            // InternalSpice.g:158:4: (lv_durationStep_8_0= ruleELong )
            // InternalSpice.g:159:5: lv_durationStep_8_0= ruleELong
            {

            					newCompositeNode(grammarAccess.getSimulationAccess().getDurationStepELongParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_8);
            lv_durationStep_8_0=ruleELong();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSimulationRule());
            					}
            					set(
            						current,
            						"durationStep",
            						lv_durationStep_8_0,
            						"org.xtext.Spice.ELong");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getSimulationAccess().getRightParenthesisKeyword_9());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getSimulationAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalSpice.g:184:3: ( ( (lv_components_11_0= ruleComponent ) ) ( (lv_components_12_0= ruleComponent ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalSpice.g:185:4: ( (lv_components_11_0= ruleComponent ) ) ( (lv_components_12_0= ruleComponent ) )*
                    {
                    // InternalSpice.g:185:4: ( (lv_components_11_0= ruleComponent ) )
                    // InternalSpice.g:186:5: (lv_components_11_0= ruleComponent )
                    {
                    // InternalSpice.g:186:5: (lv_components_11_0= ruleComponent )
                    // InternalSpice.g:187:6: lv_components_11_0= ruleComponent
                    {

                    						newCompositeNode(grammarAccess.getSimulationAccess().getComponentsComponentParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_components_11_0=ruleComponent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimulationRule());
                    						}
                    						add(
                    							current,
                    							"components",
                    							lv_components_11_0,
                    							"org.xtext.Spice.Component");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSpice.g:204:4: ( (lv_components_12_0= ruleComponent ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==18) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalSpice.g:205:5: (lv_components_12_0= ruleComponent )
                    	    {
                    	    // InternalSpice.g:205:5: (lv_components_12_0= ruleComponent )
                    	    // InternalSpice.g:206:6: lv_components_12_0= ruleComponent
                    	    {

                    	    						newCompositeNode(grammarAccess.getSimulationAccess().getComponentsComponentParserRuleCall_11_1_0());
                    	    					
                    	    pushFollow(FOLLOW_10);
                    	    lv_components_12_0=ruleComponent();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSimulationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"components",
                    	    							lv_components_12_0,
                    	    							"org.xtext.Spice.Component");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSpice.g:224:3: ( ( (lv_views_13_0= ruleView ) ) ( (lv_views_14_0= ruleView ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalSpice.g:225:4: ( (lv_views_13_0= ruleView ) ) ( (lv_views_14_0= ruleView ) )*
                    {
                    // InternalSpice.g:225:4: ( (lv_views_13_0= ruleView ) )
                    // InternalSpice.g:226:5: (lv_views_13_0= ruleView )
                    {
                    // InternalSpice.g:226:5: (lv_views_13_0= ruleView )
                    // InternalSpice.g:227:6: lv_views_13_0= ruleView
                    {

                    						newCompositeNode(grammarAccess.getSimulationAccess().getViewsViewParserRuleCall_12_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_views_13_0=ruleView();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSimulationRule());
                    						}
                    						add(
                    							current,
                    							"views",
                    							lv_views_13_0,
                    							"org.xtext.Spice.View");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSpice.g:244:4: ( (lv_views_14_0= ruleView ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==20) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalSpice.g:245:5: (lv_views_14_0= ruleView )
                    	    {
                    	    // InternalSpice.g:245:5: (lv_views_14_0= ruleView )
                    	    // InternalSpice.g:246:6: lv_views_14_0= ruleView
                    	    {

                    	    						newCompositeNode(grammarAccess.getSimulationAccess().getViewsViewParserRuleCall_12_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_views_14_0=ruleView();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getSimulationRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"views",
                    	    							lv_views_14_0,
                    	    							"org.xtext.Spice.View");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getSimulationAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleSimulation"


    // $ANTLR start "entryRuleComponent"
    // InternalSpice.g:272:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalSpice.g:272:50: (iv_ruleComponent= ruleComponent EOF )
            // InternalSpice.g:273:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
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
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalSpice.g:279:1: ruleComponent returns [EObject current=null] : (otherlv_0= 'Component' otherlv_1= 'xmod_id:' ( (lv_xmod_id_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_priority_4_0= ruleELong ) ) otherlv_5= ',' ( (lv_period_6_0= ruleELong ) ) otherlv_7= ')' ( (lv_isDataFlow_8_0= 'DF' ) )? otherlv_9= '{' ( ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* )? ( ( (lv_actions_12_0= ruleXmod_Action ) ) ( (lv_actions_13_0= ruleXmod_Action ) )* )? otherlv_14= '}' ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_isDataFlow_8_0=null;
        Token otherlv_9=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_xmod_id_2_0 = null;

        AntlrDatatypeRuleToken lv_priority_4_0 = null;

        AntlrDatatypeRuleToken lv_period_6_0 = null;

        EObject lv_attributes_10_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_actions_12_0 = null;

        EObject lv_actions_13_0 = null;



        	enterRule();

        try {
            // InternalSpice.g:285:2: ( (otherlv_0= 'Component' otherlv_1= 'xmod_id:' ( (lv_xmod_id_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_priority_4_0= ruleELong ) ) otherlv_5= ',' ( (lv_period_6_0= ruleELong ) ) otherlv_7= ')' ( (lv_isDataFlow_8_0= 'DF' ) )? otherlv_9= '{' ( ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* )? ( ( (lv_actions_12_0= ruleXmod_Action ) ) ( (lv_actions_13_0= ruleXmod_Action ) )* )? otherlv_14= '}' ) )
            // InternalSpice.g:286:2: (otherlv_0= 'Component' otherlv_1= 'xmod_id:' ( (lv_xmod_id_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_priority_4_0= ruleELong ) ) otherlv_5= ',' ( (lv_period_6_0= ruleELong ) ) otherlv_7= ')' ( (lv_isDataFlow_8_0= 'DF' ) )? otherlv_9= '{' ( ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* )? ( ( (lv_actions_12_0= ruleXmod_Action ) ) ( (lv_actions_13_0= ruleXmod_Action ) )* )? otherlv_14= '}' )
            {
            // InternalSpice.g:286:2: (otherlv_0= 'Component' otherlv_1= 'xmod_id:' ( (lv_xmod_id_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_priority_4_0= ruleELong ) ) otherlv_5= ',' ( (lv_period_6_0= ruleELong ) ) otherlv_7= ')' ( (lv_isDataFlow_8_0= 'DF' ) )? otherlv_9= '{' ( ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* )? ( ( (lv_actions_12_0= ruleXmod_Action ) ) ( (lv_actions_13_0= ruleXmod_Action ) )* )? otherlv_14= '}' )
            // InternalSpice.g:287:3: otherlv_0= 'Component' otherlv_1= 'xmod_id:' ( (lv_xmod_id_2_0= ruleEString ) ) otherlv_3= '(' ( (lv_priority_4_0= ruleELong ) ) otherlv_5= ',' ( (lv_period_6_0= ruleELong ) ) otherlv_7= ')' ( (lv_isDataFlow_8_0= 'DF' ) )? otherlv_9= '{' ( ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* )? ( ( (lv_actions_12_0= ruleXmod_Action ) ) ( (lv_actions_13_0= ruleXmod_Action ) )* )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getComponentAccess().getComponentKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getComponentAccess().getXmod_idKeyword_1());
            		
            // InternalSpice.g:295:3: ( (lv_xmod_id_2_0= ruleEString ) )
            // InternalSpice.g:296:4: (lv_xmod_id_2_0= ruleEString )
            {
            // InternalSpice.g:296:4: (lv_xmod_id_2_0= ruleEString )
            // InternalSpice.g:297:5: lv_xmod_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getXmod_idEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_xmod_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"xmod_id",
            						lv_xmod_id_2_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getComponentAccess().getLeftParenthesisKeyword_3());
            		
            // InternalSpice.g:318:3: ( (lv_priority_4_0= ruleELong ) )
            // InternalSpice.g:319:4: (lv_priority_4_0= ruleELong )
            {
            // InternalSpice.g:319:4: (lv_priority_4_0= ruleELong )
            // InternalSpice.g:320:5: lv_priority_4_0= ruleELong
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getPriorityELongParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_7);
            lv_priority_4_0=ruleELong();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"priority",
            						lv_priority_4_0,
            						"org.xtext.Spice.ELong");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getComponentAccess().getCommaKeyword_5());
            		
            // InternalSpice.g:341:3: ( (lv_period_6_0= ruleELong ) )
            // InternalSpice.g:342:4: (lv_period_6_0= ruleELong )
            {
            // InternalSpice.g:342:4: (lv_period_6_0= ruleELong )
            // InternalSpice.g:343:5: lv_period_6_0= ruleELong
            {

            					newCompositeNode(grammarAccess.getComponentAccess().getPeriodELongParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_period_6_0=ruleELong();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComponentRule());
            					}
            					set(
            						current,
            						"period",
            						lv_period_6_0,
            						"org.xtext.Spice.ELong");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_12); 

            			newLeafNode(otherlv_7, grammarAccess.getComponentAccess().getRightParenthesisKeyword_7());
            		
            // InternalSpice.g:364:3: ( (lv_isDataFlow_8_0= 'DF' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalSpice.g:365:4: (lv_isDataFlow_8_0= 'DF' )
                    {
                    // InternalSpice.g:365:4: (lv_isDataFlow_8_0= 'DF' )
                    // InternalSpice.g:366:5: lv_isDataFlow_8_0= 'DF'
                    {
                    lv_isDataFlow_8_0=(Token)match(input,19,FOLLOW_9); 

                    					newLeafNode(lv_isDataFlow_8_0, grammarAccess.getComponentAccess().getIsDataFlowDFKeyword_8_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComponentRule());
                    					}
                    					setWithLastConsumed(current, "isDataFlow", lv_isDataFlow_8_0 != null, "DF");
                    				

                    }


                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_13); 

            			newLeafNode(otherlv_9, grammarAccess.getComponentAccess().getLeftCurlyBracketKeyword_9());
            		
            // InternalSpice.g:382:3: ( ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)||LA7_0==26) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalSpice.g:383:4: ( (lv_attributes_10_0= ruleAttribute ) ) ( (lv_attributes_11_0= ruleAttribute ) )*
                    {
                    // InternalSpice.g:383:4: ( (lv_attributes_10_0= ruleAttribute ) )
                    // InternalSpice.g:384:5: (lv_attributes_10_0= ruleAttribute )
                    {
                    // InternalSpice.g:384:5: (lv_attributes_10_0= ruleAttribute )
                    // InternalSpice.g:385:6: lv_attributes_10_0= ruleAttribute
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getAttributesAttributeParserRuleCall_10_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_attributes_10_0=ruleAttribute();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"attributes",
                    							lv_attributes_10_0,
                    							"org.xtext.Spice.Attribute");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSpice.g:402:4: ( (lv_attributes_11_0= ruleAttribute ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||LA6_0==26) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalSpice.g:403:5: (lv_attributes_11_0= ruleAttribute )
                    	    {
                    	    // InternalSpice.g:403:5: (lv_attributes_11_0= ruleAttribute )
                    	    // InternalSpice.g:404:6: lv_attributes_11_0= ruleAttribute
                    	    {

                    	    						newCompositeNode(grammarAccess.getComponentAccess().getAttributesAttributeParserRuleCall_10_1_0());
                    	    					
                    	    pushFollow(FOLLOW_13);
                    	    lv_attributes_11_0=ruleAttribute();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"attributes",
                    	    							lv_attributes_11_0,
                    	    							"org.xtext.Spice.Attribute");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalSpice.g:422:3: ( ( (lv_actions_12_0= ruleXmod_Action ) ) ( (lv_actions_13_0= ruleXmod_Action ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSpice.g:423:4: ( (lv_actions_12_0= ruleXmod_Action ) ) ( (lv_actions_13_0= ruleXmod_Action ) )*
                    {
                    // InternalSpice.g:423:4: ( (lv_actions_12_0= ruleXmod_Action ) )
                    // InternalSpice.g:424:5: (lv_actions_12_0= ruleXmod_Action )
                    {
                    // InternalSpice.g:424:5: (lv_actions_12_0= ruleXmod_Action )
                    // InternalSpice.g:425:6: lv_actions_12_0= ruleXmod_Action
                    {

                    						newCompositeNode(grammarAccess.getComponentAccess().getActionsXmod_ActionParserRuleCall_11_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_actions_12_0=ruleXmod_Action();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    						}
                    						add(
                    							current,
                    							"actions",
                    							lv_actions_12_0,
                    							"org.xtext.Spice.Xmod_Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSpice.g:442:4: ( (lv_actions_13_0= ruleXmod_Action ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==30) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSpice.g:443:5: (lv_actions_13_0= ruleXmod_Action )
                    	    {
                    	    // InternalSpice.g:443:5: (lv_actions_13_0= ruleXmod_Action )
                    	    // InternalSpice.g:444:6: lv_actions_13_0= ruleXmod_Action
                    	    {

                    	    						newCompositeNode(grammarAccess.getComponentAccess().getActionsXmod_ActionParserRuleCall_11_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_actions_13_0=ruleXmod_Action();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComponentRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"actions",
                    	    							lv_actions_13_0,
                    	    							"org.xtext.Spice.Xmod_Action");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_14=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getComponentAccess().getRightCurlyBracketKeyword_12());
            		

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
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleView"
    // InternalSpice.g:470:1: entryRuleView returns [EObject current=null] : iv_ruleView= ruleView EOF ;
    public final EObject entryRuleView() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleView = null;


        try {
            // InternalSpice.g:470:45: (iv_ruleView= ruleView EOF )
            // InternalSpice.g:471:2: iv_ruleView= ruleView EOF
            {
             newCompositeNode(grammarAccess.getViewRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleView=ruleView();

            state._fsp--;

             current =iv_ruleView; 
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
    // $ANTLR end "entryRuleView"


    // $ANTLR start "ruleView"
    // InternalSpice.g:477:1: ruleView returns [EObject current=null] : (otherlv_0= 'View' otherlv_1= 'xmod_id:' ( (lv_xmod_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'host' ( (lv_host_5_0= ruleEString ) ) )? (otherlv_6= 'port' ( (lv_port_7_0= ruleEInt ) ) )? (otherlv_8= 'period' ( (lv_period_9_0= ruleELong ) ) )? (otherlv_10= 'observe' ( (lv_observedTags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_observedTags_13_0= ruleEString ) ) )* otherlv_14= ';' )? otherlv_15= '}' ) ;
    public final EObject ruleView() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_xmod_id_2_0 = null;

        AntlrDatatypeRuleToken lv_host_5_0 = null;

        AntlrDatatypeRuleToken lv_port_7_0 = null;

        AntlrDatatypeRuleToken lv_period_9_0 = null;

        AntlrDatatypeRuleToken lv_observedTags_11_0 = null;

        AntlrDatatypeRuleToken lv_observedTags_13_0 = null;



        	enterRule();

        try {
            // InternalSpice.g:483:2: ( (otherlv_0= 'View' otherlv_1= 'xmod_id:' ( (lv_xmod_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'host' ( (lv_host_5_0= ruleEString ) ) )? (otherlv_6= 'port' ( (lv_port_7_0= ruleEInt ) ) )? (otherlv_8= 'period' ( (lv_period_9_0= ruleELong ) ) )? (otherlv_10= 'observe' ( (lv_observedTags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_observedTags_13_0= ruleEString ) ) )* otherlv_14= ';' )? otherlv_15= '}' ) )
            // InternalSpice.g:484:2: (otherlv_0= 'View' otherlv_1= 'xmod_id:' ( (lv_xmod_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'host' ( (lv_host_5_0= ruleEString ) ) )? (otherlv_6= 'port' ( (lv_port_7_0= ruleEInt ) ) )? (otherlv_8= 'period' ( (lv_period_9_0= ruleELong ) ) )? (otherlv_10= 'observe' ( (lv_observedTags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_observedTags_13_0= ruleEString ) ) )* otherlv_14= ';' )? otherlv_15= '}' )
            {
            // InternalSpice.g:484:2: (otherlv_0= 'View' otherlv_1= 'xmod_id:' ( (lv_xmod_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'host' ( (lv_host_5_0= ruleEString ) ) )? (otherlv_6= 'port' ( (lv_port_7_0= ruleEInt ) ) )? (otherlv_8= 'period' ( (lv_period_9_0= ruleELong ) ) )? (otherlv_10= 'observe' ( (lv_observedTags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_observedTags_13_0= ruleEString ) ) )* otherlv_14= ';' )? otherlv_15= '}' )
            // InternalSpice.g:485:3: otherlv_0= 'View' otherlv_1= 'xmod_id:' ( (lv_xmod_id_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'host' ( (lv_host_5_0= ruleEString ) ) )? (otherlv_6= 'port' ( (lv_port_7_0= ruleEInt ) ) )? (otherlv_8= 'period' ( (lv_period_9_0= ruleELong ) ) )? (otherlv_10= 'observe' ( (lv_observedTags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_observedTags_13_0= ruleEString ) ) )* otherlv_14= ';' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getViewAccess().getViewKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getViewAccess().getXmod_idKeyword_1());
            		
            // InternalSpice.g:493:3: ( (lv_xmod_id_2_0= ruleEString ) )
            // InternalSpice.g:494:4: (lv_xmod_id_2_0= ruleEString )
            {
            // InternalSpice.g:494:4: (lv_xmod_id_2_0= ruleEString )
            // InternalSpice.g:495:5: lv_xmod_id_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getViewAccess().getXmod_idEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_xmod_id_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getViewRule());
            					}
            					set(
            						current,
            						"xmod_id",
            						lv_xmod_id_2_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getViewAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalSpice.g:516:3: (otherlv_4= 'host' ( (lv_host_5_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalSpice.g:517:4: otherlv_4= 'host' ( (lv_host_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getViewAccess().getHostKeyword_4_0());
                    			
                    // InternalSpice.g:521:4: ( (lv_host_5_0= ruleEString ) )
                    // InternalSpice.g:522:5: (lv_host_5_0= ruleEString )
                    {
                    // InternalSpice.g:522:5: (lv_host_5_0= ruleEString )
                    // InternalSpice.g:523:6: lv_host_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getViewAccess().getHostEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_host_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getViewRule());
                    						}
                    						set(
                    							current,
                    							"host",
                    							lv_host_5_0,
                    							"org.xtext.Spice.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSpice.g:541:3: (otherlv_6= 'port' ( (lv_port_7_0= ruleEInt ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalSpice.g:542:4: otherlv_6= 'port' ( (lv_port_7_0= ruleEInt ) )
                    {
                    otherlv_6=(Token)match(input,22,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getViewAccess().getPortKeyword_5_0());
                    			
                    // InternalSpice.g:546:4: ( (lv_port_7_0= ruleEInt ) )
                    // InternalSpice.g:547:5: (lv_port_7_0= ruleEInt )
                    {
                    // InternalSpice.g:547:5: (lv_port_7_0= ruleEInt )
                    // InternalSpice.g:548:6: lv_port_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getViewAccess().getPortEIntParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_port_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getViewRule());
                    						}
                    						set(
                    							current,
                    							"port",
                    							lv_port_7_0,
                    							"org.xtext.Spice.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSpice.g:566:3: (otherlv_8= 'period' ( (lv_period_9_0= ruleELong ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSpice.g:567:4: otherlv_8= 'period' ( (lv_period_9_0= ruleELong ) )
                    {
                    otherlv_8=(Token)match(input,23,FOLLOW_6); 

                    				newLeafNode(otherlv_8, grammarAccess.getViewAccess().getPeriodKeyword_6_0());
                    			
                    // InternalSpice.g:571:4: ( (lv_period_9_0= ruleELong ) )
                    // InternalSpice.g:572:5: (lv_period_9_0= ruleELong )
                    {
                    // InternalSpice.g:572:5: (lv_period_9_0= ruleELong )
                    // InternalSpice.g:573:6: lv_period_9_0= ruleELong
                    {

                    						newCompositeNode(grammarAccess.getViewAccess().getPeriodELongParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_period_9_0=ruleELong();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getViewRule());
                    						}
                    						set(
                    							current,
                    							"period",
                    							lv_period_9_0,
                    							"org.xtext.Spice.ELong");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSpice.g:591:3: (otherlv_10= 'observe' ( (lv_observedTags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_observedTags_13_0= ruleEString ) ) )* otherlv_14= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSpice.g:592:4: otherlv_10= 'observe' ( (lv_observedTags_11_0= ruleEString ) ) (otherlv_12= ',' ( (lv_observedTags_13_0= ruleEString ) ) )* otherlv_14= ';'
                    {
                    otherlv_10=(Token)match(input,24,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getViewAccess().getObserveKeyword_7_0());
                    			
                    // InternalSpice.g:596:4: ( (lv_observedTags_11_0= ruleEString ) )
                    // InternalSpice.g:597:5: (lv_observedTags_11_0= ruleEString )
                    {
                    // InternalSpice.g:597:5: (lv_observedTags_11_0= ruleEString )
                    // InternalSpice.g:598:6: lv_observedTags_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getViewAccess().getObservedTagsEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_observedTags_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getViewRule());
                    						}
                    						add(
                    							current,
                    							"observedTags",
                    							lv_observedTags_11_0,
                    							"org.xtext.Spice.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSpice.g:615:4: (otherlv_12= ',' ( (lv_observedTags_13_0= ruleEString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalSpice.g:616:5: otherlv_12= ',' ( (lv_observedTags_13_0= ruleEString ) )
                    	    {
                    	    otherlv_12=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_12, grammarAccess.getViewAccess().getCommaKeyword_7_2_0());
                    	    				
                    	    // InternalSpice.g:620:5: ( (lv_observedTags_13_0= ruleEString ) )
                    	    // InternalSpice.g:621:6: (lv_observedTags_13_0= ruleEString )
                    	    {
                    	    // InternalSpice.g:621:6: (lv_observedTags_13_0= ruleEString )
                    	    // InternalSpice.g:622:7: lv_observedTags_13_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getViewAccess().getObservedTagsEStringParserRuleCall_7_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_19);
                    	    lv_observedTags_13_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getViewRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"observedTags",
                    	    								lv_observedTags_13_0,
                    	    								"org.xtext.Spice.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,25,FOLLOW_20); 

                    				newLeafNode(otherlv_14, grammarAccess.getViewAccess().getSemicolonKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_15=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getViewAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleView"


    // $ANTLR start "entryRuleAttribute"
    // InternalSpice.g:653:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSpice.g:653:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSpice.g:654:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalSpice.g:660:1: ruleAttribute returns [EObject current=null] : (this_IntBasic_0= ruleIntBasic | this_IntArray_1= ruleIntArray | this_DoubleBasic_2= ruleDoubleBasic | this_DoubleArray_3= ruleDoubleArray | this_StringBasic_4= ruleStringBasic | this_StringArray_5= ruleStringArray | this_BooleanBasic_6= ruleBooleanBasic | this_BooleanArray_7= ruleBooleanArray ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        EObject this_IntBasic_0 = null;

        EObject this_IntArray_1 = null;

        EObject this_DoubleBasic_2 = null;

        EObject this_DoubleArray_3 = null;

        EObject this_StringBasic_4 = null;

        EObject this_StringArray_5 = null;

        EObject this_BooleanBasic_6 = null;

        EObject this_BooleanArray_7 = null;



        	enterRule();

        try {
            // InternalSpice.g:666:2: ( (this_IntBasic_0= ruleIntBasic | this_IntArray_1= ruleIntArray | this_DoubleBasic_2= ruleDoubleBasic | this_DoubleArray_3= ruleDoubleArray | this_StringBasic_4= ruleStringBasic | this_StringArray_5= ruleStringArray | this_BooleanBasic_6= ruleBooleanBasic | this_BooleanArray_7= ruleBooleanArray ) )
            // InternalSpice.g:667:2: (this_IntBasic_0= ruleIntBasic | this_IntArray_1= ruleIntArray | this_DoubleBasic_2= ruleDoubleBasic | this_DoubleArray_3= ruleDoubleArray | this_StringBasic_4= ruleStringBasic | this_StringArray_5= ruleStringArray | this_BooleanBasic_6= ruleBooleanBasic | this_BooleanArray_7= ruleBooleanArray )
            {
            // InternalSpice.g:667:2: (this_IntBasic_0= ruleIntBasic | this_IntArray_1= ruleIntArray | this_DoubleBasic_2= ruleDoubleBasic | this_DoubleArray_3= ruleDoubleArray | this_StringBasic_4= ruleStringBasic | this_StringArray_5= ruleStringArray | this_BooleanBasic_6= ruleBooleanBasic | this_BooleanArray_7= ruleBooleanArray )
            int alt15=8;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalSpice.g:668:3: this_IntBasic_0= ruleIntBasic
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getIntBasicParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntBasic_0=ruleIntBasic();

                    state._fsp--;


                    			current = this_IntBasic_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSpice.g:677:3: this_IntArray_1= ruleIntArray
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getIntArrayParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntArray_1=ruleIntArray();

                    state._fsp--;


                    			current = this_IntArray_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSpice.g:686:3: this_DoubleBasic_2= ruleDoubleBasic
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getDoubleBasicParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleBasic_2=ruleDoubleBasic();

                    state._fsp--;


                    			current = this_DoubleBasic_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalSpice.g:695:3: this_DoubleArray_3= ruleDoubleArray
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getDoubleArrayParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_DoubleArray_3=ruleDoubleArray();

                    state._fsp--;


                    			current = this_DoubleArray_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalSpice.g:704:3: this_StringBasic_4= ruleStringBasic
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getStringBasicParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringBasic_4=ruleStringBasic();

                    state._fsp--;


                    			current = this_StringBasic_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalSpice.g:713:3: this_StringArray_5= ruleStringArray
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getStringArrayParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringArray_5=ruleStringArray();

                    state._fsp--;


                    			current = this_StringArray_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalSpice.g:722:3: this_BooleanBasic_6= ruleBooleanBasic
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getBooleanBasicParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanBasic_6=ruleBooleanBasic();

                    state._fsp--;


                    			current = this_BooleanBasic_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalSpice.g:731:3: this_BooleanArray_7= ruleBooleanArray
                    {

                    			newCompositeNode(grammarAccess.getAttributeAccess().getBooleanArrayParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_BooleanArray_7=ruleBooleanArray();

                    state._fsp--;


                    			current = this_BooleanArray_7;
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleIntBasic"
    // InternalSpice.g:743:1: entryRuleIntBasic returns [EObject current=null] : iv_ruleIntBasic= ruleIntBasic EOF ;
    public final EObject entryRuleIntBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntBasic = null;


        try {
            // InternalSpice.g:743:49: (iv_ruleIntBasic= ruleIntBasic EOF )
            // InternalSpice.g:744:2: iv_ruleIntBasic= ruleIntBasic EOF
            {
             newCompositeNode(grammarAccess.getIntBasicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntBasic=ruleIntBasic();

            state._fsp--;

             current =iv_ruleIntBasic; 
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
    // $ANTLR end "entryRuleIntBasic"


    // $ANTLR start "ruleIntBasic"
    // InternalSpice.g:750:1: ruleIntBasic returns [EObject current=null] : ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= ';' ) ;
    public final EObject ruleIntBasic() throws RecognitionException {
        EObject current = null;

        Token lv_isObservable_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalSpice.g:756:2: ( ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= ';' ) )
            // InternalSpice.g:757:2: ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= ';' )
            {
            // InternalSpice.g:757:2: ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= ';' )
            // InternalSpice.g:758:3: ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEInt ) ) otherlv_5= ';'
            {
            // InternalSpice.g:758:3: ( (lv_isObservable_0_0= 'observable' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSpice.g:759:4: (lv_isObservable_0_0= 'observable' )
                    {
                    // InternalSpice.g:759:4: (lv_isObservable_0_0= 'observable' )
                    // InternalSpice.g:760:5: lv_isObservable_0_0= 'observable'
                    {
                    lv_isObservable_0_0=(Token)match(input,26,FOLLOW_4); 

                    					newLeafNode(lv_isObservable_0_0, grammarAccess.getIntBasicAccess().getIsObservableObservableKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIntBasicRule());
                    					}
                    					setWithLastConsumed(current, "isObservable", lv_isObservable_0_0 != null, "observable");
                    				

                    }


                    }
                    break;

            }

            // InternalSpice.g:772:3: ( (lv_type_1_0= ruleEString ) )
            // InternalSpice.g:773:4: (lv_type_1_0= ruleEString )
            {
            // InternalSpice.g:773:4: (lv_type_1_0= ruleEString )
            // InternalSpice.g:774:5: lv_type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntBasicAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntBasicRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpice.g:791:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSpice.g:792:4: (lv_name_2_0= ruleEString )
            {
            // InternalSpice.g:792:4: (lv_name_2_0= ruleEString )
            // InternalSpice.g:793:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntBasicAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntBasicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getIntBasicAccess().getEqualsSignKeyword_3());
            		
            // InternalSpice.g:814:3: ( (lv_value_4_0= ruleEInt ) )
            // InternalSpice.g:815:4: (lv_value_4_0= ruleEInt )
            {
            // InternalSpice.g:815:4: (lv_value_4_0= ruleEInt )
            // InternalSpice.g:816:5: lv_value_4_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getIntBasicAccess().getValueEIntParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_value_4_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntBasicRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.xtext.Spice.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIntBasicAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleIntBasic"


    // $ANTLR start "entryRuleIntArray"
    // InternalSpice.g:841:1: entryRuleIntArray returns [EObject current=null] : iv_ruleIntArray= ruleIntArray EOF ;
    public final EObject entryRuleIntArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntArray = null;


        try {
            // InternalSpice.g:841:49: (iv_ruleIntArray= ruleIntArray EOF )
            // InternalSpice.g:842:2: iv_ruleIntArray= ruleIntArray EOF
            {
             newCompositeNode(grammarAccess.getIntArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntArray=ruleIntArray();

            state._fsp--;

             current =iv_ruleIntArray; 
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
    // $ANTLR end "entryRuleIntArray"


    // $ANTLR start "ruleIntArray"
    // InternalSpice.g:848:1: ruleIntArray returns [EObject current=null] : ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEInt ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEInt ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEInt ) ) )* otherlv_13= ')' ) otherlv_14= ';' ) ;
    public final EObject ruleIntArray() throws RecognitionException {
        EObject current = null;

        Token lv_isObservable_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_value_10_0 = null;

        AntlrDatatypeRuleToken lv_value_12_0 = null;



        	enterRule();

        try {
            // InternalSpice.g:854:2: ( ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEInt ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEInt ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEInt ) ) )* otherlv_13= ')' ) otherlv_14= ';' ) )
            // InternalSpice.g:855:2: ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEInt ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEInt ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEInt ) ) )* otherlv_13= ')' ) otherlv_14= ';' )
            {
            // InternalSpice.g:855:2: ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEInt ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEInt ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEInt ) ) )* otherlv_13= ')' ) otherlv_14= ';' )
            // InternalSpice.g:856:3: ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEInt ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEInt ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEInt ) ) )* otherlv_13= ')' ) otherlv_14= ';'
            {
            // InternalSpice.g:856:3: ( (lv_isObservable_0_0= 'observable' ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSpice.g:857:4: (lv_isObservable_0_0= 'observable' )
                    {
                    // InternalSpice.g:857:4: (lv_isObservable_0_0= 'observable' )
                    // InternalSpice.g:858:5: lv_isObservable_0_0= 'observable'
                    {
                    lv_isObservable_0_0=(Token)match(input,26,FOLLOW_4); 

                    					newLeafNode(lv_isObservable_0_0, grammarAccess.getIntArrayAccess().getIsObservableObservableKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getIntArrayRule());
                    					}
                    					setWithLastConsumed(current, "isObservable", lv_isObservable_0_0 != null, "observable");
                    				

                    }


                    }
                    break;

            }

            // InternalSpice.g:870:3: ( (lv_type_1_0= ruleEString ) )
            // InternalSpice.g:871:4: (lv_type_1_0= ruleEString )
            {
            // InternalSpice.g:871:4: (lv_type_1_0= ruleEString )
            // InternalSpice.g:872:5: lv_type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntArrayAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntArrayRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpice.g:889:3: (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSpice.g:890:4: otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getIntArrayAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalSpice.g:894:4: ( (lv_multiplicity_3_0= ruleELong ) )
                    // InternalSpice.g:895:5: (lv_multiplicity_3_0= ruleELong )
                    {
                    // InternalSpice.g:895:5: (lv_multiplicity_3_0= ruleELong )
                    // InternalSpice.g:896:6: lv_multiplicity_3_0= ruleELong
                    {

                    						newCompositeNode(grammarAccess.getIntArrayAccess().getMultiplicityELongParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_multiplicity_3_0=ruleELong();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getIntArrayRule());
                    						}
                    						set(
                    							current,
                    							"multiplicity",
                    							lv_multiplicity_3_0,
                    							"org.xtext.Spice.ELong");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getIntArrayAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalSpice.g:918:3: ( (lv_name_5_0= ruleEString ) )
            // InternalSpice.g:919:4: (lv_name_5_0= ruleEString )
            {
            // InternalSpice.g:919:4: (lv_name_5_0= ruleEString )
            // InternalSpice.g:920:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIntArrayAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIntArrayRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getIntArrayAccess().getEqualsSignKeyword_4());
            		
            // InternalSpice.g:941:3: (otherlv_7= '(' ( (lv_value_8_0= ruleEInt ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEInt ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEInt ) ) )* otherlv_13= ')' )
            // InternalSpice.g:942:4: otherlv_7= '(' ( (lv_value_8_0= ruleEInt ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEInt ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEInt ) ) )* otherlv_13= ')'
            {
            otherlv_7=(Token)match(input,13,FOLLOW_6); 

            				newLeafNode(otherlv_7, grammarAccess.getIntArrayAccess().getLeftParenthesisKeyword_5_0());
            			
            // InternalSpice.g:946:4: ( (lv_value_8_0= ruleEInt ) )
            // InternalSpice.g:947:5: (lv_value_8_0= ruleEInt )
            {
            // InternalSpice.g:947:5: (lv_value_8_0= ruleEInt )
            // InternalSpice.g:948:6: lv_value_8_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getIntArrayAccess().getValueEIntParserRuleCall_5_1_0());
            					
            pushFollow(FOLLOW_7);
            lv_value_8_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getIntArrayRule());
            						}
            						add(
            							current,
            							"value",
            							lv_value_8_0,
            							"org.xtext.Spice.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_6); 

            				newLeafNode(otherlv_9, grammarAccess.getIntArrayAccess().getCommaKeyword_5_2());
            			
            // InternalSpice.g:969:4: ( (lv_value_10_0= ruleEInt ) )
            // InternalSpice.g:970:5: (lv_value_10_0= ruleEInt )
            {
            // InternalSpice.g:970:5: (lv_value_10_0= ruleEInt )
            // InternalSpice.g:971:6: lv_value_10_0= ruleEInt
            {

            						newCompositeNode(grammarAccess.getIntArrayAccess().getValueEIntParserRuleCall_5_3_0());
            					
            pushFollow(FOLLOW_25);
            lv_value_10_0=ruleEInt();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getIntArrayRule());
            						}
            						add(
            							current,
            							"value",
            							lv_value_10_0,
            							"org.xtext.Spice.EInt");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalSpice.g:988:4: (otherlv_11= ',' ( (lv_value_12_0= ruleEInt ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==14) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalSpice.g:989:5: otherlv_11= ',' ( (lv_value_12_0= ruleEInt ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_6); 

            	    					newLeafNode(otherlv_11, grammarAccess.getIntArrayAccess().getCommaKeyword_5_4_0());
            	    				
            	    // InternalSpice.g:993:5: ( (lv_value_12_0= ruleEInt ) )
            	    // InternalSpice.g:994:6: (lv_value_12_0= ruleEInt )
            	    {
            	    // InternalSpice.g:994:6: (lv_value_12_0= ruleEInt )
            	    // InternalSpice.g:995:7: lv_value_12_0= ruleEInt
            	    {

            	    							newCompositeNode(grammarAccess.getIntArrayAccess().getValueEIntParserRuleCall_5_4_1_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_value_12_0=ruleEInt();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getIntArrayRule());
            	    							}
            	    							add(
            	    								current,
            	    								"value",
            	    								lv_value_12_0,
            	    								"org.xtext.Spice.EInt");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_22); 

            				newLeafNode(otherlv_13, grammarAccess.getIntArrayAccess().getRightParenthesisKeyword_5_5());
            			

            }

            otherlv_14=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getIntArrayAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleIntArray"


    // $ANTLR start "entryRuleDoubleBasic"
    // InternalSpice.g:1026:1: entryRuleDoubleBasic returns [EObject current=null] : iv_ruleDoubleBasic= ruleDoubleBasic EOF ;
    public final EObject entryRuleDoubleBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleBasic = null;


        try {
            // InternalSpice.g:1026:52: (iv_ruleDoubleBasic= ruleDoubleBasic EOF )
            // InternalSpice.g:1027:2: iv_ruleDoubleBasic= ruleDoubleBasic EOF
            {
             newCompositeNode(grammarAccess.getDoubleBasicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleBasic=ruleDoubleBasic();

            state._fsp--;

             current =iv_ruleDoubleBasic; 
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
    // $ANTLR end "entryRuleDoubleBasic"


    // $ANTLR start "ruleDoubleBasic"
    // InternalSpice.g:1033:1: ruleDoubleBasic returns [EObject current=null] : ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEDouble ) ) otherlv_5= ';' ) ;
    public final EObject ruleDoubleBasic() throws RecognitionException {
        EObject current = null;

        Token lv_isObservable_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalSpice.g:1039:2: ( ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEDouble ) ) otherlv_5= ';' ) )
            // InternalSpice.g:1040:2: ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEDouble ) ) otherlv_5= ';' )
            {
            // InternalSpice.g:1040:2: ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEDouble ) ) otherlv_5= ';' )
            // InternalSpice.g:1041:3: ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEDouble ) ) otherlv_5= ';'
            {
            // InternalSpice.g:1041:3: ( (lv_isObservable_0_0= 'observable' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSpice.g:1042:4: (lv_isObservable_0_0= 'observable' )
                    {
                    // InternalSpice.g:1042:4: (lv_isObservable_0_0= 'observable' )
                    // InternalSpice.g:1043:5: lv_isObservable_0_0= 'observable'
                    {
                    lv_isObservable_0_0=(Token)match(input,26,FOLLOW_4); 

                    					newLeafNode(lv_isObservable_0_0, grammarAccess.getDoubleBasicAccess().getIsObservableObservableKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDoubleBasicRule());
                    					}
                    					setWithLastConsumed(current, "isObservable", lv_isObservable_0_0 != null, "observable");
                    				

                    }


                    }
                    break;

            }

            // InternalSpice.g:1055:3: ( (lv_type_1_0= ruleEString ) )
            // InternalSpice.g:1056:4: (lv_type_1_0= ruleEString )
            {
            // InternalSpice.g:1056:4: (lv_type_1_0= ruleEString )
            // InternalSpice.g:1057:5: lv_type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDoubleBasicAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoubleBasicRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpice.g:1074:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSpice.g:1075:4: (lv_name_2_0= ruleEString )
            {
            // InternalSpice.g:1075:4: (lv_name_2_0= ruleEString )
            // InternalSpice.g:1076:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDoubleBasicAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoubleBasicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_26); 

            			newLeafNode(otherlv_3, grammarAccess.getDoubleBasicAccess().getEqualsSignKeyword_3());
            		
            // InternalSpice.g:1097:3: ( (lv_value_4_0= ruleEDouble ) )
            // InternalSpice.g:1098:4: (lv_value_4_0= ruleEDouble )
            {
            // InternalSpice.g:1098:4: (lv_value_4_0= ruleEDouble )
            // InternalSpice.g:1099:5: lv_value_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getDoubleBasicAccess().getValueEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_value_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoubleBasicRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.xtext.Spice.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDoubleBasicAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleDoubleBasic"


    // $ANTLR start "entryRuleDoubleArray"
    // InternalSpice.g:1124:1: entryRuleDoubleArray returns [EObject current=null] : iv_ruleDoubleArray= ruleDoubleArray EOF ;
    public final EObject entryRuleDoubleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoubleArray = null;


        try {
            // InternalSpice.g:1124:52: (iv_ruleDoubleArray= ruleDoubleArray EOF )
            // InternalSpice.g:1125:2: iv_ruleDoubleArray= ruleDoubleArray EOF
            {
             newCompositeNode(grammarAccess.getDoubleArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoubleArray=ruleDoubleArray();

            state._fsp--;

             current =iv_ruleDoubleArray; 
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
    // $ANTLR end "entryRuleDoubleArray"


    // $ANTLR start "ruleDoubleArray"
    // InternalSpice.g:1131:1: ruleDoubleArray returns [EObject current=null] : ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEDouble ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEDouble ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEDouble ) ) )* otherlv_13= ')' ) otherlv_14= ';' ) ;
    public final EObject ruleDoubleArray() throws RecognitionException {
        EObject current = null;

        Token lv_isObservable_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_value_10_0 = null;

        AntlrDatatypeRuleToken lv_value_12_0 = null;



        	enterRule();

        try {
            // InternalSpice.g:1137:2: ( ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEDouble ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEDouble ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEDouble ) ) )* otherlv_13= ')' ) otherlv_14= ';' ) )
            // InternalSpice.g:1138:2: ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEDouble ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEDouble ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEDouble ) ) )* otherlv_13= ')' ) otherlv_14= ';' )
            {
            // InternalSpice.g:1138:2: ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEDouble ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEDouble ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEDouble ) ) )* otherlv_13= ')' ) otherlv_14= ';' )
            // InternalSpice.g:1139:3: ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEDouble ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEDouble ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEDouble ) ) )* otherlv_13= ')' ) otherlv_14= ';'
            {
            // InternalSpice.g:1139:3: ( (lv_isObservable_0_0= 'observable' ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSpice.g:1140:4: (lv_isObservable_0_0= 'observable' )
                    {
                    // InternalSpice.g:1140:4: (lv_isObservable_0_0= 'observable' )
                    // InternalSpice.g:1141:5: lv_isObservable_0_0= 'observable'
                    {
                    lv_isObservable_0_0=(Token)match(input,26,FOLLOW_4); 

                    					newLeafNode(lv_isObservable_0_0, grammarAccess.getDoubleArrayAccess().getIsObservableObservableKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDoubleArrayRule());
                    					}
                    					setWithLastConsumed(current, "isObservable", lv_isObservable_0_0 != null, "observable");
                    				

                    }


                    }
                    break;

            }

            // InternalSpice.g:1153:3: ( (lv_type_1_0= ruleEString ) )
            // InternalSpice.g:1154:4: (lv_type_1_0= ruleEString )
            {
            // InternalSpice.g:1154:4: (lv_type_1_0= ruleEString )
            // InternalSpice.g:1155:5: lv_type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDoubleArrayAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoubleArrayRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpice.g:1172:3: (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSpice.g:1173:4: otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getDoubleArrayAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalSpice.g:1177:4: ( (lv_multiplicity_3_0= ruleELong ) )
                    // InternalSpice.g:1178:5: (lv_multiplicity_3_0= ruleELong )
                    {
                    // InternalSpice.g:1178:5: (lv_multiplicity_3_0= ruleELong )
                    // InternalSpice.g:1179:6: lv_multiplicity_3_0= ruleELong
                    {

                    						newCompositeNode(grammarAccess.getDoubleArrayAccess().getMultiplicityELongParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_multiplicity_3_0=ruleELong();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDoubleArrayRule());
                    						}
                    						set(
                    							current,
                    							"multiplicity",
                    							lv_multiplicity_3_0,
                    							"org.xtext.Spice.ELong");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getDoubleArrayAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalSpice.g:1201:3: ( (lv_name_5_0= ruleEString ) )
            // InternalSpice.g:1202:4: (lv_name_5_0= ruleEString )
            {
            // InternalSpice.g:1202:4: (lv_name_5_0= ruleEString )
            // InternalSpice.g:1203:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDoubleArrayAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoubleArrayRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getDoubleArrayAccess().getEqualsSignKeyword_4());
            		
            // InternalSpice.g:1224:3: (otherlv_7= '(' ( (lv_value_8_0= ruleEDouble ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEDouble ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEDouble ) ) )* otherlv_13= ')' )
            // InternalSpice.g:1225:4: otherlv_7= '(' ( (lv_value_8_0= ruleEDouble ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEDouble ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEDouble ) ) )* otherlv_13= ')'
            {
            otherlv_7=(Token)match(input,13,FOLLOW_26); 

            				newLeafNode(otherlv_7, grammarAccess.getDoubleArrayAccess().getLeftParenthesisKeyword_5_0());
            			
            // InternalSpice.g:1229:4: ( (lv_value_8_0= ruleEDouble ) )
            // InternalSpice.g:1230:5: (lv_value_8_0= ruleEDouble )
            {
            // InternalSpice.g:1230:5: (lv_value_8_0= ruleEDouble )
            // InternalSpice.g:1231:6: lv_value_8_0= ruleEDouble
            {

            						newCompositeNode(grammarAccess.getDoubleArrayAccess().getValueEDoubleParserRuleCall_5_1_0());
            					
            pushFollow(FOLLOW_7);
            lv_value_8_0=ruleEDouble();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDoubleArrayRule());
            						}
            						add(
            							current,
            							"value",
            							lv_value_8_0,
            							"org.xtext.Spice.EDouble");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_26); 

            				newLeafNode(otherlv_9, grammarAccess.getDoubleArrayAccess().getCommaKeyword_5_2());
            			
            // InternalSpice.g:1252:4: ( (lv_value_10_0= ruleEDouble ) )
            // InternalSpice.g:1253:5: (lv_value_10_0= ruleEDouble )
            {
            // InternalSpice.g:1253:5: (lv_value_10_0= ruleEDouble )
            // InternalSpice.g:1254:6: lv_value_10_0= ruleEDouble
            {

            						newCompositeNode(grammarAccess.getDoubleArrayAccess().getValueEDoubleParserRuleCall_5_3_0());
            					
            pushFollow(FOLLOW_25);
            lv_value_10_0=ruleEDouble();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDoubleArrayRule());
            						}
            						add(
            							current,
            							"value",
            							lv_value_10_0,
            							"org.xtext.Spice.EDouble");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalSpice.g:1271:4: (otherlv_11= ',' ( (lv_value_12_0= ruleEDouble ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==14) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSpice.g:1272:5: otherlv_11= ',' ( (lv_value_12_0= ruleEDouble ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_26); 

            	    					newLeafNode(otherlv_11, grammarAccess.getDoubleArrayAccess().getCommaKeyword_5_4_0());
            	    				
            	    // InternalSpice.g:1276:5: ( (lv_value_12_0= ruleEDouble ) )
            	    // InternalSpice.g:1277:6: (lv_value_12_0= ruleEDouble )
            	    {
            	    // InternalSpice.g:1277:6: (lv_value_12_0= ruleEDouble )
            	    // InternalSpice.g:1278:7: lv_value_12_0= ruleEDouble
            	    {

            	    							newCompositeNode(grammarAccess.getDoubleArrayAccess().getValueEDoubleParserRuleCall_5_4_1_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_value_12_0=ruleEDouble();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getDoubleArrayRule());
            	    							}
            	    							add(
            	    								current,
            	    								"value",
            	    								lv_value_12_0,
            	    								"org.xtext.Spice.EDouble");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_22); 

            				newLeafNode(otherlv_13, grammarAccess.getDoubleArrayAccess().getRightParenthesisKeyword_5_5());
            			

            }

            otherlv_14=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getDoubleArrayAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleDoubleArray"


    // $ANTLR start "entryRuleStringBasic"
    // InternalSpice.g:1309:1: entryRuleStringBasic returns [EObject current=null] : iv_ruleStringBasic= ruleStringBasic EOF ;
    public final EObject entryRuleStringBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringBasic = null;


        try {
            // InternalSpice.g:1309:52: (iv_ruleStringBasic= ruleStringBasic EOF )
            // InternalSpice.g:1310:2: iv_ruleStringBasic= ruleStringBasic EOF
            {
             newCompositeNode(grammarAccess.getStringBasicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringBasic=ruleStringBasic();

            state._fsp--;

             current =iv_ruleStringBasic; 
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
    // $ANTLR end "entryRuleStringBasic"


    // $ANTLR start "ruleStringBasic"
    // InternalSpice.g:1316:1: ruleStringBasic returns [EObject current=null] : ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) otherlv_5= ';' ) ;
    public final EObject ruleStringBasic() throws RecognitionException {
        EObject current = null;

        Token lv_isObservable_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalSpice.g:1322:2: ( ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) otherlv_5= ';' ) )
            // InternalSpice.g:1323:2: ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) otherlv_5= ';' )
            {
            // InternalSpice.g:1323:2: ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) otherlv_5= ';' )
            // InternalSpice.g:1324:3: ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEString ) ) otherlv_5= ';'
            {
            // InternalSpice.g:1324:3: ( (lv_isObservable_0_0= 'observable' ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSpice.g:1325:4: (lv_isObservable_0_0= 'observable' )
                    {
                    // InternalSpice.g:1325:4: (lv_isObservable_0_0= 'observable' )
                    // InternalSpice.g:1326:5: lv_isObservable_0_0= 'observable'
                    {
                    lv_isObservable_0_0=(Token)match(input,26,FOLLOW_4); 

                    					newLeafNode(lv_isObservable_0_0, grammarAccess.getStringBasicAccess().getIsObservableObservableKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringBasicRule());
                    					}
                    					setWithLastConsumed(current, "isObservable", lv_isObservable_0_0 != null, "observable");
                    				

                    }


                    }
                    break;

            }

            // InternalSpice.g:1338:3: ( (lv_type_1_0= ruleEString ) )
            // InternalSpice.g:1339:4: (lv_type_1_0= ruleEString )
            {
            // InternalSpice.g:1339:4: (lv_type_1_0= ruleEString )
            // InternalSpice.g:1340:5: lv_type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringBasicAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringBasicRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpice.g:1357:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSpice.g:1358:4: (lv_name_2_0= ruleEString )
            {
            // InternalSpice.g:1358:4: (lv_name_2_0= ruleEString )
            // InternalSpice.g:1359:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringBasicAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringBasicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_4); 

            			newLeafNode(otherlv_3, grammarAccess.getStringBasicAccess().getEqualsSignKeyword_3());
            		
            // InternalSpice.g:1380:3: ( (lv_value_4_0= ruleEString ) )
            // InternalSpice.g:1381:4: (lv_value_4_0= ruleEString )
            {
            // InternalSpice.g:1381:4: (lv_value_4_0= ruleEString )
            // InternalSpice.g:1382:5: lv_value_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringBasicAccess().getValueEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_value_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringBasicRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getStringBasicAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleStringBasic"


    // $ANTLR start "entryRuleStringArray"
    // InternalSpice.g:1407:1: entryRuleStringArray returns [EObject current=null] : iv_ruleStringArray= ruleStringArray EOF ;
    public final EObject entryRuleStringArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringArray = null;


        try {
            // InternalSpice.g:1407:52: (iv_ruleStringArray= ruleStringArray EOF )
            // InternalSpice.g:1408:2: iv_ruleStringArray= ruleStringArray EOF
            {
             newCompositeNode(grammarAccess.getStringArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringArray=ruleStringArray();

            state._fsp--;

             current =iv_ruleStringArray; 
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
    // $ANTLR end "entryRuleStringArray"


    // $ANTLR start "ruleStringArray"
    // InternalSpice.g:1414:1: ruleStringArray returns [EObject current=null] : ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEString ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEString ) ) )* otherlv_13= ')' ) otherlv_14= ';' ) ;
    public final EObject ruleStringArray() throws RecognitionException {
        EObject current = null;

        Token lv_isObservable_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_value_10_0 = null;

        AntlrDatatypeRuleToken lv_value_12_0 = null;



        	enterRule();

        try {
            // InternalSpice.g:1420:2: ( ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEString ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEString ) ) )* otherlv_13= ')' ) otherlv_14= ';' ) )
            // InternalSpice.g:1421:2: ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEString ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEString ) ) )* otherlv_13= ')' ) otherlv_14= ';' )
            {
            // InternalSpice.g:1421:2: ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEString ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEString ) ) )* otherlv_13= ')' ) otherlv_14= ';' )
            // InternalSpice.g:1422:3: ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEString ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEString ) ) )* otherlv_13= ')' ) otherlv_14= ';'
            {
            // InternalSpice.g:1422:3: ( (lv_isObservable_0_0= 'observable' ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==26) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSpice.g:1423:4: (lv_isObservable_0_0= 'observable' )
                    {
                    // InternalSpice.g:1423:4: (lv_isObservable_0_0= 'observable' )
                    // InternalSpice.g:1424:5: lv_isObservable_0_0= 'observable'
                    {
                    lv_isObservable_0_0=(Token)match(input,26,FOLLOW_4); 

                    					newLeafNode(lv_isObservable_0_0, grammarAccess.getStringArrayAccess().getIsObservableObservableKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getStringArrayRule());
                    					}
                    					setWithLastConsumed(current, "isObservable", lv_isObservable_0_0 != null, "observable");
                    				

                    }


                    }
                    break;

            }

            // InternalSpice.g:1436:3: ( (lv_type_1_0= ruleEString ) )
            // InternalSpice.g:1437:4: (lv_type_1_0= ruleEString )
            {
            // InternalSpice.g:1437:4: (lv_type_1_0= ruleEString )
            // InternalSpice.g:1438:5: lv_type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringArrayAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringArrayRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpice.g:1455:3: (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSpice.g:1456:4: otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getStringArrayAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalSpice.g:1460:4: ( (lv_multiplicity_3_0= ruleELong ) )
                    // InternalSpice.g:1461:5: (lv_multiplicity_3_0= ruleELong )
                    {
                    // InternalSpice.g:1461:5: (lv_multiplicity_3_0= ruleELong )
                    // InternalSpice.g:1462:6: lv_multiplicity_3_0= ruleELong
                    {

                    						newCompositeNode(grammarAccess.getStringArrayAccess().getMultiplicityELongParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_multiplicity_3_0=ruleELong();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStringArrayRule());
                    						}
                    						set(
                    							current,
                    							"multiplicity",
                    							lv_multiplicity_3_0,
                    							"org.xtext.Spice.ELong");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getStringArrayAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalSpice.g:1484:3: ( (lv_name_5_0= ruleEString ) )
            // InternalSpice.g:1485:4: (lv_name_5_0= ruleEString )
            {
            // InternalSpice.g:1485:4: (lv_name_5_0= ruleEString )
            // InternalSpice.g:1486:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getStringArrayAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStringArrayRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getStringArrayAccess().getEqualsSignKeyword_4());
            		
            // InternalSpice.g:1507:3: (otherlv_7= '(' ( (lv_value_8_0= ruleEString ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEString ) ) )* otherlv_13= ')' )
            // InternalSpice.g:1508:4: otherlv_7= '(' ( (lv_value_8_0= ruleEString ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEString ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEString ) ) )* otherlv_13= ')'
            {
            otherlv_7=(Token)match(input,13,FOLLOW_4); 

            				newLeafNode(otherlv_7, grammarAccess.getStringArrayAccess().getLeftParenthesisKeyword_5_0());
            			
            // InternalSpice.g:1512:4: ( (lv_value_8_0= ruleEString ) )
            // InternalSpice.g:1513:5: (lv_value_8_0= ruleEString )
            {
            // InternalSpice.g:1513:5: (lv_value_8_0= ruleEString )
            // InternalSpice.g:1514:6: lv_value_8_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getStringArrayAccess().getValueEStringParserRuleCall_5_1_0());
            					
            pushFollow(FOLLOW_7);
            lv_value_8_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStringArrayRule());
            						}
            						add(
            							current,
            							"value",
            							lv_value_8_0,
            							"org.xtext.Spice.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_4); 

            				newLeafNode(otherlv_9, grammarAccess.getStringArrayAccess().getCommaKeyword_5_2());
            			
            // InternalSpice.g:1535:4: ( (lv_value_10_0= ruleEString ) )
            // InternalSpice.g:1536:5: (lv_value_10_0= ruleEString )
            {
            // InternalSpice.g:1536:5: (lv_value_10_0= ruleEString )
            // InternalSpice.g:1537:6: lv_value_10_0= ruleEString
            {

            						newCompositeNode(grammarAccess.getStringArrayAccess().getValueEStringParserRuleCall_5_3_0());
            					
            pushFollow(FOLLOW_25);
            lv_value_10_0=ruleEString();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getStringArrayRule());
            						}
            						add(
            							current,
            							"value",
            							lv_value_10_0,
            							"org.xtext.Spice.EString");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalSpice.g:1554:4: (otherlv_11= ',' ( (lv_value_12_0= ruleEString ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==14) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalSpice.g:1555:5: otherlv_11= ',' ( (lv_value_12_0= ruleEString ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_4); 

            	    					newLeafNode(otherlv_11, grammarAccess.getStringArrayAccess().getCommaKeyword_5_4_0());
            	    				
            	    // InternalSpice.g:1559:5: ( (lv_value_12_0= ruleEString ) )
            	    // InternalSpice.g:1560:6: (lv_value_12_0= ruleEString )
            	    {
            	    // InternalSpice.g:1560:6: (lv_value_12_0= ruleEString )
            	    // InternalSpice.g:1561:7: lv_value_12_0= ruleEString
            	    {

            	    							newCompositeNode(grammarAccess.getStringArrayAccess().getValueEStringParserRuleCall_5_4_1_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_value_12_0=ruleEString();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getStringArrayRule());
            	    							}
            	    							add(
            	    								current,
            	    								"value",
            	    								lv_value_12_0,
            	    								"org.xtext.Spice.EString");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_22); 

            				newLeafNode(otherlv_13, grammarAccess.getStringArrayAccess().getRightParenthesisKeyword_5_5());
            			

            }

            otherlv_14=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getStringArrayAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleStringArray"


    // $ANTLR start "entryRuleBooleanBasic"
    // InternalSpice.g:1592:1: entryRuleBooleanBasic returns [EObject current=null] : iv_ruleBooleanBasic= ruleBooleanBasic EOF ;
    public final EObject entryRuleBooleanBasic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanBasic = null;


        try {
            // InternalSpice.g:1592:53: (iv_ruleBooleanBasic= ruleBooleanBasic EOF )
            // InternalSpice.g:1593:2: iv_ruleBooleanBasic= ruleBooleanBasic EOF
            {
             newCompositeNode(grammarAccess.getBooleanBasicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanBasic=ruleBooleanBasic();

            state._fsp--;

             current =iv_ruleBooleanBasic; 
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
    // $ANTLR end "entryRuleBooleanBasic"


    // $ANTLR start "ruleBooleanBasic"
    // InternalSpice.g:1599:1: ruleBooleanBasic returns [EObject current=null] : ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) ) otherlv_5= ';' ) ;
    public final EObject ruleBooleanBasic() throws RecognitionException {
        EObject current = null;

        Token lv_isObservable_0_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalSpice.g:1605:2: ( ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) ) otherlv_5= ';' ) )
            // InternalSpice.g:1606:2: ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) ) otherlv_5= ';' )
            {
            // InternalSpice.g:1606:2: ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) ) otherlv_5= ';' )
            // InternalSpice.g:1607:3: ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) ( (lv_name_2_0= ruleEString ) ) otherlv_3= '=' ( (lv_value_4_0= ruleEBoolean ) ) otherlv_5= ';'
            {
            // InternalSpice.g:1607:3: ( (lv_isObservable_0_0= 'observable' ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==26) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSpice.g:1608:4: (lv_isObservable_0_0= 'observable' )
                    {
                    // InternalSpice.g:1608:4: (lv_isObservable_0_0= 'observable' )
                    // InternalSpice.g:1609:5: lv_isObservable_0_0= 'observable'
                    {
                    lv_isObservable_0_0=(Token)match(input,26,FOLLOW_4); 

                    					newLeafNode(lv_isObservable_0_0, grammarAccess.getBooleanBasicAccess().getIsObservableObservableKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanBasicRule());
                    					}
                    					setWithLastConsumed(current, "isObservable", lv_isObservable_0_0 != null, "observable");
                    				

                    }


                    }
                    break;

            }

            // InternalSpice.g:1621:3: ( (lv_type_1_0= ruleEString ) )
            // InternalSpice.g:1622:4: (lv_type_1_0= ruleEString )
            {
            // InternalSpice.g:1622:4: (lv_type_1_0= ruleEString )
            // InternalSpice.g:1623:5: lv_type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBooleanBasicAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanBasicRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpice.g:1640:3: ( (lv_name_2_0= ruleEString ) )
            // InternalSpice.g:1641:4: (lv_name_2_0= ruleEString )
            {
            // InternalSpice.g:1641:4: (lv_name_2_0= ruleEString )
            // InternalSpice.g:1642:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBooleanBasicAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanBasicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27); 

            			newLeafNode(otherlv_3, grammarAccess.getBooleanBasicAccess().getEqualsSignKeyword_3());
            		
            // InternalSpice.g:1663:3: ( (lv_value_4_0= ruleEBoolean ) )
            // InternalSpice.g:1664:4: (lv_value_4_0= ruleEBoolean )
            {
            // InternalSpice.g:1664:4: (lv_value_4_0= ruleEBoolean )
            // InternalSpice.g:1665:5: lv_value_4_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getBooleanBasicAccess().getValueEBooleanParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
            lv_value_4_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanBasicRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.xtext.Spice.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBooleanBasicAccess().getSemicolonKeyword_5());
            		

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
    // $ANTLR end "ruleBooleanBasic"


    // $ANTLR start "entryRuleBooleanArray"
    // InternalSpice.g:1690:1: entryRuleBooleanArray returns [EObject current=null] : iv_ruleBooleanArray= ruleBooleanArray EOF ;
    public final EObject entryRuleBooleanArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanArray = null;


        try {
            // InternalSpice.g:1690:53: (iv_ruleBooleanArray= ruleBooleanArray EOF )
            // InternalSpice.g:1691:2: iv_ruleBooleanArray= ruleBooleanArray EOF
            {
             newCompositeNode(grammarAccess.getBooleanArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBooleanArray=ruleBooleanArray();

            state._fsp--;

             current =iv_ruleBooleanArray; 
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
    // $ANTLR end "entryRuleBooleanArray"


    // $ANTLR start "ruleBooleanArray"
    // InternalSpice.g:1697:1: ruleBooleanArray returns [EObject current=null] : ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEBoolean ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEBoolean ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEBoolean ) ) )* otherlv_13= ')' ) otherlv_14= ';' ) ;
    public final EObject ruleBooleanArray() throws RecognitionException {
        EObject current = null;

        Token lv_isObservable_0_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_multiplicity_3_0 = null;

        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_value_8_0 = null;

        AntlrDatatypeRuleToken lv_value_10_0 = null;

        AntlrDatatypeRuleToken lv_value_12_0 = null;



        	enterRule();

        try {
            // InternalSpice.g:1703:2: ( ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEBoolean ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEBoolean ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEBoolean ) ) )* otherlv_13= ')' ) otherlv_14= ';' ) )
            // InternalSpice.g:1704:2: ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEBoolean ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEBoolean ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEBoolean ) ) )* otherlv_13= ')' ) otherlv_14= ';' )
            {
            // InternalSpice.g:1704:2: ( ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEBoolean ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEBoolean ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEBoolean ) ) )* otherlv_13= ')' ) otherlv_14= ';' )
            // InternalSpice.g:1705:3: ( (lv_isObservable_0_0= 'observable' ) )? ( (lv_type_1_0= ruleEString ) ) (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )? ( (lv_name_5_0= ruleEString ) ) otherlv_6= '=' (otherlv_7= '(' ( (lv_value_8_0= ruleEBoolean ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEBoolean ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEBoolean ) ) )* otherlv_13= ')' ) otherlv_14= ';'
            {
            // InternalSpice.g:1705:3: ( (lv_isObservable_0_0= 'observable' ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSpice.g:1706:4: (lv_isObservable_0_0= 'observable' )
                    {
                    // InternalSpice.g:1706:4: (lv_isObservable_0_0= 'observable' )
                    // InternalSpice.g:1707:5: lv_isObservable_0_0= 'observable'
                    {
                    lv_isObservable_0_0=(Token)match(input,26,FOLLOW_4); 

                    					newLeafNode(lv_isObservable_0_0, grammarAccess.getBooleanArrayAccess().getIsObservableObservableKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBooleanArrayRule());
                    					}
                    					setWithLastConsumed(current, "isObservable", lv_isObservable_0_0 != null, "observable");
                    				

                    }


                    }
                    break;

            }

            // InternalSpice.g:1719:3: ( (lv_type_1_0= ruleEString ) )
            // InternalSpice.g:1720:4: (lv_type_1_0= ruleEString )
            {
            // InternalSpice.g:1720:4: (lv_type_1_0= ruleEString )
            // InternalSpice.g:1721:5: lv_type_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBooleanArrayAccess().getTypeEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_23);
            lv_type_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanArrayRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpice.g:1738:3: (otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==28) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSpice.g:1739:4: otherlv_2= '[' ( (lv_multiplicity_3_0= ruleELong ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,28,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getBooleanArrayAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalSpice.g:1743:4: ( (lv_multiplicity_3_0= ruleELong ) )
                    // InternalSpice.g:1744:5: (lv_multiplicity_3_0= ruleELong )
                    {
                    // InternalSpice.g:1744:5: (lv_multiplicity_3_0= ruleELong )
                    // InternalSpice.g:1745:6: lv_multiplicity_3_0= ruleELong
                    {

                    						newCompositeNode(grammarAccess.getBooleanArrayAccess().getMultiplicityELongParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_multiplicity_3_0=ruleELong();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getBooleanArrayRule());
                    						}
                    						set(
                    							current,
                    							"multiplicity",
                    							lv_multiplicity_3_0,
                    							"org.xtext.Spice.ELong");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,29,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getBooleanArrayAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            // InternalSpice.g:1767:3: ( (lv_name_5_0= ruleEString ) )
            // InternalSpice.g:1768:4: (lv_name_5_0= ruleEString )
            {
            // InternalSpice.g:1768:4: (lv_name_5_0= ruleEString )
            // InternalSpice.g:1769:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBooleanArrayAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBooleanArrayRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_6, grammarAccess.getBooleanArrayAccess().getEqualsSignKeyword_4());
            		
            // InternalSpice.g:1790:3: (otherlv_7= '(' ( (lv_value_8_0= ruleEBoolean ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEBoolean ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEBoolean ) ) )* otherlv_13= ')' )
            // InternalSpice.g:1791:4: otherlv_7= '(' ( (lv_value_8_0= ruleEBoolean ) ) otherlv_9= ',' ( (lv_value_10_0= ruleEBoolean ) ) (otherlv_11= ',' ( (lv_value_12_0= ruleEBoolean ) ) )* otherlv_13= ')'
            {
            otherlv_7=(Token)match(input,13,FOLLOW_27); 

            				newLeafNode(otherlv_7, grammarAccess.getBooleanArrayAccess().getLeftParenthesisKeyword_5_0());
            			
            // InternalSpice.g:1795:4: ( (lv_value_8_0= ruleEBoolean ) )
            // InternalSpice.g:1796:5: (lv_value_8_0= ruleEBoolean )
            {
            // InternalSpice.g:1796:5: (lv_value_8_0= ruleEBoolean )
            // InternalSpice.g:1797:6: lv_value_8_0= ruleEBoolean
            {

            						newCompositeNode(grammarAccess.getBooleanArrayAccess().getValueEBooleanParserRuleCall_5_1_0());
            					
            pushFollow(FOLLOW_7);
            lv_value_8_0=ruleEBoolean();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBooleanArrayRule());
            						}
            						add(
            							current,
            							"value",
            							lv_value_8_0,
            							"org.xtext.Spice.EBoolean");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_9=(Token)match(input,14,FOLLOW_27); 

            				newLeafNode(otherlv_9, grammarAccess.getBooleanArrayAccess().getCommaKeyword_5_2());
            			
            // InternalSpice.g:1818:4: ( (lv_value_10_0= ruleEBoolean ) )
            // InternalSpice.g:1819:5: (lv_value_10_0= ruleEBoolean )
            {
            // InternalSpice.g:1819:5: (lv_value_10_0= ruleEBoolean )
            // InternalSpice.g:1820:6: lv_value_10_0= ruleEBoolean
            {

            						newCompositeNode(grammarAccess.getBooleanArrayAccess().getValueEBooleanParserRuleCall_5_3_0());
            					
            pushFollow(FOLLOW_25);
            lv_value_10_0=ruleEBoolean();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getBooleanArrayRule());
            						}
            						add(
            							current,
            							"value",
            							lv_value_10_0,
            							"org.xtext.Spice.EBoolean");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalSpice.g:1837:4: (otherlv_11= ',' ( (lv_value_12_0= ruleEBoolean ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==14) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalSpice.g:1838:5: otherlv_11= ',' ( (lv_value_12_0= ruleEBoolean ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_27); 

            	    					newLeafNode(otherlv_11, grammarAccess.getBooleanArrayAccess().getCommaKeyword_5_4_0());
            	    				
            	    // InternalSpice.g:1842:5: ( (lv_value_12_0= ruleEBoolean ) )
            	    // InternalSpice.g:1843:6: (lv_value_12_0= ruleEBoolean )
            	    {
            	    // InternalSpice.g:1843:6: (lv_value_12_0= ruleEBoolean )
            	    // InternalSpice.g:1844:7: lv_value_12_0= ruleEBoolean
            	    {

            	    							newCompositeNode(grammarAccess.getBooleanArrayAccess().getValueEBooleanParserRuleCall_5_4_1_0());
            	    						
            	    pushFollow(FOLLOW_25);
            	    lv_value_12_0=ruleEBoolean();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getBooleanArrayRule());
            	    							}
            	    							add(
            	    								current,
            	    								"value",
            	    								lv_value_12_0,
            	    								"org.xtext.Spice.EBoolean");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_22); 

            				newLeafNode(otherlv_13, grammarAccess.getBooleanArrayAccess().getRightParenthesisKeyword_5_5());
            			

            }

            otherlv_14=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getBooleanArrayAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleBooleanArray"


    // $ANTLR start "entryRuleXmod_Action"
    // InternalSpice.g:1875:1: entryRuleXmod_Action returns [EObject current=null] : iv_ruleXmod_Action= ruleXmod_Action EOF ;
    public final EObject entryRuleXmod_Action() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmod_Action = null;


        try {
            // InternalSpice.g:1875:52: (iv_ruleXmod_Action= ruleXmod_Action EOF )
            // InternalSpice.g:1876:2: iv_ruleXmod_Action= ruleXmod_Action EOF
            {
             newCompositeNode(grammarAccess.getXmod_ActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXmod_Action=ruleXmod_Action();

            state._fsp--;

             current =iv_ruleXmod_Action; 
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
    // $ANTLR end "entryRuleXmod_Action"


    // $ANTLR start "ruleXmod_Action"
    // InternalSpice.g:1882:1: ruleXmod_Action returns [EObject current=null] : (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleXmod_OperationCall ) ) ( (lv_operations_4_0= ruleXmod_OperationCall ) )* otherlv_5= '}' ) ;
    public final EObject ruleXmod_Action() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_operations_3_0 = null;

        EObject lv_operations_4_0 = null;



        	enterRule();

        try {
            // InternalSpice.g:1888:2: ( (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleXmod_OperationCall ) ) ( (lv_operations_4_0= ruleXmod_OperationCall ) )* otherlv_5= '}' ) )
            // InternalSpice.g:1889:2: (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleXmod_OperationCall ) ) ( (lv_operations_4_0= ruleXmod_OperationCall ) )* otherlv_5= '}' )
            {
            // InternalSpice.g:1889:2: (otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleXmod_OperationCall ) ) ( (lv_operations_4_0= ruleXmod_OperationCall ) )* otherlv_5= '}' )
            // InternalSpice.g:1890:3: otherlv_0= 'Action' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' ( (lv_operations_3_0= ruleXmod_OperationCall ) ) ( (lv_operations_4_0= ruleXmod_OperationCall ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getXmod_ActionAccess().getActionKeyword_0());
            		
            // InternalSpice.g:1894:3: ( (lv_name_1_0= ruleEString ) )
            // InternalSpice.g:1895:4: (lv_name_1_0= ruleEString )
            {
            // InternalSpice.g:1895:4: (lv_name_1_0= ruleEString )
            // InternalSpice.g:1896:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getXmod_ActionAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXmod_ActionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getXmod_ActionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSpice.g:1917:3: ( (lv_operations_3_0= ruleXmod_OperationCall ) )
            // InternalSpice.g:1918:4: (lv_operations_3_0= ruleXmod_OperationCall )
            {
            // InternalSpice.g:1918:4: (lv_operations_3_0= ruleXmod_OperationCall )
            // InternalSpice.g:1919:5: lv_operations_3_0= ruleXmod_OperationCall
            {

            					newCompositeNode(grammarAccess.getXmod_ActionAccess().getOperationsXmod_OperationCallParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
            lv_operations_3_0=ruleXmod_OperationCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXmod_ActionRule());
            					}
            					add(
            						current,
            						"operations",
            						lv_operations_3_0,
            						"org.xtext.Spice.Xmod_OperationCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpice.g:1936:3: ( (lv_operations_4_0= ruleXmod_OperationCall ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==33) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSpice.g:1937:4: (lv_operations_4_0= ruleXmod_OperationCall )
            	    {
            	    // InternalSpice.g:1937:4: (lv_operations_4_0= ruleXmod_OperationCall )
            	    // InternalSpice.g:1938:5: lv_operations_4_0= ruleXmod_OperationCall
            	    {

            	    					newCompositeNode(grammarAccess.getXmod_ActionAccess().getOperationsXmod_OperationCallParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_operations_4_0=ruleXmod_OperationCall();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getXmod_ActionRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_4_0,
            	    						"org.xtext.Spice.Xmod_OperationCall");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getXmod_ActionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleXmod_Action"


    // $ANTLR start "entryRuleXmod_OperationDef"
    // InternalSpice.g:1963:1: entryRuleXmod_OperationDef returns [EObject current=null] : iv_ruleXmod_OperationDef= ruleXmod_OperationDef EOF ;
    public final EObject entryRuleXmod_OperationDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmod_OperationDef = null;


        try {
            // InternalSpice.g:1963:58: (iv_ruleXmod_OperationDef= ruleXmod_OperationDef EOF )
            // InternalSpice.g:1964:2: iv_ruleXmod_OperationDef= ruleXmod_OperationDef EOF
            {
             newCompositeNode(grammarAccess.getXmod_OperationDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXmod_OperationDef=ruleXmod_OperationDef();

            state._fsp--;

             current =iv_ruleXmod_OperationDef; 
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
    // $ANTLR end "entryRuleXmod_OperationDef"


    // $ANTLR start "ruleXmod_OperationDef"
    // InternalSpice.g:1970:1: ruleXmod_OperationDef returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_parametersTag_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) ) )* )? otherlv_5= ')' otherlv_6= 'on' ( (lv_objectTag_7_0= ruleEString ) ) (otherlv_8= 'returns' ( (lv_returnTag_9_0= ruleEString ) ) )? ( ( (lv_exceptions_10_0= ruleXmod_Exception ) ) ( (lv_exceptions_11_0= ruleXmod_Exception ) )* )? ) ;
    public final EObject ruleXmod_OperationDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_parametersTag_2_0 = null;

        AntlrDatatypeRuleToken lv_parametersTag_4_0 = null;

        AntlrDatatypeRuleToken lv_objectTag_7_0 = null;

        AntlrDatatypeRuleToken lv_returnTag_9_0 = null;

        EObject lv_exceptions_10_0 = null;

        EObject lv_exceptions_11_0 = null;



        	enterRule();

        try {
            // InternalSpice.g:1976:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_parametersTag_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) ) )* )? otherlv_5= ')' otherlv_6= 'on' ( (lv_objectTag_7_0= ruleEString ) ) (otherlv_8= 'returns' ( (lv_returnTag_9_0= ruleEString ) ) )? ( ( (lv_exceptions_10_0= ruleXmod_Exception ) ) ( (lv_exceptions_11_0= ruleXmod_Exception ) )* )? ) )
            // InternalSpice.g:1977:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_parametersTag_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) ) )* )? otherlv_5= ')' otherlv_6= 'on' ( (lv_objectTag_7_0= ruleEString ) ) (otherlv_8= 'returns' ( (lv_returnTag_9_0= ruleEString ) ) )? ( ( (lv_exceptions_10_0= ruleXmod_Exception ) ) ( (lv_exceptions_11_0= ruleXmod_Exception ) )* )? )
            {
            // InternalSpice.g:1977:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_parametersTag_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) ) )* )? otherlv_5= ')' otherlv_6= 'on' ( (lv_objectTag_7_0= ruleEString ) ) (otherlv_8= 'returns' ( (lv_returnTag_9_0= ruleEString ) ) )? ( ( (lv_exceptions_10_0= ruleXmod_Exception ) ) ( (lv_exceptions_11_0= ruleXmod_Exception ) )* )? )
            // InternalSpice.g:1978:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= '(' ( ( (lv_parametersTag_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) ) )* )? otherlv_5= ')' otherlv_6= 'on' ( (lv_objectTag_7_0= ruleEString ) ) (otherlv_8= 'returns' ( (lv_returnTag_9_0= ruleEString ) ) )? ( ( (lv_exceptions_10_0= ruleXmod_Exception ) ) ( (lv_exceptions_11_0= ruleXmod_Exception ) )* )?
            {
            // InternalSpice.g:1978:3: ( (lv_name_0_0= ruleEString ) )
            // InternalSpice.g:1979:4: (lv_name_0_0= ruleEString )
            {
            // InternalSpice.g:1979:4: (lv_name_0_0= ruleEString )
            // InternalSpice.g:1980:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getXmod_OperationDefAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_5);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXmod_OperationDefRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getXmod_OperationDefAccess().getLeftParenthesisKeyword_1());
            		
            // InternalSpice.g:2001:3: ( ( (lv_parametersTag_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_STRING && LA34_0<=RULE_ID)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalSpice.g:2002:4: ( (lv_parametersTag_2_0= ruleEString ) ) (otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) ) )*
                    {
                    // InternalSpice.g:2002:4: ( (lv_parametersTag_2_0= ruleEString ) )
                    // InternalSpice.g:2003:5: (lv_parametersTag_2_0= ruleEString )
                    {
                    // InternalSpice.g:2003:5: (lv_parametersTag_2_0= ruleEString )
                    // InternalSpice.g:2004:6: lv_parametersTag_2_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getXmod_OperationDefAccess().getParametersTagEStringParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_parametersTag_2_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXmod_OperationDefRule());
                    						}
                    						add(
                    							current,
                    							"parametersTag",
                    							lv_parametersTag_2_0,
                    							"org.xtext.Spice.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSpice.g:2021:4: (otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==14) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalSpice.g:2022:5: otherlv_3= ',' ( (lv_parametersTag_4_0= ruleEString ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_4); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getXmod_OperationDefAccess().getCommaKeyword_2_1_0());
                    	    				
                    	    // InternalSpice.g:2026:5: ( (lv_parametersTag_4_0= ruleEString ) )
                    	    // InternalSpice.g:2027:6: (lv_parametersTag_4_0= ruleEString )
                    	    {
                    	    // InternalSpice.g:2027:6: (lv_parametersTag_4_0= ruleEString )
                    	    // InternalSpice.g:2028:7: lv_parametersTag_4_0= ruleEString
                    	    {

                    	    							newCompositeNode(grammarAccess.getXmod_OperationDefAccess().getParametersTagEStringParserRuleCall_2_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_25);
                    	    lv_parametersTag_4_0=ruleEString();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXmod_OperationDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parametersTag",
                    	    								lv_parametersTag_4_0,
                    	    								"org.xtext.Spice.EString");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_31); 

            			newLeafNode(otherlv_5, grammarAccess.getXmod_OperationDefAccess().getRightParenthesisKeyword_3());
            		
            otherlv_6=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getXmod_OperationDefAccess().getOnKeyword_4());
            		
            // InternalSpice.g:2055:3: ( (lv_objectTag_7_0= ruleEString ) )
            // InternalSpice.g:2056:4: (lv_objectTag_7_0= ruleEString )
            {
            // InternalSpice.g:2056:4: (lv_objectTag_7_0= ruleEString )
            // InternalSpice.g:2057:5: lv_objectTag_7_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getXmod_OperationDefAccess().getObjectTagEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_32);
            lv_objectTag_7_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXmod_OperationDefRule());
            					}
            					set(
            						current,
            						"objectTag",
            						lv_objectTag_7_0,
            						"org.xtext.Spice.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalSpice.g:2074:3: (otherlv_8= 'returns' ( (lv_returnTag_9_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalSpice.g:2075:4: otherlv_8= 'returns' ( (lv_returnTag_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_8, grammarAccess.getXmod_OperationDefAccess().getReturnsKeyword_6_0());
                    			
                    // InternalSpice.g:2079:4: ( (lv_returnTag_9_0= ruleEString ) )
                    // InternalSpice.g:2080:5: (lv_returnTag_9_0= ruleEString )
                    {
                    // InternalSpice.g:2080:5: (lv_returnTag_9_0= ruleEString )
                    // InternalSpice.g:2081:6: lv_returnTag_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getXmod_OperationDefAccess().getReturnTagEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_returnTag_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXmod_OperationDefRule());
                    						}
                    						set(
                    							current,
                    							"returnTag",
                    							lv_returnTag_9_0,
                    							"org.xtext.Spice.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalSpice.g:2099:3: ( ( (lv_exceptions_10_0= ruleXmod_Exception ) ) ( (lv_exceptions_11_0= ruleXmod_Exception ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==34) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalSpice.g:2100:4: ( (lv_exceptions_10_0= ruleXmod_Exception ) ) ( (lv_exceptions_11_0= ruleXmod_Exception ) )*
                    {
                    // InternalSpice.g:2100:4: ( (lv_exceptions_10_0= ruleXmod_Exception ) )
                    // InternalSpice.g:2101:5: (lv_exceptions_10_0= ruleXmod_Exception )
                    {
                    // InternalSpice.g:2101:5: (lv_exceptions_10_0= ruleXmod_Exception )
                    // InternalSpice.g:2102:6: lv_exceptions_10_0= ruleXmod_Exception
                    {

                    						newCompositeNode(grammarAccess.getXmod_OperationDefAccess().getExceptionsXmod_ExceptionParserRuleCall_7_0_0());
                    					
                    pushFollow(FOLLOW_33);
                    lv_exceptions_10_0=ruleXmod_Exception();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXmod_OperationDefRule());
                    						}
                    						add(
                    							current,
                    							"exceptions",
                    							lv_exceptions_10_0,
                    							"org.xtext.Spice.Xmod_Exception");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalSpice.g:2119:4: ( (lv_exceptions_11_0= ruleXmod_Exception ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==34) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalSpice.g:2120:5: (lv_exceptions_11_0= ruleXmod_Exception )
                    	    {
                    	    // InternalSpice.g:2120:5: (lv_exceptions_11_0= ruleXmod_Exception )
                    	    // InternalSpice.g:2121:6: lv_exceptions_11_0= ruleXmod_Exception
                    	    {

                    	    						newCompositeNode(grammarAccess.getXmod_OperationDefAccess().getExceptionsXmod_ExceptionParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_33);
                    	    lv_exceptions_11_0=ruleXmod_Exception();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getXmod_OperationDefRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"exceptions",
                    	    							lv_exceptions_11_0,
                    	    							"org.xtext.Spice.Xmod_Exception");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleXmod_OperationDef"


    // $ANTLR start "entryRuleXmod_OperationCall"
    // InternalSpice.g:2143:1: entryRuleXmod_OperationCall returns [EObject current=null] : iv_ruleXmod_OperationCall= ruleXmod_OperationCall EOF ;
    public final EObject entryRuleXmod_OperationCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmod_OperationCall = null;


        try {
            // InternalSpice.g:2143:59: (iv_ruleXmod_OperationCall= ruleXmod_OperationCall EOF )
            // InternalSpice.g:2144:2: iv_ruleXmod_OperationCall= ruleXmod_OperationCall EOF
            {
             newCompositeNode(grammarAccess.getXmod_OperationCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXmod_OperationCall=ruleXmod_OperationCall();

            state._fsp--;

             current =iv_ruleXmod_OperationCall; 
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
    // $ANTLR end "entryRuleXmod_OperationCall"


    // $ANTLR start "ruleXmod_OperationCall"
    // InternalSpice.g:2150:1: ruleXmod_OperationCall returns [EObject current=null] : (otherlv_0= 'call' this_Xmod_OperationDef_1= ruleXmod_OperationDef otherlv_2= ';' ) ;
    public final EObject ruleXmod_OperationCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Xmod_OperationDef_1 = null;



        	enterRule();

        try {
            // InternalSpice.g:2156:2: ( (otherlv_0= 'call' this_Xmod_OperationDef_1= ruleXmod_OperationDef otherlv_2= ';' ) )
            // InternalSpice.g:2157:2: (otherlv_0= 'call' this_Xmod_OperationDef_1= ruleXmod_OperationDef otherlv_2= ';' )
            {
            // InternalSpice.g:2157:2: (otherlv_0= 'call' this_Xmod_OperationDef_1= ruleXmod_OperationDef otherlv_2= ';' )
            // InternalSpice.g:2158:3: otherlv_0= 'call' this_Xmod_OperationDef_1= ruleXmod_OperationDef otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getXmod_OperationCallAccess().getCallKeyword_0());
            		

            			newCompositeNode(grammarAccess.getXmod_OperationCallAccess().getXmod_OperationDefParserRuleCall_1());
            		
            pushFollow(FOLLOW_22);
            this_Xmod_OperationDef_1=ruleXmod_OperationDef();

            state._fsp--;


            			current = this_Xmod_OperationDef_1;
            			afterParserOrEnumRuleCall();
            		
            otherlv_2=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getXmod_OperationCallAccess().getSemicolonKeyword_2());
            		

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
    // $ANTLR end "ruleXmod_OperationCall"


    // $ANTLR start "entryRuleXmod_Exception"
    // InternalSpice.g:2178:1: entryRuleXmod_Exception returns [EObject current=null] : iv_ruleXmod_Exception= ruleXmod_Exception EOF ;
    public final EObject entryRuleXmod_Exception() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXmod_Exception = null;


        try {
            // InternalSpice.g:2178:55: (iv_ruleXmod_Exception= ruleXmod_Exception EOF )
            // InternalSpice.g:2179:2: iv_ruleXmod_Exception= ruleXmod_Exception EOF
            {
             newCompositeNode(grammarAccess.getXmod_ExceptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXmod_Exception=ruleXmod_Exception();

            state._fsp--;

             current =iv_ruleXmod_Exception; 
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
    // $ANTLR end "entryRuleXmod_Exception"


    // $ANTLR start "ruleXmod_Exception"
    // InternalSpice.g:2185:1: ruleXmod_Exception returns [EObject current=null] : (otherlv_0= 'onError' ( ( (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered ) ) | ( ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')' ) ) (otherlv_6= 'call' ( (lv_calledOperation_7_0= ruleXmod_OperationDef ) ) )? otherlv_8= 'then' ( (lv_reaction_9_0= ruleXmod_ExceptionReaction ) ) ) ;
    public final EObject ruleXmod_Exception() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_kind_1_0 = null;

        AntlrDatatypeRuleToken lv_kind_2_0 = null;

        AntlrDatatypeRuleToken lv_filter_4_0 = null;

        EObject lv_calledOperation_7_0 = null;

        Enumerator lv_reaction_9_0 = null;



        	enterRule();

        try {
            // InternalSpice.g:2191:2: ( (otherlv_0= 'onError' ( ( (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered ) ) | ( ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')' ) ) (otherlv_6= 'call' ( (lv_calledOperation_7_0= ruleXmod_OperationDef ) ) )? otherlv_8= 'then' ( (lv_reaction_9_0= ruleXmod_ExceptionReaction ) ) ) )
            // InternalSpice.g:2192:2: (otherlv_0= 'onError' ( ( (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered ) ) | ( ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')' ) ) (otherlv_6= 'call' ( (lv_calledOperation_7_0= ruleXmod_OperationDef ) ) )? otherlv_8= 'then' ( (lv_reaction_9_0= ruleXmod_ExceptionReaction ) ) )
            {
            // InternalSpice.g:2192:2: (otherlv_0= 'onError' ( ( (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered ) ) | ( ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')' ) ) (otherlv_6= 'call' ( (lv_calledOperation_7_0= ruleXmod_OperationDef ) ) )? otherlv_8= 'then' ( (lv_reaction_9_0= ruleXmod_ExceptionReaction ) ) )
            // InternalSpice.g:2193:3: otherlv_0= 'onError' ( ( (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered ) ) | ( ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')' ) ) (otherlv_6= 'call' ( (lv_calledOperation_7_0= ruleXmod_OperationDef ) ) )? otherlv_8= 'then' ( (lv_reaction_9_0= ruleXmod_ExceptionReaction ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getXmod_ExceptionAccess().getOnErrorKeyword_0());
            		
            // InternalSpice.g:2197:3: ( ( (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered ) ) | ( ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=37 && LA38_0<=42)) ) {
                alt38=1;
            }
            else if ( (LA38_0==36) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalSpice.g:2198:4: ( (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered ) )
                    {
                    // InternalSpice.g:2198:4: ( (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered ) )
                    // InternalSpice.g:2199:5: (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered )
                    {
                    // InternalSpice.g:2199:5: (lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered )
                    // InternalSpice.g:2200:6: lv_kind_1_0= ruleXmod_ExceptionKind_Unfiltered
                    {

                    						newCompositeNode(grammarAccess.getXmod_ExceptionAccess().getKindXmod_ExceptionKind_UnfilteredParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_kind_1_0=ruleXmod_ExceptionKind_Unfiltered();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXmod_ExceptionRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_1_0,
                    							"org.xtext.Spice.Xmod_ExceptionKind_Unfiltered");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalSpice.g:2218:4: ( ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')' )
                    {
                    // InternalSpice.g:2218:4: ( ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')' )
                    // InternalSpice.g:2219:5: ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) ) otherlv_3= '(' ( (lv_filter_4_0= ruleEString ) ) otherlv_5= ')'
                    {
                    // InternalSpice.g:2219:5: ( (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered ) )
                    // InternalSpice.g:2220:6: (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered )
                    {
                    // InternalSpice.g:2220:6: (lv_kind_2_0= ruleXmod_ExceptionKind_Filtered )
                    // InternalSpice.g:2221:7: lv_kind_2_0= ruleXmod_ExceptionKind_Filtered
                    {

                    							newCompositeNode(grammarAccess.getXmod_ExceptionAccess().getKindXmod_ExceptionKind_FilteredParserRuleCall_1_1_0_0());
                    						
                    pushFollow(FOLLOW_5);
                    lv_kind_2_0=ruleXmod_ExceptionKind_Filtered();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getXmod_ExceptionRule());
                    							}
                    							set(
                    								current,
                    								"kind",
                    								lv_kind_2_0,
                    								"org.xtext.Spice.Xmod_ExceptionKind_Filtered");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_3=(Token)match(input,13,FOLLOW_4); 

                    					newLeafNode(otherlv_3, grammarAccess.getXmod_ExceptionAccess().getLeftParenthesisKeyword_1_1_1());
                    				
                    // InternalSpice.g:2242:5: ( (lv_filter_4_0= ruleEString ) )
                    // InternalSpice.g:2243:6: (lv_filter_4_0= ruleEString )
                    {
                    // InternalSpice.g:2243:6: (lv_filter_4_0= ruleEString )
                    // InternalSpice.g:2244:7: lv_filter_4_0= ruleEString
                    {

                    							newCompositeNode(grammarAccess.getXmod_ExceptionAccess().getFilterEStringParserRuleCall_1_1_2_0());
                    						
                    pushFollow(FOLLOW_8);
                    lv_filter_4_0=ruleEString();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getXmod_ExceptionRule());
                    							}
                    							set(
                    								current,
                    								"filter",
                    								lv_filter_4_0,
                    								"org.xtext.Spice.EString");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_35); 

                    					newLeafNode(otherlv_5, grammarAccess.getXmod_ExceptionAccess().getRightParenthesisKeyword_1_1_3());
                    				

                    }


                    }
                    break;

            }

            // InternalSpice.g:2267:3: (otherlv_6= 'call' ( (lv_calledOperation_7_0= ruleXmod_OperationDef ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==33) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalSpice.g:2268:4: otherlv_6= 'call' ( (lv_calledOperation_7_0= ruleXmod_OperationDef ) )
                    {
                    otherlv_6=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getXmod_ExceptionAccess().getCallKeyword_2_0());
                    			
                    // InternalSpice.g:2272:4: ( (lv_calledOperation_7_0= ruleXmod_OperationDef ) )
                    // InternalSpice.g:2273:5: (lv_calledOperation_7_0= ruleXmod_OperationDef )
                    {
                    // InternalSpice.g:2273:5: (lv_calledOperation_7_0= ruleXmod_OperationDef )
                    // InternalSpice.g:2274:6: lv_calledOperation_7_0= ruleXmod_OperationDef
                    {

                    						newCompositeNode(grammarAccess.getXmod_ExceptionAccess().getCalledOperationXmod_OperationDefParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_36);
                    lv_calledOperation_7_0=ruleXmod_OperationDef();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXmod_ExceptionRule());
                    						}
                    						set(
                    							current,
                    							"calledOperation",
                    							lv_calledOperation_7_0,
                    							"org.xtext.Spice.Xmod_OperationDef");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,35,FOLLOW_37); 

            			newLeafNode(otherlv_8, grammarAccess.getXmod_ExceptionAccess().getThenKeyword_3());
            		
            // InternalSpice.g:2296:3: ( (lv_reaction_9_0= ruleXmod_ExceptionReaction ) )
            // InternalSpice.g:2297:4: (lv_reaction_9_0= ruleXmod_ExceptionReaction )
            {
            // InternalSpice.g:2297:4: (lv_reaction_9_0= ruleXmod_ExceptionReaction )
            // InternalSpice.g:2298:5: lv_reaction_9_0= ruleXmod_ExceptionReaction
            {

            					newCompositeNode(grammarAccess.getXmod_ExceptionAccess().getReactionXmod_ExceptionReactionEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_reaction_9_0=ruleXmod_ExceptionReaction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getXmod_ExceptionRule());
            					}
            					set(
            						current,
            						"reaction",
            						lv_reaction_9_0,
            						"org.xtext.Spice.Xmod_ExceptionReaction");
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
    // $ANTLR end "ruleXmod_Exception"


    // $ANTLR start "entryRuleXmod_ExceptionKind_Filtered"
    // InternalSpice.g:2319:1: entryRuleXmod_ExceptionKind_Filtered returns [String current=null] : iv_ruleXmod_ExceptionKind_Filtered= ruleXmod_ExceptionKind_Filtered EOF ;
    public final String entryRuleXmod_ExceptionKind_Filtered() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXmod_ExceptionKind_Filtered = null;


        try {
            // InternalSpice.g:2319:67: (iv_ruleXmod_ExceptionKind_Filtered= ruleXmod_ExceptionKind_Filtered EOF )
            // InternalSpice.g:2320:2: iv_ruleXmod_ExceptionKind_Filtered= ruleXmod_ExceptionKind_Filtered EOF
            {
             newCompositeNode(grammarAccess.getXmod_ExceptionKind_FilteredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXmod_ExceptionKind_Filtered=ruleXmod_ExceptionKind_Filtered();

            state._fsp--;

             current =iv_ruleXmod_ExceptionKind_Filtered.getText(); 
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
    // $ANTLR end "entryRuleXmod_ExceptionKind_Filtered"


    // $ANTLR start "ruleXmod_ExceptionKind_Filtered"
    // InternalSpice.g:2326:1: ruleXmod_ExceptionKind_Filtered returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'methodException' ;
    public final AntlrDatatypeRuleToken ruleXmod_ExceptionKind_Filtered() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpice.g:2332:2: (kw= 'methodException' )
            // InternalSpice.g:2333:2: kw= 'methodException'
            {
            kw=(Token)match(input,36,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getXmod_ExceptionKind_FilteredAccess().getMethodExceptionKeyword());
            	

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
    // $ANTLR end "ruleXmod_ExceptionKind_Filtered"


    // $ANTLR start "entryRuleXmod_ExceptionKind_Unfiltered"
    // InternalSpice.g:2341:1: entryRuleXmod_ExceptionKind_Unfiltered returns [String current=null] : iv_ruleXmod_ExceptionKind_Unfiltered= ruleXmod_ExceptionKind_Unfiltered EOF ;
    public final String entryRuleXmod_ExceptionKind_Unfiltered() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXmod_ExceptionKind_Unfiltered = null;


        try {
            // InternalSpice.g:2341:69: (iv_ruleXmod_ExceptionKind_Unfiltered= ruleXmod_ExceptionKind_Unfiltered EOF )
            // InternalSpice.g:2342:2: iv_ruleXmod_ExceptionKind_Unfiltered= ruleXmod_ExceptionKind_Unfiltered EOF
            {
             newCompositeNode(grammarAccess.getXmod_ExceptionKind_UnfilteredRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXmod_ExceptionKind_Unfiltered=ruleXmod_ExceptionKind_Unfiltered();

            state._fsp--;

             current =iv_ruleXmod_ExceptionKind_Unfiltered.getText(); 
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
    // $ANTLR end "entryRuleXmod_ExceptionKind_Unfiltered"


    // $ANTLR start "ruleXmod_ExceptionKind_Unfiltered"
    // InternalSpice.g:2348:1: ruleXmod_ExceptionKind_Unfiltered returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'other' | kw= 'unknownNamespace' | kw= 'objectNotFound' | kw= 'methodNotFound' | kw= 'parametersNotMatching' | kw= 'returnTypeNotMatching' ) ;
    public final AntlrDatatypeRuleToken ruleXmod_ExceptionKind_Unfiltered() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpice.g:2354:2: ( (kw= 'other' | kw= 'unknownNamespace' | kw= 'objectNotFound' | kw= 'methodNotFound' | kw= 'parametersNotMatching' | kw= 'returnTypeNotMatching' ) )
            // InternalSpice.g:2355:2: (kw= 'other' | kw= 'unknownNamespace' | kw= 'objectNotFound' | kw= 'methodNotFound' | kw= 'parametersNotMatching' | kw= 'returnTypeNotMatching' )
            {
            // InternalSpice.g:2355:2: (kw= 'other' | kw= 'unknownNamespace' | kw= 'objectNotFound' | kw= 'methodNotFound' | kw= 'parametersNotMatching' | kw= 'returnTypeNotMatching' )
            int alt40=6;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt40=1;
                }
                break;
            case 38:
                {
                alt40=2;
                }
                break;
            case 39:
                {
                alt40=3;
                }
                break;
            case 40:
                {
                alt40=4;
                }
                break;
            case 41:
                {
                alt40=5;
                }
                break;
            case 42:
                {
                alt40=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalSpice.g:2356:3: kw= 'other'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getOtherKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSpice.g:2362:3: kw= 'unknownNamespace'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getUnknownNamespaceKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSpice.g:2368:3: kw= 'objectNotFound'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getObjectNotFoundKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalSpice.g:2374:3: kw= 'methodNotFound'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getMethodNotFoundKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalSpice.g:2380:3: kw= 'parametersNotMatching'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getParametersNotMatchingKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalSpice.g:2386:3: kw= 'returnTypeNotMatching'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXmod_ExceptionKind_UnfilteredAccess().getReturnTypeNotMatchingKeyword_5());
                    		

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
    // $ANTLR end "ruleXmod_ExceptionKind_Unfiltered"


    // $ANTLR start "entryRuleEDouble"
    // InternalSpice.g:2395:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalSpice.g:2395:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalSpice.g:2396:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalSpice.g:2402:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ( (kw= 'e' | kw= 'E' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalSpice.g:2408:2: ( ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ( (kw= 'e' | kw= 'E' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalSpice.g:2409:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ( (kw= 'e' | kw= 'E' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalSpice.g:2409:2: ( (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ( (kw= 'e' | kw= 'E' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalSpice.g:2410:3: (kw= '-' )? this_INT_1= RULE_INT kw= '.' this_INT_3= RULE_INT ( (kw= 'e' | kw= 'E' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalSpice.g:2410:3: (kw= '-' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalSpice.g:2411:4: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_6); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_38); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
            		
            kw=(Token)match(input,44,FOLLOW_6); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_39); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalSpice.g:2436:3: ( (kw= 'e' | kw= 'E' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=45 && LA44_0<=46)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalSpice.g:2437:4: (kw= 'e' | kw= 'E' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalSpice.g:2437:4: (kw= 'e' | kw= 'E' )
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==45) ) {
                        alt42=1;
                    }
                    else if ( (LA42_0==46) ) {
                        alt42=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 0, input);

                        throw nvae;
                    }
                    switch (alt42) {
                        case 1 :
                            // InternalSpice.g:2438:5: kw= 'e'
                            {
                            kw=(Token)match(input,45,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalSpice.g:2444:5: kw= 'E'
                            {
                            kw=(Token)match(input,46,FOLLOW_26); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalSpice.g:2450:4: (kw= '-' )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==43) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // InternalSpice.g:2451:5: kw= '-'
                            {
                            kw=(Token)match(input,43,FOLLOW_6); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

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
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalSpice.g:2469:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalSpice.g:2469:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalSpice.g:2470:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalSpice.g:2476:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSpice.g:2482:2: (this_INT_0= RULE_INT )
            // InternalSpice.g:2483:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getEIntAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleELong"
    // InternalSpice.g:2493:1: entryRuleELong returns [String current=null] : iv_ruleELong= ruleELong EOF ;
    public final String entryRuleELong() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleELong = null;


        try {
            // InternalSpice.g:2493:45: (iv_ruleELong= ruleELong EOF )
            // InternalSpice.g:2494:2: iv_ruleELong= ruleELong EOF
            {
             newCompositeNode(grammarAccess.getELongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELong=ruleELong();

            state._fsp--;

             current =iv_ruleELong.getText(); 
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
    // $ANTLR end "entryRuleELong"


    // $ANTLR start "ruleELong"
    // InternalSpice.g:2500:1: ruleELong returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_INT_0= RULE_INT ;
    public final AntlrDatatypeRuleToken ruleELong() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;


        	enterRule();

        try {
            // InternalSpice.g:2506:2: (this_INT_0= RULE_INT )
            // InternalSpice.g:2507:2: this_INT_0= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            		current.merge(this_INT_0);
            	

            		newLeafNode(this_INT_0, grammarAccess.getELongAccess().getINTTerminalRuleCall());
            	

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
    // $ANTLR end "ruleELong"


    // $ANTLR start "entryRuleEString"
    // InternalSpice.g:2517:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalSpice.g:2517:47: (iv_ruleEString= ruleEString EOF )
            // InternalSpice.g:2518:2: iv_ruleEString= ruleEString EOF
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
    // InternalSpice.g:2524:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalSpice.g:2530:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalSpice.g:2531:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalSpice.g:2531:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_ID) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalSpice.g:2532:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSpice.g:2540:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalSpice.g:2551:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalSpice.g:2551:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalSpice.g:2552:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalSpice.g:2558:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalSpice.g:2564:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalSpice.g:2565:2: (kw= 'true' | kw= 'false' )
            {
            // InternalSpice.g:2565:2: (kw= 'true' | kw= 'false' )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==47) ) {
                alt46=1;
            }
            else if ( (LA46_0==48) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalSpice.g:2566:3: kw= 'true'
                    {
                    kw=(Token)match(input,47,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSpice.g:2572:3: kw= 'false'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

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
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "ruleXmod_ExceptionReaction"
    // InternalSpice.g:2581:1: ruleXmod_ExceptionReaction returns [Enumerator current=null] : ( (enumLiteral_0= 'continue' ) | (enumLiteral_1= 'skip' ) | (enumLiteral_2= 'exit' ) | (enumLiteral_3= 'localstop' ) ) ;
    public final Enumerator ruleXmod_ExceptionReaction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSpice.g:2587:2: ( ( (enumLiteral_0= 'continue' ) | (enumLiteral_1= 'skip' ) | (enumLiteral_2= 'exit' ) | (enumLiteral_3= 'localstop' ) ) )
            // InternalSpice.g:2588:2: ( (enumLiteral_0= 'continue' ) | (enumLiteral_1= 'skip' ) | (enumLiteral_2= 'exit' ) | (enumLiteral_3= 'localstop' ) )
            {
            // InternalSpice.g:2588:2: ( (enumLiteral_0= 'continue' ) | (enumLiteral_1= 'skip' ) | (enumLiteral_2= 'exit' ) | (enumLiteral_3= 'localstop' ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt47=1;
                }
                break;
            case 50:
                {
                alt47=2;
                }
                break;
            case 51:
                {
                alt47=3;
                }
                break;
            case 52:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalSpice.g:2589:3: (enumLiteral_0= 'continue' )
                    {
                    // InternalSpice.g:2589:3: (enumLiteral_0= 'continue' )
                    // InternalSpice.g:2590:4: enumLiteral_0= 'continue'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getXmod_ExceptionReactionAccess().getContinueEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getXmod_ExceptionReactionAccess().getContinueEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSpice.g:2597:3: (enumLiteral_1= 'skip' )
                    {
                    // InternalSpice.g:2597:3: (enumLiteral_1= 'skip' )
                    // InternalSpice.g:2598:4: enumLiteral_1= 'skip'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getXmod_ExceptionReactionAccess().getSkipEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getXmod_ExceptionReactionAccess().getSkipEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSpice.g:2605:3: (enumLiteral_2= 'exit' )
                    {
                    // InternalSpice.g:2605:3: (enumLiteral_2= 'exit' )
                    // InternalSpice.g:2606:4: enumLiteral_2= 'exit'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getXmod_ExceptionReactionAccess().getExitEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getXmod_ExceptionReactionAccess().getExitEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSpice.g:2613:3: (enumLiteral_3= 'localstop' )
                    {
                    // InternalSpice.g:2613:3: (enumLiteral_3= 'localstop' )
                    // InternalSpice.g:2614:4: enumLiteral_3= 'localstop'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getXmod_ExceptionReactionAccess().getLocalstopEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getXmod_ExceptionReactionAccess().getLocalstopEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleXmod_ExceptionReaction"

    // Delegated rules


    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\30\uffff";
    static final String dfa_2s = "\4\5\1\4\2\33\1\35\1\4\1\5\1\31\1\uffff\1\4\2\uffff\2\33\2\uffff\1\16\2\uffff\1\15\1\uffff";
    static final String dfa_3s = "\1\32\1\6\2\34\1\4\2\33\1\35\1\60\1\6\1\54\1\uffff\1\60\2\uffff\2\33\2\uffff\1\54\2\uffff\1\15\1\uffff";
    static final String dfa_4s = "\13\uffff\1\7\1\uffff\1\5\1\3\2\uffff\1\1\1\4\1\uffff\1\10\1\6\1\uffff\1\2";
    static final String dfa_5s = "\30\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\23\uffff\1\1",
            "\1\2\1\3",
            "\1\5\1\6\25\uffff\1\4",
            "\1\5\1\6\25\uffff\1\4",
            "\1\7",
            "\1\10",
            "\1\10",
            "\1\11",
            "\1\12\2\15\6\uffff\1\14\35\uffff\1\16\3\uffff\2\13",
            "\1\17\1\20",
            "\1\21\22\uffff\1\16",
            "",
            "\1\23\2\25\44\uffff\1\22\3\uffff\2\24",
            "",
            "",
            "\1\26",
            "\1\26",
            "",
            "",
            "\1\27\35\uffff\1\22",
            "",
            "",
            "\1\14",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "667:2: (this_IntBasic_0= ruleIntBasic | this_IntArray_1= ruleIntArray | this_DoubleBasic_2= ruleDoubleBasic | this_DoubleArray_3= ruleDoubleArray | this_StringBasic_4= ruleStringBasic | this_StringArray_5= ruleStringArray | this_BooleanBasic_6= ruleBooleanBasic | this_BooleanArray_7= ruleBooleanArray )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000160000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000044020060L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001E20000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001C20000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001820000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002004000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010000060L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000008060L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000500000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000007F000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000A00000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000600000000002L});

}