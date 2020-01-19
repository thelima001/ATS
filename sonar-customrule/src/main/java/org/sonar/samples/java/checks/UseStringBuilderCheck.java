package org.sonar.samples.java.checks;

import com.google.common.collect.ImmutableList;

import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.tree.*;
import org.sonar.plugins.java.api.tree.Tree.Kind;

import java.util.Iterator;
import java.util.List;

@Rule(
        key = "UseStringBuilderCheck",
        name = "Build toString() with StringBuilder",
        description = "Use StringBuilder to build toString() methods.",
        tags = {"smell"},
        priority = Priority.MAJOR
)
public class UseStringBuilderCheck extends IssuableSubscriptionVisitor {

    @Override
    public List<Kind> nodesToVisit() {
        return ImmutableList.of(Kind.METHOD);
    }

    @Override
    public void visitNode(Tree tree) {
        MethodTree method = (MethodTree) tree;
        if (method.simpleName().name().equals("toString")) {
            Iterator<StatementTree> iterator = method.block().body().iterator();
            while(iterator.hasNext()){
                StatementTree expressao =  iterator.next();
                if(expressao.is(Kind.RETURN_STATEMENT)){
                    ReturnStatementTree rt = (ReturnStatementTree)expressao;
                    if(rt.expression().is(Kind.METHOD_INVOCATION)){
                        MethodInvocationTree mit = (MethodInvocationTree)rt.expression();
                        String owner = mit.symbol().owner().toString();
                        String name = mit.symbol().name();
                        if(!owner.equals("StringBuilder") || !name.equals("toString")){
                            reportIssue(method.simpleName(), "No StringBuilder implemented in return.");
                        }
                    } else {
                        reportIssue(method.simpleName(), "No StringBuilder implemented in return.");
                    }
                }
            }
        }
    }
}