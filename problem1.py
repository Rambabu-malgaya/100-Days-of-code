from collections import defaultdict
from queue import Queue

def bfs(graph, start, visited, component):
    queue = Queue()
    queue.put(start)
    visited[start] = True

    while not queue.empty():
        vertex = queue.get()
        component.add(vertex)

        for neighbor in graph[vertex]:
            if not visited[neighbor]:
                queue.put(neighbor)
                visited[neighbor] = True

def find_connected_components(graph, colors):
    visited = defaultdict(bool)
    components = []

    for vertex in graph:
        if not visited[vertex]:
            component = set()
            bfs(graph, vertex, visited, component)
            components.append(component)

    color_components = defaultdict(set)
    for component in components:
        for vertex in component:
            color = colors[vertex]
            color_components[color].add(frozenset(component))

    return color_components

def minimum_operations(test_cases):
    results = []

    for _ in range(test_cases):
        N, M, K = map(int, input().split())
        colors = list(map(int, input().split()))

        graph = defaultdict(list)
        for _ in range(M):
            u, v = map(int, input().split())
            graph[u].append(v)
            graph[v].append(u)

        color_components = find_connected_components(graph, colors)
        operations = 0

        for color in color_components:
            components = color_components[color]
            operations += len(components) - 1

        results.append(operations)

    return results

# Read the number of test cases
T = int(input())

# Get the minimum operations for each test case
output = minimum_operations(T)

# Print the output
for result in output:
    print(result)
