//
//  FizzBuzz_iOSUITests.swift
//  FizzBuzz-iOSUITests
//
//  Created by Choi Jung Hyun on 24/01/2017.
//  Copyright © 2017 Choi Jung Hyun. All rights reserved.
//

import XCTest

class FizzBuzz_iOSUITests: XCTestCase {
    
    var app: XCUIApplication!
        
    override func setUp() {
        super.setUp()
        
        // Put setup code here. This method is called before the invocation of each test method in the class.
        app = XCUIApplication()
        
        // In UI tests it is usually best to stop immediately when a failure occurs.
        continueAfterFailure = false
        // UI tests must launch the application that they test. Doing this in setup will make sure it happens for each test method.
        XCUIApplication().launch()

        // In UI tests it’s important to set the initial state - such as interface orientation - required for your tests before they run. The setUp method is a good place to do this.
    }
    
    override func tearDown() {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
        super.tearDown()
    }
    
    func test_컨트롤이모두존재하는가() {
        // Use recording to get started writing UI tests.
        // Use XCTAssert and related functions to verify your tests produce the correct results.
        
        XCTAssert(app.textFields["numberTextField"].exists)       // 숫자입력을 위한 박스가 있는가?
        XCTAssert(app.buttons["okButton"].exists)     // OK버튼이 있는가?
        XCTAssert(app.staticTexts["resultLabel"].exists)   // FizzBuzz결과를 알려주는 레이블이 있는가?
    }
    
    func test_3을입력하고OK하면Fizz출력() {
        
        app.textFields["numberTextField"].tap()
        app.textFields["numberTextField"].typeText("3")
        app.buttons["okButton"].tap()
        XCTAssert(app.staticTexts["Fizz"].exists)
    }    
}
