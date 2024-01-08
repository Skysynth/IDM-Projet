package fr.l127.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.l127.services.LAGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLAParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'librairies'", "'{'", "'}'", "'algo'", "'entr\\u00E9es'", "'('", "')'", "'sorties'", "'chemin'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalLAParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLAParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLAParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLA.g"; }



     	private LAGrammarAccess grammarAccess;

        public InternalLAParser(TokenStream input, LAGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Librairie";
       	}

       	@Override
       	protected LAGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleLibrairie"
    // InternalLA.g:64:1: entryRuleLibrairie returns [EObject current=null] : iv_ruleLibrairie= ruleLibrairie EOF ;
    public final EObject entryRuleLibrairie() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrairie = null;


        try {
            // InternalLA.g:64:50: (iv_ruleLibrairie= ruleLibrairie EOF )
            // InternalLA.g:65:2: iv_ruleLibrairie= ruleLibrairie EOF
            {
             newCompositeNode(grammarAccess.getLibrairieRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibrairie=ruleLibrairie();

            state._fsp--;

             current =iv_ruleLibrairie; 
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
    // $ANTLR end "entryRuleLibrairie"


    // $ANTLR start "ruleLibrairie"
    // InternalLA.g:71:1: ruleLibrairie returns [EObject current=null] : (otherlv_0= 'librairies' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleLibrairieElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleLibrairie() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalLA.g:77:2: ( (otherlv_0= 'librairies' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleLibrairieElement ) )* otherlv_4= '}' ) )
            // InternalLA.g:78:2: (otherlv_0= 'librairies' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleLibrairieElement ) )* otherlv_4= '}' )
            {
            // InternalLA.g:78:2: (otherlv_0= 'librairies' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleLibrairieElement ) )* otherlv_4= '}' )
            // InternalLA.g:79:3: otherlv_0= 'librairies' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleLibrairieElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLibrairieAccess().getLibrairiesKeyword_0());
            		
            // InternalLA.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLA.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLA.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalLA.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLibrairieAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLibrairieRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLibrairieAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLA.g:105:3: ( (lv_elements_3_0= ruleLibrairieElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLA.g:106:4: (lv_elements_3_0= ruleLibrairieElement )
            	    {
            	    // InternalLA.g:106:4: (lv_elements_3_0= ruleLibrairieElement )
            	    // InternalLA.g:107:5: lv_elements_3_0= ruleLibrairieElement
            	    {

            	    					newCompositeNode(grammarAccess.getLibrairieAccess().getElementsLibrairieElementParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_elements_3_0=ruleLibrairieElement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLibrairieRule());
            	    					}
            	    					add(
            	    						current,
            	    						"elements",
            	    						lv_elements_3_0,
            	    						"fr.l127.LA.LibrairieElement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLibrairieAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleLibrairie"


    // $ANTLR start "entryRuleLibrairieElement"
    // InternalLA.g:132:1: entryRuleLibrairieElement returns [EObject current=null] : iv_ruleLibrairieElement= ruleLibrairieElement EOF ;
    public final EObject entryRuleLibrairieElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLibrairieElement = null;


        try {
            // InternalLA.g:132:57: (iv_ruleLibrairieElement= ruleLibrairieElement EOF )
            // InternalLA.g:133:2: iv_ruleLibrairieElement= ruleLibrairieElement EOF
            {
             newCompositeNode(grammarAccess.getLibrairieElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLibrairieElement=ruleLibrairieElement();

            state._fsp--;

             current =iv_ruleLibrairieElement; 
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
    // $ANTLR end "entryRuleLibrairieElement"


    // $ANTLR start "ruleLibrairieElement"
    // InternalLA.g:139:1: ruleLibrairieElement returns [EObject current=null] : this_Algorithme_0= ruleAlgorithme ;
    public final EObject ruleLibrairieElement() throws RecognitionException {
        EObject current = null;

        EObject this_Algorithme_0 = null;



        	enterRule();

        try {
            // InternalLA.g:145:2: (this_Algorithme_0= ruleAlgorithme )
            // InternalLA.g:146:2: this_Algorithme_0= ruleAlgorithme
            {

            		newCompositeNode(grammarAccess.getLibrairieElementAccess().getAlgorithmeParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Algorithme_0=ruleAlgorithme();

            state._fsp--;


            		current = this_Algorithme_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleLibrairieElement"


    // $ANTLR start "entryRuleAlgorithme"
    // InternalLA.g:157:1: entryRuleAlgorithme returns [EObject current=null] : iv_ruleAlgorithme= ruleAlgorithme EOF ;
    public final EObject entryRuleAlgorithme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithme = null;


        try {
            // InternalLA.g:157:51: (iv_ruleAlgorithme= ruleAlgorithme EOF )
            // InternalLA.g:158:2: iv_ruleAlgorithme= ruleAlgorithme EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithme=ruleAlgorithme();

            state._fsp--;

             current =iv_ruleAlgorithme; 
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
    // $ANTLR end "entryRuleAlgorithme"


    // $ANTLR start "ruleAlgorithme"
    // InternalLA.g:164:1: ruleAlgorithme returns [EObject current=null] : (otherlv_0= 'algo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'entr\\u00E9es' otherlv_4= '(' ( (lv_entrees_5_0= RULE_ID ) )+ otherlv_6= ')' otherlv_7= 'sorties' otherlv_8= '(' ( (lv_sorties_9_0= RULE_ID ) )+ otherlv_10= ')' otherlv_11= 'chemin' ( (lv_chemin_12_0= RULE_ID ) ) otherlv_13= '}' ) ;
    public final EObject ruleAlgorithme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_entrees_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_sorties_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_chemin_12_0=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalLA.g:170:2: ( (otherlv_0= 'algo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'entr\\u00E9es' otherlv_4= '(' ( (lv_entrees_5_0= RULE_ID ) )+ otherlv_6= ')' otherlv_7= 'sorties' otherlv_8= '(' ( (lv_sorties_9_0= RULE_ID ) )+ otherlv_10= ')' otherlv_11= 'chemin' ( (lv_chemin_12_0= RULE_ID ) ) otherlv_13= '}' ) )
            // InternalLA.g:171:2: (otherlv_0= 'algo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'entr\\u00E9es' otherlv_4= '(' ( (lv_entrees_5_0= RULE_ID ) )+ otherlv_6= ')' otherlv_7= 'sorties' otherlv_8= '(' ( (lv_sorties_9_0= RULE_ID ) )+ otherlv_10= ')' otherlv_11= 'chemin' ( (lv_chemin_12_0= RULE_ID ) ) otherlv_13= '}' )
            {
            // InternalLA.g:171:2: (otherlv_0= 'algo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'entr\\u00E9es' otherlv_4= '(' ( (lv_entrees_5_0= RULE_ID ) )+ otherlv_6= ')' otherlv_7= 'sorties' otherlv_8= '(' ( (lv_sorties_9_0= RULE_ID ) )+ otherlv_10= ')' otherlv_11= 'chemin' ( (lv_chemin_12_0= RULE_ID ) ) otherlv_13= '}' )
            // InternalLA.g:172:3: otherlv_0= 'algo' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'entr\\u00E9es' otherlv_4= '(' ( (lv_entrees_5_0= RULE_ID ) )+ otherlv_6= ')' otherlv_7= 'sorties' otherlv_8= '(' ( (lv_sorties_9_0= RULE_ID ) )+ otherlv_10= ')' otherlv_11= 'chemin' ( (lv_chemin_12_0= RULE_ID ) ) otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmeAccess().getAlgoKeyword_0());
            		
            // InternalLA.g:176:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLA.g:177:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLA.g:177:4: (lv_name_1_0= RULE_ID )
            // InternalLA.g:178:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAlgorithmeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlgorithmeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAlgorithmeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getAlgorithmeAccess().getEntrEsKeyword_3());
            		
            otherlv_4=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getAlgorithmeAccess().getLeftParenthesisKeyword_4());
            		
            // InternalLA.g:206:3: ( (lv_entrees_5_0= RULE_ID ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLA.g:207:4: (lv_entrees_5_0= RULE_ID )
            	    {
            	    // InternalLA.g:207:4: (lv_entrees_5_0= RULE_ID )
            	    // InternalLA.g:208:5: lv_entrees_5_0= RULE_ID
            	    {
            	    lv_entrees_5_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    					newLeafNode(lv_entrees_5_0, grammarAccess.getAlgorithmeAccess().getEntreesIDTerminalRuleCall_5_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getAlgorithmeRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"entrees",
            	    						lv_entrees_5_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getAlgorithmeAccess().getRightParenthesisKeyword_6());
            		
            otherlv_7=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getAlgorithmeAccess().getSortiesKeyword_7());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getAlgorithmeAccess().getLeftParenthesisKeyword_8());
            		
            // InternalLA.g:236:3: ( (lv_sorties_9_0= RULE_ID ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLA.g:237:4: (lv_sorties_9_0= RULE_ID )
            	    {
            	    // InternalLA.g:237:4: (lv_sorties_9_0= RULE_ID )
            	    // InternalLA.g:238:5: lv_sorties_9_0= RULE_ID
            	    {
            	    lv_sorties_9_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    					newLeafNode(lv_sorties_9_0, grammarAccess.getAlgorithmeAccess().getSortiesIDTerminalRuleCall_9_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getAlgorithmeRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"sorties",
            	    						lv_sorties_9_0,
            	    						"org.eclipse.xtext.common.Terminals.ID");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getAlgorithmeAccess().getRightParenthesisKeyword_10());
            		
            otherlv_11=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getAlgorithmeAccess().getCheminKeyword_11());
            		
            // InternalLA.g:262:3: ( (lv_chemin_12_0= RULE_ID ) )
            // InternalLA.g:263:4: (lv_chemin_12_0= RULE_ID )
            {
            // InternalLA.g:263:4: (lv_chemin_12_0= RULE_ID )
            // InternalLA.g:264:5: lv_chemin_12_0= RULE_ID
            {
            lv_chemin_12_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_chemin_12_0, grammarAccess.getAlgorithmeAccess().getCheminIDTerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlgorithmeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"chemin",
            						lv_chemin_12_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getAlgorithmeAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleAlgorithme"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002000L});

}