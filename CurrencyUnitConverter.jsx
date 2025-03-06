import { useState, useEffect } from "react";
import { Card, CardContent } from "@/components/ui/card";
import { Input } from "@/components/ui/input";
import { Select, SelectItem } from "@/components/ui/select";
import { Button } from "@/components/ui/button";

const units = {
  length: { meter: 1, kilometer: 0.001, mile: 0.000621371, foot: 3.28084 },
  weight: { gram: 1, kilogram: 0.001, pound: 0.00220462, ounce: 0.035274 },
  temperature: { celsius: "C", fahrenheit: "F", kelvin: "K" },
};

const CurrencyUnitConverter = () => {
  const [amount, setAmount] = useState(1);
  const [currencyRates, setCurrencyRates] = useState({});
  const [fromCurrency, setFromCurrency] = useState("USD");
  const [toCurrency, setToCurrency] = useState("EUR");
  const [convertedCurrency, setConvertedCurrency] = useState(0);
  const [unitType, setUnitType] = useState("length");
  const [fromUnit, setFromUnit] = useState("meter");
  const [toUnit, setToUnit] = useState("kilometer");
  const [convertedUnit, setConvertedUnit] = useState(0);

  useEffect(() => {
    fetch("https://api.exchangerate-api.com/v4/latest/USD")
      .then((res) => res.json())
      .then((data) => setCurrencyRates(data.rates));
  }, []);

  const convertCurrency = () => {
    if (currencyRates[fromCurrency] && currencyRates[toCurrency]) {
      setConvertedCurrency(
        (amount / currencyRates[fromCurrency]) * currencyRates[toCurrency]
      );
    }
  };

  const convertUnit = () => {
    if (unitType === "temperature") {
      if (fromUnit === "celsius" && toUnit === "fahrenheit") {
        setConvertedUnit(amount * 1.8 + 32);
      } else if (fromUnit === "fahrenheit" && toUnit === "celsius") {
        setConvertedUnit((amount - 32) / 1.8);
      } else if (fromUnit === "celsius" && toUnit === "kelvin") {
        setConvertedUnit(amount + 273.15);
      } else if (fromUnit === "kelvin" && toUnit === "celsius") {
        setConvertedUnit(amount - 273.15);
      } else {
        setConvertedUnit(amount);
      }
    } else {
      setConvertedUnit((amount * units[unitType][toUnit]) / units[unitType][fromUnit]);
    }
  };

  return (
    <div className="p-6 grid gap-6">
      <Card>
        <CardContent>
          <h2 className="text-xl font-semibold">Currency Converter</h2>
          <Input type="number" value={amount} onChange={(e) => setAmount(e.target.value)} />
          <Select value={fromCurrency} onChange={(e) => setFromCurrency(e.target.value)}>
            {Object.keys(currencyRates).map((cur) => (
              <SelectItem key={cur} value={cur}>{cur}</SelectItem>
            ))}
          </Select>
          <Select value={toCurrency} onChange={(e) => setToCurrency(e.target.value)}>
            {Object.keys(currencyRates).map((cur) => (
              <SelectItem key={cur} value={cur}>{cur}</SelectItem>
            ))}
          </Select>
          <Button onClick={convertCurrency}>Convert</Button>
          <p>Converted Amount: {convertedCurrency.toFixed(2)}</p>
        </CardContent>
      </Card>

      <Card>
        <CardContent>
          <h2 className="text-xl font-semibold">Physical Unit Converter</h2>
          <Select value={unitType} onChange={(e) => setUnitType(e.target.value)}>
            {Object.keys(units).map((type) => (
              <SelectItem key={type} value={type}>{type}</SelectItem>
            ))}
          </Select>
          <Input type="number" value={amount} onChange={(e) => setAmount(e.target.value)} />
          <Select value={fromUnit} onChange={(e) => setFromUnit(e.target.value)}>
            {Object.keys(units[unitType]).map((unit) => (
              <SelectItem key={unit} value={unit}>{unit}</SelectItem>
            ))}
          </Select>
          <Select value={toUnit} onChange={(e) => setToUnit(e.target.value)}>
            {Object.keys(units[unitType]).map((unit) => (
              <SelectItem key={unit} value={unit}>{unit}</SelectItem>
            ))}
          </Select>
          <Button onClick={convertUnit}>Convert</Button>
          <p>Converted Value: {convertedUnit.toFixed(2)}</p>
        </CardContent>
      </Card>
    </div>
  );
};

export default CurrencyUnitConverter;
