import torch
import torch.nn as nn
import torch.optim as optim

# Inputs: 10 samples, 3 features each
X = torch.randn(10, 3)

# Targets: 10 samples, 1 output
y = torch.randn(10, 1)

class SimpleModel(nn.Module):
    def __init__(self):
        super(SimpleModel, self).__init__()
        self.hidden = nn.Linear(3, 5)
        self.output = nn.Linear(5, 1)
    
    def forward(self, x):
        x = torch.relu(self.hidden(x))
        x = self.output(x)
        return x

model = SimpleModel()

criterion = nn.MSELoss()
optimizer = optim.SGD(model.parameters(), lr=0.01)

epochs = 100

for epoch in range(epochs):
    optimizer.zero_grad()
    outputs = model(X)
    loss = criterion(outputs, y)
    loss.backward()
    optimizer.step()

    if (epoch+1) % 10 == 0:
        print(f'Epoch {epoch+1}, Loss: {loss.item():.4f}')

with torch.no_grad():
    predictions = model(X)
    print(predictions)
