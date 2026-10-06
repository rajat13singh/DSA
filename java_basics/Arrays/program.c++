#include <iostream>
#include <stack>
#include <string>
#include <cctype>

int getPrecedence(char op) {
    if (op == '^')
        return 3;
    if (op == '*' || op == '/' || op == '%')
        return 2;
    if (op == '+' || op == '-')
        return 1;
    return -1;
}

bool isRightAssociative(char op) {
    return (op == '^');
}

std::string infixToPostfix(const std::string& infix) {
    std::stack<char> st;
    std::string postfix = "";

    for (char c : infix) {
        if (std::isspace(c)) continue;

        if (std::isalnum(c)) {
            postfix += c;
        }
        else if (c == '(') {
            st.push(c);
        }
        else if (c == ')') {
            while (!st.empty() && st.top() != '(') {
                postfix += st.top();
                st.pop();
            }
            if (!st.empty() && st.top() == '(') {
                st.pop();
            }
        }
        else {
            while (!st.empty() && st.top() != '(') {
                int precCurr = getPrecedence(c);
                int precTop = getPrecedence(st.top());

                if (precTop > precCurr || (precTop == precCurr && !isRightAssociative(c))) {
                    postfix += st.top();
                    st.pop();
                } else {
                    break;
                }
            }
            st.push(c);
        }
    }

    while (!st.empty()) {
        postfix += st.top();
        st.pop();
    }

    return postfix;
}

int main() {
    std::string infix1 = "A+B*(C^D-E)^(F+G*H)-I";
    std::string infix2 = "(a+b)*c%d^e/f";

    std::cout << "Infix 1:   " << infix1 << "\n";
    std::cout << "Postfix 1: " << infixToPostfix(infix1) << "\n\n";

    std::cout << "Infix 2:   " << infix2 << "\n";
    std::cout << "Postfix 2: " << infixToPostfix(infix2) << "\n";

    return 0;
}