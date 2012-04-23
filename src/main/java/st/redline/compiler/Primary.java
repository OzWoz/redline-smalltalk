/* Redline Smalltalk, Copyright (c) James C. Ladd. All rights reserved. See LICENSE in the root of this distribution */
package st.redline.compiler;

public abstract class Primary implements VisitableNode {

	abstract int line();

    boolean isBlockWithAnswerExpression() {
        return false;
    }
}
