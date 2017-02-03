using System;
//using Microsoft.VisualStudio.TestTools.UnitTesting;
using NUnit.Framework;

namespace FizzBuzzCSharp
{
    [TestFixture]
    [Category("TheFizzBuzzKata")]
    public class TestFizzBuzzGameRA
    {
        [Test]
        [TestCase(1, "1")]
        [TestCase(3, "Fizz")]
        [TestCase(5, "Buzz")]
        [TestCase(15, "FizzBuzz")]
        [TestCase(30, "FizzBuzz")]
        public void 경계값위주숫자를입력하여결과값을확인한다(int number, string expectedResult)
        {
            Assert.AreEqual(expectedResult, FizzBuzzGame.Play(number));
        }
    }
}
