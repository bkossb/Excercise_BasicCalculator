package com.bartek.controller;

import com.bartek.models.CalculatorAverage;
import com.bartek.models.OperationModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.bartek.models.CalculatorSimple;

@Controller
public class CalculatorController {

    CalculatorSimple calculatorSimple = new CalculatorSimple();
    CalculatorAverage calculatorAverage = new CalculatorAverage();
    OperationModel operationModel = new OperationModel();

    @GetMapping("/")
    public String indexGet(Model model){
        model.addAttribute("operationModel", operationModel);
        return "index";
    }

    @RequestMapping(params = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorSimple.add(operationModel.getA(), operationModel.getB()));
        return "index";
    }

    @RequestMapping(params = "sub", method = RequestMethod.POST)
    public String subtract(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorSimple.subtract(operationModel.getA(), operationModel.getB()));
        return "index";
    }

    @RequestMapping(params = "mul", method = RequestMethod.POST)
    public String multiplication(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorSimple.multiplication(operationModel.getA(), operationModel.getB()));
        return "index";
    }

    @RequestMapping(params = "div", method = RequestMethod.POST)
    public String division(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorSimple.division(operationModel.getA(), operationModel.getB()));
        return "index";
    }

    @RequestMapping(params = "sqr", method = RequestMethod.POST)
    public String sqrt(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorAverage.squareOf(operationModel.getA()));
        return "index";
    }

    @RequestMapping(params = "ele", method = RequestMethod.POST)
    public String elementOf(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorAverage.elementOf(operationModel.getA()));
        return "index";
    }

    @RequestMapping(params = "prm", method = RequestMethod.POST)
    public String prime(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorAverage.isPrimeNumber(operationModel.getA()));
        return "index";
    }

    @RequestMapping(params = "fac", method = RequestMethod.POST)
    public String factorial(@ModelAttribute("operationModel")OperationModel operationModel, Model model) {
        model.addAttribute("result", calculatorAverage.factorial(operationModel.getA()));
        return "index";
    }

    @GetMapping("/desc")
    public String descGet(){
        return "desc";
    }

}
