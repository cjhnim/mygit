//
//  BowlingKataTests.swift
//  BowlingKataTests
//
//  Created by Choi Jung Hyun on 18/01/2017.
//  Copyright © 2017 Choi Jung Hyun. All rights reserved.
//

import XCTest
@testable import BowlingKata

class BowlingKataTests: XCTestCase {
    
    override func setUp() {
        super.setUp()
        // Put setup code here. This method is called before the invocation of each test method in the class.
    }
    
    override func tearDown() {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
        super.tearDown()
    }
    
    func testExample() {
        let viewController = ViewController()
        XCTAssertTrue(viewController.isNumberEven(num: 6))
    }
    
//    func testPerformanceExample() {
//        // This is an example of a performance test case.
//        self.measure {
//            // Put the code you want to measure the time of here.
//        }
//    }
    
}
