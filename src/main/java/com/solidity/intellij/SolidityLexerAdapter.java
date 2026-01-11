package com.solidity.intellij;

import com.intellij.lexer.FlexAdapter;

public class SolidityLexerAdapter extends FlexAdapter {
    public SolidityLexerAdapter() {
        super(new SolidityLexer(null));
    }
} 
