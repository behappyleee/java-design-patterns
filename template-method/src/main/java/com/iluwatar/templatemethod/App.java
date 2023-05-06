/*
 * This project is licensed under the MIT license. Module model-view-viewmodel is using ZK framework licensed under LGPL (see lgpl-3.0.txt).
 *
 * The MIT License
 * Copyright © 2014-2022 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.iluwatar.templatemethod;

/**
 * Template Method defines a skeleton for an algorithm. The algorithm subclasses provide
 * implementation for the blank parts.
 *
 * <p>In this example {@link HalflingThief} contains {@link StealingMethod} that can be changed.
 * First the thief hits with {@link HitAndRunMethod} and then with {@link SubtleMethod}.
 */
public class App {

    // Template Method Pattern
    // 템플릿 메서드 패턴은 특정 작업을 처리하는 일부분을 서브 클래스로 캡슐화하여 전체적인 구조는 바뀌지 않으면서
    // 특정 단계에서 수행하는 내용을 바꾸는 패턴
    // 템플릿 메서드 패턴은 전체적으로 동일하면서 부분 적으로는 다른 구문으로 구성된 메서드의 코드 중복을 최소화 할 때 사용
  /**
   * Program entry point.
   *
   * @param args command line args
   */
  public static void main(String[] args) {
    // Template Method Pattern - Template Method Pattern 은 특정 작업을 처리하는 일 부분을 서브 클래스로 캡슐화를 함
    var thief = new HalflingThief(new HitAndRunMethod());
    // 해당 Method 에서 steal 수행 시 해당 메서드 안에서 confuseTarget(target);
    // stealTheItem(target); 같이 실행이 됨
    thief.steal();    // 기존 old goblin woman. return 이 되어야 정상임

    thief.changeMethod(new SubtleMethod()); // 객체가 SubtleMethod() 로 바뀌게 됨
    thief.steal();
  }
}
