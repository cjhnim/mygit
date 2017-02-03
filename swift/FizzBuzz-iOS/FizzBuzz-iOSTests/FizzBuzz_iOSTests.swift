//
//  FizzBuzz_iOSTests.swift
//  FizzBuzz-iOSTests
//
//  Created by Choi Jung Hyun on 24/01/2017.
//  Copyright © 2017 Choi Jung Hyun. All rights reserved.
//

import XCTest
@testable import FizzBuzz_iOS


class FizzBuzz_iOSTests: XCTestCase {

    var askMe = FizzBuzzer()
    
    override func setUp() {
        super.setUp()
        // Put setup code here. This method is called before the invocation of each test method in the class.
    }
    
    override func tearDown() {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
        super.tearDown()
    }
    
    func test_숫자1을입력하면1이출력() {
        // This is an example of a functional test case.
        // Use XCTAssert and related functions to verify your tests produce the correct results.
        
        XCTAssertEqual("1", askMe.isNumberFizzOrBuzz(number: 1))
    }
    
    func test_숫자2를입력하면2이출력() {

        XCTAssertEqual("2", askMe.isNumberFizzOrBuzz(number: 2))
    }
    
    func test_숫자3을입력하면Fizz출력() {
        
        XCTAssertEqual("Fizz", askMe.isNumberFizzOrBuzz(number: 3))
    }
    
    func test_숫자5를입력하면Buzz출력() {
        
        XCTAssertEqual("Buzz", askMe.isNumberFizzOrBuzz(number: 5))
    }
    
    func test_숫자15를입력하면FizzBuzz출력() {
        XCTAssertEqual("FizzBuzz", askMe.isNumberFizzOrBuzz(number: 15))
    }
}
